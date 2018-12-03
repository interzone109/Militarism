package com.militarism2.militarism2.services.comments;

import java.util.Collection;
import java.util.Optional;

import com.militarism2.militarism2.model.comments.TopicDiscussion;

public interface CommentService {
	Optional<TopicDiscussion> getCommentById(long id);

    Optional<TopicDiscussion> getCommentByName(String name);
    
    Optional<TopicDiscussion> getUserByText(String name);

    Collection<TopicDiscussion> getAllComment();

    void create(TopicDiscussion comment);
}
