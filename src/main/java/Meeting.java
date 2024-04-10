public class Meeting extends Task { // Создан класс Meeting, наследник Task

    private String topic; // Описание переменных
    private String project;
    private String start;

    public Meeting(int id, String topic, String project, String start) {
        super(id);          //  вызов рк Task, взять в нем id
        this.topic = topic; //  заполнение массива topic (тема)
        this.project = project;  // заполнение массива project (название проекта)
        this.start = start; //  заполнение массива start (время старта (текстом))
    }

    public String getTopic() {
        return topic;
    }

    public String getProject() {
        return project;
    }

    public String getStart() {
        return start;
    }

    @Override
    public boolean matches(String query) {
        if (topic.contains(query)) {
            return true;
        }
        if (project.contains(query)) {
            return true;
        }
        if (start.contains(query)) {
            return true;
        }

        return false;
    }


}