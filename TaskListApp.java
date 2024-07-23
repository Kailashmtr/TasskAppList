import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskListApp {
    static List<String> taskList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Task List App");
            System.out.println("------------");
            System.out.println("1. Create Task");
            System.out.println("2. Read Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    createTask(scanner);
                    break;
                case 2:
                    readTasks();
                    break;
                case 3:
                    updateTask(scanner);
                    break;
                case 4:
                    deleteTask(scanner);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    static void createTask(Scanner scanner) {
        System.out.print("Enter a new task: ");
        String task = scanner.next();
        taskList.add(task);
        System.out.println("Task created successfully!");
    }

    static void readTasks() {
        if (taskList.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Task List:");
            for (int i = 0; i < taskList.size(); i++) {
                System.out.println((i + 1) + ". " + taskList.get(i));
            }
        }
    }

    static void updateTask(Scanner scanner) {
        System.out.print("Enter the task number to update: ");
        int taskNumber = scanner.nextInt();
        if (taskNumber > 0 && taskNumber <= taskList.size()) {
            System.out.print("Enter the new task: ");
            String newTask = scanner.next();
            taskList.set(taskNumber - 1, newTask);
            System.out.println("Task updated successfully!");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    static void deleteTask(Scanner scanner) {
        System.out.print("Enter the task number to delete: ");
        int taskNumber = scanner.nextInt();
        if (taskNumber > 0 && taskNumber <= taskList.size()) {
            taskList.remove(taskNumber - 1);
            System.out.println("Task deleted successfully!");
        } else {
            System.out.println("Invalid task number.");
        }
    }
}
