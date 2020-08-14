package pl.samouczekprogramisty.Chepter09_Exeptions.HoursToSeconds;

public class ConverterHoursToSeconds {
    public static int convertHoursToSeconds(int h) {
        if (h < 0) {
            throw new IllegalArgumentException("Nieprawidłowe dane. Argument nie może być mniejszy od 0");
        }
        return h * 60 * 60;
    }
}
