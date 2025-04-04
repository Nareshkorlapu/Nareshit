public class Palindrome
{
    public static void main(String[] args)
    {
        int num = 251;
        int num1=0;
        int num2=0;
        int pal=0;
    if(num>0){
            num1=num%10;
            num2=num/10;
            pal=num2/10;
        if(pal==num1)
        {
            System.out.println(num+" is a palindrome");
        }
        else{
            System.out.println(num+" is not a palindrome");
        }
    }
    else
    {
        System.out.println("Error! Please enter positive number.");
    }

    }
}