public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater("Lake", 100, 50, false);
        BodyOfWater b2 = new BodyOfWater("Ocean", 10000);
        System.out.println("here");

        System.out.println(b.getName());
        System.out.println(b.getLargestDiameter());
        System.out.println(b.getAvgDepth());
        System.out.println(b.isSaltWater());

        System.out.println(b2.getName());
        System.out.println(b2.getAvgDepth());


        b.setName("Lake1");
        
        System.out.println(b.getName());

        b.printState();

    }
}
