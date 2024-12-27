
public class Triangle {

    public static void main(String[] args) {
        // 代入する数値は自由に変更してください
        int a = 5;
        int b = 5;
        int c = 5;

        //自分で書いたやつ（これだとそりゃダメだ）
//        if(a == 8 && b == 4 && c == 5){
//            System.out.println("不等辺三角形です");
//        }else if(a == 8 && b == 5 && c ==5) {
//            System.out.println("二等辺三角形です");
//        }else if(a == 5 && b == 5 && c == 5) {
//            System.out.println("正三角形です");
//        }


        //解答例を写したやつ
        if (a == b && b == c && c == a) {
            System.out.println("正三角形です");
        }else if (a == b || b == c || c == a) {
            System.out.println("二等辺三角形です");
        }else {
            System.out.println("不等辺三角形です");
        }
    }
}
