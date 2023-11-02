import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.Random;

/** ***************************************************
 *  Name:           Ruhani
 *  Class:          CS30S
 * 
 *  Assignment:     A1.5 Q2
 * 
 *  Description:    Place a short description of your program here
 * 
 *************************************************************/

public class A1_5Q1{

    public static void main(String[] args) throws IOException{
        // ***** constants *******
        final int MAX = 1000;       // max size of array is 1000
        final int LIMIT = 50;       // max size of number in array

        // ***** variables *****

        //String banner = "";             // output banner
        int x = 1;                      // assignemnt number for banner
        int y = 1;                      // question number for banner
        String prompt = "";             // prompt for user input

        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output

        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records

        // a new line character that works on every computer system
        String nl = System.lineSeparator();

        // the array
        int[] list = new int[MAX];
        int n = 0;
        int sum = 0;              // sum of the array of ints
        int i = 0;                // iteration of for loop

        // ***** objects *****

        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();

        // file io buffers for reading and writing to text files

        //BufferedReader fin = new BufferedReader(new FileReader("List.txt"));
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("List.txt")));

        Random random = new Random(); 
        // ***** print banners *****

        System.out.println(getBanner(nl, x, y));
        //fout.print(banner);

        // ***** Get Input *****

        // prompt for input
        // read input from keyboard
        // echo input back to console window

        // ***** Main Processing *****

        
        // load the list with random numbers
        //System.out.println("loading list with random numbers." + nl);
        for(i = 0; i < MAX; i++){
            list[i] = 1 + random.nextInt(LIMIT);
         }// end load list
        //System.out.println(nl + i);
        
        
        
        // ***** Print Formatted Output *****

        // print the list
        //System.out.println("The list of random numbers: ");
        for(i = 0; i < MAX; i++){
            fout.print(list[i] + " ");
        }// end for int i

        // ***** Closing Message *****

        printClosingMessage();
        //fout.println("End of Processing");

        // **** close io buffers *****

        //fin.close();
        fout.close();
    } // end main 

    // **** user defined methods ****

    public static String getBanner(String nl, int x, int y){
        String banner = "";   // banner to be returned to calling function 

        banner = "*****************************" + nl;
        banner += "Name:        Ruhani" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  A 1.5" + "Q" + y + nl;
        banner += "*****************************" + nl + nl;

        return banner;
    }//end banner

    public static void printClosingMessage(){
        System.out.println();
        System.out.println("end of processing");
    }// end print closing message
} // end program
