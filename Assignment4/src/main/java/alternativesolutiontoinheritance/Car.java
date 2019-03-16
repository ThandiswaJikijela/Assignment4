package alternativesolutiontoinheritance;

public class Car {
    private Vehicle veh = new Vehicle();

    private String modelName = "5series";

    String brand;

    public String getBrand()
    {
        brand = veh.getBrand();
        return brand;
    }


       public String getModelName()
    {
        return modelName;
    }
}
