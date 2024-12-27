public class SeveNumber {

    public static void main(String[] args) {

        //自分で書いたやつ
//        for (int i = 1; i < 100; i++) {
//            //70番台（70～79）
//            if(i >= 70 && i <= 79){
//                System.out.println("clap!");
//            }
//          //71～79以外で7が入っている数（ベタ打ちでいいのか？）
//            else if(i == 7 || i == 17 || i == 27 || i == 37 || i == 47 || i == 57 || i == 67 || i == 87 || i == 97 ) {
//                System.out.println("clap!");
//            }
//          //7の倍数のとき（7で割って0なら7の倍数のはず）
//            else if(i % 7 == 0) {
//                System.out.println("clap!");
//
//            }else{
//                System.out.println(i);
//            }
//    }

        //解答例を写したやつ+コメントで補足
        for (int i = 1; i <= 100; i++) {
            //iが7の倍数のとき（これは自分でもできた）||i/10の余りが7（確かに…）||i/10=7（70番台用か。小数点以下はカットされるから）
            if ( i %7 == 0 || i % 10 == 7 || i / 10 == 7) {
                System.out.println("clap!");
        }else {
            System.out.println(i);
            }
        }
    }
}
