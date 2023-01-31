import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
       ToDoList toDoList = new ToDoList();
       ToDoList.TodoItem todoItem = toDoList.new TodoItem();

       todoItem.createStreams();
       todoItem.addTask();

        System.out.println(toDoList.tasks.get(0).taskDescription);
    }
}