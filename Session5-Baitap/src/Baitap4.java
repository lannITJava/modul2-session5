import java.util.Scanner;
import java.util.regex.Pattern;

public class Baitap4 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi");
        String str = scanner.nextLine();
        boolean check =true;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)){
                check = false;
            }
        }
        if (check){
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }


    }
}
