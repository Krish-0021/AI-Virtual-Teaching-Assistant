
public class Scheduler {
    public void addReminder(String message, int delaySeconds) {
        Thread reminderThread = new Thread(() -> {
            try {
                Thread.sleep(delaySeconds * 1000);
                System.out.println("Reminder: " + message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        reminderThread.start();
    }
}
