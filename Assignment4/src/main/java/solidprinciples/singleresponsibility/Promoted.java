package solidprinciples.singleresponsibility;

public class Promoted {
    public boolean isPromotedDueThisMonth()
    {
        return isPromotedDueThisMonth();
    }
    
}

 class Car2{
     private String carId;
     private String carName;
     private String carColor;

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
