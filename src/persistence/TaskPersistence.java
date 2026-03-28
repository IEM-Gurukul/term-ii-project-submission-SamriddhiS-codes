package persistence;

import model.Task;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaskPersistence {

    private static final String FILE_NAME = "tasks.ser";

    public static void saveTasks(List<Task> tasks) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(tasks);
            System.out.println("Tasks saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving tasks: " + e.getMessage());
        }
    }
    public static List<Task> loadTasks() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Task>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No previous tasks found. Starting fresh.");
            return new ArrayList<>();
        }
    }
}
