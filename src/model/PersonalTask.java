package model;

public class PersonalTask extends Task {

    private String category;

    public PersonalTask(String title, String category) {
        super(title);
        this.category = category;
    }

    @Override
    public int calculatePriority() {
        return 5;
    }
}