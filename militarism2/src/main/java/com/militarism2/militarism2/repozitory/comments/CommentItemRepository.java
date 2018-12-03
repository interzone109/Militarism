package com.militarism2.militarism2.repozitory.comments;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.militarism2.militarism2.model.comments.CommentItem;

public interface CommentItemRepository extends JpaRepository<CommentItem, Long>{
//	@Query("select * from commentitem where topic_colum_id = ?1")
//	Optional<CommentItem> findByTopicId(Long id);
}
