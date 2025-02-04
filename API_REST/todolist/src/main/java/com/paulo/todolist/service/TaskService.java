package com.paulo.todolist.service;

import com.paulo.todolist.model.Task;
import com.paulo.todolist.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    
    public List<Task> listAll() {
    	return taskRepository.findAll();
    }
    
    public Task create(Task task) {
    	return taskRepository.save(task);
    }
    
    public Task update(Task task) {
    	return taskRepository.save(task);
    }
    
    public void delete(Long id) {
    	taskRepository.deleteById(id);
    }
}