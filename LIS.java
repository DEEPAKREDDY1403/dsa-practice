import java.lang.*;
class LIS {
	static int list(int arr[], int n)
	{
		int list[] = new int[n];
		int i, j, max = 0;
		for (i = 0; i < n; i++)
			list[i] = 1;
		for (i = 1; i < n; i++){
			for (j = 0; j < i; j++){
				if (arr[i] > arr[j] && list[i] < list[j] + 1)
					list[i] = list[j] + 1;
                    System.err.print(list[j]+" ");
            }
       System.err.println();
        }
		for (i = 0; i < n; i++)
			if (max < list[i])
				max = list[i];

		return max;
	}
	public static void main(String args[])
	{
		int arr[] = { 10, 9, 2, 5, 3, 7, 101, 18 };
		int n = arr.length;
		System.out.println("Length of list sequence is : "
						+ list(arr, n));
	}
}
