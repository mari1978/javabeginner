package com.java.program.interview;

/*New features added in interfaces in JDK 8

Prior to JDK 8, interface could not define implementation. We can now add default implementation for interface methods. This default implementation has special use and does not affect the intention behind interfaces.
Suppose we need to add a new function in an existing interface. Obviously the old code will not work as the classes have not implemented those new functions. So with the help of default implementation, we will give a default body for the newly added functions. Then the old codes will still work.
*/

/*New features added in interfaces in JDK 9
From Java 9 onwards, interfaces can contain following also

Static methods
Private methods
Private Static methods*/


//An example to show that interfaces can 
//have methods from JDK 1.8 onwards 
interface In1 
{ 
 final int a = 10; 
 default void display() 
 { 
     System.out.println("hello"); 
 } 
} 

//A class that implements the interface. 
class TestClass implements In1 
{ 
 // Driver Code 
 public static void main (String[] args) 
 { 
     TestClass t = new TestClass(); 
     t.display(); 
 } 
} 

/*Another feature that was added in JDK 8 is that we can now define static methods in interfaces which can be called independently without an object. Note: these methods are not inherited.
filter_none
edit
play_arrow

brightness_4*/
// An example to show that interfaces can 
// have methods from JDK 1.8 onwards 
/*interface In1 
{ 
    final int a = 10; 
    static void display() 
    { 
        System.out.println("hello"); 
    } 
} 
  
// A class that implements the interface. 
class TestClass implements In1 
{ 
    // Driver Code 
    public static void main (String[] args) 
    { 
        In1.display(); 
    } 
} */
/*Output :
hello*/