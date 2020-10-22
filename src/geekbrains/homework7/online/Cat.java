package geekbrains.homework7.online;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;
    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        isFull = false;
    }
    public void eat(Plate plate){
        if (plate.hasEnoughFood(appetite) && !isFull)
        {
            plate.decreaseFood(appetite);
            isFull = true;
            System.out.println(name + " покушал");
        }
        else if (isFull)
        {
            System.out.println(name + " не хочет кушать");
        }
        else
        {
            System.out.println("Мало еды в тарелке для " + name);
        }
    }
}
