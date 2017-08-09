/*A gas station wants to determine which of their products is the preference of their customers. 
Write a program to read the type of fuel supplied (coded as follows: 1. Alcohol 2. Gasoline 3. Diesel 4. End). If you enter an
 invalid code (outside the range of 1 to 4) 
a new code must be requested. The program will end when the inserted code is the number 4.*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int fuelType,alcohol,gasoline,diesel;
		alcohol=gasoline=diesel=0;
		do
		{
			fuelType=Integer.parseInt(in.readLine());
           if(fuelType==4)
           	choice=false;
           else
           {
             if(fuelType==1 || fuelType==2|| fuelType==3)
             {
             	if(fuelType==1)
             		alcohol+=1;
             	if(fuelType==2)
             		gasoline+=1;
             	if(fuelType==3)
             		diesel+=1;                  
             }
             else
             	System.out.printf("MUITO OBRIGADO\n");
             choice=true;
           }
		}while(choice);
       System.out.printf("Alcool: %d\nGasolina: %d\nDiesel: %d\n",alcohol,gasoline,diesel);

	}
}