package com.militarism2.militarism2.controller.comments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.militarism2.militarism2.model.comments.TopicDiscussion;
import com.militarism2.militarism2.services.comments.CommentService;

@Controller
@RequestMapping("/comments")
public class CommentsController {

	@Autowired
	@Qualifier("commentServise")
	private CommentService commentService;

	@RequestMapping(method = RequestMethod.GET)
	public String tipic(Model model) {
		model.addAttribute("coment", new TopicDiscussion());
		model.addAttribute("listComments", commentService.getAllComment());
		return "topicDi";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String topiPOST(@ModelAttribute("coment") TopicDiscussion discussion, Model model) {
		commentService.create(discussion);
		model.addAttribute("coment", new TopicDiscussion());
		model.addAttribute("listComments", commentService.getAllComment());
		return "topicDi";
	}
}
