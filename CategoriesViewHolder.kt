package DIEGO.diegoprueba.TODO

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.diegoinicial.diegoprueba.R

class CategoriesViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val tvCategoryName:TextView = view.findViewById(R.id.tvCategoryName)
    private val divider:View = view.findViewById(R.id.divider)
    private var viewContainer:CardView = view.findViewById(R.id.viewContainer)


    fun render(taskCategory: TaskCategory, onItemSelected: (Int) -> Unit){

        val color = if(taskCategory.isSelected){
            R.color.todo_background_card
        }else{
            R.color.todo_background_disabled
        }
        viewContainer.setCardBackgroundColor(ContextCompat.getColor(viewContainer.context, color))

        itemView.setOnClickListener { onItemSelected(layoutPosition) }

        when(taskCategory){
            TaskCategory.Personal -> {
                tvCategoryName.text = "Personal"
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.todo_personal_category)
                )
            }
            TaskCategory.Colegios -> {
                tvCategoryName.text = "Colegios"
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.todo_colegios_category)
                )
            }
            TaskCategory.Turnos -> {
                tvCategoryName.text = "Turnos"
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.todo_turnos_category)
                )
            }
            TaskCategory.Otros -> {
                tvCategoryName.text = "Otros"
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.todo_otros_category)
                )
            }
        }

    }

}