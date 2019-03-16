package objectorientedprogramming.Polymorphism;

public class Meat extends Food
{

    @Override
    public String cook()
    {
        String cookFood = "Cook meat for 30minuets";
        return cookFood;
    }

    @Override
    public String eat()
    {
        String eatFood = "Eat after 2 hours";
        return eatFood;
    }
}
