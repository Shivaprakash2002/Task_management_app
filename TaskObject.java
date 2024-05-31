package com.newproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskObject {

    public static void main(String[] args) {
        
        String lists[] = 
            {"Add Task",
             "Edit Task",
             "Delete Task",
             "View All Tasks",
             "Exit"};
        
        List<Addtask> tasks = new ArrayList<>(); 

        Scanner sc = new Scanner(System.in);

        while(true) {
            int sno = 1;
            for(String list : lists) {
                System.out.println(sno + ". " + list);
                ++sno;
            }

            System.out.print("Enter the Choice (1-5) : ");
            int value = sc.nextInt();
            sc.nextLine(); 

            switch(value) {
                case 1:
                    // Add Task
                    Addtask newTask = new Addtask();
                    System.out.println("Enter task title :");
                    String title = sc.nextLine();
                    newTask.setTitle(title);

                    System.out.println("Enter task description :");
                    String description = sc.nextLine();
                    newTask.setDescription(description);

                    System.out.println("Enter task priority (High/Medium/Low):");
                    String priority = sc.nextLine();
                    newTask.setPriority(priority);

                    System.out.println("Enter task status (Pending/In progress/Completed):");
                    String status = sc.nextLine();
                    newTask.setStatus(status);

                    tasks.add(newTask); // Add the new task to the list
                    System.out.println("Task Added");
                    break;

                case 2:
                    System.out.println("Enter task number to edit:");
                    int editIndex = sc.nextInt() - 1;
                    sc.nextLine(); 

                    if (editIndex >= 0 && editIndex < tasks.size()) {
                        Addtask taskToEdit = tasks.get(editIndex);

                        System.out.println("Enter new title (leave blank to keep existing):");
                        String newTitle = sc.nextLine();
                        if (!newTitle.isEmpty()) {
                            taskToEdit.setTitle(newTitle);
                        }

                        System.out.println("Enter new description (leave blank to keep existing):");
                        String newDescription = sc.nextLine();
                        if (!newDescription.isEmpty()) {
                            taskToEdit.setDescription(newDescription);
                        }

                        System.out.println("Enter new priority (leave blank to keep existing):");
                        String newPriority = sc.nextLine();
                        if (!newPriority.isEmpty()) {
                            taskToEdit.setPriority(newPriority);
                        }

                        System.out.println("Enter new status (leave blank to keep existing):");
                        String newStatus = sc.nextLine();
                        if (!newStatus.isEmpty()) {
                            taskToEdit.setStatus(newStatus);
                        }

                        System.out.println("Task Updated");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case 3:
                    System.out.println("Enter task number to delete:");
                    int deleteIndex = sc.nextInt() - 1;
                    sc.nextLine(); 

                    if (deleteIndex >= 0 && deleteIndex < tasks.size()) {
                        tasks.remove(deleteIndex); 
                        System.out.println("Task Deleted");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case 4:
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i).toString());
                    }
                    break;

                case 5:
                    System.out.println("Exiting");

                default:
                    System.out.println("Invalid value entered.");
                    break;
            }
        }
    }
}

