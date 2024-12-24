
public class Clork {

    public static void main(String[] args) {
        // getSceondsに値を3つ渡し、結果を返す
        int result = getSeconds(18, 32 ,47);

        // 返ってきた結果を出力
        System.out.println(result);

    }
    public static int getSeconds(int hour, int minute, int second) {
        // hourを秒に変換
        int hour_second =hour *60 *60;
        // minuteを秒に変換
        int minute_second = minute *60;
        // 秒に変換した結果を合計
        int second_total =hour_second + minute_second + second;
        return second_total;
    }
}
