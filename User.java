public class User {
    private String name;
    private TaskList taskList;
    public boolean isLoggedIn;

    // 1. create user
    // 2. store users in an array
    // 3. each user has a unique name
    // 4. login user
    // 5. logout user

    // 1. create user
    public User(String name) {
        this.name = name;
        this.taskList = new TaskList();
    }

    // 2. store users in an array
    public static User[] users = new User[10];
    public static int userCount = 0;

    // 3. each user has a unique name
    public static boolean addUser(String name){
    for (int i = 0; i < userCount; i++) {
        if (name.equals(users[i].name)) {
            System.out.println("User already exists");
            return false;
        }
    }
    users[userCount] = new User(name);
    userCount++;
    return true;
}

    // 4. login user
    public static User loggedInUser = null;
    public static boolean login(String name) {
        for (int i = 0; i < userCount; i++) {
            if (name.equals(users[i].name)) {
                loggedInUser = users[i];
                System.out.println("User logged in");
                return true;
            }
        }
        System.out.println("User not found");
        return false;
    }

    // 5. logout user
    public static void logout() {
        if (loggedInUser != null) {
            System.out.println("No user logged in");
            loggedInUser = null;
        } else {
        System.out.println("User logged out");
        }
    }

    // 6. add task
    // 7. makr task as done
    // 8.print all tasks
    // getter for the user name
    // isLogged in

    // 6. add task
    public void addTask(String description) {
        taskList.addTask(description);
        int taskNumber = taskList.getTaskNumber();
        System.out.println("Task " + taskNumber + " is added");
    }

    // 7. mark task as done
    public void markTaskAsDone(int taskIndex) {
        taskList.markAsCompleted(taskIndex);
    }

    // 8. print all tasks for user
    public void printAllTasks() {
        System.out.println("Tasks for user: " + name);
        taskList.printAllTasks();
    }
   
    // getter for the user name
    public String getName() {
        return name;
    }

    // isLogged in
    public boolean isLoggedIn() {
        return this == loggedInUser;
    }

    public void markAsCompleted(int taskNumber) {
        taskList.markAsCompleted(taskNumber);
    }
}