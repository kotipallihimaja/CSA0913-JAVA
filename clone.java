import java.lang.*;
class baseclass implements cloneable{
    int a;
    double b;
    protected Object clone() throws cloneablesupportedexception
    {
        return super.clone();
    }
    public static void main(String[]args){
        try
        {
            clone obj1=new clone();
            obj1.a=10;
            obj.b=10.2;
            System.out.println("values:" + obj1.a + " " + obj1.b);
            baseclass obj2=(baseclass)obj1.clone();
            System.out.println("values:" + obj2.a + " " + obj2.b);
        }
        catch (clo)
    }
}
public class clone {
    
}
