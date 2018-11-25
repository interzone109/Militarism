package com.militarism2.militarism2.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class Persistent_Logins {

	@Id
	@NotNull
	@Column(columnDefinition="VARCHAR(64)")
	String series;
	
	@NotNull
	@Column(columnDefinition="VARCHAR(64)")
	String username;
	
	@NotNull
	@Column(columnDefinition="VARCHAR(64)")
	String token;
	
	@NotNull
	@Column(columnDefinition="TIMESTAMP")
	Timestamp last_used;

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Timestamp getLast_used() {
		return last_used;
	}

	public void setLast_used(Timestamp last_used) {
		this.last_used = last_used;
	}
}