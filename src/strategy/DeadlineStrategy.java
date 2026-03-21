package strategy;

import model.Task;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DeadlineStrategy implements SchedulingStrategy {

    @Override
    public int calculatePriority(Task task) {
        long daysLeft = ChronoUnit.DAYS.between(LocalDate.now(), task.getDeadline());
        return (int)(10 - daysLeft);
    }
}