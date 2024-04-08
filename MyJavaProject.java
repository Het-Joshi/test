import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ThemeParkQueueSimulation {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			Queue<String> themeParkQueue = new LinkedList<>();

			System.out.println("Welcome to the Theme Park Queue Simulation!");
			System.out.println("You are at the entrance of the theme park.");

			while (true) {
			    System.out.println("\nMenu:");
			    System.out.println("1. Join the queue");
			    System.out.println
			    ("2. Check the queue length");
			    System.out.println
			    ("3. Let the next person enter");
			    System.out.println
			    ("4. Exit the theme park");

			    System.out.print("Enter your choice: ");
			    int choice = scanner.nextInt();

			    switch (choice) {
			        case 1:
			            scanner.nextLine(); 
			            // Consume newline character
			            System.out.print
			            ("Enter your name to join the queue: ");
			            String name = scanner.nextLine();
			            themeParkQueue.offer(name);
			            System.out.println(name + 
			            		" has joined the queue!");
			            break;
			        case 2:
			            System.out.println
			            ("Current queue length: " + 
			            themeParkQueue.size());
			            break;
			        case 3:
			            if (!themeParkQueue.isEmpty()) {
			                String nextPerson = 
			                		themeParkQueue.poll();
			                System.out.println(nextPerson 
			                		+ " is entering the "
			                		+ "theme park!");
			            } else {
			                System.out.println
			                ("The queue is empty. "
			                		+ "No one to let in!");
			            }
			            break;
			        case 4:
			            System.out.println
			            ("Exiting the theme park queue "
			            		+ "simulation. Goodbye!");
			            System.exit(0);
			        default:
			            System.out.println
			            ("Invalid choice. Please try again.");
			    }
			}
		}
    }
}
