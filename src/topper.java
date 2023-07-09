import java.util.Scanner;
public class topper {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int sum_even=0,sum_odd=0;
        String str=Integer.toString(num);
        for(int i=0;i<str.length();i++)
        {
            if(i%2==0)
            {
                char ch=str.charAt(i);
                int res = Integer.parseInt(String.valueOf(ch));
                sum_odd=sum_odd+res;
            }
            else
            {
                char ch=str.charAt(i);
                int res = Integer.parseInt(String.valueOf(ch));
                sum_even=sum_even+res;
            }
        }
        if(sum_odd==sum_even)
        {
            System.out.print("true");

        }
        else {
            System.out.print("false");
        }

    }
}
