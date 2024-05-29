import org.w3c.dom.ls.LSOutput;

class TelevisionTest {
    public static void main(String[] args) {
        Television tv1 = new Television("Samsung", 23, VolumeLevel.MAX, DisplayType.LED);
        System.out.println(tv1);
    }

}