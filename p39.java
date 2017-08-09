
/*Tax calculation*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        double income,tax;
        income=Double.parseDouble(input.readLine());
        tax=0.00;
        if(income>=0 && income<=2000.00)
            System.out.printf("Isento\n");
        else if(income>=2000.01 && income<=3000.00)
        {tax=0.08*(income-2000.00);
            System.out.printf("R$ %.2f\n",tax);}
        else if(income>=3000.01 && income<=4500.00)
        {tax=0.18*(income-3000.00)+0.08*1000.00;
            System.out.printf("R$ %.2f\n",tax);}
        else if(income>=4500.01)
        {tax=.28*(income-4500.00)+.18*(1500)+.08*1000.00;
            System.out.printf("R$ %.2f\n",tax);}


    }
}