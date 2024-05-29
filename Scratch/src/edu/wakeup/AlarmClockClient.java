package edu.wakeup;

/*
* Client-side "main-class" (class definition with the main method)
* it will create a few instances of AlarmClock, and give them a basic test-drive.
 */
class AlarmClockClient {

    public static void main(String[] args) {
        // create an AlarmClock object and set its properties
        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(7);

        // create a second instance and set its properties, also
        AlarmClock clock2 = new AlarmClock(AlarmClock.MAX_INTERVAL); // Max possible snooze interval

        //create a third instance BUT this time don't set its properties
        AlarmClock clock3 = new AlarmClock();


        // make them snooze
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();

        System.out.println(clock1.toString());
        System.out.println(clock2);
        System.out.println(clock3);
    }
}