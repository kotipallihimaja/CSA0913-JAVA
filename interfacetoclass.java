import java.util.Scanner;
interface printable
{
    void print();
}
interface showable
{
    void show();
}
class baseclass implements printable,showable{
    public void print()
    {
        System.out.println("hello");
    }
    public void show()
    {
        System.out.println("world");
    }
}
public class interfacetoclass{
    public static void main(String[]args)
    {
        baseclass obj1=new baseclass();
        obj1.print();
        obj1.show();
    }
}