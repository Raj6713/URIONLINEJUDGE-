/*
In this problem, the task is to read a code of a product 1, the number of units of product 1, 
the price for one unit of product 1, the code of a product 2,
 the number of units of product 2 and the price for one unit of product 2. After this, calculate and show the amount to be paid.
*/

 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;

 public class Main 
 {
 	public static void main(String[] args) throws IOException
 	{
 		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
 		String s=null;
 		int codeOne, unitsOne, codeTwo, unitsTwo;
 		double priceOne, priceTwo,totalBill=0;
 		s=input.readLine();
 		codeOne=Integer.parseInt(s.split(" ")[0]);
 		unitsOne=Integer.parseInt(s.split(" ")[1]);
 		priceOne=Double.parseDouble(s.split(" ")[2]);
 		s=input.readLine();
 		codeTwo=Integer.parseInt(s.split(" ")[0]);
 		unitsTwo=Integer.parseInt(s.split(" ")[1]);
 		priceTwo=Double.parseDouble(s.split(" ")[2]);
 		totalBill=unitsOne*priceOne+unitsTwo*priceTwo;
 		System.out.printf("VALOR A PAGAR: R$ %.2f\n",totalBill);
 	}
 }