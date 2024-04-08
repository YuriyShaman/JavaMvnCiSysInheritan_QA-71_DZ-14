public class Epic extends Task {

    protected String subtasks;

    public Epic(int id, String subtasks) {  // Создан конструктор с 2-мя параметрами (int id, String subtasks)
        super(id); // вызов родительского конструктора, взять в нем id
        this.subtasks = subtasks; // заполнение массива subtasks (задачи)
    }

    public String getSubtasks() {
        return subtasks;
    }

      @Override
    public boolean matches(String query) {
        if (subtasks.contains(query)) {      // Если такой текст запроса уже имеется в массиве,
            return true;                     // Выводим подтверждение *** "Да" ***
        }
        return false;
    }

}