import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;


public class TasksTest {

    @Test       // Тест "Такого  запроса нет"
    public void simpleTaskTestFalse() {  // методы называют с маленькой буквы,
        // а каждое следующее слово с большой, все пишется в одно слово
        SimpleTask simpleTask = new SimpleTask(5, "Позвоните родителям");
        // cоздаем объект simpleTask и передаем в него параметры
        boolean actual = simpleTask.matches("Купите родителям"); //Oбращаемся к методу matches и передаем туда запрос
        boolean expected = false;   // указываем ожидаемый результат. т.к. в "Позвоните родителям"
        // нет "Купите", то ожидаем мы false
        Assertions.assertEquals(expected, actual);
    }

    @Test       // Тест "Такой  запрос есть"
    public void simpleTaskTestTrue() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвоните родителям");
        boolean actual = simpleTask.matches("Позвоните"); //Oбращаемся к методу matches и передаем туда запрос
        boolean expected = true;   // в "Позвоните родителям" есть "Позвоните" --  ожидаем  true
        Assertions.assertEquals(expected, actual);
    }

    @Test       // Тест "Такой  запрос есть"
    public void simpleTaskTestFalseNew() {
        SimpleTask simpleTask = new SimpleTask(7, "Новая задачка");
        boolean actual = simpleTask.matches("Найти"); //Oбращаемся к методу matches и передаем туда запрос
        boolean expected = false;   // в "Позвоните родителям" нет "Напомнить", то ожидаем мы false
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void EpicFalse() {
        Epic epic = new Epic(55, "Молоко");   // cоздаем Epic и передаем в него параметры
        boolean actual = epic.matches("Хлеб"); // обращаемся к методу matches и передаем туда этот запрос
        boolean expected = false; //  ожидаем false
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void EpicTrue() {
        Epic epic = new Epic(55, "Молоко");   // cоздаем Epic и передаем в него параметры
        boolean actual = epic.matches("Молоко"); // обращаемся к методу matches и передаем туда этот запрос
        boolean expected = true; //  ожидаем false
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MeetingTrueTopic() {
       Meeting meeting = new Meeting(555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("Выкатка 3й версии приложения");
        boolean expected = true; //  ожидаем = true

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MeetingFalseTopic() {
        Meeting meeting = new Meeting(555,
                "Выкатка 5й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("Выкатка 3й версии приложения");
        boolean expected = false; //  ожидаем = false

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MeetingTrueProject() {
        Meeting meeting = new Meeting(555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("Приложение НетоБанка");
        boolean expected = true; //  ожидаем true

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MeetingFalseProject() {
        Meeting meeting = new Meeting(555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("Приложение Банка");
        boolean expected = false; //  ожидаем false

        Assertions.assertEquals(expected, actual);
    }

}
