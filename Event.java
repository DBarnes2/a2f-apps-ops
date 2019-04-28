public class Event implements Comparable<Event>{
   private int date;
   private int startTime;
   private int endTime;
   private String Name;
   private String Location;
   private int Group_GP;
   
   public Event () {
   
   }
   
   public int compareTo(Event other) {
      return -1;
   }

}