package pract5;

public class MathOperations {
    static { System.loadLibrary("MathLib"); } 
    public native int add(int a, int b);
    public native int subtract(int a, int b);
    public native int multiply(int a, int b);
    public native int divide(int a, int b);
    public static void main(String[] args) {
        MathOperations m = new MathOperations();
        int a = 10, b = 5;
        System.out.println("10 + 5 = " + m.add(a,b));
        System.out.println("10 - 5 = " + m.subtract(a,b));
        System.out.println("10 * 5 = " + m.multiply(a,b));
        System.out.println("10 / 5 = " + m.divide(a,b));
    }
}
/* Compile Java & Generate Header
->cd pract5
javac -h . MathOperations.java
Creates MathOperations.class + MathOperations.h
*/


/* 
Linux
g++ -fPIC -shared -I"$JAVA_HOME/include" -I"$JAVA_HOME/include/linux" -o libMathLib.so MathLib.cpp

Windows
g++ -shared -I"D:\Java\jdk-21\include" -I"D:\Java\jdk-21\include\win32" -o MathLib.dll MathLib.cpp                    

Run Java Program
->cd ..
java -Djava.library.path=. MathOperations
*/
