import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        ArrayList<LocalDate> dates = new ArrayList<LocalDate>();

            dates.add(LocalDate.of(2023, 1, 15));
            dates.add(LocalDate.of(2023, 2, 16));
            dates.add(LocalDate.of(2023, 3, 17));
            dates.add(LocalDate.of(2023, 4, 17));
            dates.add(LocalDate.of(2023, 5, 17));
            dates.add(LocalDate.of(2023, 6, 17));
            dates.add(LocalDate.of(2023, 7, 17));
            dates.add(LocalDate.of(2024, 7, 11));
            dates.add(LocalDate.of(2023, 8, 17));
            dates.add(LocalDate.of(2023, 9, 17));
            dates.add(LocalDate.of(2023, 10, 17));
            dates.add(LocalDate.of(2023, 11, 17));
            dates.add(LocalDate.of(2023, 12, 17));


        DateSorter dateSorter = new DateSorter();
        Collection<LocalDate> sorted = dateSorter.sortDates(dates);
        System.out.println(sorted);
    }
}