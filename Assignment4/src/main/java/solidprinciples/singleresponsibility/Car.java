package solidprinciples.singleresponsibility;

public class Car {
    private String carId;
    private String carName;
    private String carColor;

    public boolean isPromotedDueThisMonth()
    {
       return isPromotedDueThisMonth();
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }
    public String getCarId() {
        return carId;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarColor() {
        return carColor;
    }
}
