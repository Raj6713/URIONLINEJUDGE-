/*Read an integer number that is the code number for phone dialing.
Then, print the destination according to the following table:
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        int num;
        num=Integer.parseInt(input.readLine());
        if(num==61)
            System.out.printf("Brasilia\n");
        else if(num==71)
            System.out.printf("Salvador\n");
        else if(num==11)
            System.out.printf("Sao Paulo\n");
        else if(num==21)
            System.out.printf("Rio de Janeiro\n");
        else if(num==32)
            System.out.printf("Juiz de Fora\n");
        else if(num==19)
            System.out.printf("Campinas\n");
        else if(num==27)
            System.out.printf("Vitoria\n");
        else if(num==31)
            System.out.printf("Belo Horizonte\n");
        else
            System.out.println("nao cadastrado\n");
    }
}