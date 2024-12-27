
public class Review02 {

    public static void main(String[] args) {
        //カウンタ用変数の宣言
        int i;

        for (i = 1; i <= 100; i++) {
            //3で割り切れるし、5でも割り切れる
            if ( i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            //3で割り切れる場合
            }else if(i % 3 == 0) {
                System.out.println("Fizz");
            //5で割り切れる場合
            }else if(i % 5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }

}
