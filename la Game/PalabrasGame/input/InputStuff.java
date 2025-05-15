import java.util.Scanner;

public class InputStuff {
    public String getUserInputThangSutffYk() {
        Scanner scan = new Scanner(System.in);
        String gyuess = scan.nextLine();
        return gyuess;
    }

    public boolean validateInput(String input) {
         return input != null && input.length() == 5 && input.chars().allMatch(Character::isLetter);
    }
}
