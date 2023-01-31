import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ToDoList {
    String name;
    Queue<TodoItem> priorityQueue;
    ArrayList<TodoItem> tasksList;
    private BufferedReader consoleReader;


    public ToDoList(String name) {
        this.name = name;
        this.priorityQueue = new PriorityQueue<>();
        this.tasksList = new ArrayList<TodoItem>();
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

        void addTask(TodoItem task) throws IOException {
            task.taskName = userAskInput(Messages.TASK_NAME);
            task.taskDescription = userAskInput(Messages.TASK_DESCRIPTION);
            task.priorityLevel = Integer.parseInt(userAskInput(Messages.TASK_PRIORITY_LEVEL));
            tasksList.add(new TodoItem(task.taskName,task.taskDescription,task.priorityLevel));
        }
        void removeTask(TodoItem task){
            tasksList.remove(task);


        }
        void getNextTask() {
            //aaaaaa

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
