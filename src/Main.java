import exampleQueue.Person;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
       ToDoList myList = new ToDoList("Tarefas Domésticas");
       ToDoList.TodoItem myItems = myList.new TodoItem();
        myItems.createStreams();

        System.out.println(myList.tasksList.get(0).taskDescription);
    }
}