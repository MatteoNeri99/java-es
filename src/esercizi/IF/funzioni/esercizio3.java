package esercizi.IF.funzioni;

public class esercizio3 {

    public static void main(String[] args) {

        //Calcolare la somma di due numeri interi utilizzando una funzione.

        int a = 10;
        int b = 5;

        int somma =somma(a,b);
        System.out.println("la somma é " + somma);
    }

    static int somma (int a, int b){
        return a + b;
    }
}
