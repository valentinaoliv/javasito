
import java.util.Calendar;
public class calendar {
        public static String findDay(int month, int day, int year) {


            if(year<3000 && year>2000){
                Calendar calendar=Calendar.getInstance();

                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH,month-1);
                calendar.set(Calendar.DAY_OF_MONTH,day);

                int diaSemana = calendar.get(Calendar.DAY_OF_WEEK);

                return switch (diaSemana) {
                    case 1 -> "SUNDAY";
                    case 2 -> "MONDAY";
                    case 3 -> "TUESDAY";
                    case 4 -> "WEDNESDAY";
                    case 5 -> "THURSDAY";
                    case 6 -> "FRIDAY";
                    case 7 -> "SATURDAY";
                    default -> "";
                };
            }
            return "";
        }
    public static void main(String[] args) {
        int month = 8;
        int day = 5;
        int year = 2015;

        String res = findDay(month, day, year);
        System.out.println(res);
    }

}



