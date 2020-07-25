package loop;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		//入力される数字は正の整数のみ想定
		Scanner sc = new Scanner(System.in);
		System.out.print("数字を入力してください: " );
		int inputNum = sc.nextInt();//入力される自然数、繰り返しの上限
		int sum = 0;
		
		for(int i = 1; i <= inputNum; i++) { //i=inputNumになるまで、一つずつ繰り返し足し算処理
			System.out.print(i);
			if(i < inputNum) {
				System.out.print(" + " ); //繰返し処理の最後の1手前まで"+"を表示
			}
			sum += i; //sumにsum+iを代入、1からinputNumまで足していく
		}
		System.out.print(" = " + sum);
		sc.close();
	}
}
