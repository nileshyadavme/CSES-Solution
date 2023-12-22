import java.util.Scanner;

class Main{
    public static long BS(int[] arr)
    {
        int n = arr.length;
        long sum = ((n+1)*(n+2))/2;
        for(int i=0;i<arr.length;i++)
        {
            sum-=arr[i];

        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = n-1;
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(BS(arr));
    }
}