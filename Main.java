import java.util.Scanner;

    // creates users and adds them to an array
    // adds tasks to a users task list
    // marks tasks as done
    // prints all tasks for each user

    // user login
    // user logout


public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User[] users = new User[10];
        // allows for 10 users to be created
        int userCount = 0;
        

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create User");
            System.out.println("2. Login");
            System.out.println("3. Add Task");
            System.out.println("4. Mark Task as Done");
            System.out.println("5. Print Tasks");
            System.out.println("6. Logout");
            System.out.println("7. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                // add user
                System.out.println("Enter username:");
                String username = scanner.nextLine();
                users[userCount] = new User(username);
                userCount++;

            } else if (choice == 2) {
                // login
                System.out.println("Enter username:");
                String username = scanner.nextLine();
                if (!User.login(username)) {
                        System.out.println("Login failed");
                        continue;   
                } else {
                    System.out.println("Login successful");
                }

            } else if (choice == 3) {
                // add task
                System.out.println("Enter task:");
                String task = scanner.nextLine();
                if (User.loggedInUser != null) {
                    User.loggedInUser.addTask(task);
                    } else {
                        System.out.println("Please login first");
                        continue;
                    }

            } else if (choice == 4) {
                // mark as done
                if (User.loggedInUser != null) {
                    System.out.println("Enter task number:");
                    int taskNumber = scanner.nextInt();
                    User.loggedInUser.markAsCompleted(taskNumber);
                } else {
                    System.out.println("Please login first");
                    continue;
                }
            } else if (choice == 5) {
                if (User.loggedInUser != null) {
                    User.loggedInUser.printAllTasks();
                } else {
                    System.out.println("Please login first");
                    continue;
                }
            } else if (choice == 6) {
                User.logout();
            } else if (choice == 7) {
                break;
        }
    }
}
}
