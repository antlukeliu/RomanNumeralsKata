
//This class is meant to convert Roman Numerals to Arabic Numbers
// Taking in "I" and 1 should be returned
// "III" should return 3

//Plan 1 create a if/else if for every number
//Since the length of the Roman Numerals fluctuates in size, determining the number by the length size is not possible
//Plan 2
//I would want to go through each character in the string, assign it a value and store it in a variable
//dilemmas I would come across are how to determine the value of numbers of 4's and 9's.
//Two arrays or a hashmap to store the Roman Numeral and the corresponding Arabic number value

public class RomNumToAraNumConverter {

	public int convert(String romNum) {
		int araNum = 0;
		String[] romArray = {"I"};
		int[] araArray = {1};
		
		//Loop through each character in the Roman Numeral String
		for(int i=0; i<romNum.length(); i++){
			//Loop through each character in the romArray 
			for(int j=0; j<romArray.length; j++){
				//checks to see if the characters match each other
				if(romNum.substring(i, i+1) == romArray[j]){
					//if it does than the corresponding value is added to araNum
					araNum += araArray[j];
				}
			}
		}
		return araNum;
	}
}
