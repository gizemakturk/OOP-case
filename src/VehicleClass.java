import java.util.Date;

public abstract  class VehicleClass {
    public String plate;
    public double price;
    public int hgsNo;
    public String name;
    public String lastName;


    public abstract double decreasePrice();


    @Override
    public String toString() {
        return "VehicleClass{" +
                "plate='" + plate + '\'' +
                ", price=" + price +
                ", hgsNo=" + hgsNo +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
