
public class Loader
{
    public static void main(String[] args)
    {
        Cat murka = new Cat();
        murka.meow();
        System.out.println("Murka weight: " + murka.getWeight());
        Cat vasya = new Cat();
        vasya.drink(4000.2);
        vasya.feed(3500.3);
        System.out.println("Vasya weight:" + vasya.getWeight());
        System.out.println("Vasya is " + vasya.getStatus() + " and Murka is " + murka.getStatus());
        vasya.getEatenFood();
        System.out.println(vasya.getEatenFood());
        vasya.toilet();
        System.out.println(vasya.getWeight());



    }
}