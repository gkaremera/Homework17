package edu.dmacc.codedsm.hw17;


import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        User assignee = new User("Anael","Kuzwa", "anael@gmail.com");
        User assigner = new User("Pauline", "karemera", "5153056518");
        Task task = new Task("Inventory",1,assigner,assignee);
        Person person = new Person();
        person.performTask(task,assignee);
        Office office = new Office();
        office.performTask(task,assignee);
        Group group = new Group();
        group.performTask(task, new ArrayList<>());
    }
}
