// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package pass;

import java.lang.System;

public class HelloWorld {

    public static String message() {
    	/*
    	 * multi-line
    	 */
    	 //double literal
    	return "Hello, World!";
    }

    public static void main(String[] args) {
    	// single line
    	int j = 010;
    	j = 0x0155;
    	j = 019;
    	j = 013452;
    	j = 8.59;
    	System.out.println(HelloWorld.message());
    }

}
