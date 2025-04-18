package Enum;

public enum TaskStatus {
    Todo("To do", "Gray") {
        @Override
        public boolean isCompleted() {
            return false;
        }
    },
    In_progress("In progress", "Blue") {
        @Override
        public boolean isCompleted() {
            return false;
        }
    },
    Done("Done", "Green") {
        @Override
        public boolean isCompleted() {
            return false;
        }
    };

    private final String label;
    private final String color;

    TaskStatus(String label, String color) {
        this.label = label;
        this.color = color;
    }

    public String getLabel() {
        return label;
    }

    public String getColor() {
        return color;
    }

    public abstract boolean isCompleted();
}
class Task {
    private String name;
    private TaskStatus status;

    public Task(String name, TaskStatus status) {
        this.name = name;
        this.status = status;
    }

    public void printStatus() {
        System.out.println("Task: " + name);
        System.out.println("Status: " + status.getLabel());
        System.out.println("Color: " + status.getColor());
        System.out.println("Is completed? " + status.isCompleted());
    }

    public static void main(String[] args) {
        Task task1 = new Task ("Finish report", TaskStatus.Todo);
        Task task2 = new Task("Review PR", TaskStatus.Done);

        task1.printStatus();
        System.out.println("---");
        task2.printStatus();

        System.out.println("all status options: ");
        for(TaskStatus status : TaskStatus.values()) {
            System.out.println(status + " (" + status.getLabel() + ") - Color: " + status.getColor());
        }
    }
}
