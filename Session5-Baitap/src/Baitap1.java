import java.util.Arrays;
import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi thứ 1");
        String str1 = scanner.nextLine();
        System.out.println("Nhập vào chuỗi thứ 2");
        String str2 = scanner.nextLine();
        StringBuilder strB = new StringBuilder(str1);
        String strB1= strB.reverse().toString();
        if (strB1.equalsIgnoreCase(str2)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
