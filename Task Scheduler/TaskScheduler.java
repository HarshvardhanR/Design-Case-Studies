import java.util.PriorityQueue;

class Task {
    String name;
    long executeAt; // timestamp in milliseconds

    public Task(String name, long executeAt) {
        this.name = name;
        this.executeAt = executeAt;
    }
}

public class TaskScheduler {
    // Min-heap: task with earliest executeAt at the top
    private PriorityQueue<Task> taskQueue;

    public TaskScheduler() {
        taskQueue = new PriorityQueue<>((a, b) -> Long.compare(a.executeAt, b.executeAt));
    }

    // Schedule a task after delayInSeconds
    public void schedule(String taskName, long delayInSeconds) {
        long executeAt = System.currentTimeMillis() + delayInSeconds * 1000;
        Task task = new Task(taskName, executeAt);
        taskQueue.offer(task);
        System.out.println("Scheduled task '" + taskName + "' to run in " + delayInSeconds + " seconds.");
    }

    // Run all tasks that are ready
    public void run() {
        long now = System.currentTimeMillis();
        while (!taskQueue.isEmpty() && taskQueue.peek().executeAt <= now) {
            Task t = taskQueue.poll();
            System.out.println("Running task: " + t.name + " at " + System.currentTimeMillis());
        }
    }

    // Optional: continuously check for tasks and run them
    public void runContinuously() throws InterruptedException {
        while (true) {
            run();
            Thread.sleep(500); // check every 0.5 seconds
        }
    }

    // ---------------- Example ----------------
    public static void main(String[] args) throws InterruptedException {
        TaskScheduler scheduler = new TaskScheduler();

        scheduler.schedule("Task 1", 2); // runs after 2 seconds
        scheduler.schedule("Task 2", 5); // runs after 5 seconds
        scheduler.schedule("Task 3", 3); // runs after 3 seconds

        // Run tasks manually (simulate a scheduler)
        for (int i = 0; i < 6; i++) {
            scheduler.run();
            Thread.sleep(1000); // wait 1 second
        }

        // Or, to run continuously:
        // scheduler.runContinuously();
    }
}
