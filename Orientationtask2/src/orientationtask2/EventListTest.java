package orientationtask2;

public class EventListTest {

    public static void main(String[] args) {

        EventList eventList = new EventList();

        // Add events
        eventList.addEvent(new Event(15, EventType.ARRIVAL));
        eventList.addEvent(new Event(5, EventType.EXIT));
        eventList.addEvent(new Event(10, EventType.ARRIVAL));
        eventList.addEvent(new Event(20, EventType.EXIT));

        // Print all events
        System.out.println("All events:");
        eventList.printEvents();

        // Remove the next event
        System.out.println("\nNext event to be processed:");

        Event nextEvent = eventList.getNextEvent();
        System.out.println(nextEvent);

        // Print remaining events
        System.out.println("\nRemaining events:");

        eventList.printEvents();
    }
}
