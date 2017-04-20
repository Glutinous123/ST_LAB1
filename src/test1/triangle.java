package test1;

import java.util.Arrays;

public class triangle {
	private static String result = "";
	private static int[] length = new int[3];
	
	public void clearArray(){
		for(int i=0;i<3;i++){
			length[i] = 0;
		}
	}
	
	public static void getIntegers(int a,int b,int c){
		length[0] = a;
		length[1] = b;
		length[2] = c;
		Arrays.sort(length);
	}
	
	public static void judgeIllegal(){
		if(length[0] + length[1] <= length[2]){
			result = "illegal";
		}
	}
	
	public static void judgeEquilateral(){
		if(length[0] == length[1] && length[1] == length[2]){
				result = "equilateral";
			}
	}
	
	public static void judgeIossceles(){	
		if(length[0] == length[1] || length[1] == length[2]){
				result = "isosceles";
			}
	}
	
	public static void judgeScalene(){
		if(length[0] != length[1] && length[1] != length[2]){
			result = "scalene";
		}
	}
	
	public static String getResult(){
		return result;
	}
	
}
