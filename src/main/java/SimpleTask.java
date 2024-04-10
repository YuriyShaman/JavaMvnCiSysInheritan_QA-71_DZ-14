public class SimpleTask extends Task { // Создан дочерний класс SimpleTask рк Task

    protected String title; // Защищенный текстовый параметр title,берем из рк Task

    public SimpleTask(int id, String title) {  // Создан конструктор с 2-мя параметрами id и String title
        super(id);          // вызов параметра id из родительского конструктора в Task
        this.title = title; // заполнение поля названия новой задачи
    }
    public String getTitle() { // Ищем (проверяем) название (текст) задачи
        return title;
    } // SimpleTask и String getTitle должны быть public

       @Override
    public boolean matches(String query) {  // Создаем метод matches c текстом  qery (текущий запрос)
        if (title.contains(query)) {       // Если такой текст запроса уже имеется в массиве,
            return true;                    // выводим подтверждение *** "Да" ***
        }
        return false;                       // Если нет - выход
    }
}

