import java.util.PriorityQueue;
import java.util.Queue;

public class ToDoList {
    String name;
    Queue<Integer> priorityQueue = new PriorityQueue<>();

    public class TodoItem{
        String taskName;
        String taskDescription;
        boolean isComplete;
        int priorityLevel;

        void addTask(TodoItem task) {}
        void removeTask(TodoItem task){}
        void getNextTask() {}
        void getAllTasks(){}
        void getIncompleteTasks(){}
        void getCompleteTasks(){}
        void markTaskComplete(TodoItem task){}
        void markTaskIncomplete(TodoItem task){}




    }
}
