package com.test2;

public class Prog13 {

}

class Super {
public int index = 1;
}
class App extends Super {
public App(int index) {
//index = index;// if we use this keyword and initialize with local variable then o/p is 10.
//System.out.println(index);
}
public static void main(String args[]) {
App myApp = new App(10);
System.out.println(myApp.index);
}
}