package com.militarism2.militarism2.comments.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.militarism2.militarism2.comments.entity.Comments;

public interface CommentsService {

	List<Comments> getByUrl (String url);
	List <Comments> getByUser (String name);
	Comments add (Comments comment);
	void setTime(Comments comment);
	void setUserName(Comments comment);
	void setUrl(Comments comment, HttpServletRequest request);
	void add(Comments comment, int responceid, String responceName);
}
