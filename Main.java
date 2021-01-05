import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int N,n=1,a=1,count=1;
        N=scanner.nextInt();
        for(;;)
        {
        if(N==1)
        {
            break;
        }
        a=a+6*n;
        count++;
        n++;
        if(a>=N)
        {
            break;
        }
        }
        System.out.println(count);
    }
}