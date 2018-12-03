package com.militarism2.militarism2.model.comments;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TopicDiscussion {
	private Long id;
	private String name;
	private String description;
	private Timestamp time;

	private Set<CommentItem> comments;

	public TopicDiscussion() {
	}

	public TopicDiscussion(Long id, String name, String description, Timestamp time) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.time = time;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "topicdiscussion_id", nullable = false, unique = true)
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	@OneToMany(mappedBy = "discussion", cascade = CascadeType.ALL)
	public Set<CommentItem> getComments() {
		return comments;
	}

	public void setComments(Set<CommentItem> comments) {
		this.comments = comments;
	}

}
