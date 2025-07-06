package com.example.tasktracker;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class TaskService {
    private final Map<Integer, Task> tasks = new HashMap<>();

    public Task addTask(Task task) {
        tasks.put(task.getId(), task);
        return task;
    }

    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks.values());
    }

    public Task updateTaskStatus(int id, String status) {
        Task task = tasks.get(id);
        if (task != null) {
            task.setStatus(status);
        }
        return task;
    }

    public void deleteTask(int id) {
        tasks.remove(id);
    }
}
