package com.springboot.todolist.todo;

import java.time.LocalDateTime;

import jakarta.validation.constraints.Size;

public class Todo {

	private int id;
	private String username;
	@Size(min = 10)
	private String desc;
	private LocalDateTime dueDate;
	

	

	public Todo(int id, String username, String desc,LocalDateTime dueDate) {
		super();
		this.id = id;
		this.username = username;
		this.desc = desc;
		this.dueDate = dueDate;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public LocalDateTime getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDateTime dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", username=" + username + ", desc=" + desc + ", dueDate=" + dueDate + "]";
	}







}
