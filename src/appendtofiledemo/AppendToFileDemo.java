/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appendtofiledemo;

import java.io.*;   // for PrintWriter class and IOException if we use a BufferedWriter object
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author u0005547
 */
public class AppendToFileDemo {

    public static void main(String[] args) //throws IOException
    {
        PrintWriter output = null;

        File confidential = new File("secrets.txt");
        try {
            // create new stream, link newly created stream to file
            //output = new PrintWriter(new BufferedWriter(new FileWriter(confidential, true)));	
            
            FileWriter fw = new FileWriter(confidential, true);
            output = new PrintWriter(fw);

        } catch (IOException e) // problem with file !
        {
            System.out.println("Error - problem creating the file! Program closing");
            System.exit(0);  // this terminates the program - parameter 0 indicates normal termination
        }


        int num = 16;
        String str = "goodbye";

        output.print(str);   // append �goodbye� to file
        output.print(" ");   // append �hello� to file
        output.println(num); 	// append �6� to file

        // tidy up and close the file

        output.close();

    }// end of main
}
