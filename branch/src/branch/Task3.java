package branch;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double inputnum = sc.nextDouble(); //入力される数字が整数でない可能性があるのでdouble
		if(inputnum > 0) {
			System.out.print("入力された数字は正の数です。"); //0より大きければ表示
		}else if(inputnum < 0){
			System.out.print("入力された数字は負の数です。"); //0より小さければ表示
		}else{
			System.out.print("入力された数字は0です。");//0より大きくも小さくもない→0ならば表示
		}

		sc.close();
	}

}
