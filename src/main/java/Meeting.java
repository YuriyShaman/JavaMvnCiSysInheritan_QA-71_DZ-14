public class Meeting extends Task {

    protected String title;

    public Meeting(int id, String topic, String project, String start) {
        super(id);          // вызов родительского конструктора
        this.title = title; // заполнение своих полей
    }

    public String getTitle() {
        return title;
    }

//    ************************************************************
//    @Override
//    public boolean matches(String query) {
//        if (topic.contains(query)) {
//            return true;
//        }
//        if (project.contains(query)) {
//            return true;
//        }
//        return false;
//    }
}

// ******************************************
//    @Override
//    public boolean matches(String query) {
//        if (title.contains(query)) {
//            return true;
//        }
//            return false;
//    }
//    public boolean matches(String query) {
//        return false;
//    }
// *******************************************
//    @Override
//    public boolean matches(String query) {
//        if (topic.contains(query)) {
//            return true;
//        }
//        if (project.contains(query)) {
//            return true;
//        }
//       if (title.contains(query)) {
//            return true;
//        }
//        return false;
//    }
// *******************************************
//    public boolean matches(String query) {
//        return false;
//    }
