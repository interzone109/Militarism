package com.militarism2.militarism2.controller.comments;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.militarism2.militarism2.model.comments.CommentItem;
import com.militarism2.militarism2.services.comments.CommItem;
import com.militarism2.militarism2.services.comments.CommentService;

@Controller
@RequestMapping("/item")
public class CommnetsItemController {
	private Long id;
	@Autowired
	@Qualifier("commentServise")
	private CommentService commentService;
	
	@Autowired
	@Qualifier("ItemServise")
	private CommItem commitem;
	
	@RequestMapping(method = RequestMethod.GET,params="id")
	public String commetItem(@RequestParam("id")Long itemID, Model model) {
		id=itemID;
		model.addAttribute("item", new CommentItem());
		model.addAttribute("listItem", commitem.getAllComment());
		return "CommItem";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String createItem(@ModelAttribute("item") CommentItem item,Model model) {
		item.setDiscussion(commentService.getCommentById(id).get());
		commitem.create(item);
		model.addAttribute("item", new CommentItem());
		model.addAttribute("listItem", commitem.getAllComment());
		return "CommItem";
	}
}
