
public class Cat
{
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
    }
    public void toilet()
    {
        weight = weight * 0.9;
        System.out.println("cat got toilet");
    }

    public void meow()
    {
        weight = weight - 3500;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        eatenFood += amount;
        weight = weight + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
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
}