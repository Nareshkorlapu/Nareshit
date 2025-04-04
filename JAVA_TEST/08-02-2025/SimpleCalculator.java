
public class SimpleCalculator
{
    public static void main(String[] args)
    {
        int num1=Integer.parseInt(args[0]);
        int num2=Integer.parseInt(args[1]);
        char operator=String.parseString(args[2]);
        swith(operator);
        {
            case '+':
            int add=num1+num2;
            System.out.println("Addition is"+add);
            break;
            case '-':
            int sub=num1-num2;
            System.out.println("Subtraction is"+sub);
            break;
            case '*':
            int mul=num1*num2;
            System.out.println("Multiplication is"+mul);
            break;
            case '/':
            int div=num1/num2;
            System.out.println("Division is"+div);
            break;
            default:
            System.out.println("Invalid input,Please enter valid operator");

        }

    }

}

