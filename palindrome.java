public class palindrome {
   public static int palindrome(int arr[], int start, int end){
    if (start >end) {
		return 1;
	}
	if (arr[start] == arr[end]) {
		return palindrome(arr, start+ 1, end - 1);
	}
	else {
		return 0;
	}
   }
public static void main(String args[]){
    int a[] = { 3,0,1,0,3 };
	int n = a.length;
    if(palindrome(a,0,n-1)==1){
        System.out.println("IT IS A PALINDROME");
    }
    else{
        System.out.println("IT IS  NOT A PALINDROME");
    }

}
}
