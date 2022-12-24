package com.driver;
class A{
  void meth(){System.out.println("Invoking method from class A");}
}

class B extends A{
  
  void meth(){
    System.out.println("Method is overriden");
  }
}

public class Main {
  
  B obj=new B();
  obj.meth();
  
}
