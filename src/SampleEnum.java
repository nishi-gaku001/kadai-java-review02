
public class SampleEnum {

    //列挙型Genderの定義
    public static enum Gender{
        男性,
        女性
    }

    // Gender型の変数の宣言と初期化
    public static void main(String[] args) {
        // Gender型の変数の宣言と初期か
        Gender gender0 = Gender.男性;
        Gender gender1 = Gender.女性;

        // genderの利用
        System.out.println(gender0);
        System.out.println(gender1);

        // 採番された数値を取得したい場合は変数名.ordinal()と書く
        System.out.println(gender0.ordinal());
        System.out.println(gender1.ordinal());
    }

}
