package edu.wakeup;

/*
* Class definition to model the workings of an alarm clock.
* This is sometimes called a "business" class, or "system" class, or "application" class.
* It has NO main() method - classes like these don't.
 */
class AlarmClock {
    //class ("static") variables
    // There is only one copy of thes, they live up in that "shared" area, NOT in each object
    // properties or attributes - called "fields" or "instance variables"
    private int snoozeInterval = 5; // default value when client doesn't specify (instead of 0)

    public static final int MIN_INTERVAL = 1;
    public static final int MAX_INTERVAL = 20;

    public AlarmClock(){

    }
    //constructors - like "methods" that get called when clients say "new"
    public AlarmClock(int snoozeInterval) {
        setSnoozeInterval(snoozeInterval);
    }
    // functions or behaviors - called "methods" in Java
    void snooze() {
        System.out.println("Snoozing " + snoozeInterval + " minutes");
    }

    //"accessor" methods - provide "controlled access" to the object's fields
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    public void setSnoozeInterval(int snoozeInterval) {
        if(snoozeInterval>= MIN_INTERVAL && snoozeInterval<= MAX_INTERVAL){
            this.snoozeInterval = snoozeInterval;
        }
        else{
            System.out.println("Invalid snoozeInterval: " + snoozeInterval +
                    ". Must be between " + MIN_INTERVAL + " and " + MAX_INTERVAL + " inclusive.");
        }
    }
    /*
    * Returns a string representation of this AlarmClock object.
    * Generally includes the name of the class (its type) and the values of its fields.
     */
    public String toString(){
        return "AlarmClock: snoozeInterval = " + snoozeInterval;
    }
}