package tech.claudioed.tasks.domain.service

import org.springframework.stereotype.Service
import tech.claudioed.tasks.domain.CreateTaskRequest
import tech.claudioed.tasks.domain.Task
import tech.claudioed.tasks.domain.repository.TaskRepository
import java.util.*

/**
 * @author claudioed on 25/03/18.
 * Project tasks
 */
@Service
class TaskService(private val taskRepository: TaskRepository) {

    fun tasks() = this.taskRepository.findAll()

    fun task(id: String) = this.taskRepository.findById(id)

    fun newTask(request: CreateTaskRequest) = this.taskRepository.save(
            request.let { Task(id = UUID.randomUUID().toString(), owner = request.owner, description = request.description, projectId = request.projectId) })

}