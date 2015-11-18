
public class RustyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "2+3*2";
		String input2 = "2*4*3+9*3+5"; //Result: 243**93*5++
		System.out.println(answer(input2));
	}
	public static String answer(String str){
		String resultString = "";
		int plusCount=0;
		int multCount=0;
		for (int i=0;i<str.length();i++){
			if (str.charAt(i)=='*'){
				multCount++;
			}
			else if (str.charAt(i)=='+'){
				for (int j=1;j<=multCount;j++){
					resultString+="*";
				}
				multCount=0;
				plusCount++;
			} else {
				resultString+=str.charAt(i);
			}
		}
		for (int i=1;i<=multCount;i++){
			resultString+="*";
		}
		for (int i=1;i<=plusCount;i++){
			resultString+="+";
		}
		return resultString;
		
	}
}
