package tech.claudioed.tasks.domain.repository

import org.springframework.data.repository.reactive.ReactiveCrudRepository
import tech.claudioed.tasks.domain.Task

/**
 * @author claudioed on 25/03/18.
 * Project tasks
 */
interface TaskRepository:ReactiveCrudRepository<Task,String>