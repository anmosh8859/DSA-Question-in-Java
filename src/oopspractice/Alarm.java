package oopspractice;

import java.time.LocalDateTime;

public sealed class Alarm permits PrioritezedAlarm,HighVisibilityAlarm,DummyClass{
    private boolean active;
    private final String message;
    private LocalDateTime snoozeUntil;
    Alarm(){
        this("Temperature is too high");
    }
    Alarm(String message){
        this.message = message;
        stopSnoozing();
    }

    public void snooze(){
        if(active) snoozeUntil = LocalDateTime.now().plusSeconds(5);
    }

    public boolean isSnoozing(){
        return snoozeUntil.isAfter(LocalDateTime.now());
    }

    private void stopSnoozing(){
        snoozeUntil = LocalDateTime.now().minusSeconds(1);
    }

    public void turnOn(){
        active = true;
        stopSnoozing();
    }

    public boolean isActive() {
        return active;
    }

    public void turnOff(){
        active = false;
    }

    public String getMessage(){
        return message;
    }

    public String getReport(Boolean uppercase){
        if(active && !isSnoozing()){
            if(uppercase) return message.toUpperCase();
            return message;
        }
        return "";
    }
    public void sendReport(){
        System.out.println(getReport(true));
    }
}
