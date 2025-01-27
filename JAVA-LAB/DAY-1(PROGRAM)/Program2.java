/*
2.Write a java program to find out the biggest number among three number
Input :int a=5,b=6,c=7
output as "the biggest number is 7"

Input: int a=5,b=16,c=7
output as "the biggest number is 16"

Input: int a=25,b=6,c=7
output as "the biggest number is 25"
*/
class Program2{
public static void main(String [] args){
	int a=25;
	int b=6;
	int c=7;
	if(a>b && a>c){
		System.out.println("The biggest number is:"+a);
	}
	else if(b>a && b>c){
		System.out.println("The biggest number is:"+b);
	}
	else{
		System.out.println("The biggest number is:"+c);
	}
}
}