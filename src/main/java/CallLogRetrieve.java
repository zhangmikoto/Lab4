import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/*
 * 2017-Sep-24
 * TA Zhe Xu
 * for CS125 2017 Fall
 *
 * Call Log Retrieval
Following text file was recovered from 007’s recent call log when his cell phone crashed. Print out the lines
containing “Challen” with the next 2 call logs (following 2 lines), if any. Printed lines should be in the original
(unmodified) mixture of upper- and lower-case.
 *
 *
 *Since you might have not learned how to read a file, the text read is provided.
 * */

public class CallLogRetrieve {
  public static void main(String [] args) throws FileNotFoundException, IOException {
      try (BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir")+"/data/007CallLog.txt"))) {
          String line;
          while ((line = br.readLine()) != null) {
             //write your code, either based on this loop or using other method
          }
      }
} } // end of main method and class