package brandonjf.getitdone.models

/**
 * Created by brandon on 11/3/17.
 */
data class Task(val description: String)

data class TaskList(val tasks: MutableList<Task> = mutableListOf())