package model;

public class WorkTask extends Task {

    private String projectName;

    public WorkTask(String title, String projectName) {
        super(title);
        this.projectName = projectName;
    }

    @Override
    public int calculatePriority() {
        return 8;
    }
}
