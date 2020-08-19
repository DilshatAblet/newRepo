package Day33_LocalDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Practice2 {
    public static void main(String[] args) {

        String[] student = {"Kalbinur kaherman", "Virginia Truba", "Odina", "Ernis", "Isa","Dilshat","Roman"};
        LocalDate[] birthDays = {
                LocalDate.of(1982, 12, 26),
                LocalDate.of(1993, 11, 25),
                LocalDate.of(1980, 11, 25),
                LocalDate.of(1990, 2, 21),
                LocalDate.of(1982, 11, 28),
                LocalDate.of(1985,6,9),
                LocalDate.of(2018,12,24)

        };

        DateTimeFormatter DateFormat = DateTimeFormatter.ofPattern("MMMM/dd/yy EEEE");

        for(int i =0 ;i<=student.length-1;i++){
            System.out.println(student[i]+" : "+birthDays[i].format(DateFormat));
        }


    }
}
