package InterviewProgramms;

public class VowelOrCosonant {

	public static void main(String[] args) {

		vowel_Or_consonant('e');
	}

	static void vowel_Or_consonant(char y) {
		if(y=='a'||y=='e'||y=='i'||y=='o'||y=='u'||y=='A'||y=='E'||y=='I'||y=='O'||y=='U') {
	System.out.println("vowel");
		}
		else {
			System.out.println("consonant");
		}
	}
	}


