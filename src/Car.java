public class Car extends VehicleClass{

    @Override
    public double decreasePrice() {
       price = price - 50 ;
       return 50;
    }
}
