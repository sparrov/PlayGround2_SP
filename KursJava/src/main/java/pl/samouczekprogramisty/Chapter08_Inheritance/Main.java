package pl.samouczekprogramisty.Chapter08_Inheritance;

public class Main {


    public static void main(String[] args) {
        Goldfish goldfish1 = new Goldfish();
        Fish goldfish2 = new Goldfish();
        Animal goldfish3 = new Goldfish();
        System.out.println(goldfish1);
        System.out.println(goldfish1.toString());
        System.out.println(goldfish1.hashCode());
        System.out.println(goldfish2.toString());
        System.out.println(goldfish2.hashCode());
        System.out.println(goldfish3.toString());
        System.out.println(goldfish3.hashCode());

        Human human1 = new Human();
        Mimmal human2 = new Human();
        Animal human3 = new Human();
        System.out.println(human1);
        System.out.println(human1.toString());
        System.out.println(human1.hashCode());
        System.out.println(human2.toString());
        System.out.println(human2.hashCode());
        System.out.println(human3.toString());
        System.out.println(human3.hashCode());
    }
}
