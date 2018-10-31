import java.util.Scanner;
class New1
{
    public void print()
    {
        System.out.println("NULL argument");
    }
    public void print(int x)
    {
        System.out.println("Integer:"+ x);
    }
    public void print(float x)
    {
        System.out.println("float:"+x);
    }
}
class overloadnew1
{
    public static void main(String args[])
    {
        New1 a = new New1();
        New1 b = new New1();
        New1 c = new New1();
        a.print();
        b.print(10);
        c.print(10.5f);
    }
}