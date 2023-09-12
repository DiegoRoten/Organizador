package DIEGO.diegoprueba.TODO

sealed class TaskCategory(var isSelected:Boolean = true) {
    object Personal : TaskCategory()
    object Colegios : TaskCategory()
    object Turnos : TaskCategory()
    object Otros : TaskCategory()
}