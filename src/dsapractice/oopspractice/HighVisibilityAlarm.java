package dsapractice.oopspractice;

public non-sealed class HighVisibilityAlarm extends Alarm{
    public HighVisibilityAlarm(String message) {
        super(message);
    }

    @Override
    public String getReport(Boolean uppercase) {
        String report = super.getReport(uppercase);
        if(!report.isEmpty()) return report + "!";
        return report;
    }
}
