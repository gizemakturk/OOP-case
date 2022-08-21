public class Minibus extends VehicleClass{


    @Override
    public double decreasePrice() {
        price=price-100;
        return 100;
    }
}
