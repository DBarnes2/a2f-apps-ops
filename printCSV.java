//File path:  C:\Users\wyatt\Desktop\Dev\A2f Ops\a2f-apps-ops


import java.io.*;
import java.util.*;
public class printCSV {
   public static void main(String[] args) throws Exception {
      File f = new File("calendar_data.csv");
      Scanner in = new Scanner(f);
      while(in.hasNext()) {
         System.out.println(in.next());
      }  
   }

}