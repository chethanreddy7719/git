import java.util.Arrays;
import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the array size :");
		int arrSize = sc.nextInt();
		int[] arr = new int[arrSize];
		System.out.println("please enter the array value :");
		for(int i=0 ; i<arrSize ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("input :" +Arrays.toString(arr));
		int sum = 0;
		int index = 0;
		for(int i=0 ; i<arr.length ; i++) {
		sum += arr[i];
		index = i;
	}
		System.out.println("output :" +sum/arr.length);
		System.out.println("index :" +index);

	}

}