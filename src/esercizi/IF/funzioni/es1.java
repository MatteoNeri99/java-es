package esercizi.IF.funzioni;

public class es1 {
    public static void main(String[] args) {

        //Scrivi un programma Java che calcola il prezzo scontato di un prodotto in base all'importo e al tasso di sconto.

        double base = 10.0;
        double altezza = 3.0;
        double areaRettangolo= areaRettangolo(base,altezza);
        System.out.println(areaRettangolo);


    }

    public static double areaRettangolo(double base , double altezza){
        return base * altezza;
    }
}
