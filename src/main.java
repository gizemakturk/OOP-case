import java.util.Date;

public class main {
    public static void main(String[] args) {
        Car car = new Car();
      car.name="gizem";
      car.lastName="aktürk";
      car.plate= "123";
      car.price=500;
      car.hgsNo=123;

      Minibus minibus=new Minibus();
        minibus.name="gizem";
        minibus.lastName="aktürk";
        minibus.plate= "456";
        minibus.price=500;
        minibus.hgsNo=456;

        Bus bus=new Bus();
        bus.name="gizem";
        bus.lastName="aktürk";
        bus.plate= "789";
        bus.price=500;
        bus.hgsNo=789;

        TicketOffice ticketOffice= new TicketOffice();
        Date date= new Date();
        date.setHours(0);
        Date date1= new Date();
        date1.setHours(1);
        Date date2= new Date();
        date2.setHours(2);
    ticketOffice.incomingVehicle(car,date );
        ticketOffice.incomingVehicle(minibus,date1 );
        ticketOffice.incomingVehicle(minibus,date2 );

        Manager manager= new Manager(ticketOffice);
        manager.DailyPrice(date);
        ticketOffice.PassedVehicles.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });


    }
}
