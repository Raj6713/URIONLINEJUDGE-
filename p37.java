
/*Write a classification program based in java.*/
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        String m1,m2,m3;
        m1=input.readLine();
        m2=input.readLine();
        m3=input.readLine();

        if(m1.equals("vertebrado"))
        {
            if(m2.equals("ave"))
            {
                if(m3.equals("carnivoro"))
                    System.out.printf("aguia\n");
                else if(m3.equals("onivoro"))
                    System.out.printf("pomba\n");

            }
            else if(m2.equals("mamifero"))
            {
                if(m3.equals("onivoro"))
                    System.out.printf("homem\n");
                else if(m3.equals("herbivoro"))
                    System.out.printf("vaca\n");

            }
        }
        else if(m1.equals("invertebrado"))
        {
            if(m2.equals("inseto"))
            {
                if(m3.equals("hematofago"))
                    System.out.printf("pulga\n");
                else if(m3.equals("herbivoro"))
                    System.out.printf("lagarta\n");

            }
            else if(m2.equals("anelideo"))
            {
                if(m3.equals("hematofago"))
                    System.out.printf("sanguessuga\n");
                else if(m3.equals("onivoro"))
                    System.out.printf("minhoca\n");

            }

        }
    }
}