import java.util.Scanner;
/**
 * Classe CoPrimalita 
 * un semplice programma che controlla se due numeri dati sono co-primi,
 * ovvero se non hanno divisori.
 * 
 * Esercizio.
 * Definire una funzione booleana coprimi(-) che svolge la verifica richiesta 
 * utilizzando il calcolo del MCD
 * e modificare il programma di conseguenza
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CoPrimalita
{
    static Scanner tastiera = new Scanner(System.in);
    
    /**
     * Calcolo del massimo comun divisore
     *
     * @param  x  intero >0
     * @param  y  intero >0
     * @return    MCD
     */
    static int mcd(int x, int y)
    {
        int z = 0;
        while (x!=y){
            if (x>y) x -=y;
            else y -=x;
        }
        z = x;
        return z;
    }
    
    /**
     * main method - da eseguire subito!
     *
     * @param  args  (non usato)
     * @return    nulla
     */
    public static void main(String[] args)
    {
        int a, b;
        String risposta = "sono co-primi!";
        System.out.println("AMPRG2019 - Test di co-primalità \n");
        System.out.println("Scrivi qui di seguito due numeri interi positivi");
        a = tastiera.nextInt();
        b = tastiera.nextInt();
        if (mcd(a,b) != 1) risposta = "non "+risposta;
        System.out.println("\n "+risposta);
        System.out.println("\nAMPRG2019 - A presto!");
        return;
    }

}
