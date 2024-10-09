package u2t7_p2_morestringmethods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalPoints = 0;
        String previousWord = "";
        String currentWord = "";
        int wordCount = 1;
        int difference;

        System.out.print("Enter first word: ");
        currentWord = scan.nextLine();
        while (totalPoints < 50) {
            System.out.print("Enter next word: ");
            wordCount++;
            previousWord = currentWord;
            currentWord = scan.nextLine();
            difference = currentWord.compareTo(previousWord);
            if (difference > 0){
                totalPoints += 2;
                System.out.println("+2 points: current word alphabetically after; SCORE: " + totalPoints);
            }else if (difference < 0){
                totalPoints -= 5;
                System.out.println("-5 points: current word alphabetically before; SCORE: " + totalPoints);
            }else {
                totalPoints -= 10;
                System.out.println("-10 points: current word the same as before; SCORE: " + totalPoints);
            }
            if (previousWord.length() >= 2 && currentWord.length() >= 2){
                String previousTwoLetters = previousWord.substring(previousWord.length() - 2);
                String currentTwoLetters = currentWord.substring(0, 2);
                if (previousTwoLetters.equals(currentTwoLetters)){
                    totalPoints += 5;
                    System.out.println("+5 points: last 2 letters of previous word match first 2 letters of current; SCORE: " + totalPoints);
                }
            }

            if (currentWord.indexOf(previousWord.substring(0, 1)) != -1){
                totalPoints += 3;
                System.out.println("+3 points: first letter of previous word found in current word; SCORE: " + totalPoints);
            }
            
             if (currentWord.length() == previousWord.length()){
                 totalPoints += 2;
                 System.out.println("+2 points: length of previous word is same as current; SCORE: " + totalPoints);
                 }
        }
        System.out.println("You win! It took you " + wordCount + " words! Try again for a lower word count :)");
    }
}
