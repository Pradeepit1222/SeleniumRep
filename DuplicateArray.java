package week2.day1;

public class DuplicateArray {

	public static void main(String[] args) {
  int [] a= {2,5,4,2,5,4};
  
  for (int i = 0; i < a.length; i++) {
	for (int j = i+1; j < a.length; j++) {
		if(a[i]==a[j]) {
			System.out.println("Without duplicate no is" + a[i]);
		}
	}
}
	}

}
