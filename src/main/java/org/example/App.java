package org.example;

public class App 
{

    DummyInterface dummy;

    public App(DummyInterface dummy){
        this.dummy = dummy;
    }

    public int func1(int num1, int num2){
        return add(num1,num2)+dummy.func2(num1,num2);
    }

    public int add(int num1, int num2){
        return num1+num2;
    }

    public int sub(int num1, int num2){
        return num1-num2;
    }

    public int mul(int num1, int num2){
        return num1*num2;
    }

    public int div(int num1, int num2){
        return num1/num2;
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
