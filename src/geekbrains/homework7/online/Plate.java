package geekbrains.homework7.online;

public class Plate {
    private int food;
    public Plate(int food){
        this.food = food;
    }
    public void decreaseFood(int val){
        this.food -= val;
    }
    public void increaseFood(int food)
    {
        this.food += food;
    }
    public boolean hasEnoughFood(int appetite)
    {
        return appetite <= food;
    }
}
