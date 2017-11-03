package brandonjf.getitdone

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import brandonjf.getitdone.models.Task
import brandonjf.getitdone.models.TaskList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setup()
    }

    fun setup() {
        val list = TaskList()
        list.tasks.add(Task("First task"))

    }
}
