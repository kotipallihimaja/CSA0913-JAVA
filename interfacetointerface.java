interface printable{
    int a=5;
    void print();
}
interface showable extends printable{
    void show();
}
class baseclass implements showable{
    public void print()
    {
        System.out.println("hello"+a);
    }
    public void show()
    {
        System.out.println("world"+a);
    }
}
public class interfacetointerface {
    public static void main(String[]args)
    {
        baseclass obj1=new baseclass();
        obj1.print();
        obj1.show();
    }
}
