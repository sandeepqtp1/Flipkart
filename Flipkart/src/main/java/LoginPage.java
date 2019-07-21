import java.util.regex.Matcher;
import java.util.regex.Pattern;


import org.testng.annotations.Test;

public class LoginPage {
	//1--- Search Vowels pos using Pattern
	@Test(enabled=false)
	public void searchVowelsUsingPattern() {
		String vwpos=null;
		String x="sandeep kumar yadav";
		Pattern pattern = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE); 
		Matcher m=pattern.matcher(x);
		while (m.find()) {
			vwpos =vwpos+" "+String.valueOf(m.start());
			
		}
		System.out.println(vwpos);
	}
	
	//1--- Search Vowels pos using Pattern
		@Test/*(enabled=false)*/
		public void pattern1() {
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=i;j++ ) {
				
			}
			
		}
		}
	
}
