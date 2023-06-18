
import java.util.Calendar;
public class calendar {
        public static String findDay(int month, int day, int year) {


            if(year<3000 && year>2000){
                Calendar calendar=Calendar.getInstance();

                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH,month-1);
                calendar.set(Calendar.DAY_OF_MONTH,day);

                int diaSemana = calendar.get(Calendar.DAY_OF_WEEK);

                String diaSemanaTexto = "";

                switch (diaSemana) {
                    case 1:
                        diaSemanaTexto = "SUNDAY";
                        break;
                    case 2:
                        diaSemanaTexto = "MONDAY";
                        break;
                    case 3:
                        diaSemanaTexto = "TUESDAY";
                        break;
                    case 4:
                        diaSemanaTexto = "WEDNESDAY";
                        break;
                    case 5:
                        diaSemanaTexto = "THURSDAY";
                        break;
                    case 6:
                        diaSemanaTexto = "FRIDAY";
                        break;
                    case 7:
                        diaSemanaTexto = "SATURDAY";
                        break;
                }
                return diaSemanaTexto;
            }
            return "";
        }

}
