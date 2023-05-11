package org.example;

import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    static ArrayList<Task> todolist = new ArrayList<>();

    public static void main(String[] args) {
        Date date = new Date();

        while (true) {
            Scanner console = new Scanner(System.in);
            System.out.println("Привет! Что хочешь сделать? (Создать задачу/Показать задачи/Удалить задачу/Выход)");
            String a = console.nextLine().toLowerCase();
            if (a.equalsIgnoreCase("создать задачу")) {
                Scanner console1 = new Scanner(System.in);
                System.out.println("Наименование задачи: ");
                String name = console1.nextLine();
                Scanner console2 = new Scanner(System.in);
                System.out.println("Описание задачи: ");
                String description = console2.nextLine();
                Task task = new Task(name, description);
                todolist.add(task);
            }
            else if(a.equalsIgnoreCase("показать задачи")) {
                for(int i = 0; i < todolist.size(); i++) {
                    System.out.println("Задача №:" + (i + 1) +"\n " + todolist.get(i).getName() +"\n"+ date);
                }
            }
            else if(a.equalsIgnoreCase("удалить задачу")) {
                Scanner console3 = new Scanner(System.in);
                System.out.println("Номер задачи: ");
                int id = console3.nextInt();
                todolist.remove(id-1);
            }
            else if(a.equalsIgnoreCase("выход")) {
                System.err.println("До свидания!");
                System.exit(0);
            }
            else {
                System.out.println("Неверная команда");
            }
        }
    }
}