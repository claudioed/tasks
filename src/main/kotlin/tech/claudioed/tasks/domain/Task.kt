package tech.claudioed.tasks.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 * @author claudioed on 25/03/18.
 * Project tasks
 */
@Document(collection = "tasks")
data class Task(@Id val id:String,val owner:String, val description:String, val projectId:String)

data class CreateTaskRequest(val owner:String, val description:String, val projectId:String)