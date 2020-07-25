package calc;

public class Task4 {

	public static void main(String[] args) {
		int num = 192837;
		int exceptFirstDigit = num / 10; //10で割って小数点以下切り捨て→一桁目の数字をなくした数
		int onlyFirstDigit =num % 10; //10で割った余り→一桁目の数値

		System.out.println("一の位を除く数:" + exceptFirstDigit);
		System.out.println("一の位の数):" + onlyFirstDigit);
	}

}