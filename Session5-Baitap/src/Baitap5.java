public class Baitap5 {
    public static void main(String[] args) {
        String input = "   Xin chào mỌi     ngƯỜi     ";
           input=input.trim();
           String[] words =input.split("\\s+");//Dấu cách liên tiếp nhau
        for (int i = 0; i < words.length ; i++) {
            words[i]= words[i].toLowerCase();
            String firstChar = words[i].substring(0,1);//Lấy từ ký tự đầu tiên và lấy một ký tự và trả lại các phần tử đã cắt
            firstChar = firstChar.toUpperCase();
            words[i]= firstChar+ words[i].substring(1);
        }
        System.out.println(String.join(" ",words));
    }
}
