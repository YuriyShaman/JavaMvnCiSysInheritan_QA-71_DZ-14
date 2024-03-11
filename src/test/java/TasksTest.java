import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;


public class TasksTest {

    @Test
          public void Find_title_Test() {
          Task task = new Task(5);
           SimpleTask.matches();                  // Идем в класс task, берем результат метода matches
//        Task[] actual = simpleTask.getTitle();        // Прикрутить геттер
//        Task[] expected = simpleTask.getTitle();      // ????
//          Assertions.assertArrayEquals(expected, actual);
        }


}

//    @Test
//    public void Find_title_Test() {
//        Task tasks = new Task(5);
//    String[] actual = manager.findAll();
//    String[] expected = {};
//           Assertions.assertArrayEquals(expected, actual);
//                   }