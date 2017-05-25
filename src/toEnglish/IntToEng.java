package toEnglish;
import java.util.Scanner;

public class IntToEng {

	    // メインメソッド
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();
	        translateEng(input);	
	        System.out.println(translateEng(input));

	    }

	    // 数値を英訳する変換するメソッド
	    static String translateEng(int n) {
	    	String eng = "";
	    	switch (n) {
			case 0: break;
			case 1: eng  = "one"; break;
			case 2: eng = "two"; break;
			case 3: eng = "three"; break;
			case 4: eng = "four"; break;
			case 5: eng = "five"; break;
			case 6: eng = "six"; break;
			case 7: eng = "seven"; break;
			case 8: eng = "eight"; break;
			case 9: eng = "nine"; break;
	    	}
	    	switch(n/10) {
	    	case 0: break;
	    	case 1: eng = "ten"; break;
	    	case 2: eng = "twenty"; break;
	    	case 3: eng = "thirty"; break;
	    	case 4: eng = "forty"; break;
	    	case 5: eng = "fifty"; break;
	    	case 6: eng = "sixty"; break;
	    	case 7: eng = "seventy"; break;
	    	case 8: eng = "eighty"; break;
	    	case 9: eng = "ninty"; break;
	    	
	    	}
	    	switch(n%10) {
	    	case 0: break;
	    	case 1: eng = "eleven"; break;
	    	case 2: eng = "twelve"; break;
	    	case 3: eng = "thirteen"; break;
	    	case 4: eng = "fourteen"; break;
	    	case 5: eng = "fifteen"; break;
	    	case 6: eng = "sixteen"; break;
	    	case 7: eng = "seventeen"; break;
	    	case 8: eng = "eighteen"; break;
	    	case 9: eng = "ninteen"; break;
	    	}
	    	switch(n/100) {
	    	case 0: break;
	    	case 1: eng = "one hundred"; break;
	    	case 2: eng = "two hundred"; break;
	    	case 3: eng = "three hundred"; break;
	    	case 4: eng = "four hundred"; break;
	    	case 5: eng = "five hundred"; break;
	    	case 6: eng = "six hundred"; break;
	    	case 7: eng = "seven hundred"; break;
	    	case 8: eng = "eight hundred"; break;
	    	case 9: eng = "nine hundred"; break;
	    	}
	    return eng;
	    }
	    
	}