import java.util.*;
import java.io.*;

public class task3
{
   public static void main(String args[]) throws Exception {
    Scanner sc1 = new Scanner(new BufferedReader(new FileReader(args[0] + "/Cash1.txt")));
    Scanner sc2 = new Scanner(new BufferedReader(new FileReader(args[0] + "/Cash2.txt")));
    Scanner sc3 = new Scanner(new BufferedReader(new FileReader(args[0] + "/Cash3.txt")));
    Scanner sc4 = new Scanner(new BufferedReader(new FileReader(args[0] + "/Cash4.txt")));
    Scanner sc5 = new Scanner(new BufferedReader(new FileReader(args[0] + "/Cash5.txt")));
    
    double myArray[][] = new double[16][1];
    double myArray1[][] = new double[16][5];
    
    while(sc1.hasNextLine()) 
    {
        for (int i=0; i<16; i++) 
        {
            String[] line = sc1.nextLine().trim().split(" ");
            for (int j=0; j<line.length; j++) 
            {
            myArray[i][j] = Double.parseDouble(line[j]);
            }
        }
    }
    for(int i=0;i<16;i++) {myArray1[i][0]=myArray[i][0];}
    while(sc2.hasNextLine()) 
    {
        for (int i=0; i<16; i++) 
        {
            String[] line = sc2.nextLine().trim().split(" ");
            for (int j=0; j<line.length; j++) 
            {
            myArray[i][j] = Double.parseDouble(line[j]);
            }
        }
    }
    for(int i=0;i<16;i++) {myArray1[i][1]=myArray[i][0];}
    while(sc3.hasNextLine()) 
    {
        for (int i=0; i<16; i++) 
        {
            String[] line = sc3.nextLine().trim().split(" ");
            for (int j=0; j<line.length; j++) 
            {
            myArray[i][j] = Double.parseDouble(line[j]);
            }
        }
    }
    for(int i=0;i<16;i++) {myArray1[i][2]=myArray[i][0];}
    while(sc4.hasNextLine()) 
    {
        for (int i=0; i<16; i++) 
        {
            String[] line = sc4.nextLine().trim().split(" ");
            for (int j=0; j<line.length; j++) 
            {
            myArray[i][j] = Double.parseDouble(line[j]);
            }
        }
    }
    for(int i=0;i<16;i++) {myArray1[i][3]=myArray[i][0];}
    while(sc5.hasNextLine()) 
    {
        for (int i=0; i<16; i++) 
        {
            String[] line = sc5.nextLine().trim().split(" ");
            for (int j=0; j<line.length; j++) 
            {
            myArray[i][j] = Double.parseDouble(line[j]);
            }
        }
    }
    for(int i=0;i<16;i++) {myArray1[i][4]=myArray[i][0];}
    
    
    int key = 1;
    double max=0;
    double sum[] = new double[16];
    for(int i = 0; i <  16; i++) {
    sum[i] = myArray1[i][0] + myArray1[i][1] + myArray1[i][2] + myArray1[i][3] + myArray1[i][4];
    if (sum[i] > max){max=sum[i];key = i + 1;}
    }
    System.out.print(key + "\n");
    
   }
}