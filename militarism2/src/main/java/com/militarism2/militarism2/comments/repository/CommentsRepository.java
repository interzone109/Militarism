package com.militarism2.militarism2.comments.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.militarism2.militarism2.comments.entity.Comments;

public interface CommentsRepository extends JpaRepository<Comments, Integer>{

	//get All Coments By Current Url
	public List<Comments> findAllByUrlOrderByDateDesc(String url);
	
	// find All by Name
	public List <Comments> findAllByName(String name);
	
	//public List<Comments> findAllfindAllByUrlByParentCommentIsNull(String url); 
	
	
//	@Query("select distinct e FROM parentComment e INNER JOIN e.childComments m ORDER BY m.parentComment")
//	public List<Comments> getChildCommentList();
	
	
}
