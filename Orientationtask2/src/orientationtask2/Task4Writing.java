package orientationtask2;

public class Task4Writing {

    public static void main(String[] args) {

        System.out.println("Telephone Call Centre Simulation");
        System.out.println("________________");

        System.out.println("Clock 15:");
        System.out.println("Customer X3 arrives.");
        System.out.println("X3 starts router service.");

        System.out.println("\nClock 16:");
        System.out.println("Operator 1 completes X2.");
        System.out.println("X2 exits the system.");
        System.out.println("X3 moves to Operator 1.");
        System.out.println("Operator 1 starts serving X3.");

        System.out.println("\nClock 18:");
        System.out.println("Operator 2 completes Y1.");
        System.out.println("Y1 exits the system.");

        System.out.println("\nFinal Results:");
        System.out.println("X customers completed: 2");
        System.out.println("Y customers completed: 1");
        System.out.println("Simulation finished at clock 18.");
    }
}

/*
TASK 5 – TELEPHONE CALL CENTRE SIMULATION

1. SIMULATION RULES

X customers arrive every 5 minutes.
Y customers arrive every 10 minutes.
Router service takes 1 minute.
Operator 1 serves X customers in 4 minutes.
Operator 2 serves Y customers in 7 minutes.
Both queues use FIFO (First In, First Out).

2. THREE-PHASE APPROACH

A-phase: Advance the clock to the next event.
B-phase: Execute scheduled events.
C-phase: Execute conditional events.

3. CLOCK 15

A-phase:
Advance the clock to 15.

B-phase:
Customer X3 arrives.
The next X arrival is scheduled at clock 20.

C-phase:
Router starts serving X3.
Router completion is scheduled at clock 16.

4. CLOCK 16

A-phase:
Advance the clock to 16.

B-phase:
Operator 1 completes X2.
X2 exits the system.
Router completes service for X3.
X3 moves to the X queue.

C-phase:
Operator 1 starts serving X3.
Completion is scheduled at clock 20.

5. CLOCK 18

A-phase:
Advance the clock to 18.

B-phase:
Operator 2 completes serving Y1.
Y1 exits the system.

C-phase:
No conditional event can start.

The simulation stops because one Y customer has exited.

6. FINAL RESULTS

X customers completed: 2
Y customers completed: 1
Simulation ends at clock: 18

CONCLUSION:
The simulation was completed using the three-phase approach.
Two X customers and one Y customer completed their service.
One Y customer exited at clock 18.
*/
