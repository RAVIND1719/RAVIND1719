package assingments_w1_d2;
import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] array = {1,2,5,3,7,6,8,9};
		Arrays.sort(array);
		for (int i = array[0]; i<=array.length;i++)
		{
			if(i != array[i-1]) {
				System.out.println("The missing element in array is " + i);
				break;
			}
		}

	}

}
