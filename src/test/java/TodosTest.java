import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodosTest {

    @Test
    public void shouldAddThreeTasksOfDifferentType1() {


        SimpleTask simpleTask = new SimpleTask(5,"Купить"); // "Купите родителям" "Позвоните родителям"

        String[] subtasks = {"Хлеб","Молоко", "Яйца"};//  "Чай"
        Epic epic = new Epic(55, "Чай" );

//        Meeting meeting = new Meeting(
//                555,
//                "Выкатка 3й версии приложения",
//                "Приложение НетоБанка",
//                "Во вторник после обеда"
//       );
        Todos todos = new Todos();
        todos.add(simpleTask);
        todos.add(epic);
//        todos.add(meeting);
//
        Task[] expected = {simpleTask, epic}; //, epic, meeting};
        Task[] actual = todos.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}

//    @Test
//    public void shouldAddThreeTasksOfDifferentType() {
//
//        SimpleTask simpleTask = new SimpleTask(5, "Зайдите ");
//
//       String[] subtasks = {"Хлеб","Молоко", "Яйца" };
//        Epic epic = new Epic(55, "Молоко");
//
//        Meeting meeting = new Meeting(
//                555,
//                "Выкатка 3й версии приложения",
//                "Приложение НетоБанка",
//                "Во вторник после обеда"
//        );
//        Todos todos = new Todos();
//        todos.add(simpleTask);
//        todos.add(epic);
//        todos.add(meeting);
//
//        Task[] expected = {simpleTask, epic, meeting};
//        Task[] actual = todos.findAll();
//        Assertions.assertArrayEquals(expected, actual);
//    }

//}
