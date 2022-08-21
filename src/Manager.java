import java.util.Date;
import java.util.Map;
import java.util.stream.Collectors;

public class Manager {
    public TicketOffice ticketOffice;
    public double sum;

    public Manager(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }
     public void DailyPrice (Date date){
        ticketOffice.Price.entrySet().stream()
                .filter(x -> x.getKey().getDay()==date.getDay())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
                .entrySet().forEach(entry -> {
                    System.out.println(entry.getKey() + " " + entry.getValue());
                });
         for (double value : ticketOffice.Price.values()) {
             sum += value;
         }
         System.out.println("Daily Price : "+sum);
     }
}
