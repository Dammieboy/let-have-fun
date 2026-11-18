import java.util.Scanner;
  public class TaskOne {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      int total = 0;
      int scorecounter = 1;
    for(scorecounter = 1; scorecounter <= 10; scorecounter++){
     System.out.print("Enter Score: ");
     int score = input.nextInt();
     
      total+= score;
    }
   
System.out.println(total);
      
      
    }      
  }  

  
