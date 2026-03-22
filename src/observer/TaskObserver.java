package observer;

import model.Task;

public interface TaskObserver {
    void onTaskAdded(Task task);
    void onTaskUpdated(Task task);
    void onTaskCompleted(Task task);
}