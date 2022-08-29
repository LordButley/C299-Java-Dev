package demo;

import java.util.ArrayList;
import java.util.List;

public class Trial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sampleInput = "Hello World How Are You";
		
		//Sample Output
		// H : Hello How
		// W : World 
		// A : Are
		// Y : You
		
		
		display(formatTheInput(sampleInput));
	}

	private static String [] formatTheInput(String sampleInput) {
		// TODO Auto-generated method stub
		String[] stringArray = sampleInput.split(" ");		
		return stringArray;
	}

	private static void display(String outputString []) {
		// TODO Auto-generated method stub
//		String[] initials;
		List<String> H = new ArrayList<String>();
		H.add("H");
		List<String> W = new ArrayList<String>();
		W.add("W");
		List<String> A = new ArrayList<String>();
		A.add("A");
		List<String> Y = new ArrayList<String>();
		Y.add("Y");
		
		for (int i = 0; i < outputString.length; i++) {
			switch(outputString[i].charAt(0)) {
			case 'H':
				H.add(outputString[i]);
				break;
			case 'W':
				W.add(outputString[i]);
				break;
			case 'A':
				A.add(outputString[i]);
				break;
			case 'Y':
				Y.add(outputString[i]);
				break;
			}
		}
		
		System.out.println(H.get(0) + " : " + H.get(1) + " " + H.get(2));
		System.out.println(W.get(0) + " : " + W.get(1));
		System.out.println(A.get(0) + " : " + A.get(1));
		System.out.println(Y.get(0) + " : " + Y.get(1));
		
		
	}

}