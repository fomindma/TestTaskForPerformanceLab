import java.util.*;
import java.io.*;

public class Main
{
   
    public static void main(String args[]) throws Exception {
    Scanner sc = new Scanner(new BufferedReader(new FileReader(args[0] + ".txt")));
    LineNumberReader lnr = new LineNumberReader(new FileReader(args[0] + ".txt"));
    int linesCount = 0; while(null != lnr.readLine()) {linesCount++;}
    int rows = linesCount;
    int columns = 4;
    int myArray[][] = new int[rows][columns];
    while(sc.hasNextLine()) 
    {
        for (int i=0; i<rows; i++) 
        {
            String lin = sc.nextLine().trim().replace(':',' ');
            String[] line = lin.split(" ");
            for (int j=0; j<4; j++) 
            {
            myArray[i][j] = Integer.parseInt(line[j]);
            }
        }
    }
    
    int arr[] = new int[rows * columns];
    for(int i=0;i<rows;i++)
    {
        arr[2 * i]=(myArray[i][0] - 8) * 60 + myArray[i][1];
        arr[2 * i + 1]=(myArray[i][2] - 8) * 60 + myArray[i][3];
    }
    
    int max = 0;
    int n = 721;
    int arr1[] = new int[n];
    for(int i = 0; i <  arr.length / 2; i++)
    {
        for(int j = arr[2*i];j < arr[2*i+1];j++)
        {
            arr1[j]++;
        }
    }
    for(int j = 0;j < arr1.length;j++)
    {
        if (arr1[j] > max){max=arr1[j];}
    }
    int arr2[] = new int[40];int k=0;
    for(int j = 1;j < arr1.length - 1;j++)
    {
        if (arr1[j] == max){
            if(arr1[j - 1] !=max || arr1[j + 1] != max){arr2[k]=j;k++;}}
        if (arr1[0] == max){arr2[0] = 0;}
        if (arr1[arr1.length - 1] == max){arr2[k - 1] = arr1[arr1.length - 1];}
    }
    int p=0;
    while(arr2[p] != 0) 
    {System.out.printf("%d:%02d %d:%02d\n",(8 + (int)arr2[p]/60),arr2[p]%60,(8 + (int)(arr2[p+1]+1)/60),(arr2[p+1]+1)%60);p=p + 2;}
   }
}