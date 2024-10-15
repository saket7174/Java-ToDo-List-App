package com.student;
import java.util.*;

public class ToDo {
	
	private List<String>tasks;
//	private Scanner r;
	
	Scanner r  = new Scanner(System.in);
	public ToDo() {
		tasks= new ArrayList<>();
	}
	
	private void run() {
		boolean running = true ;
		while(running ) {
			System.out.println("\n*...............To Do List....................*");
			System.out.println("1. Add Task");
			System.out.println("2. Delete Task");
			System.out.println("3. View All Task");
			System.out.println("4. Quit");
			System.out.println("\nEnter Your Choice ");
			int choice = r.nextInt();
			r.nextLine();
			
			switch(choice) {
			case 1 :
				addTask();
			break;
			
			case 2:
				deletetask();
				break;
				
			case 3:
				displayTask();
				break;
				
			case 4:
				running = false;
				break;
				
				default:
					System.out.println("Inalid Choice ");
					break;
			
			}
			
		}
	}
	
	private void addTask() {
		System.out.println("\nEnter Task:");
		String task = r.nextLine();
		tasks.add(task);
		System.out.println("Task Added Successfully !");
	}
	
	private void deletetask() {
		System.out.println("\nEnter Task to be Deleated :");
		int tasknum = r.nextInt();
		r.nextLine();
		if(tasknum>0 && tasknum<=tasks.size()) {
		tasks.remove(tasknum-1);
		System.out.println("Task Deleated  Successfully !");
	}else {
		System.out.println("Invlid Task Number ");
	}
	}
	private void displayTask() {
		if(tasks.isEmpty()) {
			System.out.println("No Task to Display");
			
		}else {
			for (int i = 0;i<tasks.size();i++) {
				System.out.println((i+1)+ "." +tasks.get(i));
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToDo box = new ToDo();  // Create ToDo instance
        box.run();  
	}

}
