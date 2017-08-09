
/*
Using the following table, write a program that reads a code and the amount of an item. After, print the value to pay.
 This is a very simple program with the only intention of practice of selection commands.
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
        int itemCode,quantity;
        double itemOne=4.00,itemTwo=4.50,itemThree=5.00,itemFour=2.00,itemFive=1.50;
        s=input.readLine();
        itemCode=Integer.parseInt(s.split(" ")[0]);
        quantity=Integer.parseInt(s.split(" ")[1]);
        if(itemCode==1)
            System.out.printf("Total: R$ %.2f\n",itemOne*quantity);
        else 	if(itemCode==2)
            System.out.printf("Total: R$ %.2f\n",itemTwo*quantity);
        else 	if(itemCode==3)
            System.out.printf("Total: R$ %.2f\n",itemThree*quantity);
        else 	if(itemCode==4)
            System.out.printf("Total: R$ %.2f\n",itemFour*quantity);
        else 	if(itemCode==5)
            System.out.printf("Total: R$ %.2f\n",itemFive*quantity);

    }
}