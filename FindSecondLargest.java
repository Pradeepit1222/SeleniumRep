package week2.day1;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {31,22,11,45,66,57};
		int length = data.length;
		//System.out.println(length of the data is);
		
		Arrays.sort(data);
		{

			if(data.length>=4) {
				System.out.println("Second Largest number is : " + data[length-2]);
			}
			{	
	
			}
	
}
	}
	

}