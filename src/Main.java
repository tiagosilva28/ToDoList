import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
       ToDoList toDoList = new ToDoList("Tarefas Domésticas");
       ToDoList.TodoItem todoItem = toDoList.new TodoItem();

       todoItem.createStreams();
       //todoItem.addTask();
       //todoItem.removeTask();
        //teste

        System.out.println(toDoList.tasksList.get(0).taskDescription);
    }
}