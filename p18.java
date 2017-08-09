/*
In this problem you have to read an integer value and calculate the smallest possible number of banknotes in which the value may be decomposed.
The possible banknotes are 100, 50, 20, 10, 5, 2 e 1. Print the read value and the list of banknotes.
Input
The input file contains an integer value N (0 < N < 1000000).
Output
Print the read number and the minimum quantity of each necessary banknotes in Portuguese language, as the given example.
 Do not forget to print the end of line after each line, otherwise you will receive “Presentation Error”.
*/
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        int totalMoney,t,hundredNote,fiftyNote,twentyNote,tenNote,fiveNote,twoNote,oneNote;
        totalMoney=Integer.parseInt(input.readLine());
        t=totalMoney;
        hundredNote=totalMoney/100;
        totalMoney=totalMoney%100;

        fiftyNote=totalMoney/50;
        totalMoney=totalMoney%50;

        twentyNote=totalMoney/20;
        totalMoney=totalMoney%20;

        tenNote=totalMoney/10;
        totalMoney=totalMoney%10;

        fiveNote=totalMoney/5;
        totalMoney=totalMoney%5;

        twoNote=totalMoney/2;
        totalMoney=totalMoney%2;

        oneNote=totalMoney;

        System.out.printf("%d\n%d nota(s) de R$ 100,00\n%d nota(s) de R$ 50,00\n%d nota(s) de R$ 20,00\n%d nota(s) de R$ 10,00\n%d nota(s) de R$ 5,00\n%d nota(s) de R$ 2,00\n%d nota(s) de R$ 1,00\n",
               t, hundredNote,fiftyNote,twentyNote,tenNote,fiveNote,twoNote,oneNote);

    }
}