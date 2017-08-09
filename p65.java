/*Write a program to read the coordinates (X, Y) of an indeterminate number of points in Cartesian system. For
 each point write the quadrant to which it belongs. The program finish when at least one of two coordinates is
 NULL (in this situation without writing any message).*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int xPoint,yPoint;
        String s=null;
        while(true)
        {
            s=in.readLine();
            xPoint=Integer.parseInt(s.split(" ")[0]);
            yPoint=Integer.parseInt(s.split(" ")[1]);
            if(xPoint==0 || yPoint==0)
                break;
            else
            {
                if(xPoint>0)
                {
                    if(yPoint>0)
                        System.out.printf("primeiro\n");
                    else
                        System.out.printf("quarto\n");
                }
                else
                {
                    if(yPoint>0)
                        System.out.printf("segundo\n");
                    else
                        System.out.printf("terceiro\n");

                }
            }

        }
    }
}
