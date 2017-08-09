/*
Read a value of floating point with two decimal places. This represents a monetary value. After this, calculate the
 smallest possible number of notes and coins on which the value can be decomposed. The considered notes are of 100, 50, 20, 10, 5, 2. 
 The possible coins are of 1, 0.50, 0.25, 0.10, 0.05 and 0.01.
 Print the message “NOTAS:” followed by the list of notes and the message “MOEDAS:” followed by the list of coins.
*/
import java.io.BufferReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;
public class Main 
{
	public static void main(String[] args) throws IOException
	{
      BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
      double totalAmount=Double.parseDouble(input.readLine());
      int totalAmount1, totalAmount2;
      totalAmount1=Math.floor(totalAmount);
      totalAmount2=totalAmount-totalAmount1;
      int hunderedNote,fiftyNote,twentyNote,tenNote,fiveNote,twoNote,oneCoin,pachasPaise,pacheesPaise,dasPaise,paanchPaise,ekPaise;
      hundredNote=totalAmount1/100;
      totalAmount1=totalAmount1%100;

      fiftyNote=totalAmount1/50;
      totalAmount1=totalAmount1%50;

      twentyNote=totalAmount1/20;
      totalAmount1=totalAmount1%20;

      tenNote=totalAmount1/10;
      totalAmount1=totalAmount1%10;

      fiveNote=totalAmount1/5;
      totalAmount1=totalAmount1%5;

      twoNote=totalAmount1/2;
      totalAmount1=totalAmount1%2;

      oneCoin=totalAmount1;
      
      totalAmount2=(int)(totalAmount2*100);
      
      pachasPaise=totalAmount2/50;
      totalAmount2=totalAmount2%50;

      pacheesPaise=totalAmount2/25;
      totalAmount2=totalAmount2%25;

      dasPaise=totalAmount2/10;
      totalAmount2=totalAmount2/10;

      paanchPaise=totalAmount2/5;
      totalAmount2=totalAmount2%5;

      ekPaise=totalAmount;
System.out.printf("NOTAS:\n%d nota(s) de R$ 100.00\n%d nota(s) de R$ 50.00\n%d nota(s) de R$ 20.00\n%d nota(s) de R$ 10.00\n%d nota(s) de R$ 5.00\n%d nota(s) de R$ 2.00\n",hundredNote,fiftyNote,twentyNote,tenNote,fiveNote,twoNote);
System.out.printf("MOEDAS:\n%d moeda(s) de R$ 1.00\n%d moeda(s) de R$ 0.50\n%d moeda(s) de R$ 0.25\n%d moeda(s) de R$ 0.10 \n%d moeda(s) de R$ 0.05\n%d moeda(s) de R$ 0.01\n",oneCoin,pachasPaise,pacheesPaise,dasPaise,paanchPaise,ekPaise);














    
	}
}