package my.packege.navin;
import java.util.Scanner;
public class MobNumOccurence 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,count;
        long  number,digit,temp;
        System.out.println("Enter any Number : ");
        number=sc.nextLong();
         System.out.println("Digit Frequency");
        for(i=0;i<=9;i++)
        {
            count=0;
            temp=number;
            while(temp>0)
            {
                digit=temp%10;
                if(digit==i)
                {
                    count++;
                }
                temp=temp/10;
            }
            if(count>0)
            {
                System.out.println(i+"\t"+count);
            }
        }
        sc.close();
    }
}
