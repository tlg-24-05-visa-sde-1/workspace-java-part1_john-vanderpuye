package misc.test;

class StringTest {
    public static void main(String[] args) {
        String city1 = "new york";
        String city2 = "new york";

        System.out.println(city1.equals(city2)); // this is what you should do
        System.out.println(city1 == city2); // this is the wrong way to do it

        System.out.println();

        String newCity1 = city1.substring(0,3);
        String newCity2 = city2.substring(0,3);
        System.out.println(newCity1.equals(newCity2)); // this is what you should do
        System.out.println(newCity1 == newCity2); // this is the wrong way to do it
        System.out.println();

        String greeting = "What's up \"Doc?\"";
        System.out.println(greeting);
        System.out.println();

        System.out.println("roses are red\nviolets are blue");
        System.out.println();

        String poem = """
                sugar is sweet
                and so are you""";
        System.out.println(poem);
        System.out.println();

        String pattern = "\\d{3}[A-Z]{3}|^[A-Z]\\d{3}[A-Z]{3}$";
        String plate1 = "A123XYZ";
        String plate2 = "PPS6050";
        System.out.println("This license plate is valid: " + plate2.matches(pattern));
    }
}