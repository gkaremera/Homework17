package edu.dmacc.codedsm.hw17;

import java.util.List;

public class Group extends TaskPerformer {
    @Override
    public void performTask(Task task, List<User> users) {
        System.out.println("Here I m in the group class");
    }
}
