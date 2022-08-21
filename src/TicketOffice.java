import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TicketOffice {
public Map<Date , Double> Price =new HashMap<>();
public Map<Date , VehicleClass> PassedVehicles =new HashMap<>();

public void incomingVehicle (VehicleClass vehicleClass,Date date){
    PassedVehicles.put(date,vehicleClass);
    Price.put(date,vehicleClass.decreasePrice());
}


}

