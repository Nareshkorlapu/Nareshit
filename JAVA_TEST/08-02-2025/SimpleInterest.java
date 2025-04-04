public class SimpleInterest
{
    public static void main(String[] args)
    {
        int p=Integer.parseInt(args[0]);
        int r=Integer.parseInt(args[1]);
        int t=Integer.parseInt(args[2]);
        if(p>=0 && r>=0 && t>=0)
        {
            int si= (p*r*t)/100;
            System.out.println("SI is"+si);

        }
        else
        {
            System.out.println("Values cannot be '-ve'");
        }

    }

}