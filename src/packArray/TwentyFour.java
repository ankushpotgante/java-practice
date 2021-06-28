package packArray;

public class TwentyFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[] {15,75,34,23,45,12,22,87,65};
		
		int sorted[] = new int[arr.length];
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				
				// logic to swap elements
				
				int temp = 0;
				
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
			sorted[i] = arr[i];
		}
		
		for(int i=0;i<sorted.length;i++) {
			System.out.print(sorted[i]+" ");
		}

	}

}
