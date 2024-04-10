import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;


public class TasksTest {

    @Test       // Тест "Такого  запроса нет"
    public void simpleTaskFalse() {  // методы называют с маленькой буквы,
        // а каждое следующее слово с большой, все пишется в одно слово
        SimpleTask simpleTask = new SimpleTask(5, "Купите родителям");
        // cоздаем объект simpleTask и передаем в него параметры
        boolean actual = simpleTask.matches("Позвоните"); //Oбращаемся к методу matches и передаем туда запрос
        boolean expected = false;   // ожидаем false. т.к. в "Позвоните родителям" нет "Купите", то ожидаем мы false
        Assertions.assertEquals(expected, actual);
    }

    @Test       // Тест "Такой  запрос есть"
    public void simpleTaskTestTrue() {
        SimpleTask simpleTask = new SimpleTask(5, "Купите родителям");
        boolean actual = simpleTask.matches("Купите"); //Oбращаемся к методу matches и передаем туда запрос
        Assertions.assertTrue(actual); //  Сравниваем полученный и ожидаемый результаты, используя другой оператор
    }

    @Test
    public void EpicFalse() {
        Epic epic = new Epic(55, "Молоко");   // cоздаем Epic и передаем в него параметры
        boolean actual = epic.matches("Чай"); // обращаемся к методу matches и передаем туда этот запрос
        boolean expected = false;   // ожидаем false. т.к. в "Позвоните родителям" нет "Купите", то ожидаем мы false
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void EpicTrue() {
        Epic epic = new Epic(55, "Молоко");   // Передаем в Epic запрос на новую задачу
        boolean actual = epic.matches("Молоко"); // Методом matches передаем наличие "Молоко" в Epic
        Assertions.assertTrue(actual); //  Сравниваем полученный и ожидаемый результаты, используя другой оператор
    }

    @Test
    public void MeetingTopicFalse() {
        Meeting meeting = new Meeting(555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("4й версии приложения");
        boolean expected = false; //  ожидаем = false
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MeetingTopicTrue() {
        Meeting meeting = new Meeting(555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("Выкатка 3й версии");
        Assertions.assertTrue(actual); //  Сравниваем полученный и ожидаемый результаты, используя другой оператор
    }

    @Test
    public void MeetingProjectFalse() {
        Meeting meeting = new Meeting(555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("СберБанка");
        boolean expected = false; //  ожидаем false
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MeetingProjectTrue() {
        Meeting meeting = new Meeting(555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("НетоБанка");
        Assertions.assertTrue(actual); //  Сравниваем полученный и ожидаемый результаты, используя другой оператор
    }

    @Test
    public void MeetingStartFalse() {
        Meeting meeting = new Meeting(555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("Завтра");
        boolean expected = false; //  ожидаем false
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MeetingStartTrue() {
        Meeting meeting = new Meeting(558,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("Во вторник после обеда");
        Assertions.assertTrue(actual); //  Сравниваем полученный и ожидаемый результаты, используя другой оператор
    }

    @Test
    public void MeetingStartFalseAll() {
        Meeting meeting = new Meeting(555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("Ничего нет");
        boolean expected = false; //  ожидаем false
        Assertions.assertEquals(expected, actual);
    }
}
