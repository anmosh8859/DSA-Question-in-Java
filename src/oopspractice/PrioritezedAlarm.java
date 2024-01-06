package oopspractice;

public final class PrioritezedAlarm extends Alarm {
    final private int priority;
    public PrioritezedAlarm(int priority, String message){
        super(message);
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
}
