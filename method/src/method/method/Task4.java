package method;

public class Task4 {
/*戻り値boolean
 * 配列にnullがあるか調べる(nullがあるときはtrue、なければfalse)
 */
	public static void main(String[] args) {
		String[] array1 =new String [] {"a","b","c"};
		String[] array2 =new String [] {"a",null,"c"};

		System.out.println("---配列にnullがない場合---");
		System.out.println(nullCheck(array1));

		System.out.println("---配列にnullがある場合---");
		System.out.println(nullCheck(array2));
		}

	public static boolean nullCheck(String[] array) {
		boolean check = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				check = true;
				}
			}
		return check;
		}
}
