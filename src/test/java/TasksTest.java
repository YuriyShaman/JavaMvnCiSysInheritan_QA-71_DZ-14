import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;


public class TasksTest {

    @Test
    public void findTitleTest() { // обратите вниманеи,что методы называют с маленькой буквы,
                                    // а каждое следующее слово с большой, все пишется в одно слово
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
                                    // cоздаем объект simpleTask и передаем в него параметры
        boolean actual = simpleTask.matches("Написать"); // обращаемся к методу matches и передаем туда запрос
        boolean expected = false; // указываем ожидаемый результат. т.к. в "Позвоните родителям"
                                    // нет "Написать", то ожидаем мы false
        Assertions.assertEquals(expected, actual); // сравниваем ожидаемый и фактический результаты
    }


    @Test
    public void Epic() {
        Epic epic = new Epic(55, "Молоко");   // cоздаем Epic и передаем в него параметры
        boolean actual = epic.matches("Мол"); // обращаемся к методу matches и передаем туда запрос
        boolean expected = false; //  ожидаем false
        Assertions.assertEquals(expected, actual); // сравниваем ожидаемый и фактический результаты
    }
}