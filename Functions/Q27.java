

import java.util.*;
public class Q27 {
    public static void EligiblityCheck(int vote) {
        if(vote>=18)
        System.out.println("Your age is : "+vote+" and you are eligible to vote");
        else{
            System.out.println("Not Eligible as your age < 18 ");
        }
        return;
        
    }
    public static void main(String[] args) {
        int vote=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        
        if(age>=18){
            vote = age;
            EligiblityCheck(vote);
        }

        else{
            vote= age;
            EligiblityCheck(vote);
        }
    }
    
}
