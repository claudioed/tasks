package tech.claudioed.tasks.domain.resource

import org.springframework.web.bind.annotation.*
import tech.claudioed.tasks.domain.CreateTaskRequest
import tech.claudioed.tasks.domain.service.TaskService

/**
 * @author claudioed on 25/03/18.
 * Project tasks
 */
@RestController
@RequestMapping("/api/tasks")
class TaskResource(private val taskService: TaskService) {

    @GetMapping("/{id}")
    fun task(@PathVariable("id") id:String) = this.taskService.task(id)

    @PostMapping
    fun newTask(@RequestBody request: CreateTaskRequest) = this.taskService.newTask(request)

    @GetMapping
    fun tasks() = this.taskService.tasks()

}