
// Problem Statement: Implement a round-robin CPU scheduling algorithm using a circular linked list. Each node will represent a process and contain Process ID, Burst Time, and Priority. Implement the following functionalities:
// Add a new process at the end of the circular list.
// Remove a process by Process ID after its execution.
// Simulate the scheduling of processes in a round-robin manner with a fixed time quantum.
// Display the list of processes in the circular queue after each round.
// Calculate and display the average waiting time and turn-around time for all processes.


class Process {
    int processID;
    int burstTime;
    int priority;
    Process next;

    // Constructor
    public Process(int processID, int burstTime, int priority) {
        this.processID = processID;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

class SchedulerProcess {
    Process head;
    int quantumTime;
    Process current;

    SchedulerProcess(int n){
        this.quantumTime = n;
    }

    public void addProcess(int processID, int burstTime, int priority){
       Process newProcess = new Process(processID, burstTime, priority);

        if(head == null){
            head = newProcess;
            newProcess.next = head;
            current = head;
        }else{
            Process temp = head;
            while (temp.next!=current) {
                temp = temp.next;
            }
            temp.next = newProcess;
            newProcess.next = head;
        }

    }

    public void display(){
        System.out.println("fajhk");
        Process temp = head;
        while (temp.next!=head) {
            System.out.println("Process ID: " + temp.processID + " | Burst Time: " + temp.burstTime + " | Priority: " + temp.priority);
            temp = temp.next;
        }
    }
}

public class RoundRobin {
    public static void main(String[] args) {
        SchedulerProcess s1 = new SchedulerProcess(4); // Set Time Quantum = 4

        // Add processes
        s1.addProcess(1, 10, 2);
        s1.addProcess(2, 4, 1);
        s1.addProcess(3, 7, 3);
        s1.addProcess(4, 2, 1);
        System.out.println("Initial Process Queue:");

        // Display initial process queue
        s1.display();
    }
}
