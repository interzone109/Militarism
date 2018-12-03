package com.militarism2.militarism2.services.comments;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.militarism2.militarism2.model.comments.TopicDiscussion;
import com.militarism2.militarism2.repozitory.comments.CommentsRepository;

@Component("commentServise")
public class CommentsServiceImpl implements CommentService {
	
	@Autowired
	private CommentsRepository commentsRepos;
		
	@Override
	public Optional<TopicDiscussion> getCommentById(long id) {
		return commentsRepos.findById(id);
	}

	@Override
	public Optional<TopicDiscussion> getCommentByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<TopicDiscussion> getUserByText(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<TopicDiscussion> getAllComment() {
		// TODO Auto-generated method stub
		return commentsRepos.findAll();
	}

	@Override
	public void create(TopicDiscussion comment) {
		comment.setTime(new Timestamp(System.currentTimeMillis()));
		commentsRepos.save(comment);
	}

}
