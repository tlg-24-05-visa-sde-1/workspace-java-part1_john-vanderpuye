package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private final String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS
    /*
     * Option 4: try-catch and throw a different excetion at the client.
     * Note: we will "wrap" the destinationUnreachableException into a new WorkException
     */
    public void goToWork() throws WorkException {
        // create an instance of Car with all three properties: vin, make, model
        Car c = new Car("ABC123", "Lamborghini", "Revuelto");


        // call moveTo() on the Car object, passing "West Seattle" for the destination
        try {
            c.start();
            c.moveTo(("West Seattle"));
        } catch (DestinationUnreachableException e) {
            // insert this exception into a new WorkException and throw that
            throw new WorkException("Unable to get to work", e);
        }
        finally{
            c.stop();
        }
    }
    /*
     * Option 3: try-catch, "react in some way," and then re-throw it back at the client
     */
    /*public void goToWork() throws DestinationUnreachableException {
        // create an instance of Car with all three properties: vin, make, model
        Car c = new Car("ABC123", "Lamborghini", "Revuelto");


        // call moveTo() on the Car object, passing "West Seattle" for the destination
        try {
            c.start();
            c.moveTo(("West Seattle"));
        } catch (DestinationUnreachableException e) {
            // email Lisa Herbold via Java Mail API to complain
            System.out.println("Emailing Lisa Herbold to complain");
            throw e;
        }
        finally{
            c.stop();
        }
    }*/
    /*
     * Option 2: "punt," i.e., DON"T catch the exception at all, just "ignore" it.
     * NOTE: we use a try-finally, to guarantee that c.stop() is always called, BUT
     * we're still punting because there's no catch.
     */
    /*public void goToWork() throws DestinationUnreachableException {
        // create an instance of Car with all three properties: vin, make, model
        Car c = new Car("ABC123", "Lamborghini", "Revuelto");

        try {
            c.start();
            c.moveTo(("West Seattle"));

        } finally {
            c.stop();
        }

    }*/
    /*
     * Option 1: try-catch and "handle" itin some way, so the exception stops here.
     * Note that put the call to c.stop() in a finally block, to guarantee that it is called
     */

    /*public void goToWork(){
        // create an instance of Car with all three properties: vin, make, model
        Car c = new Car("ABC123", "Lamborghini", "Revuelto");


        // call moveTo() on the Car object, passing "West Seattle" for the destination
        try {
            c.start();
            c.moveTo(("West Seattle"));
        } catch (DestinationUnreachableException e) {
            System.out.println(e.getMessage());
        }
        finally{
            c.stop();
        }
    }
*/
    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}