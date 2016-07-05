package reverse;

import java.util.Scanner;

public class TestPrintReverse extends PrintReverse{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestPrintReverse tpr = new TestPrintReverse();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements for array");
		int number = sc.nextInt();
		System.out.println("Enter the numbers");
		int[] arr = new int[number];
		for(int i=0; i < number; i++){
            arr[i] = sc.nextInt();
        }
		
		System.out.println("Reverse of array is ");
		tpr.ReverseOfArray(arr);
		
	}

}
