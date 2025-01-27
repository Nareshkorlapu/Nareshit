/*3.Write a java program by round of the number by following few requirements:
Requirement is =>If the last number is less than 5 round of the previous of its 10
			=>If the last number is greater than 5 or equals to 5 round of to the next multiplication of 10.

Input: a=34
Output: 30

Input: a=38
Output: 40 
*/
class Program3{
public static void main(String [] args){
	int a=38;
	int last=a%10;
	if(last>5){
		int result=((a/10)+1)*10;
		System.out.println("The round of the number is:"+result);
	}
	else{
		int res=(a/10)*10;
		System.out.println("The round of the number is:"+res);
	}
}
}

