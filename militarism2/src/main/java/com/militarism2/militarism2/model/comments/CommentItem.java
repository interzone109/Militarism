package com.militarism2.militarism2.model.comments;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class CommentItem {
	private Long id;
	private String name;
	private String text;
	private Timestamp time;

	private TopicDiscussion discussion;

	public CommentItem() {
	}

	public CommentItem(Long id, String name, String text, Timestamp time, TopicDiscussion discussion) {
		this.id = id;
		this.name = name;
		this.text = text;
		this.time = time;
		this.discussion = discussion;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "comment_id", nullable = false, unique = true)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}
	
	@OneToOne
	@JoinColumn(name="topic_colum_id")
	public TopicDiscussion getDiscussion() {
		return discussion;
	}

	public void setDiscussion(TopicDiscussion discussion) {
		this.discussion = discussion;
	}

}
