public class Cat {
    public static int count;
    private double originWeight;
    private double weight;
    private double eatenFood = 0;

    private double minWeight;
    private double maxWeight;

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;
    }
    public static int getCount()
    {
        return count;
    }
    public void toilet()
    {
        weight = weight * 0.9;
        if(weight < minWeight){
            catDied();
        }
        System.out.println("cat got toilet");
    }
    private static void catDied(){
        count--;
    }
    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
        if(weight < minWeight) {
            catDied();
        }
    }

    public void feed(Double amount)
    {
        eatenFood += amount;
        weight = weight + amount;
        if(weight > maxWeight) {
            catDied();
        }
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
        if(weight > maxWeight) {
            catDied();
        }
    }
    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
    public Double getEatenFood()
    {
        return eatenFood;
    }
    public boolean isAlive()
    {
        return getWeight() >= minWeight && getWeight() <= maxWeight;
    }
}