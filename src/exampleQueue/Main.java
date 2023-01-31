package exampleQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        PriorityQueue<Person> persons= new PriorityQueue<>();

        persons.add(new Person(10, "Z"));
        persons.add(new Person(2, "A"));
        persons.add(new Person(50, "N"));


        Iterator<Person> iterator= persons.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        // quantas pessoas quer criar? N

       /* for (int i = 0; i < 5; i++) {
            // qual é o nome dele? qual é a idade? X Z
            persons.add(new Person(50, "N"));
        }*/

        System.out.println(persons.poll());
        System.out.println(persons.poll());
        System.out.println(persons.poll());

    }
}
