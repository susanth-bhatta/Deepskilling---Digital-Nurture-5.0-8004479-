public class Main {

    public static void main(String[] args) {

        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(101, "Complete Java Assignment", "Pending");
        taskList.addTask(102, "Prepare Presentation", "In Progress");
        taskList.addTask(103, "Submit Report", "Completed");

        System.out.println("\nTask List:");

        taskList.displayTasks();

        System.out.println("\nSearching Task ID 102:");

        Task task = taskList.searchTask(102);

        if (task != null)
            System.out.println(task);
        else
            System.out.println("Task Not Found.");

        taskList.deleteTask(101);

        System.out.println("\nAfter Deletion:");

        taskList.displayTasks();
    }
}