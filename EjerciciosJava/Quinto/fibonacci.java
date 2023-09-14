package Quinto;

public class fibonacci {
    
    public static void main(String[] args) {
        
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print("Sucesion fibonacci: " + b + ", ");

        while(c <= 500){
            c = a + b;
            a = b;
            b = c;
            if(c <= 500 ){
                System.out.print(c + ", ");
            }
        }
    }
}
