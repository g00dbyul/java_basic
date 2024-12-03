package example1.enum_example;

import java.util.Calendar;

public class EnumExample {
    public static void main(String[] args) {
        Week today = null;
        Calendar calendar = Calendar.getInstance();
        int week = calendar.get(Calendar.DAY_OF_WEEK);
        switch (week) {
            case 1:
                today = Week.SUNDAY; break;
            case 2:
                today = Week.MONDAY; break;
            case 3:
                today = Week.TUESDAY; break;
            case 4:
                today = Week.WEDNESDAY; break;
            case 5:
                today = Week.THURSDAY; break;
            case 6:
                today = Week.FRIDAY; break;
            case 7:
                today = Week.SATURDAY; break;
            default:
                System.out.println("Invalid week");
        }
        System.out.println(today);

        if (today == Week.SUNDAY) {
            System.out.println("Go to Soccer");
        } else {
            System.out.println("Study Java");
        }

    }
}
