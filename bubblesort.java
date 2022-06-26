package algorithms;
// BUBBLE SORT
public class bubblesort {

	public static void main(String[] args) {
		int[] arr= {12,8,7,5,2};
		int n=5;
		System.out.println("Array before sorting: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<=n-2;i++) {
			for(int j=0;j<=n-2-i;j++) {
				if (arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("\nArray after sorting: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
