import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ToDoList {
    String name;
    Queue<Integer> priorityQueue = new PriorityQueue<>();
    ArrayList<TodoItem> tasks;
    private BufferedReader consoleReader;


    public ToDoList() {
        this.name = "Lista 1";
        this.priorityQueue = new PriorityQueue<>();
        this.tasks = new ArrayList<TodoItem>();
    }




    public class TodoItem{
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

        public void createStreams() throws IOException {
            consoleReader = new BufferedReader(new InputStreamReader(System.in));
        }

        public String userAskInput(String message) throws IOException {

            System.out.println(message);
            return consoleReader.readLine();
        }

        void addTask() throws IOException {
            this.taskName = userAskInput(Messages.TASK_NAME);
            this.taskDescription = userAskInput(Messages.TASK_DESCRIPTION);
            this.priorityLevel = Integer.parseInt(userAskInput(Messages.TASK_PRIORITY_LEVEL));
            tasks.add(new TodoItem(this.taskName,this.taskDescription,this.priorityLevel));
        }
        void removeTask(TodoItem task){

        }
        void getNextTask() {

        }
        void getAllTasks(){

        }
        void getIncompleteTasks(){

        }
        void getCompleteTasks(){

        }
        void markTaskComplete(TodoItem task){

        }
        void markTaskIncomplete(TodoItem task){

        }




    }
}
