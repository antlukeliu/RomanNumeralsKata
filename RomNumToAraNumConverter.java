
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
		String[] romArray = {"L","X","V","I"};
		int[] araArray = {50,10,5,1};
		
		//Loop through each character in the Roman Numeral String
		for(int i=0; i<romNum.length(); i++){
			
			//Loop through each character in the romArray 
			for(int j=0; j<romArray.length; j++){
				
				//
				if(romNum.length() == 1){
					for(int k=0; k<romArray.length;k++){
						if(romNum.equals(romArray[k])){
							return araArray[k];
						}
					}
				}
				//checks to see if the characters match each other
				else if(romNum.substring(i, i+1).equals(romArray[j])){
				
					if(i+1 < romNum.length()){
						if(romNum.substring(i,i+1).equals("I") && romNum.substring(i+1,i+2).equals("V")){
							araNum += 4;
							i +=2; //I wanted to skip a character so if it is IV than it starts on the next character after
						}
						else if(romNum.substring(i,i+1).equals("I") && romNum.substring(i+1,i+2).equals("X")){
							araNum += 9;
							i +=2;
						}
						else if(romNum.substring(i,i+1).equals("X") && romNum.substring(i+1,i+2).equals("L")){
							araNum += 40;
							i +=1; //Unsure why this works 
						}
						else{
							araNum += araArray[j];
						}
					}
					else{
						araNum += araArray[j];
					}
				}
			}
		}
		return araNum;
	}
}
