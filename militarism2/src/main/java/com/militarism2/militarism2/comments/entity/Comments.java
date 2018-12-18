package com.militarism2.militarism2.comments.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "comments")
public class Comments {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id", nullable = false, updatable = true, unique=true)
	private int id;
	
	@Column(name = "user_name", nullable = false)
	private String name;
	
	@Column(name = "comment_description", nullable = false)
	private String description;
	
	@Column(name = "comment_date", nullable = false)
	private Timestamp date;
	
	@Column(name = "responce_name", nullable = true)
	private String responceName;
	
	@Column(name = "current_Url", nullable = false)
	private String url;
	
	@NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne
    @JoinColumn(name = "parent_comment_id")
    private Comments parentComment;

    
    @OneToMany(mappedBy = "parentComment", fetch = FetchType.EAGER)
    private List<Comments> childComments;
	
	public Comments() {
		
	}

	public Comments(int id, String userName, String description, Timestamp date, String responceName,
			String currentUrl) {
		
		this.id = id;
		this.name = userName;
		this.description = description;
		this.date = date;
		this.responceName = responceName;
		this.url = currentUrl;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return name;
	}

	public void setUserName(String userName) {
		this.name = userName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public String getResponceName() {
		return responceName;
	}

	public void setResponceName(String responceName) {
		this.responceName = responceName;
	}

	public String getCurrentUrl() {
		return url;
	}

	public void setCurrentUrl(String currentUrl) {
		this.url = currentUrl;
	}


	public void setChildComments(List<Comments> childComments) {
		this.childComments = childComments;
	}

	public void setParentComment(Comments responceComment) {
		this.parentComment = responceComment;
		
	}

	public List<Comments> getChildComments() {
		return childComments;
	}

	public Comments getParentComment() {
		return parentComment;
	}
	
	
	
}
