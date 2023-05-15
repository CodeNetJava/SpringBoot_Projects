package rohitExam;

import java.util.Scanner;

public class ShiftingLetters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
	
		String[] strArray = str.split("\\s");
		
		//System.out.println(strArray[2]);
		
		
		char[] array = new char[26];
		char ch= 'A';
		int i = 0;
        while(ch<='Z')
        {
        	array[i] = ch;
        	ch+=1;
        	i++;
          
        }
        
        //System.out.println(array[25]);
        
        String OutputnewStr="";
        for(int j = 0 ; j < strArray.length ; j++) {
        	
        	for (char c : newStr.toCharArray()) 
        	 OutputnewStr = (char) (c + newStr.length());
        	System.out.print(OutputnewStr+" ");
        	}
        
	}

}
