import java.util.Scanner;

public class Baitap8 {
    public static void main(String[] args) {
        String str1 ="Wellcome";
        String str2 ="home";
        if (str1.length()==str2.length()){
            System.out.println("Chuỗi sau khi nối là: "+ str1+str2);
        }
        if (str1.length()>str2.length()){
            int cut = str1.length()-str2.length();
            System.out.println(str1.substring(cut,str1.length())+str2);
        }else {
            int cut = str2.length()-str1.length();
            System.out.println("Chuỗi sau khi nối là: "+str1+str2.substring(cut,str2.length()));
        }

    }
}
