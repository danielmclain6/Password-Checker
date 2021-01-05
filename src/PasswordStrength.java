import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordStrength {
		public static void main(String[] args) {
			String missingLowercase = "ASD$44";
			String missingUppercase = "asd$44";
			String missingDigit = "asd$dd";
			String missingSpecialChar = "asd44dd";
			String notLongEnough = "asd$4";
			String goodPassword = "Asd$44";
			
			String lowercaseRegex = "[a-z]";
			String uppercaseRegex = "[A-Z]";
			String digitRegex = "[0-9]";
			String specialCharRegex = "[!|@|#|$|%|^|&|*|(|)|-|+]";
			
			
			
			Pattern lowercaseCheck = Pattern.compile(lowercaseRegex);
			Pattern uppercaseCheck = Pattern.compile(uppercaseRegex);
			Pattern digitCheck = Pattern.compile(digitRegex);
			Pattern specialCharCheck = Pattern.compile(specialCharRegex);
			
			//Set up pattern to first check for lowercase
			Pattern pattern = Pattern.compile(lowercaseRegex);
			Matcher password = pattern.matcher(goodPassword);
			boolean hasLowercase = password.find();
			
			//Next check for uppercase
			pattern = Pattern.compile(uppercaseRegex);
			password = pattern.matcher(goodPassword);
			boolean hasUpperCase = password.find();
			
			//Checking for a digit
			pattern = Pattern.compile(digitRegex);
			password = pattern.matcher(goodPassword);
			boolean hasDigit = password.find();
			
			//Checking for special character
			pattern = Pattern.compile(specialCharRegex);
			password = pattern.matcher(goodPassword);
			boolean hasSpecial = password.find();
			
			
			
			
			if(goodPassword.length() < 6) {
				System.out.println("Password Must be at least 6 characters long");
			} else {
				System.out.println("password length is good");
			}
			//Checking for lowercase char
			if(hasLowercase) {
				System.out.println("found requirement");
			} else {
				System.out.println("Needs at least one lowercase Letter ");
			}
			
			if(hasUpperCase) {
				System.out.println("Found uppercase");
			} else {
				System.out.println("Needs at least one uppercase letter");
			}
			
			if(hasDigit) {
				System.out.println("Found Number");
			} else {
				System.out.println("Needs at leat one number");
			}
			if(hasSpecial) {
				System.out.println("Found special character");
			} else {
				System.out.println("Needs at least one special character");
			}
			
			
			
			
		}
}
