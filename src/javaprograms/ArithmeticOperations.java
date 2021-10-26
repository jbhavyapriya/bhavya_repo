package javaprograms;

public class ArithmeticOperations {
    public static void main(String[] args)
    {
        ArithmeticOperations a=new ArithmeticOperations();
        int x=45,y=9;
        int divResult=a.division(x,y);
        int subtResult=a.subtraction(x,y);
        int addResult= a.addition(x,y);
        int multResult=a.multiplication(x,y);
        System.out.println("division="+divResult);
        System.out.println("subtraction="+subtResult);
        System.out.println("addition="+addResult);
        System.out.println("multiplication="+multResult);

    }

    public int division(int x,int y)
    {
        int result=x/y;
        return result;
    }

    public int subtraction(int x,int y)
    {
        int result = x-y;
        return result;
    }

    public int addition(int x,int y)
    {
        int result = x+y;
        return result;
    }
    public int multiplication(int x,int y)
    {
        int result=x*y;
        return result;
    }
}
