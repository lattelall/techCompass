package calc;

public class Task2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		int c = 13;
		int sum = a + b + c;
		int ave1 = sum / 3;
		double ave2 =sum / 3.0;

		System.out.println("合計:" + sum);
		System.out.println("平均(3で割った時):" + ave1);
		System.out.println("平均(3.0で割った時):" + ave2);
	}

}
