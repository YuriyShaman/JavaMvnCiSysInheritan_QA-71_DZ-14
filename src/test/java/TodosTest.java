import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;



    public class TodosTest {


    @Test
    public void shouldAddThreeTasksOfDifferentType() {

        SimpleTask simpleTask = new SimpleTask(5,"Купиите родителям"); // "Купите родителям" "Позвоните родителям"

        String[] subtasks = {"Хлеб","Молоко", "Яйца"};//  "Чай"
        Epic epic = new Epic(55, "Хлеб" );

        Meeting meeting = new Meeting(
                555,
                "Выкатка 10й версии приложения",
                "Приложение 7 НетоБанка",
                "Во вторник 65 после обеда"
       );
        Todos todos = new Todos();
        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] actual = todos.findAll();
        Task[] expected = {simpleTask, epic, meeting};
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldAddThreeTasksOfDifferentType1() {

       SimpleTask simpleTask = new SimpleTask(5, "Купите Хлеб");  // "Купите Молоко"

       String[] subtasks = {"Хлеб","Молоко", "Яйца" };
        Epic epic = new Epic(55, "Хлеб");

       Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        Todos todos = new Todos();
        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = {simpleTask,epic};
        Task[] actual = todos.search("Хлеб");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddThreeTasksOfDifferentType2() {

        SimpleTask simpleTask = new SimpleTask(5, "Купите Хлеб");  // "Купите Молоко"

        String[] subtasks = {"Хлеб","Молоко", "Яйца" };
        Epic epic = new Epic(55, "Хлеб");

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        Todos todos = new Todos();
        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = {meeting};
        Task[] actual = todos.search("Выкатка");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddThreeTasksOfDifferentType3() {

        SimpleTask simpleTask = new SimpleTask(5, "Купите Хлеб");  // "Купите Молоко"

        String[] subtasks = {"Хлеб","Молоко", "Яйца" };
        Epic epic = new Epic(55, "Хлеб");

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        Todos todos = new Todos();
        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = {};
        Task[] actual = todos.search("Ничего");
        Assertions.assertArrayEquals(expected, actual);
    }

}
