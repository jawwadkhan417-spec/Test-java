// Demo Java Code for CloudDefense.ai testing
// Author: Jawwad

public class Test{
    public static void main(String args[]){
        System.out.println("Hello, World!"); // Proper line

        int a=5,b=10;  // Intentional style issue: no spaces after commas
        int sum=a+b;
        System.out.println("Sum of a and b is: "+sum);

        if(sum>10){System.out.println("Sum is greater than 10");} // Style warning: braces on same line
    }

    // Method with potential warning: no Javadoc
    public void sayHello(){
        System.out.println("Say Hello method called");
    }
}
