public class Cat
{
    // Переменные
    private double originWeight;
    private double weight;
    public static int count;
    private boolean isAlive;
    private double feedCount;
    private String deadMessage = "ДОХЛАЯ КОШКА НЕ МОЖЕТ КУШАТь, ХОДИТЬ В ТУАЛЕТ, МЯУКАТЬ!!!";
    private CatColor catColor1;
    // Константы
    private static final double MIN_WEIGHT = 1000.0;
    private static final double MAX_WEIGHT = 9000.0;

    private static final int EYE_COUNT = 2;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random(); // устанавливаем начальный вес кошке
        originWeight = weight;
        feedCount = 0; // счетчик еды для кошки
        isAlive = true; // статус кошки
        catColor1 = CatColor.NONE; // цвет кошки по умолчанию
        setCatCount(); // при создании объекта кошка считаем ее живой и добовляем в счетчик живых кошек
    }

    // Добавляем кошку
    public void setCatCount()
    {
        count = count + 1;
    }

    // Передаем цвет кошки
    public void setCatColor (CatColor catColor)
    {
        catColor1 = catColor;
    }

    // Кошка умерла
    public String deadCat()
    {
        if (!isAlive)
        {
            count = count - 1;
            return "Кошка сдохла...";
        }
        return null;
    }

    // Получаем кол-во живых кошек
    public static int getCatCount()
    {
        return count;
    }

    public void meow()
    {
        if (isAlive)
        {
            weight = weight - 1;
            System.out.println("Meow");
        }
        else
        {
            System.out.println(deadMessage);
        }
    }

    // Кормить кошку
    public void feed(Double amount)
    {
        if (isAlive)
        {
            weight = weight + amount;
            feedCount = feedCount + amount;
        }
        else
        {
            System.out.println(deadMessage);
        }
    }

    // Напоить кошку
    public void drink(Double amount)
    {
        if (isAlive)
        {
            weight = weight + amount;
        }
        else
        {
            System.out.println(deadMessage);
        }
    }

    // Получить вес кошки
    public Double getWeight()
    {
        if (isAlive)
        {
            return weight;
        }
        else
        {
            System.out.println(deadMessage);
        }
        return null;
    }

    //
    public Double getCountFeed()
    {
        return feedCount;
    }

    // Ходит в туалет
    public void pee()
    {
        if (isAlive)
        {
            weight = weight - 5;
            System.out.println("Я покакал!");
        }
        else
        {
            System.out.println(deadMessage);
        }
    }

    // Контролируем статус кошки
    public String statusController()
    {
        if(weight < MIN_WEIGHT) {
            isAlive = false;
            return "Dead";
        }
        else if(weight > MAX_WEIGHT) {
            isAlive = false;
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}