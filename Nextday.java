import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap ngay (1-31): ");
        int day = scanner.nextInt();
        System.out.println("Nhap thang (1-12): ");
        int month = scanner.nextInt();
        System.out.println("Nhap nam (1812-2012): ");
        int year = scanner.nextInt();

        String result = nextDate(day, month, year);
        System.out.println("Ngay ke tiep la: " + result);

        scanner.close();
    }

    public static String nextDate(int day, int month, int year) {
        if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1812 || year > 2012) {
            return "Ngay khong hop le";
        }

        day++;
        if (day > numberOfDays(month, year)) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }

        return day + "/" + month + "/" + year;
    }

    public static int numberOfDays(int month, int year) {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 31;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}