package model;

import java.time.LocalDate;

public abstract class Task {
    protected String title;
    protected LocalDate deadline;

    public Task(String title) {
        this.title = title;
    }

    public Task(String title, LocalDate deadline) {
        this.title = title;
        this.deadline = deadline;
    }

    public abstract int calculatePriority();

    public String getTitle() {
        return title;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }
}