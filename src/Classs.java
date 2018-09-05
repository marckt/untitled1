import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.StringTokenizer;

public class Classs {
    public static void main(String[] args) {
        System.out.println(convertDate("\"2015-09-28\""));
    }

    public static String convertDate(String date) {
      String pizDate =  date.replaceAll("\"","");
        if (!pizDate.matches("^((19|20)\\d\\d)-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])$"))
            return "Incorrect input";
        String st[] = pizDate.replaceAll("-", "/").split("/");
        return "\""+ st[1]+"/" + st[2]+"/" + st[0]+"\"";

       /* SimpleDateFormat oldDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat newDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        try {
            Date date1 = oldDateFormat.parse(date);
            return newDateFormat.format(date1);

        } catch (ParseException e) {
            return "Incorrect input";
        }
        }*/
    }

}