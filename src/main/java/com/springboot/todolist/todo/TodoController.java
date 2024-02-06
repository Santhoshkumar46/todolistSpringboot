package com.springboot.todolist.todo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	@RequestMapping("todos")
	public String getAllTodo(ModelMap model) {
		List<Todo> todos= todoService.gettodo("sk");
		model.addAttribute("todos", todos);
		return "todo-list";
	}
	
	@RequestMapping(value = "add-todo", method = RequestMethod.GET)
	public String addNewTodo(ModelMap model) {
		Todo todo =  new Todo(0,"SK","HI",LocalDateTime.now());
		model.put("todo",todo);
		model.put("name", todo.getUsername());
		return "add-todo";
	}
	
	@RequestMapping(value = "add-todo", method = RequestMethod.POST)
	public String returnListWithNewTodo(ModelMap model,@Valid Todo todo, BindingResult result) {
		if(result.hasErrors()) {
			return "add-todo";
		}
		if(todo.getDesc() == null || todo.getDueDate() == null) {
			model.put("error", "Please enter the descriptio and date");
			return "add-todo";
		}
		String user=(String) model.get("name");
		todoService.addTodo(user, todo.getDesc(), todo.getDueDate());
		return "redirect:todos";
	}

}
