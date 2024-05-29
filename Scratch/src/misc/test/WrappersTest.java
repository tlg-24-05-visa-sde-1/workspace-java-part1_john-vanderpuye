package misc.test;

class WrappersTest {
    public static void main(String[] args) {
        String ageInput = "23";
        int age = Integer.parseInt(ageInput);// takes "23" -> returns int 23
        Integer ageInteger = Integer.valueOf(ageInput); // returns and Integer with 23 Inside

        String populationInput = "8000000000";
        long population = Long.parseLong(populationInput); // returns primitive long
        long populationLong = Long.valueOf(populationInput); // returns Long object

        String sizeInput = "10.0";
        double size = Double.parseDouble(sizeInput); // returns primitive double
        double sizeLong = Double.valueOf(sizeInput); // returns Double object

        String isRainingInput = "true";
        boolean isRaining = Boolean.parseBoolean(isRainingInput); // returns primitive boolean
        boolean isRainingLong = Boolean.valueOf(isRainingInput); // returns Boolean object
    }
}