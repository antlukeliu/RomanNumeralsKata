//Objective of this is to take in a number and convert it Roman Numeral
// 1 = "I"
// 3 = "III"
// 9 = "IX"
// 1066 = "MLXVI"
// 1989 = "MCMLXXXIX"

//Thoughts on how to create this converter
//Plan 1. create an if/else if or case switch for every number
//Plan 2. Find the length of the number create methods to find each 
//place(ones, tens, hundreds, thousands) and concat it all together
//Plan 3. Two arrays i.e. arabicNumArray = [10,9,5,4,1] romanNumArray = ["X", "IX", "V", "IV", "I"]
//Have a variable holding the romanNumString
//i.e. the number is 7
//loop through to find what it is greater than or equal to. It is greater than 5 have V stored in 
//romanNumString and 2 be the value of your variable number (7-5). Loop again to find 2 >= 1 
//so "VI" continue until number reaches 0

public class RomanNumeralsConverter {

	public String convert(String number) {
		
		int[] arabicNumArray = {100,90,50,40,10,9,5,4,1};
		String[] romanNumArray = {"C","XC","L","XL","X", "IX", "V", "IV", "I"};
		String romanNum = "";
		
		int inputNum = Integer.parseInt(number);
		
		
		while(inputNum > 0){
			for(int i=0; i <arabicNumArray.length; i++){
				if(inputNum >= arabicNumArray[i]){
					romanNum += romanNumArray[i];
					inputNum -= arabicNumArray[i];
					i=-1; //will reset the index to 0
				}
			}
		}
		return romanNum;
		
}
}
