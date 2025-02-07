package esercizi.IF.funzioni;

public class esercizio2 {

    public static void main(String[] args) {

        //verifica se un numero è pari utillizando una funzione.

        int numero = 8;

        pariDispari(numero);


    }

    static void pariDispari (int x){
        if (x % 2== 0){

            System.out.println("il numero è pari");

        }else{

            System.out.println("il numero è dispari");

        }
    }

}
