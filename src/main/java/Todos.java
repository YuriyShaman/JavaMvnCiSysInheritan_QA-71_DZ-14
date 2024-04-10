public class Todos {

    private Task[] tasks = new Task[0]; // <- тут будут все задачи

    /**
     * Вспомогательный метод для имитации добавления
     * элемента в массив
     *
     * @param current Массив, в который мы хотим добавить элемент
     * @param task    Элемент, который мы хотим добавить
     * @return Возвращает новый массив, который выглядит
     * как тот, что мы передали,
     * но с добавлением нового элемента в КОНЕЦ
     */
    private Task[] addToArray(Task[] current, Task task) {
        Task[] tmp = new Task[current.length + 1];
        for (int i = 0; i < current.length; i++) {
            tmp[i] = current[i];
        }
        tmp[tmp.length - 1] = task;
        return tmp; // Текущее число задач в их массиве
    }

    public void add(Task task) { // <- вот здесь в параметре может лежать объект
        // вида SimpleTask или вида Epic, или вида Meeting

        tasks = addToArray(tasks, task); // *** Новая задача вводится в массив задач
        //                                      и ей присваивается имя  tasks
    }

    public Task[] findAll() {
        return tasks;
    }

    /*
     * Метод поиска задач, которые подходят под поисковый запрос
     * @param query Поисковый запрос
     * @return Массив из подошедших задач
     */
    public Task[] search(String query) {                 // В Task ищем текст запроса query
        Task[] result = new Task[0];                     // создаум массив  ответа
        for (Task task : tasks) {                        // перебираем все задачи
            if (task.matches(query)) {                   // если задача подходит под выбранный запрос
                result = addToArray(result, task);       // добавляем её в массив ответа
            }
        }
        return result;
    }
}



