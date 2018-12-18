package com.militarism2.militarism2.comments.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.militarism2.militarism2.comments.entity.Comments;
import com.militarism2.militarism2.comments.repository.CommentsRepository;

import com.militarism2.militarism2.model.User;
import com.militarism2.militarism2.services.userservice.UserServiceImpl;
import org.springframework.data.domain.Sort;

@Service
public class CommentsServiceImpl implements CommentsService {
	
	@Autowired
	private UserServiceImpl userServiceImpl;

	private CommentsRepository commentsRepository;
	
	@Autowired
	public CommentsServiceImpl(CommentsRepository commentsRepository) {
		this.commentsRepository = commentsRepository;
	}
	
	@Override
	public List<Comments> getByUrl(String url) {
				
		return commentsRepository.findAllByUrlOrderByDate(url);
	}
	
	
	@Override
	public List<Comments> getByUser(String name) {
		
		return commentsRepository.findAllByName(name);
	}

	@Override
	public Comments add(Comments comment) {
		Comments addComment = comment;
		return commentsRepository.saveAndFlush(addComment);
	}
	@Override
	public void setTime(Comments comment) {
		comment.setDate(new Timestamp(System.currentTimeMillis()));
	}
	
	public void setUserName(Comments comment) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		System.out.println(currentPrincipalName);
		if (currentPrincipalName.equals("anonymousUser")) {
			comment.setUserName("anonymousUser");
			return;
		}
		Optional<User> user = userServiceImpl.getUserByName(currentPrincipalName);
		User userRegistred = user.get();
		comment.setUserName(userRegistred.getName());
		
	}

	@Override
	public void setUrl(Comments comment, HttpServletRequest request) {
		String referer = request.getHeader("Referer");
		comment.setCurrentUrl(referer);
		
	}

	@Override
	public void add(Comments comment, int responceid, String responceName) {
		
		Comments responceComment = commentsRepository.findById(responceid).get();
		List<Comments> temp = responceComment.getChildComments();
		comment.setResponceName(responceName);
		comment.setParentComment(responceComment);
		temp.add(comment);
		responceComment.setChildComments(temp);
		
		commentsRepository.saveAndFlush(comment);
		
	}

	//https://stackoverflow.com/questions/31668522/hibernate-self-join-confusion
	
//	public List<Comments> getCommetsByUrlAndSort(String url){
//		
//		List<Comments> tempComments = new ArrayList<Comments>();
//		List<Comments> pageComments = new ArrayList<Comments>();
//		tempComments = commentsRepository.findAllByUrlOrderByDate(url);
//		System.err.println(tempComments.size());
//		
//		for (Comments comment : tempComments) {
//			pageComments.addAll(comment.getChildComments());
//			System.err.println(pageComments.size());
////			if (comment.getParentComment() == null) {
////				for (Comments childComment : tempComments) {
////					if (comment.getParentComment() == null ) {
////						continue;
////					}
////					
////				}
////			}
//		}
//		
//		
//		return pageComments;
//		
//	}
		
}
