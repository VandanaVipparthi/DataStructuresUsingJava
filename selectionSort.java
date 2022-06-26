package algorithms;

public class selectionSort {

	public static void main(String[] args) {
		int[] arr= {12,8,7,5,2};
		int n=5;
		System.out.println("Array before sorting: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<=n-2;i++) {
			for(int j=i+1;j<=n-1;j++) {
				if (arr[j]<arr[i]) {
					int temp=arr[j];//min
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println("\nArray after sorting: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
