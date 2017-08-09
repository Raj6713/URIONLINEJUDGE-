
/*
Read 4 integer values A, B, C and D. Then if B is greater than C and D is greater than A and
if the sum of C and D is greater than the sum of A and B and if C and D were positives values and if A is even,
 write the message “Valores aceitos” (Accepted values). Otherwise, write the message “Valores nao aceitos” (Values not accepted).
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        int a,b,c,d;
        String s=null;
        s=input.readLine();
        a=Integer.parseInt(s.split(" ")[0]);
        b=Integer.parseInt(s.split(" ")[1]);
        c=Integer.parseInt(s.split(" ")[2]);
        d=Integer.parseInt(s.split(" ")[3]);
        if((b>c) &&(d>a) &&((c+d)>(a+b)) && c>0 && d>0 && a%2==0)
            System.out.printf("Valores aceitos\n");
        else
            System.out.printf("Valores nao aceitos\n");
    }
}