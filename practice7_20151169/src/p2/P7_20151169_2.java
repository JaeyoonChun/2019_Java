package p2;
import java.util.*;

public class P7_20151169_2 {
	public static void main(String[] args) {
		Scanner scin;
		String guessWords[] = {"algorithm", "university", "programming", "windows", "excel", "sogang"};
		Random rand = new Random();
		int idx = rand.nextInt(6);
		
		String answer = guessWords[idx];
		StringBuffer letterList = new StringBuffer("");
		String inLetter;
		
		boolean isCorrect = false;
		int correct = 0;
		int wrong = 0;
		
		for(int i = 0; i < answer.length(); i++) {
			letterList.append("-");
		}
		
		do {
			System.out.print("Guess a word : ");
			System.out.println(letterList);
			System.out.println("The number of correct guess : "+correct);
			
			scin = new Scanner(System.in);
			System.out.print("Enter a guess character : ");
			inLetter = scin.next();
			inLetter = inLetter.toLowerCase();
			System.out.println("Letter entered : "+inLetter);
			
			for(int i = 0; i < answer.length(); i++) {
				if(answer.charAt(i) == inLetter.charAt(0)) {
					letterList.setCharAt(i, answer.charAt(i)); 
					correct ++;
					isCorrect = true;
				}
			}
			if (isCorrect == true) System.out.println("Correct guess :>");
			else {
				System.out.println("Sorry, wrong guess");
				wrong++;
			}
			if (correct == answer.length()) {
				System.out.println("YOU WIN!! :>");
				break;
			}
			System.out.println();
			isCorrect = false;
		} while(wrong < answer.length());
		
		if(isCorrect == false) System.out.println("Sorry you lose. The word was : "+answer);
		scin.close();
	}
}
