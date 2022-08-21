public  class Bus extends VehicleClass{

    @Override
    public double decreasePrice() {
        price=price-150;
        return 150;
    }
}
