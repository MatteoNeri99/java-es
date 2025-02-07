package esercizi;

public class esercizio5 {

    public static void main(String[] args) {

        //Scrivi un programma Java che verifica se una stringa è vuota o null.

        String s = "ciao";

        if (s == null){

            System.out.println("la stringa ha valore null");

        } else if (s.isEmpty()) {

            System.out.println("la stringa è vuota");

        }else{
            System.out.println("stringa: " + s );
        }


    }
}
