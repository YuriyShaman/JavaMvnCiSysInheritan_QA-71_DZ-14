public class SimpleTask extends Task { // Создан дочерний класс SimpleTask род. класса Task

    protected String title; // Защищенный текстовый параметр title

    public SimpleTask(int id, String title) {  // Создан конструктор с 2-мя параметрами
        super(id);          // вызов параметра id из родительского конструктора
        this.title = title; // заполнение своих полей
    }

    public String getTitle() {
        return title;
    }   // Вводим название (текст) задачи

    @Override
    public boolean matches(String query) {  // Создаем метод matches c параметром String qery (текущий запрос)
        if (title.contains(query)) {       // Если такой текст запроса уже имеется в массиве,
            return true;                    // выводим подтверждение "Да"
        }
        return false;                       // Если нет - выход
    }
}

