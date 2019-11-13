import java.util.*;
import chn.util.*;
/**
 * Write a description of class KeyMaster here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class IOman
{
  
  public static void Prompter(String prompt) 
  {
    System.out.print(prompt + " ");
    System.out.flush();
  }
  
  public static void inputFlush() 
  {
    int dummy;
    int bAvail;

    try {
      while ((System.in.available()) != 0)
        dummy = System.in.read();
    } catch (java.io.IOException e) {
      System.out.println("Input error");
    }
  }
  
  public static String getString()
  {
     String ret = "";
     
     ConsoleIO KeyMan = new ConsoleIO();
     
     ret = KeyMan.readLine();
     
     return ret;
  }
  
  public static int getInt()
  {
      int X;
      
      X = Integer.valueOf(getString());
      
      return X;
  }
  
  public static Double getDouble()
  {
      double D;
      
      D = Double.valueOf(getString());
      
      return D;
  }
  
  public static char getCharacter()
  {
      String hold = "";
      char array[];
      char C;
      hold = getString();
      array = hold.toCharArray();
      C = array[0];
      return C;
  }
  
  public static void Print(String yarn)
  {
      System.out.print(yarn);
  }
  
  public static void Printf(int i, String s)
  {
      int x;
      for(x = 0; x <= i; x++)
            IOman.Print(" ");
      IOman.Print(s);
  }
}
