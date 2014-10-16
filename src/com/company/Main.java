package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Box<Integer> integerBox;
        integerBox = new Box<Integer>();
        integerBox.add(new Integer(10));
        Integer someInteger = integerBox.get();
        System.out.println(someInteger);
    }
}
