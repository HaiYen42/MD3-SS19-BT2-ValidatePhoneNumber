import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public final static String PHONE_NUMBER_REGEX= "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Phone number you want to check !");
        String phoneNumber = input.nextLine();
        boolean check = Pattern.matches(PHONE_NUMBER_REGEX, phoneNumber);
        System.out.println("Số cần check đúng định dạng "+ check);
    }
}