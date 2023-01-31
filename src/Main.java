import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ToDoList myList = new ToDoList("Tarefas Domésticas");

        // Add tasks to myList
        myList.addTask(myList.new TodoItem("Cozinha", "Limpar a Cozinha", 6));
        myList.addTask(myList.new TodoItem("Cozinha", "Limpar a Cozinha", 5));
        myList.addTask(myList.new TodoItem("Sala", "Aspirar a Sala", 4));
        myList.addTask(myList.new TodoItem("Quarto", "Arrumar a Roupa", 3));
        myList.addTask(myList.new TodoItem("Casa de Banho", "Limpar a banheira", 2));
        myList.addTask(myList.new TodoItem("Jardim", "Cortar a relva", 1));


        //System.out.println(myList.tasksList);
        //myList.getAllTasks();
        myList.markTaskComplete(myList.getNextTask());
        myList.getIncompleteTasks();


    }
}