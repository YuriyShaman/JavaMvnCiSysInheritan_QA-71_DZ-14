import java.util.Objects;

    public class Task {  // Создаем родительский класс Task
        protected int id;  //  к параметру id даем доступ всем дочерним классам

        public Task(int id) { // Создаем конструктор с параметром id
            this.id = id;  // Заполняем поле параметра id
        }
        public int getid() {  // Вычисляем (проваряем) id
            return id;        // Возвращаем значение id
        }

        // Ниже находятся вспомогательные методы для корректной работы equals
        // Переопределять их в наследниках не нужно

//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            Task task = (Task) o;
//            return id == task.id;
//        }

//        @Override
//        public int hashCode() {
//            return Objects.hash(id);
//        }

        /**
     * Метод, проверяющий подходит ли эта задача поисковому запросу.
     * Эта логика должна быть определена в наследниках, у каждого она будет своя
     * @param query Поисковый запрос
     * @return Ответ на вопрос, подходит ли эта задача под поисковый запрос
     */
    public boolean matches(String query) { // Создан новый метод matches с параметром
                                            // (последний запрос (String query)
        return false;   // Если такого запроса нет - выход
    }
}
