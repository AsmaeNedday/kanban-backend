package com.ndy.kanban.domain;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Developer {
	
	private @Id @GeneratedValue Long id ;
	private String firstname;
	private String lastname;
	private String password;
	private String email;
	private LocalDateTime startContract;
	@ManyToMany(mappedBy="developers",fetch = FetchType.EAGER)
	@JsonIgnoreProperties("developers")
	private Set<Task> tasks;
	
	public Developer() {
		this.tasks=new HashSet<>();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDateTime getStartContract() {
		return startContract;
	}
	public void setStartContract(LocalDateTime localDateTime) {
		this.startContract = localDateTime;
	}
	public Set<Task> getTasks() {
		return tasks;
	}
	public void setTasks(Set<Task> tasks) {
		this.tasks = tasks;
	}
	
}
