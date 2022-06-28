package first;

public class CaesarCipher {
	
	private String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public String encrypt(String plainText, int key) {
		
		String cryptedString = "";
		String plainText2 = plainText.toUpperCase();
		for(int i=0;i<plainText2.length();i++) {
			char mychar = plainText2.charAt(i);
			int place = ALPHABET.indexOf(mychar);
			place = place + key;
			place = place % ALPHABET.length();
			char newChar = ALPHABET.charAt(place);
			if(Character.isLowerCase(Character.valueOf(plainText.charAt(i)))) {
				newChar = Character.toLowerCase(newChar);
			}
			cryptedString = cryptedString + newChar;
		}
		return cryptedString;
		
	}
	
}
