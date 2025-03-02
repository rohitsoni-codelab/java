package scratch.Date_Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;//outdated...
import java.util.time.*;

public class Date1 {
    public static void main(String[] args) {
        Date dt=new Date();
        System.out.println(dt);
        
        LocalDate dt1=LocalDate.now();
        System.out.println(dt1);

        LocalTime tm1= LocalTime.now();
        System.out.println(tm1);
        int hr=tm1.getHour();
        int min=tm1.getMinute();
        int sec=tm1.getSecond();
        System.out.println(hr+"/"+min+"/"+sec);
    }
    
}
