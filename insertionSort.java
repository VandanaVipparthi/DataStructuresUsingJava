package algorithms;

public class insertionSort {
	public static void main(String[] args) {
		int[] arr= {12,8,7,5,2};
		int n=5;
		System.out.println("Array before sorting: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=1;i<=n-1;i++) {
			int c=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>c) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=c;
		}
		System.out.println("\nArray after sorting: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
