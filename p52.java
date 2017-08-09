/*
Read an integer value N. After, read these N values and print a message for each value saying if this value is odd, even,
 positive or negative. In case of zero (0),
 although the correct description would be "EVEN NULL", because by definition zero is even, your program must print only "NULL", without quotes.
*/
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        int testcase,num;
        testcase=Integer.parseInt(input.readLine());
        for(int i=0;i<testcase;i++)
        {
            num=Integer.parseInt(input.readLine());
            if(num==0)
            {
                System.out.printf("NULL\n");
            }
            else
            {
                if(num>0)
                {
                    if(num%2==0)
                        System.out.printf("EVEN POSITIVE\n");
                    else
                        System.out.printf("ODD POSITIVE\n");

                }
                else
                {
                    if(num%2==0)
                        System.out.printf("EVEN NEGATIVE\n");
                    else
                        System.out.printf("ODD NEGATIVE\n");

                }
            }


        }
    }
}