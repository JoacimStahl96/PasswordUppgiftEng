import java.util.Scanner;

public class PasswordUppgift {
	public static void main(String[] args) {
		System.out.println("Enter your password.");
		Scanner passWordLine = new Scanner(System.in); // reads what's written in console
		String PasswordAttempt = passWordLine.nextLine(); // makes it possible to write in console
		String passWord = "jocke123"; // the password
		if (!passWord.equals(PasswordAttempt)) { // !passWord.equals(PasswordAttempt) is used to see if it' correct password
			                                            // written in console, if not enters if-statement
			System.out.println("Wrong password. Please enter your password again. ");
			PasswordAttempt = passWordLine.nextLine(); // makes it possible to enter your password again

			if (!passWord.equals(PasswordAttempt) ) {
				System.out.println("Wrong password. Please enter your password again, last chance.");
				PasswordAttempt = passWordLine.nextLine(); // makes it possible to enter your password again
			}
			if (!passWord.equals(PasswordAttempt)) { 
				System.out.println("Too many failed attempts.");
			} else {
				System.out.println("Correct password, welcome."); // Correct second attempt
			}
		} else {
			System.out.println("Correct password, welcome."); // Correct on the first attempt
		}
	}
}