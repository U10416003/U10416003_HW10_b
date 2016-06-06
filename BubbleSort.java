//U10416003
import java.util.*;

public class BubbleSort {
	//Bubblesort method
	public static void bubbleSort(int[] list) {
    boolean needNextPass = true;
    
    for (int k = 1; k < list.length && needNextPass; k++) {
		//array may be sorted and next pass not needed
		needNextPass = false;
		for (int i = 0; i < list.length - k; i++) {
			if (list[i] > list[i + 1]) {
				int temp = list[i];
				list[i] = list[i + 1];
				list[i + 1] = temp;
          
				needNextPass = true; // Next pass still needed
			}
		}
    }
}
//main method
public static void main(String[] args) {
	//new Scanner
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the number of Items:");
	
	int n = input.nextInt();
	//creating array variable
	int [] list = new int[n];
	
	System.out.print("Enter the numbers:");
	for(int i = 0;i < n;i++){
		list[i] = input.nextInt();
	}
	//sort
	bubbleSort(list);
	for (int i = 0; i < list.length; i++)
		System.out.print(list[i] + " ");
	}
}