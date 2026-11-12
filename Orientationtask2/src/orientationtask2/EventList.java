package orientationtask2;

import java.util.PriorityQueue;

public class EventList {

    private PriorityQueue<Event> events;

    // Constructor
    public EventList() {
        events = new PriorityQueue<>();
    }

    // Add an event
    public void addEvent(Event event) {
        events.add(event);
    }

    // Get and remove the next event
    public Event getNextEvent() {
        return events.poll();
    }

    // Check if event list is empty
    public boolean isEmpty() {
        return events.isEmpty();
    }

    // Print events in chronological order
    public void printEvents() {

        PriorityQueue<Event> temp = new PriorityQueue<>(events);

        while (!temp.isEmpty()) {
            System.out.println(temp.poll());
        }
    }
}
