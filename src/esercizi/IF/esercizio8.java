package esercizi.IF;

public class esercizio8 {

    public static void main(String[] args) {

        //Scrivi un programma Java che calcola il prezzo scontato di un prodotto in base all'importo e al tasso di sconto.

        double prezzo = 13.0;
        double sconto = 20.0;
        double prezzoScontato = prezzo -  (prezzo  * (sconto /100))  ;
        System.out.println("il prezzo scontato è : " + prezzoScontato);

    }
}

