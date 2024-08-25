public class BodyOfWater {
    private String name;
    private double largestDiameter;
    private double avgDepth;
    private boolean isSaltWater;

    public BodyOfWater(String n, double l, double d, boolean s){
        name = n;
        largestDiameter = l;
        avgDepth = d;
        isSaltWater = s;
    }

    public BodyOfWater(String n, double d){
        name = n;
        avgDepth = d;
    }

    public void setName(String n){
        name = n;
    }

    public void setLargestDiameter(double s){
        largestDiameter = s;
    }

    public String getName(){
        return name;
    }

    public double getLargestDiameter(){
        return largestDiameter;
    }

    public double getAvgDepth(){
        return avgDepth;
    }

    public boolean isSaltWater(){
        return isSaltWater;
    }

    public void printState(){
        System.out.println("Name: " + name);
        System.out.println("Largest Diameter: " + largestDiameter);
        System.out.println("Average Depth: " + avgDepth);
        System.out.println("Is Salt Water: " + isSaltWater);

    }


}


