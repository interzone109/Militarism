package com.militarism2.militarism2.services.comments;

import java.util.Collection;
import java.util.Optional;

import com.militarism2.militarism2.model.comments.CommentItem;

public interface CommItem {
	Optional<CommentItem> getCommentById(long id);
	Optional<CommentItem> getCommentByComID(long id);

	Optional<CommentItem> getCommentByName(String name);

	Optional<CommentItem> getUserByText(String name);

	Collection<CommentItem> getAllComment();

	void create(CommentItem comment);
}
