// Demo Java Code 2 for CloudDefense.ai testing
// Author: Jawwad

public class Test2
{
    public static void main(String[] args) {
        System.out.println("Welcome to the Demo 2!");

        int x=20,y=30;  // Intentional style issue: no spaces after comma
        int product=x*y;
        System.out.println("Product of x and y is: "+product);

        if(product>500){System.out.println("Product is greater than 500");} // Brace style issue

        for(int i=0;i<3;i++){System.out.println("Loop iteration: "+i);} // Missing spaces and braces on same line
    }

    // Method with potential warning: missing Javadoc
    public void greetUser(String name){
        System.out.println("Hello, "+name);
    }

    // Method with extra spacing and bad indentation
        public void printNumbers(){
    for(int n=1;n<=5;n++){
    System.out.println(n);
        }
    }
}
