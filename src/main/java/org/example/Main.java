package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите команду:");
            String command = scanner.nextLine().toLowerCase();
            if (command.equalsIgnoreCase("Создать задачу")) {
                createTask(tasks, scanner);
            } else if (command.equalsIgnoreCase("Список задач")) {
                listTasks(tasks);
            } else if (command.equalsIgnoreCase("Удалить")) {
                deleteTask(tasks, scanner);
            } else {
                System.out.println("Неизвестная команда");
            }
        }
    }

    private static void createTask(List<Task> tasks, Scanner scanner) {
        System.out.println("Введите название задачи:");
        String name = scanner.nextLine();
        System.out.println("Введите описание задачи:");
        String description = scanner.nextLine();
        Task task = new Task(name, description);
        tasks.add(task);
        System.out.println("Задача создана");
    }

    private static void listTasks(List<Task> tasks) {
        System.out.println("Список задач:");
        for (Task task : tasks) {
            System.out.println(task.getName());
        }
    }

    private static void deleteTask(List<Task> tasks, Scanner scanner) {
        System.out.println("Введите название задачи:");
        String name = scanner.nextLine();
        for (Task task : tasks) {
            if (task.getName().equals(name)) {
                tasks.remove(task);
                System.out.println("Задача удалена");
                return;
            }
        }
        System.out.println("Задача не найдена");
    }
}

