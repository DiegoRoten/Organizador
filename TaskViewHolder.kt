package DIEGO.diegoprueba.TODO

import android.content.res.ColorStateList
import android.graphics.Paint
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.diegoinicial.diegoprueba.R

class TaskViewHolder (view:View) : RecyclerView.ViewHolder(view){

    private val tvTask: TextView = view.findViewById(R.id.tvTask)
    private val cbTask: CheckBox = view.findViewById(R.id.cbTask)

    fun render(task: Task) {
        if (task.isSelected) {
            tvTask.paintFlags = tvTask.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
        } else{ tvTask.paintFlags = tvTask.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()

        }
        tvTask.text = task.name
        cbTask.isChecked = task.isSelected

        val color = when (task.category){
            TaskCategory.Personal -> R.color.todo_personal_category
            TaskCategory.Colegios -> R.color.todo_colegios_category
            TaskCategory.Turnos -> R.color.todo_turnos_category
            TaskCategory.Turnos -> R.color.todo_turnos_category
            TaskCategory.Otros -> R.color.todo_otros_category
        }
        cbTask.buttonTintList = ColorStateList.valueOf(
            ContextCompat.getColor(cbTask.context, color)
        )

    }
}

