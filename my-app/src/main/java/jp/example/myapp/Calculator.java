package jp.example.myapp;

public class Calculator {

	public static int calc(int price, int count) throws Exception {

		if(count < 0) {
			return 0;
		}

		return price * count;
	}
	
}
