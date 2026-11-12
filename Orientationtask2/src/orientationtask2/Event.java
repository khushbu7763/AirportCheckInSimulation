package orientationtask2;

public class Event implements Comparable<Event> {

    private int eventTime;
    private EventType eventType;

    // Constructor
    public Event(int eventTime, EventType eventType) {
        this.eventTime = eventTime;
        this.eventType = eventType;
    }

    // Get event time
    public int getEventTime() {
        return eventTime;
    }

    // Get event type
    public EventType getEventType() {
        return eventType;
    }

    // Compare events by time
    @Override
    public int compareTo(Event other) {
        return Integer.compare(this.eventTime, other.eventTime);
    }

    // Display event information
    @Override
    public String toString() {
        return "Event time: " + eventTime +
                ", Event type: " + eventType;
    }
}
