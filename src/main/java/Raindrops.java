class Raindrops{
	public static String convert (int num){
		String output = "";
		int flag = 0;
		if(num%3==0){
			output += "Pling";
			flag = 1;
		}
		if(num%5==0){
			output += "Plang";
			flag = 1;
		}
		if(num%7==0){
			output += "Plong";
			flag = 1;
		}
		if(flag==0){
			output += String.valueOf(num);
		}
		return output;
	}
}
