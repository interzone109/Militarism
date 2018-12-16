package com.militarism2.militarism2.comments.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.militarism2.militarism2.comments.entity.Comments;

public interface CommentsRepository extends JpaRepository<Comments, Integer>{

	//get All Coments By Current Url
	public List<Comments> findAllByUrl(String url);
	
	// find All by Name
	public List <Comments> findAllByName(String name);
	
}