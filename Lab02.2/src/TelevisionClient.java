/*
* Main-class to create a few instance of Television and give them a test-drive.
 */
class TelevisionClient {

    public static void main(String[] args) {
        // create a Television object and set its properties
        System.out.println(Television.getInstanceCount() + " instances");
        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(Television.MAX_VOLUME);

        // create a 2nd instance of Television and set its properties, also
        Television tv2 = new Television("LG", Television.MIN_VOLUME);


        // create a 3rd instance of Television, BUT do NOT set its properties
        Television tv3 = new Television();

        // call some business methods on them, i.e., turn them "on" and "off"
        tv1.turnOn();
        tv2.turnOn();
        tv3.turnOn();

        tv1.turnOff();
        tv2.turnOff();
        tv3.turnOff();

        System.out.println(tv1.toString());
        System.out.println(tv1);
        System.out.println(Television.getInstanceCount() + " instances");
    }
}