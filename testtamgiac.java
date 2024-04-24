import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap do dai 3 canh cua tam giac:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        String result = triangleType(a, b, c);
        System.out.println("Loai tam giac: " + result);

        scanner.close();
    }

    public static String triangleType(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "NotATriangle";
        }
        if (a == b && b == c) {
            return "Equilateral";
        } else if (a == b || a == c || b == c) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}