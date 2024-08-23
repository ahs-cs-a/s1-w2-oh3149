public class BodyOfWater {
    private String name;
    private int largestDiameter;
    private int avgDepth;
    private boolean isSaltWater;

    public BodyOfWater(String n, int l, int d, boolean s){
        name = n;
        largestDiameter = l;
        avgDepth = d;
        isSaltWater = s;
    }

    public BodyOfWater(String n, int d){
        name = n;
        avgDepth = d;
    }

    public void setName(String n){
        name = n;
    }

    public void setLargestDiameter(int s){
        largestDiameter = s;
    }

    public String getName() {
        return name;
    }

    public int getLargestDiameter() {
        return largestDiameter;
    }

    public int getAvgDepth() {
        return avgDepth;
    }

    public boolean isSaltWater() {
        return isSaltWater;
    }

    public void printState(){
        System.out.println("Name: " + name);
        System.out.println("Largest Diameter: " + largestDiameter);
        System.out.println("Average Depth: " + avgDepth);
        System.out.println("Is Salt Water: " + isSaltWater);

    }


}


