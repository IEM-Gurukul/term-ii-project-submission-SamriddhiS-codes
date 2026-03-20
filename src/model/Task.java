package model;

public abstract class Task {
    protected String title;

    public Task(String title) {
        this.title = title;
    }

    public abstract int calculatePriority();

    public String getTitle() {
        return title;
    }
}
