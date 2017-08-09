
/*
Read an integer value corresponding to a person's age (in days) and print it in years, months and days,
 followed by its respective message “ano(s)”, “mes(es)”, “dia(s)”.
Note: only to facilitate the calculation, consider the whole year with 365 days and 30 days every month.
In the cases of test there will never a situation that
allows 12 months and some days, like 360, 363 or 364. This is just an exercise for the purpose of testing simple mathematical reasoning.
*/
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        int totalDays,totalYears,totalMonths,totalDay;
        totalDays=Integer.parseInt(input.readLine());
        totalYears=totalDays/365;
        totalDays=totalDays%365;
        totalMonths=totalDays/30;
        totalDays=totalDays%30;
        totalDay=totalDays;
        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n",totalYears,totalMonths,totalDay);
    }
}