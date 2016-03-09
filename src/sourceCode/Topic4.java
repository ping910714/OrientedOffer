package sourceCode;

public class Topic4 {
	public void startTest(){
		String string = "We are happy!";
		System.out.println(string);
	}
	
	String replaceBlank(String origin){
		int numberBlank = 0;
		for(int i = 0; i <= origin.length(); i++){
			if(origin.charAt(i) == ' ')
				numberBlank++;
		}
		int indexOfOrigin = origin.length();
		int indexOfNew = indexOfOrigin + 2 * numberBlank;
		char[] newChar = new char[indexOfNew];
		while(indexOfOrigin >= 0 && indexOfNew >= indexOfOrigin){
			if(origin.charAt(indexOfOrigin) == ' '){
				newChar[indexOfNew--] = '0';
				newChar[indexOfNew--] = '2';
				newChar[indexOfNew--] = '%';
			}else{
				newChar[indexOfNew--] = origin.charAt(indexOfOrigin--);
			}
		}
		return origin;
	}
}
