public class MyClass {
    static int a = 0, b = 1, c;
    public static void main(String args[]) {
     //To print fibonacci numbers using for recursion
     System.out.print(a +" "+ b + " ");
     
      MyClass fib = new MyClass();
      fib.printfibo(10);
      
    }
    void printfibo(int i){
        if(i >= 1){
            c = a+b;
            System.out.print(c +" ");
            a = b;
            b = c;
           printfibo(i-1);
        }
    }
      
      
    
    
    }
