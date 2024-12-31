package ransom;
import java.util.Scanner;
/**
 * @author Brenden St. Juste
 */

public class Ransom {
    public static boolean canConstruct(String ransomNote, String magazine) {
        while (magazine.length() > 0){
            String letter = String.valueOf(ransomNote.charAt(0));
        //    System.out.println("Checking for ransom letter: " + letter);            
            if (magazine.contains(letter)){
                magazine = magazine.replaceFirst(letter, "");
            //    System.out.println("Magazine is now: " + magazine);
                ransomNote = ransomNote.substring(1);
            //    System.out.println("Ransom is now: " + ransomNote);
                if (ransomNote.length() == 0){
                   return true; 
                }
            } else if (magazine.contains(letter) == false){
                return false;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
      System.out.println("Enter standard message:");  
      Scanner user = new Scanner(System.in);
      String mag = user.nextLine();
      System.out.println("Enter hidden message:");
      String ran = user.nextLine();
      if  (canConstruct(ran, mag)){
          System.out.println(true);
      } else System.out.println(false);
    }

}
