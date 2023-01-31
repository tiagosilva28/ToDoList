import java.io.BufferedReader;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ToDoList {
    String name;
    Queue<TodoItem> priorityQueue;
    Iterator<TodoItem> iterator = priorityQueue.iterator();
    private BufferedReader consoleReader;


    public ToDoList(String name) {
        this.name = name;
        this.priorityQueue = new PriorityQueue<TodoItem>();
    }

    protected void addTask(TodoItem task) {
        priorityQueue.add(task);

    }

    void removeTask(TodoItem task) {
        priorityQueue.remove(task);

    }

    TodoItem getNextTask() {
        return priorityQueue.peek();

    }

    void getAllTasks() {
        Iterator<TodoItem> iterator = priorityQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    void getIncompleteTasks() {
        while (iterator.hasNext()) {
            TodoItem todoItem = iterator.next();
            if (!todoItem.isComplete) {
                System.out.println(todoItem);
            }
        }
    }

    void getCompleteTasks() {
        while (iterator.hasNext()) {
            TodoItem todoItem = iterator.next();
            if (todoItem.isComplete) {
                System.out.println(todoItem);
            }
        }

    }

    void markTaskComplete(TodoItem task) {
        task.isComplete = true;

    }

    void markTaskIncomplete(TodoItem task) {
        task.isComplete = false;
    }

    protected class TodoItem implements Comparable<TodoItem> {
        String taskName;
        String taskDescription;
        boolean isComplete;
        int priorityLevel;

        public TodoItem() {
        }

        public TodoItem(String taskName, String taskDescription, int priorityLevel) {
            this.taskName = taskName;
            this.taskDescription = taskDescription;
            this.isComplete = false;
            this.priorityLevel = priorityLevel;
        }

        @Override
        public String toString() {
            return "TodoItem{" +
                    "taskName='" + taskName + '\'' +
                    ", taskDescription='" + taskDescription + '\'' +
                    ", isComplete=" + isComplete +
                    ", priorityLevel=" + priorityLevel +
                    '}' + '\n';
        }

        @Override
        public int compareTo(TodoItem o) {
            return this.priorityLevel - o.priorityLevel;
        }
    }
}
