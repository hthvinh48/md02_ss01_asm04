import java.util.Scanner;

public class Ss01Asm04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float width = 0;
        float height = 0;

        while (true) {
            try {
                System.out.print("Nhập chiều rộng hình chữ nhật: ");
                width = Float.parseFloat(sc.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Dữ liệu không hợp lệ. Vui lòng nhập số!");
            }
        }

        while (true) {
            try {
                System.out.print("Nhập chiều cao hình chữ nhật: ");
                height = Float.parseFloat(sc.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Dữ liệu không hợp lệ. Vui lòng nhập số!");
            }
        }

        float area = width * height;
        float perimeter = 2 * (width + height);

        System.out.printf("Diện tích: %.2f%n", area);
        System.out.printf("Chu vi: %.2f%n", perimeter);

        sc.close();
    }
}