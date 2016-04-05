// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package pass;

import java.lang.System;

public class HelloWorld {

    public static String message() {
    	/*
    	 * multi-line
    	 */
    	return "Hello, World!";
    }

    public static void main(String[] args) {
    	// single line
    	System.out.println(HelloWorld.message());
    }

}
