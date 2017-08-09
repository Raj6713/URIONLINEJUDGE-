/*
Read the start time and end time of a game, in hours. Then calculate the duration of the game,
 knowing that the game can begin in a day and finish in another day, with a maximum duration of 24 hours.
  The message must be printed in portuguese “O JOGO DUROU X HORA(S)” that means “THE GAME LASTED X HOUR(S)”
*/
  import java.io.InputStreamReader;
  import java.io.IOException;
  import java.io.BufferedReader;
  public class Main 
  {
  	public static void main(String[] args) throws IOException 
  	{
  		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
  		String s=null;
  		int startTime,endTime,totalTime;
  		s=input.readLine();
  		startTime=Integer.parseInt(s.split(" ")[0]);
  		endTime=Integer.parseInt(s.split(" ")[1]);
  		if(startTime<endTime)
  		{
          totalTime=endTime-startTime;
  		}
  		else 
  		{
  			totalTime=(24-startTime)+endTime;
  		}
  		System.out.printf("O JOGO DUROU %d HORA(S)\n");
  	}
  }