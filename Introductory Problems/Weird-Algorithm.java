import java.util.Scanner;
 
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        while(n!=1)
        {
            System.out.print(n+" ");
            if(n%2==0)
            {
                n=n/2;
            }
            else{
                n = n*3;
                n+=1;
            }
        }
        System.out.print(1);
    }
}
