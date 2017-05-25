package toEnglish;
import java.util.Scanner;

public class IntToEng {

	    // メインメソッド
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();
	        translateEng1(input);
	        translateEng2(input);
	        translateEng3(input);
	        
	        if (input / 10 == 0) {
	        	 System.out.println(translateEng1(input));
				} else if (input / 10 == 1) {
				 System.out.println(translateEng3(input));
				} else if (input / 10 > 1 && input/10 <= 9) {
				 System.out.println(translateEng2(input) + " "+ translateEng1(input%10) );
				} else if (input / 10 >= 10 && input/10 <= 100) {
				 System.out.println(translateEng1(input / 100) + " hundred "+ translateEng2(input%100) + " " + translateEng1(input%10) );
				}else if(input / 10 >= 100 && input/10 <= 1000) {
				System.out.println(translateEng1(input / 1000) + " thousand and " +translateEng1((input-(input/1000)*1000) / 100) + " hundred and "+ translateEng2(input%100) + " " + translateEng1(input%10) );
				 //System.out.println(translateEng3(input / 100) + " hundred "+ translateEng2(input%100) + " " + translateEng1(input%10) );
				}

	    }

	    // 数値を英訳する変換するメソッド
	    static String translateEng1(int n) {
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
	    	return eng;
	    }
	    static String translateEng2(int n) {
	    	String eng = "";
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
	    	return eng;
	    }
	    static String translateEng3(int n) {
	    	String eng = "";
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
	    	return eng;
	    }
	    
	}