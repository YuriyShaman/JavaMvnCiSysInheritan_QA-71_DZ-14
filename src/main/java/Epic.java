public class Epic extends Task {

    protected String subtasks;

    public Epic(int id, String subtasks) {  // Создан конструктор с 2-мя параметрами (int id, String subtasks)
        super(id); // вызов родительского конструктора, взять в нем id
        this.subtasks = subtasks; // заполнение массива subtasks (задачи)
    }

    public String getEpic() {
        return subtasks;
    }

    @Override
    public boolean matches(String query) {
        if (subtasks.contains(query)) {
            return true;
        }
        return false;
    }
}