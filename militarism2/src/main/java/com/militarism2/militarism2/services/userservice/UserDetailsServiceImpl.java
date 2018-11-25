package com.militarism2.militarism2.services.userservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.militarism2.militarism2.services.userservice.UserServiceImpl;
import com.militarism2.militarism2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
 
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
 
    @Autowired
    private UserServiceImpl appUserService;
 
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<com.militarism2.militarism2.model.User> appUser = this.appUserService.getUserByName(userName);
 
        if (appUser.get() == null) {
            System.out.println("User not found! " + userName);
            throw new UsernameNotFoundException("User " + userName + " was not found in the database");
        }
 
        System.out.println("Found User: " + appUser.get().getName());
 
        User appUserDetails=new User();
        appUserDetails.setName(appUser.get().getName());
        appUserDetails.setEmail(appUser.get().getEmail());
        appUserDetails.setPasswordHash(appUser.get().getPasswordHash());
        List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
        org.springframework.security.core.userdetails.User user=new org.springframework.security.core.userdetails.User(appUser.get().getName(), appUser.get().getPasswordHash(), grantList);
        UserDetails userDetails = (UserDetails) user;
        return userDetails;
    }
 
}