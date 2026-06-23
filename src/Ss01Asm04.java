import java.util.Scanner;

public class Ss01Asm04 {
    public static void main(String[] args) {
        float width, height, area, perimeter;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        width = Float.parseFloat(sc.next());
        System.out.print("Nhập chiều cao hình chữ nhật: ");
        height = Float.parseFloat(sc.next());
        sc.close();

        area = width * height;
        perimeter = 2 * (width + height);

        System.out.printf("Diện tích: %.2f", Math.round(area * 100) / 100.0);
        System.out.println();
        System.out.printf("Chu vi: %.2f", Math.round(perimeter * 100) / 100.0);
    }
}
