package objectorientedprogramming.Polymorphism;

public class Pasta extends Food
{
    @Override
    public String cook() {
        String cookFood = "Cook Tomorrow";
        return cookFood;
    }

    @Override
    public String eat() {
        String eatFood = "Eat Tomorrow";
        return eatFood;
    }
}
