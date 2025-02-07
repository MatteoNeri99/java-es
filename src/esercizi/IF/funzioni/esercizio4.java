package esercizi.IF.funzioni;

public class esercizio4 {

    public static void main(String[] args) {

        //Calcolare il fattoriale di un numero utilizzando una funzione ricorsiva
        int numero = 5;

        int fattoriale = calcolaFattoriale(numero);

        System.out.println("Il fattoriale di " + numero + " è: " + fattoriale);
    }

    public static int calcolaFattoriale(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * calcolaFattoriale(numero - 1);
        }
    }


}
