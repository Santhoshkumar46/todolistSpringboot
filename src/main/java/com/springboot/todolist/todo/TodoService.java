package com.springboot.todolist.todo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	private static List<Todo> todolist = new ArrayList<Todo>();
	private static int count=0;
	
	static {
		todolist.add(new Todo(++count, "Sandy", "Java", LocalDateTime.now()));
		todolist.add(new Todo(++count, "Sandy", "AWS", LocalDateTime.now()));
	}
	
	public List<Todo> gettodo(String username){
		return todolist;
	}
	public void addTodo(String user, String desc, LocalDateTime date) {
		Todo todo = new Todo(++count,user,desc,date);
		todolist.add(todo);
	}

}
