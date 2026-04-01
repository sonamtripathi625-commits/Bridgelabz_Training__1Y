package MultiThreading;

class ExamActivity extends Thread {
    private String activityName;
    private int delayInSeconds;
    private int durationInSeconds;

    public ExamActivity(String name, int priority, int delay, int duration) {
        super(name);
        this.activityName = name;
        this.delayInSeconds = delay;
        this.durationInSeconds = duration;
        this.setPriority(priority);
    }

    @Override
    public void run() {
        try {

            Thread.sleep(delayInSeconds * 1000L);

            System.out.println(">>> " + activityName + " STARTED. (State: " + this.getState() + ")");


            Thread.sleep(durationInSeconds * 1000L);

            System.out.println( activityName );
        } catch (InterruptedException e) {
            System.out.println(activityName );
        }
    }
}

public class ExamHallSystem {
    public static void main(String[] args) throws InterruptedException {

        ExamActivity entry = new ExamActivity("Student Entry", 5, 0, 5);
        ExamActivity papers = new ExamActivity("Paper Distribution", 10, 5, 3);
        ExamActivity attendance = new ExamActivity("Attendance Marking", 8, 10, 4);
        ExamActivity collection = new ExamActivity("Sheet Collection", 7, 15, 2);

        System.out.println(entry.getState());


        entry.start();
        papers.start();
        attendance.start();
        collection.start();


        Thread.sleep(6000);

        System.out.println(entry.getName() + " State: " + entry.getState());
        System.out.println(papers.getName() + " State: " + papers.getState());
        System.out.println(attendance.getName() + " State: " + attendance.getState());
        System.out.println("-----------------------------\n");


        entry.join();
        papers.join();
        attendance.join();
        collection.join();

        System.out.println( collection.getState());
    }
}
