package packArray;

public class TwentyThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[] {5,2,8,9,3,4,1,-3,-15};
		int i,j;
		
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				int temp = 0;
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}

	}

}
