package com.wipro.EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

// Employee Class
class EmployeeManagementSystem {
    private int id;
    private String name;
    private String department;

    public EmployeeManagementSystem(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee[ID=" + id + ", Name=" + name + ", Department=" + department + "]";
    }
}

// Task Class
class Task implements Comparable<Task> {
    private int taskId;
    private String description;
    private String priority;
    private String status;

    public Task(int taskId, String description, String priority, String status) {
        this.taskId = taskId;
        this.description = description;
        this.priority = priority;
        this.status = status;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getDescription() {
        return description;
    }

    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int compareTo(Task other) {
        return this.priority.compareTo(other.priority);
    }

    @Override
    public String toString() {
        return "Task[ID=" + taskId + ", Description=" + description + ", Priority=" + priority + ", Status=" + status + "]";
    }
}

 class Employee {
    private static HashMap<Integer, Employee> employees = new HashMap<>();
    private static HashMap<Integer, List<Task>> employeeTasks = new HashMap<>();
    private static PriorityQueue<Task> taskQueue = new PriorityQueue<>();
    private static LinkedList<Task> pendingTasks = new LinkedList<>();

    public Employee(int id, String name, String department) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nEmployee Task Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Assign Task");
            System.out.println("3. View Tasks by Priority");
            System.out.println("4. View Tasks by Employee or Department");
            System.out.println("5. Remove Completed Tasks");
            System.out.println("6. View Pending Tasks");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addEmployee(scanner);
                    break;
                case 2:
                    assignTask(scanner);
                    break;
                case 3:
                    viewTasksByPriority();
                    break;
                case 4:
                    viewTasksByEmployeeOrDepartment(scanner);
                    break;
                case 5:
                    removeCompletedTasks();
                    break;
                case 6:
                    viewPendingTasks();
                    break;
                case 7:
                    System.out.println("Exiting system. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addEmployee(Scanner scanner) {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee Department: ");
        String department = scanner.nextLine();

        Employee employee = new Employee(id, name, department);
        employees.put(id, employee);
        employeeTasks.put(id, new ArrayList<>());
        System.out.println("Employee added successfully!");
    }

    private static void assignTask(Scanner scanner) {
        System.out.print("Enter Employee ID to assign task: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine();

        if (!employees.containsKey(employeeId)) {
            System.out.println("Employee ID not found.");
            return;
        }

        System.out.print("Enter Task ID: ");
        int taskId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Task Description: ");
        String description = scanner.nextLine();
        System.out.print("Enter Task Priority (High/Medium/Low): ");
        String priority = scanner.nextLine();
        System.out.print("Enter Task Status (Pending/Completed): ");
        String status = scanner.nextLine();

        Task task = new Task(taskId, description, priority, status);
        employeeTasks.get(employeeId).add(task);
        taskQueue.offer(task);

        if (status.equalsIgnoreCase("Pending")) {
            pendingTasks.add(task);
        }

        System.out.println("Task assigned successfully!");
    }

    private static void viewTasksByPriority() {
        System.out.println("Tasks sorted by priority:");
        PriorityQueue<Task> tempQueue = new PriorityQueue<>(taskQueue);
        while (!tempQueue.isEmpty()) {
            System.out.println(tempQueue.poll());
        }
    }

    private static void viewTasksByEmployeeOrDepartment(Scanner scanner) {
        System.out.print("Enter Employee Name or Department to view tasks: ");
        String input = scanner.nextLine();

        for (Map.Entry<Integer, Employee> entry : employees.entrySet()) {
            Employee employee = entry.getValue();
            if (employee.getName().equalsIgnoreCase(input) || employee.getDepartment().equalsIgnoreCase(input)) {
                System.out.println("Tasks for " + employee.getName() + " (" + employee.getDepartment() + "):");
                List<Task> tasks = employeeTasks.get(entry.getKey());
                for (Task task : tasks) {
                    System.out.println(task);
                }
            }
        }
    }

    private String getDepartment() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void removeCompletedTasks() {
        Iterator<Task> iterator = pendingTasks.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (task.getStatus().equalsIgnoreCase("Completed")) {
                iterator.remove();
            }
        }
        System.out.println("Completed tasks removed successfully!");
    }

    private static void viewPendingTasks() {
        System.out.println("Pending tasks:");
        for (Task task : pendingTasks) {
            System.out.println(task);
        }
    }
}

