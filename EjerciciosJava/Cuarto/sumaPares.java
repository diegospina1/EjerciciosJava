package Cuarto;

public class sumaPares{

    public static void main(String[] args){

        int suma = 0;

        for(int i = 0; i <= 2000; i++){
            if(i % 2 == 0){
                suma = suma + i;
            }
        }

        System.out.print("La suma de todos los numeros pares es igual a: " + suma);
    }
}