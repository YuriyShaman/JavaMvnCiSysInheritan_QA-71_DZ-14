public class Epic extends Task {

    protected String title;


    public Epic(int id, String subtasks) {
        super(id); // вызов родительского конструктора
        this.title = title; // заполнение своих полей
    }

    public String getEpic() {
        return title;
    }

//    @Override
//    public boolean matches(String query) {
//        if (subtasks.contains(query)) {
//            return true;
//        }
//        return false;
//    }
}