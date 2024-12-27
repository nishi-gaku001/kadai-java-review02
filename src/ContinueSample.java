
public class ContinueSample {

    public static void main(String[] args) {
        // 検索対象データを準備
        int[] targetArray = { 37, 85, 64, 57, 98, 100, 47, 23, 71, 69};

        //変数の宣言
        int count = 0;

        //配列の全要素を対象に探す
        for (int value : targetArray) {
            //(valueが60未満のときは繰り返しを抜け、ループに戻る…ということのはず)
            if(value < 60) {
                continue;
            }
            //変数のカウントアップ（valueが60より大きいときは変数が+1になる…ということのはず）
            count++;
        }


        //60以上の人数を表示
        System.out.println("60点以上の人は、" + count + "人です。");

    }

}
