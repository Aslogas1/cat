
public class Loader
{
    public static void main(String[] args)
    {
        Cat vasya = new Cat();
        Cat murka = new Cat();
        Cat pushok = new Cat();
        murka.feed(977.66);
        vasya.drink(9988.55);
        System.out.println("catCount = " + Cat.getCount());
        System.out.println(murka.getWeight());
        System.out.println(murka.getStatus());
        System.out.println(murka.isAlive());


    }
}