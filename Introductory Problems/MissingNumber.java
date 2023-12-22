import java.util.Scanner;
 
class MissingNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        long sum = 0;
        long tSum = (long)n*(n+1)/2;
        for(int i=1;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        if(tSum-sum>Long.MAX_VALUE)
        {
            
            System.out.println((tSum-sum)%10e7);
        }
        else{
            System.out.println(tSum-sum);
        }
    }
}