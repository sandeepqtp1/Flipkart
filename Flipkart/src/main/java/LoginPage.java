import java.util.regex.Matcher;
import java.util.regex.Pattern;


import org.testng.annotations.Test;

public class LoginPage {
	//1--- Search Vowels pos using Pattern
	@Test
	public void asearchVowelsUsingPattern() {
		String vwpos="";
		String x="sandeep kumar yadav";
		Pattern pattern = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE); 
		Matcher m=pattern.matcher(x);
		while (m.find()) {
			vwpos =vwpos+" "+String.valueOf(m.start());

		}
		System.out.println("Vowels pos ==="+vwpos);
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
	}

	//2---Creating Pattern
	@Test
	public void pattern1() {

		for(int i=1;i<=10;i++) {
			String x="";
			for(int j=1;j<=i;j++ ) {
				x=x+"*";
			}
			System.out.println(x);

		}
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
	}
	///********************************************

	//3---Creating Pattern
	@Test 
	public void pattern3() {
		for(int i=10;i>=1;i--) {
			String x="";
			for(int j=i;j>=1;j-- ) {
				x=x+"*";
			}
			System.out.println(x);

		}
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
	}
	///********************************************

	//4---Creating Pattern
	@Test
	public void pattern4() {
		for(int i=1;i<=10;i++) {
			String x="";
			for(int j=1;j<=i;j++ ) {
				x=x+"*";
			}
			System.out.println(x);
		}		
		for(int i=9;i>=1;i--) {
			String x="";
			for(int j=i;j>=1;j-- ) {
				x=x+"*";
			}
			System.out.println(x);

		}
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
	}
	///********************************************		




}
