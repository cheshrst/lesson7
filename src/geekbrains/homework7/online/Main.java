package geekbrains.homework7.online;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Котофей", 1);
        cats[1] = new Cat("Mорозка", 5);
        cats[2] = new Cat("Маня", 10);
        Plate plate = new Plate(20);
        for (int i = 0; i < cats.length; i++)
        {
            cats[i].eat(plate);
        }

        appendFoodTo(plate, 7);

        for (int i = 0; i < cats.length; i++)
        {
            cats[i].eat(plate);
        }
    }

    static void appendFoodTo(Plate plate, int food)
    {
        plate.increaseFood(food);
    }

    }

