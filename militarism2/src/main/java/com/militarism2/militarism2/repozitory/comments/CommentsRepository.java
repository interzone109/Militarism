package com.militarism2.militarism2.repozitory.comments;

import org.springframework.data.jpa.repository.JpaRepository;

import com.militarism2.militarism2.model.comments.TopicDiscussion;

public interface CommentsRepository extends JpaRepository<TopicDiscussion, Long> {

}
