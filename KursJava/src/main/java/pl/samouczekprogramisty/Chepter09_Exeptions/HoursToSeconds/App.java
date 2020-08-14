package pl.samouczekprogramisty.Chepter09_Exeptions.HoursToSeconds;

public class App {
    public static void main(String[] args) {
        int hour = -10;
        int numberOfSeconds;

        try {
            numberOfSeconds = ConverterHoursToSeconds.convertHoursToSeconds(hour);
        } catch (IllegalArgumentException e) {
            numberOfSeconds = ConverterHoursToSeconds.convertHoursToSeconds(hour * -1);
        }
        System.out.println(numberOfSeconds);
    }
}
