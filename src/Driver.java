/**
 * Driver.java
 * 
 * Demonstrates different scheduling algorithms.
 * 
 * Usage:
 *  
 *  java Driver <schedule> <algorithm>
 *
 * where 
 *  schedule is schedule of tasks
 *
 *  algorithm = [FCFS, SJF, PRI, RR, PRI-RR]
 */
  
import java.util.*;
import java.io.*;

public class Driver
{
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.err.println("Usage: java Driver <algorithm> <schedule>");
            System.exit(0);
        }

        BufferedReader inFile = new BufferedReader(new FileReader(args[1]));

        String schedule;

        // create the queue of tasks
        List<Task> queue = new ArrayList<Task>();

        // read in the tasks and populate the ready queue        
        while ( (schedule = inFile.readLine()) != null) {
            String[] params = schedule.split(",\\s*");
            queue.add(new Task(params[0], Integer.parseInt(params[1]), Integer.parseInt(params[2])));
        }

        inFile.close();
        
        Algorithm scheduler = null;
        String choice = args[0].toUpperCase();

        System.out.println("Enter one of the following commands:\n");
        System.out.println("1.) First Come First Serve\n");
        System.out.println("2.) Priority\n");
        System.out.println("3.) Round Robin\n");
        System.out.println("0.) EXIT\n");
        Scanner scanner = new Scanner(System.in);
        int selectedChoice = scanner.nextInt();

        while (selectedChoice != 0){
            if (selectedChoice == 0){
                System.out.println("See you space cowboy...");
                break;
            }
            else if(selectedChoice == 1){

            }
            else if(selectedChoice == 2){

            }
            else if(selectedChoice == 3){

            }
        }

        // start the scheduler
        scheduler.schedule();
    }
}
