import java.util.*;
import java.io.*;

public class task1
{
   public static void main(String args[]) throws Exception {
    Scanner sc = new Scanner(new BufferedReader(new FileReader(args[0] + ".txt")));
    LineNumberReader lnr = new LineNumberReader(new FileReader(args[0] + ".txt"));
    int linesCount = 0; while(null != lnr.readLine()) {linesCount++;}
    int rows = linesCount;
    int columns = 1;
    double myArray[][] = new double[rows][columns];
    while(sc.hasNextLine()) 
    {
        for (int i=0; i<rows; i++) 
        {
            String[] line = sc.nextLine().trim().split(" ");
            for (int j=0; j<line.length; j++) 
            {
            myArray[i][j] = Double.parseDouble(line[j]);
            }
        }
    }
    double arr[] = new double[rows * columns];
    for(int i=0;i<rows * columns;i++)
    {
        arr[i]=myArray[i][0];
    }
    double sum = 0;
    int n = arr.length;
    for(int i = 0; i <  arr.length; i++) {
	sum+=arr[i];
    }
    Arrays.sort(arr);
    double pers,pers3;
    pers = 0.9 * (n - 1);
    int pers1 = (int)pers;
    double pers5 = sum / n;
    double pers2 = pers - pers1;
    double pers4 = arr[pers1] + pers2 * (arr[pers1 + 1] - arr[pers1]);
    System.out.printf("%.2f\n",pers4);
    if (n % 2 == 0) {pers3 = (arr[(n/2) - 1] +arr[(n/2)]) / 2;} else {pers3 = arr[(n - 1)/2];}
    System.out.printf("%.2f\n",pers3);
    System.out.printf("%.2f\n",arr[0]);
    System.out.printf("%.2f\n",arr[n - 1]);
    System.out.printf("%.2f\n",pers5);
   }
}