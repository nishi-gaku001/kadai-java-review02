
public class Review01 {

    public static void main(String[] args) {
        //商品価格
        int price = 1500;
        //消費税率
        int tax_rate = 10;

        //taxメソッドで税額を計算して値を返す
        int  c_tax =tax(price, tax_rate);

        //税込価格を商品価格+税額
        int tax_in_price = price + c_tax;

        System.out.println(price + "円の商品の税込価格は" + tax_in_price + "円（消費税は"+ c_tax + "円）です。");

    }

    public static int tax (int price, int tax_rate) {
        //受け取った値の商品価格を消費税率で除算
        int c_tax =  price / tax_rate;

        //除算した結果をmainメソッドに返す
        return c_tax;
    }
}
