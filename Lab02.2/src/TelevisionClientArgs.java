/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

/**
 * Intended usage (by human):
 * $ java TelevisionClientArgs <brand> <volume> <display>
 * <p>
 * Example:
 * $ java TelevisionClientArgs Samsung 32 PLASMA
 * <p>
 * GOAL:
 * Create an instance of Television with the specifications (values) provided by the user.
 */

import java.util.Arrays;

class TelevisionClientArgs {

    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        if (args.length < 3) {
            String usage =
                    "Usage: java TelevisionClientArgs <brand> <volume> <display>" +
                            "Example: java TelevisionClientArgs Samsung 32 PLASMA" +
                            "Notes:\n" +
                            "1. Available brands are " + Arrays.toString(Television.VALID_BRANDS) + "\n" +
                            "2. Volume must be " + Television.MIN_VOLUME + " to " + Television.MAX_VOLUME + " (inclusive) \n" +
                            "3. Supported displays are displays are " + Arrays.toString(DisplayType.values());
            System.out.println(usage);
            return;  // early return from main(), application exits
        }

        //STEP 1: convert from string into proper types, as necessary
        String brand = args[0];
        int volume = Integer.parseInt(args[1]);
        DisplayType display = DisplayType.valueOf(args[2].toUpperCase());
        //STEP 2: create a Television object from these 3 values
        Television tv1 = new Television(brand, volume, display);

        // Step 3: congratulate them on their order, print the resulting Television
        System.out.println(tv1);


    }
}