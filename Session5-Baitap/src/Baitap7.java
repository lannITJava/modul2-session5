public class Baitap7 {
    public static void main(String[] args) {
        String str = "Rikkei";
        System.out.println("Chuỗi sau khi loại bỏ ký tự trùng lặp");
        for (int i = 0; i < str.length(); i++) {
            if (i>0){
                boolean isDuplicate = false;
                for (int j = i-1; j >=0 ; j--) {
                    if (str.charAt(i)==str.charAt(j)){
                        isDuplicate= true;
                    }
                }
                if (!isDuplicate){
                    System.out.printf("%c\t",str.charAt(i));
                }
            }else {
                System.out.printf("%c\t",str.charAt(i));
            }
        }
        System.out.printf("\n");
    }
}
