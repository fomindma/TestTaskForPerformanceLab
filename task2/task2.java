import java.util.*;
import java.io.*;

public class task2
{
   
    public static void main(String args[]) throws Exception {
    Scanner sc1 = new Scanner(new BufferedReader(new FileReader(args[0] + ".txt")));
    Scanner sc = new Scanner(new BufferedReader(new FileReader(args[1] + ".txt")));
    LineNumberReader lnr = new LineNumberReader(new FileReader(args[1] + ".txt"));
    int linesCount = 0; while(null != lnr.readLine()) {linesCount++;}
    int rows = linesCount;
    double myArray[][] = new double[4][2];
    while(sc1.hasNextLine()) 
    {
        for (int i=0; i<4; i++) 
        {
            String[] line = sc1.nextLine().trim().split(" ");
            for (int j=0; j<line.length; j++) 
            {
            myArray[i][j] = Double.parseDouble(line[j]);
            }
        }
    }
    double myArray1[][] = new double[rows][2];
    while(sc.hasNextLine()) 
    {
        for (int i=0; i<rows; i++) 
        {
            String[] line = sc.nextLine().trim().split(" ");
            for (int j=0; j<line.length; j++) 
            {
            myArray1[i][j] = Double.parseDouble(line[j]);
            }
        }
    }
    double arr1[] = new double[4];
    arr1[0]=(myArray[1][1]-myArray[0][1])*(myArray[2][0]-myArray[0][0])+(myArray[2][1]-myArray[0][1])*(myArray[0][0]-myArray[1][0]);
    arr1[1]=(myArray[2][1]-myArray[1][1])*(myArray[3][0]-myArray[1][0])+(myArray[3][1]-myArray[1][1])*(myArray[1][0]-myArray[2][0]);   
    arr1[2]=(myArray[3][1]-myArray[2][1])*(myArray[0][0]-myArray[2][0])+(myArray[0][1]-myArray[2][1])*(myArray[2][0]-myArray[3][0]);
    arr1[3]=(myArray[0][1]-myArray[3][1])*(myArray[1][0]-myArray[3][0])+(myArray[1][1]-myArray[3][1])*(myArray[3][0]-myArray[0][0]);
    
    double arr[] = new double[4];
    for(int i=0;i < rows;i++)
    {
    arr[0]=(myArray[1][1]-myArray[0][1])*(myArray1[i][0]-myArray[0][0])+(myArray1[i][1]-myArray[0][1])*(myArray[0][0]-myArray[1][0]);
    arr[1]=(myArray[2][1]-myArray[1][1])*(myArray1[i][0]-myArray[1][0])+(myArray1[i][1]-myArray[1][1])*(myArray[1][0]-myArray[2][0]);
    arr[2]=(myArray[3][1]-myArray[2][1])*(myArray1[i][0]-myArray[2][0])+(myArray1[i][1]-myArray[2][1])*(myArray[2][0]-myArray[3][0]);
    arr[3]=(myArray[0][1]-myArray[3][1])*(myArray1[i][0]-myArray[3][0])+(myArray1[i][1]-myArray[3][1])*(myArray[3][0]-myArray[0][0]);
    int y=0;
    for(int j=0;j <4;j++)
    {
        if(arr1[j]*arr[j] < 0){y--;} else {if(arr1[j]*arr[j] > 0){y++;} else {y=y + 2;}}
    }
    if(y<4){System.out.print("3\n");}
    if(y == 4){System.out.print("2\n");}
    if(y<6 && y>4){System.out.print("1\n");}
    if(y == 6){System.out.print("0\n");}
    }
        
    }
}