import java.util.Scanner;

public class Assignment2_d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter a Letter: ");
        String letter = scanner.nextLine();
        int index = sentence.indexOf(letter);
        if (index == -1 || letter=="") {
            System.out.println("The letter does not exist in the sentence.");
        } else {
            System.out.println("The rest of the sentence after the first occurrence of the letter: " + sentence.substring(index + 1));
        }
    }
}
