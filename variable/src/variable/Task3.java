package variable;

public class Task3 {

	public static void main(String[] args) {
		int intNum = 219;
		long itolNum = intNum;

		double doubleNum = 364.2;
		float dtofNum = (float) doubleNum;

		long longNum = 123456L;
		double ltodNum = longNum;

		System.out.println("変換前");
		System.out.println(intNum);
		System.out.println(doubleNum);
		System.out.println(longNum);
		System.out.println("変換後");
		System.out.println(itolNum);
		System.out.println(dtofNum);
		System.out.println(ltodNum);
	}

}
