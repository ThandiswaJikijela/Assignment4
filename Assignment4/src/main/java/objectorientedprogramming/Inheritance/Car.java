package objectorientedprogramming.Inheritance;


public class Car extends Vehicles {

    private String modelName = "5series";

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    public String getModelName()
    {
        return modelName;
    }


}
