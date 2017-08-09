
/*Read an integer value, which is the duration in seconds of a certain event in a factory, and inform it expressed in hours:minutes:seconds.*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        int totalTime,totalHours,totalMinutes,totalSeconds;
        totalTime=Integer.parseInt(input.readLine());
        totalHours=totalTime/3600;
        totalTime=totalTime%3600;

        totalMinutes=totalTime/60;
        totalTime=totalTime%60;
        totalSeconds=totalTime;
        System.out.printf("%d:%d:%d\n",totalHours,totalMinutes,totalSeconds);
    }
}