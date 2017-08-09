
/*
Maria has just started as graduate student in a medical school and she's needing your help to organize a laboratory experiment which
 she is responsible about. She wants to know, at the end of the year, how many animals were used in this laboratory and the percentage of
 each type of animal is used at all.
This laboratory uses in particular three types of animals: frogs, rats and rabbits. To obtain this information,
it knows exactly the number of experiments that were performed, the type and quantity of each animal is used in each experiment.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Character;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        int testcases,amount,totalFrog,totalRat,totalRabbit,totalTest;
        totalFrog=totalRat=totalRabbit=totalTest=0;
        String s,s1;
        s=s1=null;
        char ch;
        testcases=Integer.parseInt(input.readLine());
        for(int i=0;i<testcases;i++)
        {
            s=input.readLine();
            amount=Integer.parseInt(s.split(" ")[0]);
            s1=s.split(" ")[1];
            ch=s1.charAt(0);
            if(ch=='C')
                totalRabbit+=amount;
            else if(ch=='R')
                totalRat+=amount;
            else if(ch=='S')
                totalFrog+=amount;
            totalTest+=amount;
        }
        System.out.printf("Total: %d cobaias\n",totalTest);
        System.out.printf("Total de coelhos: %d\n",totalRabbit);
        System.out.printf("Total de ratos: %d\n",totalRat);
        System.out.printf("Total de sapos: %d\n",totalFrog);
        System.out.printf("Percentual de coelhos: %.2f %%\n",100*((double)totalRabbit/totalTest));
        System.out.printf("Percentual de ratos: %.2f %%\n",100*((double)totalRat/totalTest));
        System.out.printf("Percentual de sapos: %.2f %%\n",100*((double)totalFrog/totalTest));

    }
}