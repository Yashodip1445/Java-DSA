import java.util.Scanner;

class TodoApp {

    static String[] tasks = new String[10]; // fixed size
    static int count = 0;                  // number of tasks
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n=== TO-DO LIST MENU ===");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Done");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1 -> addTask();
                case 2 -> viewTasks();
                case 3 -> markDone();
                case 4 -> deleteTask();
                case 5 -> {
                    System.out.println("Goodbye 👋");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    static void addTask() {
        if (count == tasks.length) {
            System.out.println("Task list is full ❌");
            return;
        }

        System.out.print("Enter task: ");
        tasks[count] = sc.nextLine();
        count++;
        System.out.println("Task added ✔");
    }

    static void viewTasks() {
        if (count == 0) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("\nYour Tasks:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + tasks[i]);
        }
    }

    static void markDone() {
        viewTasks();
        if (count == 0) return;

        System.out.print("Enter task number to mark done: ");
        int index = sc.nextInt() - 1;

        if (index >= 0 && index < count) {
            tasks[index] = tasks[index] + " ✔";
            System.out.println("Task marked as done 🎉");
        } else {
            System.out.println("Invalid task number!");
        }
    }

    static void deleteTask() {
        viewTasks();
        if (count == 0) return;

        System.out.print("Enter task number to delete: ");
        int index = sc.nextInt() - 1;

        if (index >= 0 && index < count) {
            // shift elements left
            for (int i = index; i < count - 1; i++) {
                tasks[i] = tasks[i + 1];
            }
            tasks[count - 1] = null;
            count--;

            System.out.println("Task deleted ❌");
        } else {
            System.out.println("Invalid task number!");
        }
    }
}
