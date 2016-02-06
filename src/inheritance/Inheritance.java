/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Ayush
 */
abstract class A
{
 
   A()
   {
       System.out.println("constructorA");
   }
      void abc()
   {
       System.out.println("fdh");
   }
    abstract void def();
}
class B extends A
{
    B()
    {
        
        System.out.println("constructor B()");
        
    }
    @Override
    void def()
    {
    System.out.println("bbnonobwob");
    }
    byte fun(int c)
    {
        return (byte) (c);
    }
     void abc()
    {
        System.out.println("Class B"); 
    }
}
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        B b=new B();
        A a=b;
        a.def();        
        a.abc();
        System.out.println(a.hashCode());
        float y=2.577f;
        int x=(int)y;
       // short y=x; 
        System.out.println(x);
        byte v = b.fun(2000000000*1000);
        
    }
    
}
