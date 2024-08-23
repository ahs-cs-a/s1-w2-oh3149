public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater("Lake", 100, 50, false);
        BodyOfWater b1 = new BodyOfWater("Ocean", 1000, 10000, true);
        BodyOfWater b2 = new BodyOfWater("Pond", 10);
        System.out.println("here");

        System.out.println(b.getName());
        System.out.println(b.getLargestDiameter());
        System.out.println(b.getAvgDepth());
        System.out.println(b.isSaltWater());

        System.out.println(b1.getName());
        System.out.println(b1.getLargestDiameter());
        System.out.println(b1.getAvgDepth());
        System.out.println(b1.isSaltWater());

        System.out.println(b2.getName());
        System.out.println(b2.getAvgDepth());


        b.setName("Lake1");
        
        System.out.println(b.getName());

        b1.printState();

    }
}
