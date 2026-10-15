package jp.example.myapp;

public class Order {

	public static int order(int[][] values) {

        int total = 0;

        try {
        	// 引数で渡された単価、数量の合計値を算出する
            for (int[] value : values) {
                int price = value[0];
                int count = value[1];
                total += Calculator.calc(price, count);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return total;
    }
	
}
