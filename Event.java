
import java.util.*;
public class Event implements Comparable<Event>{
   private int date;
   private int startTime;
   private int endTime;
   private String name;
   private String location;
   private int group_GP;
   
   // pre  : Takes in a CSV with the data
   public Event (String data) throws Exception{
      String[] input = data.split(",");
      date = Integer.parseInt(input[0]);
      startTime = Integer.parseInt(input[1]);
      endTime = Integer.parseInt(input[2]);
      name = input[3];
      location = input[4];
      group_GP = Integer.parseInt(input[5]);
   }
   
   public int compareTo(Event other) {
      return -1;
   }
   
   public String toString(){
      return date + " " + startTime + " " + endTime  + " " +
             name + " " + location + " " + group_GP;
      
   }

}