// Copying Values: When you call a method and pass an argument, Java creates a copy of that argument's value and gives it to the method.
//Original Unchanged: If you modify the parameter inside the method, it only changes the copy, not the original variable.
package Functions;

public class CallByValue {
    public void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping Values :  " + "a = " + a + " b = " + b);
    }
    public static void main(String args[]){
        // Swap Two Numbers 
        CallByValue obj  = new CallByValue();
        int a  = 12;
        int b = 32;
        System.out.println("Values Before Swapping : a = "+a+" b = "+b);
       obj.swap(a,b); 
       
    }
}
