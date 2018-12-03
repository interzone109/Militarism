package com.militarism2.militarism2.services.comments;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.militarism2.militarism2.model.comments.CommentItem;
import com.militarism2.militarism2.repozitory.comments.CommentItemRepository;

@Component("ItemServise")
public class CommentItemImpl implements CommItem {

	@Autowired
	private CommentItemRepository commentItemRepository;

	@Override
	public Optional<CommentItem> getCommentById(long id) {
		return commentItemRepository.findById(id);
	}

	@Override
	public Optional<CommentItem> getCommentByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<CommentItem> getUserByText(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<CommentItem> getAllComment() {
		return commentItemRepository.findAll();
	}

	@Override
	public void create(CommentItem comment) {
		comment.setTime(new Timestamp(System.currentTimeMillis()));
		commentItemRepository.save(comment);

	}

	@Override
	public Optional<CommentItem> getCommentByComID(long id) {
		return null;
	}


}
