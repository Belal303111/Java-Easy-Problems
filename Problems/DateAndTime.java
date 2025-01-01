import java.io.*;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
class Result {

    public static String findDay(int month, int day, int year) {
        LocalDate date =LocalDate.of(year,month,day);
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL,new Locale("E")).toUpperCase();
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

<<<<<<< HEAD
        String res = AveryBigSum.findDay(month, day, year);
=======
        String res = Result.findDay(month, day, year);
>>>>>>> 65c803b6a17433c9801d2718ee585c103566bac0

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
