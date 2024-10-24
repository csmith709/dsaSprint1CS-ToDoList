public class TaskList {
    private static class TaskNode {
        Task task;
        TaskNode next;

        public TaskNode (Task task) {
            this.task = task;
            this.next = null;
        }
    }
//    represents the to-do list for a user
//  includes medthods for: add a task, martk as completed,print all tasks 
// get task number

private TaskNode head;

// initialize empt list
public TaskList() {
    this.head = null;
}

// add a task to the list
public void addTask(String description) {
    Task newTask = new Task(description);
    TaskNode newNode = new TaskNode(newTask);

    if (head == null) {
        head = newNode; 
        // if list is empty, new node is head
    } else {
        TaskNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        // add new node to end of list
    }
}

// mark a task as done
public void markAsCompleted(int index) {
    TaskNode temp = head;
    int counter = 0;

    while (temp != null) {
        if (counter == index) {
            temp.task.markAsDone();
            return;
        }
        temp = temp.next;
        counter++;
    }
    System.out.println("Invalid task index");
}

// print all tasks in the list
public void printAllTasks() {
    TaskNode temp = head;
    int counter = 0;

    if (temp == null) {
        System.out.println("no tasks available");
        return;
    }
    while (temp != null) {
        System.out.println(counter + ". " + temp.task);
        temp = temp.next;
        counter++;
    }
}

// get the number of tasks in the list
public int getTaskNumber() {
    TaskNode temp = head;
    int counter = 0;

    while (temp != null) {
        temp = temp.next;
        counter++;
    }
    return counter;
}
}