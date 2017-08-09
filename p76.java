/*Your program must read an integer X indefinited times (the program must stop when X is equal to zero).
 For each X print the sequence from 1 to X, with one space between each one of these numbers.*/
 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 import java.io.IOException;
 public class Main 
 {
 	public static void main(String[] args) throws IOException 
 	{
 		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
 		int number;
 		boolean flag;
 		do
 		{
         number=Integer.parseInt(in.readLine());
         if(number==0)
         {
           flag=false
         }
         else
         {
         	flag=true;
         	if(number>=1)
         	{
         	for(int i=1;i<number;i++)
         		System.out.printf("%d ",i);
         	System.out.printf("%d\n",number);
             }
            else
            {
             for(int i=1;i>number;i--)
               System.out.printf("%d ",i);
         	System.out.printf("%d\n",number);	
            }
         }


 		}while(flag);
 	}
 }