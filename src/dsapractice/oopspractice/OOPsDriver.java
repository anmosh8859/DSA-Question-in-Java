package dsapractice.oopspractice;

public class OOPsDriver {
    public static void driver(){
//        Alarm alarm = new Alarm("Temperature is too high...");
//        alarm.turnOn();
//        alarm.snooze();
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        alarm.sendReport();

        HighVisibilityAlarm hva  =new HighVisibilityAlarm("Temperature is too high...");
        hva.turnOn();
        hva.sendReport();

    }
}
