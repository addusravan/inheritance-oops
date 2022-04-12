package com.company;
//inheritance//
class Parent
{
    String name;
    public void details()
    {
        name = "Parent";
        System.out.println(name);
    }
}
class Child extends Parent {
    String name;
    public void detail()
    {
        super.details();	//calling Parent class details() method
        name = "Child";
        System.out.println(name);
    }
    public static void main(String[] args)
    {
        Child cobj = new Child();
        cobj.detail();
    }
}

