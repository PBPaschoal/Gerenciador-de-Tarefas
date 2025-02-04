package com.paulo.todolist.controller;

import com.paulo.todolist.model.Task;
import com.paulo.todolist.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
	private final TaskService taskService;
	
	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}
	
	@GetMapping
	public List<Task> getTasks() {
		return taskService.listAll();
	}
	
	@PostMapping
	public Task createTask(@RequestBody Task task) {
		return taskService.create(task);
	}
	
	@PutMapping
	public Task updateTask(@RequestBody Task task) {
		return taskService.update(task);
	}
	
	@DeleteMapping("/{id}")
	public void deleteTask(@PathVariable Long id) {
		taskService.delete(id);
	}

}
