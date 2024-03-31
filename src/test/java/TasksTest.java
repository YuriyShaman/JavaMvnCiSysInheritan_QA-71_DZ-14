import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;


public class TasksTest {

    @Test       // Тест "Такого  запроса нет"
    public void simpleTaskTestFalse() {  // обратите вниманеи,что методы называют с маленькой буквы,
        // а каждое следующее слово с большой, все пишется в одно слово
        SimpleTask simpleTask = new SimpleTask(5, "Позвоните родителям");
        // cоздаем объект simpleTask и передаем в него параметры
        boolean actual = simpleTask.matches("Напомните родителям"); //Oбращаемся к методу matches и передаем туда запрос
        boolean expected = false;   // указываем ожидаемый результат. т.к. в "Позвоните родителям"
        // нет "Напомните", то ожидаем мы false
        Assertions.assertEquals(expected, actual);
    }

    @Test       // Тест "Такой  запрос есть"
    public void simpleTaskTestTrue() {  // обратите вниманеи,что методы называют с маленькой буквы,
        // а каждое следующее слово с большой, все пишется в одно слово
        SimpleTask simpleTask = new SimpleTask(5, "Позвоните родителям");
        // cоздаем объект simpleTask и передаем в него параметры
        boolean actual = simpleTask.matches("Позвоните родителям"); //Oбращаемся к методу matches и передаем туда запрос
        boolean expected = true;   // указываем ожидаемый результат. т.к. в "Позвоните родителям"
        // нет "Напомнить", то ожидаем мы false
        Assertions.assertEquals(expected, actual);
    }

    @Test       // Тест "Такой  запрос есть"
    public void simpleTaskTestTrueId() {  // обратите вниманеи,что методы называют с маленькой буквы,
        // а каждое следующее слово с большой, все пишется в одно слово
        SimpleTask simpleTask = new SimpleTask(5, "Позвоните родителям");
        // cоздаем объект simpleTask и передаем в него параметры
        //boolean actual = simpleTask.matches("Позвоните родителям"); //Oбращаемся к методу matches и передаем туда запрос

       Task[] actual = Task.getid(6);

        boolean expected = true;   // указываем ожидаемый результат. т.к. в "Позвоните родителям"
        // есть "Позвоните", то ожидаем мы true
        Assertions.assertEquals(expected, actual);
    }

    //@Test
    public void simpleTaskTest11() { // обратите вниманеи,что методы называют с маленькой буквы,
        // а каждое следующее слово с большой, все пишется в одно слово
        SimpleTask simpleTask = new SimpleTask(5, "Позвоните родителям");
        // cоздаем объект simpleTask и передаем в него параметры
//        radio.next();

        simpleTask.matches("Позвоните родителям");

//                boolean actual = simpleTask.getTitle("Позвонить родителям"); //("Напомните родителям");
        // Oбращаемся к методу matches и передаем туда запрос
        boolean expected = false;   // указываем ожидаемый результат. т.к. в "Позвоните родителям"
        // нет "Напомните", то ожидаем мы false
        //       Assertions.assertEquals(expected, actual);
    }
}
//     public String getTitle() { // Вводим название (текст) задачи
//        return title;
//    }

//    @Test
//    public void testNextStations() {
//        Radio radio = new Radio();
//        radio.setCarrentStation(9);
//        radio.next();
//        int actual = radio.getCarrentStation();
//        int expected = 0;
//        Assertions.assertEquals(expected, actual);
//    }

//    public void prev() {
//        if (carrentStation != 0) {      // Если станция не 0 ...
//            carrentStation--;           // Уменьшаем ее номер на 1
//        } else {
//            carrentStation = 9;             // Иначе, идем на 9-ю
//        }
//    }
////    public int getCarrentStation() {
//        return carrentStation;
//    }
////    public void setCarrentStation(int carentStation) {
//        if (carentStation < 0) {
//            return;
//        }
//        if (carrentStation > 9) {
//            return;
//        }

//    @Test
//    public void simpleTaskTest2() { // обратите вниманеи,что методы называют с маленькой буквы,
//        // а каждое следующее слово с большой, все пишется в одно слово
//        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
//        // cоздаем объект simpleTask и передаем в него параметры
//        boolean actual = simpleTask.matches("Позвонить родителям"); //Oбращаемся к методу matches и передаем туда запрос
//        boolean expected = true; // указываем ожидаемый результат. т.к. в "Позвоните родителям"
//        // нет "Напомнить", то ожидаем мы false
//        Assertions.assertEquals(expected, actual);
//    }
//    @Test
//    public void simpleTaskTest3() { // обратите вниманеи,что методы называют с маленькой буквы,
//        // а каждое следующее слово с большой, все пишется в одно слово
//        SimpleTask simpleTask = new SimpleTask(5, "Навая задача");
//        // cоздаем объект simpleTask и передаем в него параметры
//        boolean actual = simpleTask.matches("Позвонить родителям"); //Oбращаемся к методу matches и передаем туда запрос
//        boolean expected = false; // указываем ожидаемый результат. т.к. в "Позвоните родителям"
//        // нет "Напомнить", то ожидаем мы false
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void simpleTaskTest4() { // обратите вниманеи,что методы называют с маленькой буквы,
//        // а каждое следующее слово с большой, все пишется в одно слово
//        SimpleTask simpleTask = new SimpleTask(5, "Навая задача");
//        // cоздаем объект simpleTask и передаем в него параметры
//        boolean actual = simpleTask.matches("Навая задача"); //Oбращаемся к методу matches и передаем туда запрос
//        boolean expected = true; // указываем ожидаемый результат. т.к. в "Позвоните родителям"
//        // нет "Напомнить", то ожидаем мы false
//        Assertions.assertEquals(expected, actual);
//    }
//    @Test
//    public void Epic() {
//        Epic epic = new Epic(55, "Молоко");   // cоздаем Epic и передаем в него параметры
//        boolean actual = epic.matches("Хлеб"); // обращаемся к методу matches и передаем туда этот запрос
//        boolean expected = false; //  ожидаем false
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void Epic2() {
//        Epic epic = new Epic(55, "Молоко" );   // cоздаем Epic и передаем в него параметры
//        boolean actual = epic.matches("Молоко"); // обращаемся к методу matches и передаем туда этот запрос
//        boolean expected = true; //  ожидаем false
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void Epic3() {
//        Epic epic = new Epic(5,"Боб");   // cоздаем Epic и передаем в него параметры
//        boolean actual = epic.matches("Боб"); // обращаемся к методу matches и передаем туда этот запрос
//        boolean expected = true; //  ожидаем false
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void Meeting() {
//        Meeting meeting = new Meeting(5, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");
//        // cоздаем Meeting и передаем в него параметры
//        boolean actual = meeting.matches("Выкатка 3й версии приложения"); // обращаемся к методу matches и передаем туда запрос
//        boolean expected = true; //  ожидаем false
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void Meeting2() {
//        Meeting meeting = new Meeting(5, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");
//        // cоздаем Meeting и передаем в него параметры
//        boolean actual = meeting.matches("Приложение НетоБанка"); // обращаемся к методу matches и передаем туда запрос
//        boolean expected = true; //  ожидаем false
//        Assertions.assertEquals(expected, actual);
//    }
//    @Test
//    public void Meeting3() {
//        Meeting meeting = new Meeting(5, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");
//        // cоздаем Meeting и передаем в него параметры
//        boolean actual = meeting.matches("Приложение НетоБанка"); // обращаемся к методу matches и передаем туда запрос
//        boolean expected = true; //  ожидаем false
//        Assertions.assertEquals(expected, actual);
//    }
//
//
//}
//// int actual = radio.getCarrentStation();
////  public String getTitle() { // Вводим название (текст) задачи
////        return title;
////    }
