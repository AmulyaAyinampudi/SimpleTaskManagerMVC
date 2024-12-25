package Main;

import Controller.TaskControl;
import View.TaskView;

public class Task {
    public static void main(String[] args) {
        TaskView view = new TaskView();
        TaskControl controller = new TaskControl(view);
        controller.run();
    }
}
