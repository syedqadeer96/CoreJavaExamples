package com.company;

/*public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
*/


interface MyInterface
{

    public void method1();
    public void method2();
}
class Demo implements MyInterface {

    public void method1() {
        System.out.println("implementation of method1");
    }

    public void method2() {
        System.out.println("implementation of method2");
    }
}
public class Interface{
    public static void main(String arg[]) {
        Demo obj = new Demo();
        obj.method1();
    }
}
