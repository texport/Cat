import java.util.Scanner;

public class Loader
{
    public static void main(String[] args)
    {
        // Cat1
        Cat cat1 = new Cat();
        System.out.println("");
        System.out.println("Имя кошки " + cat1);
        System.out.println("-----------------------------");
        System.out.println("Вес Cat1: " + cat1.getWeight());
        System.out.print("Cat1 сказал: ");
        cat1.meow();
        System.out.println("Вес Cat1 теперь " + cat1.getWeight());
        System.out.println("-----------------------------");
        System.out.println("Кол-во кошек: " + Cat.getCatCount());
        enterText();
        System.out.println("");

        // Cat2
        Cat cat2 = new Cat();
        System.out.println("Имя кошки " + cat2);
        System.out.println("-----------------------------");
        System.out.println("Вес Cat2: " + cat2.getWeight());
        System.out.print("Cat2 сказал: ");
        cat1.meow();
        System.out.println("Вес Cat2 теперь: " + cat2.getWeight());
        System.out.println("-----------------------------");
        System.out.println("Кол-во кошек: " + Cat.getCatCount());
        enterText();
        System.out.println("");

        // Cat3
        Cat cat3 = new Cat();
        System.out.println("Имя кошки " + cat3);
        System.out.println("-----------------------------");
        System.out.println("Вес Cat3: " + cat3.getWeight());
        while (cat3.statusController() != "Exploded")
        {
            cat3.feed(1.2);
            System.out.println(cat3.statusController() == "Exploded" ? cat3.deadCat() : "Кошка жрет");
        }
        System.out.println("-----------------------------");
        System.out.println("Кол-во кошек: " + Cat.getCatCount());
        enterText();
        System.out.println("");

        // Cat 4
        Cat cat4 = new Cat();
        System.out.println("Имя кошки " + cat4);
        System.out.println("-----------------------------");
        System.out.println("Вес Cat4: " + cat4.getWeight());
        while (cat4.statusController() != "Dead"){
            cat4.meow();
            System.out.println(cat4.statusController() == "Dead" ? cat4.deadCat() : "Ваша кошка очень много кричит");
        }
        System.out.println("-----------------------------");
        System.out.println("Кол-во кошек: " + Cat.getCatCount());
        enterText();
        System.out.println("");

        // Cat5
        Cat cat5 = new Cat();
        System.out.println("Имя кошки " + cat5);
        System.out.println("-----------------------------");
        System.out.println("Вес Cat5: " + cat5.getWeight()
                + "\nСъела еды: " + cat5.getCountFeed());
        System.out.println("Pizza time");
        while (cat5.getCountFeed() != 150)
        {
            cat5.feed(30.0);
            System.out.println(cat5.getCountFeed() == 150.0 ? "Кошка наелась " + cat5.getCountFeed() : "Кошка съела: " + cat5.getCountFeed());
        }
        cat5.pee();
        System.out.println(cat5.getCountFeed());
        System.out.println("-----------------------------");
        System.out.println("Кол-во кошек: " + Cat.getCatCount());
        enterText();
        System.out.println("");
    }

    public static void enterText()
    {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        System.out.println("Нажмите ENTER что бы продолжить: " + title);
    }
}