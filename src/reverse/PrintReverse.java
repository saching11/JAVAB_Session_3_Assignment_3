package reverse;

public class PrintReverse {

	protected void ReverseOfArray(int[] arr) {
		
		for(int j=arr.length-1;j>=0;j--) {
            System.out.print(arr[j] + " ");
        }
		
	}
}
