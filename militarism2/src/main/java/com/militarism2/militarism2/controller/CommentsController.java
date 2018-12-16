package com.militarism2.militarism2.controller;

import java.net.URL;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.militarism2.militarism2.comments.entity.Comments;
import com.militarism2.militarism2.comments.service.CommentsService;



@Controller()
public class CommentsController {
	
	private CommentsService commentsService;
	
	@Autowired
	public void setCommentsService(CommentsService commentsService) {
		this.commentsService = commentsService;
	}
	
	@RequestMapping(value="/comments", method = RequestMethod.GET)
	public String showComments(Model model, HttpServletRequest request) {
		String url = request.getRequestURL().toString();
		
		model.addAttribute("newComment", new Comments());
		model.addAttribute("allcomments", commentsService.getByUrl(url));
		List<Comments> test = commentsService.getByUrl(url);
		for (Comments comments : test) {
			if (!comments.getChildComments().isEmpty()) {
				System.out.println(comments.getChildComments());
			}else {
				System.err.println("Пусто");
			}
			
		}
		
		
		return "comments";

	}
	
	@RequestMapping(value="/comments", method = RequestMethod.POST)
	public String add(@ModelAttribute("comment") Comments comment, HttpServletRequest request) {
		commentsService.setTime(comment);
		commentsService.setUserName(comment);
		commentsService.setUrl(comment, request);
		commentsService.add(comment);
		return "redirect:/comments";
	}
	@PostMapping(value = "/comments", params = {"responceid" ,"responcename"})
	public String responceComment(@ModelAttribute("comment") Comments comment, int responceid, String responcename,  HttpServletRequest request) {
		commentsService.setTime(comment);
		commentsService.setUserName(comment);
		commentsService.setUrl(comment, request);
		commentsService.add(comment, responceid, responcename);
		return "redirect:/comments";
	}
	

}
