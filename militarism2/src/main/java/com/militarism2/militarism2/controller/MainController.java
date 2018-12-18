package com.militarism2.militarism2.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.militarism2.militarism2.comments.entity.Comments;
import com.militarism2.militarism2.comments.service.CommentsService;

/**
 * Контроллер для главной страници
 */
@Controller
public class MainController {
	
	private CommentsService commentsService;
	
	@Autowired
	public void setCommentsService(CommentsService commentsService) {
		this.commentsService = commentsService;
	}

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String index(Model model, HttpServletRequest request) {
		String referer = request.getHeader("Referer");
		String url = request.getRequestURL().toString();
		model.addAttribute("newComment", new Comments());
		model.addAttribute("allcomments", commentsService.getByUrl(url));
		if (referer == null || referer.contains("lang") || referer.equals("http://localhost:8080/")) {
			return "index";
		}

		return "redirect:" + referer;

	}

	@RequestMapping(value = { "/index" }, method = RequestMethod.GET)
	public String index(Model model) {
		return "index";
	}

}
