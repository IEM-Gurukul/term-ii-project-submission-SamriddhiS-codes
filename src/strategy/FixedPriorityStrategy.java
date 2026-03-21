package strategy;

import model.Task;

public class FixedPriorityStrategy implements SchedulingStrategy {

    @Override
    public int calculatePriority(Task task) {
        return task.calculatePriority();
    }
}