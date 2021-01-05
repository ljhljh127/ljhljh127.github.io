import java.util.Scanner;
public class Second_To_HourAndMinute
{
    public static void main (String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("초를 입력해주세요");
        int time=scanner.nextInt();
        System.out.println("입력된 초는 "+time+" 입니다");
        int second=time%60;
        int hour=(time/60)/60;
        int minute=(time/60)%60;
        System.out.println("현재 시각은 "+ hour+"시 "+minute+"분 "+second+"초입니다");
        
    }
}