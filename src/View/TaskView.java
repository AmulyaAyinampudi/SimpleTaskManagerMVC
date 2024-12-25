package View;

import java.util.Scanner;

public class TaskView {
    private Scanner scanner;

    public TaskView() {
        scanner = new Scanner(System.in);
    }

    public int showMenuAndGetChoice() {
        System.out.println("\n=== Task Manager ===");
        System.out.println("1. Create Task");
        System.out.println("2. View All Tasks");
        System.out.println("3. Update Task");
        System.out.println("4. Mark Task as Complete");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    public String getTaskTitle() {
        System.out.print("Enter Task Title: ");
        return scanner.next();
    }

    public String getTaskDescription() {
        System.out.print("Enter Task Description: ");
        return scanner.next();
    }

    public int getTaskPriority() {
        System.out.print("Enter Task Priority (1-High, 2-Medium, 3-Low): ");
        return scanner.nextInt();
    }

    public int getTaskId() {
        System.out.print("Enter Task ID: ");
        return scanner.nextInt();
    }

    public void showTask(String taskDetails) {
        System.out.println(taskDetails);
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
