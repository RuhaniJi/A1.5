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

public class A1_5Q2{

    public static void main(String[] args) throws IOException{
        // ***** constants *******
        final int MAX = 1000;       // max size of array is 1000
        final int LIMIT = 50;       // max value of number in list
        // ***** variables *****

        //String banner = "";             // output banner
        int x = 1;                      // assignemnt number for banner
        int y = 2;                      // question number for banner
        String prompt = "";             // prompt for user input

        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output

        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records

        // a new line character that works on every computer system
        String nl = System.lineSeparator();

        // the array
        int[] list = new int[MAX];
        int[] frequency = new int[LIMIT];
        int n = 0;
        int sum = 0;              // sum of the array of ints
        int i = 0;                // iteration of for loop
        int count = 0;            // iteration of for loop

        // ***** objects *****

        Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();

        // file io buffers for reading and writing to text files

        BufferedReader fin = new BufferedReader(new FileReader("List.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));

        // ***** print banners *****

        System.out.println(getBanner(nl, x, y));
        //fout.print(banner);

        // ***** Get Input *****

        // prompt for input
        // read input from keyboard
        // echo input back to console window

        // ***** Main Processing *****

        strin = fin.readLine();
        //System.out.println(strin);

        while(strin != null){
            //System.out.println(strin);

            tokens = strin.split(delim);

            //System.out.println("loading list with random numbers." + nl);

            for(i = 0; i < MAX; i++){
                // parse the record

                try{
                    list[i] = Integer.parseInt(tokens[i]);
                } // end try
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Incomplete data record");
                } // end array exception
                catch(NumberFormatException e ){
                    System.out.println("Invalid number format");
                }
                //System.out.println("List Length: " + i);
            }// end load list
            // update loop control
            strin = fin.readLine();
        }// end eof

        for(i = 0; i < MAX; i++){
            // parse the record

            try{
                frequency[list[i]-1]++;
            } // end try
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Incomplete data record");
            } // end array exception
        }

        // ***** Print Formatted Output *****
        try{
            System.out.println("The list of random numbers: ");
            for(i = 0; i < MAX; i++){
                System.out.println((i+1) + ": " + list[i] + " ");
            }// end for loop

            // print the list
            System.out.println(nl + "The frequency of the numbers: ");
            //int m = 0;
            for(i = 0; i < LIMIT; i++){
                System.out.println((i+1) + ": " + frequency[i] + " ");

                //m += frequency[i];

            }// end for loop
            //System.out.println(m);

        } // end try
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Incomplete data record");
        } // end array exception
        // ***** Closing Message *****

        printClosingMessage();
        //fout.println("End of Processing");

        // **** close io buffers *****

        fin.close();
        //fout.close();
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
