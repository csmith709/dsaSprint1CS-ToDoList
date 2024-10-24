public class Task{
    public String description;
    public boolean isDone;
    //  store the description and cpmletion of a task
    // method to mark tasks as complete

    // initialize
    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    // mark as done
    public void markAsDone() {
        this.isDone = true;
    }

    // method to return as a string
    @Override
    public String toString() {
        String status = isDone ? "Completed" : "Pending";
        return description + " (" + status + ")";
    }

    // getter for cpmpetion status
    public boolean getCompleted() {
        return isDone;
    }

}