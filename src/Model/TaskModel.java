package Model;

public class TaskModel {
    private int id;
    private String title;
    private String description;
    private int priority; // 1-High, 2-Medium, 3-Low
    private boolean isComplete;

    public TaskModel(int id, String title, String description, int priority) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.isComplete = false;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public int getPriority() { return priority; }
    public boolean isComplete() { return isComplete; }

    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setPriority(int priority) { this.priority = priority; }
    public void setComplete(boolean complete) { isComplete = complete; }

    @Override
    public String toString() {
        return "Task ID: " + id + ", Title: " + title + ", Description: " + description +
                ", Priority: " + priority + ", Completed: " + (isComplete ? "Yes" : "No");
     }
 }
