import java.util.Scanner;
/**
 * Classe ContaInvertibili 
 * un semplice programma per verificare quanti sono
 * gli elementi invertibili modulo M.
 * 
 * Esercizio.
 * Estendere le funzionalità del programma 
 * per consentire:
 * ...
 *
 * @author (AMPRG)
 * @version (2019)
 */
public class ContaInvertibili
{
    static Scanner tastiera = new Scanner(System.in);

    /**
     * main method - da eseguire subito!
     *
     * @param  args  (non usato)
     * @return    nulla
     */
    public static void main(String[] args)
    {
        int m;
        System.out.println("AMPRG2019 - conteggio degli invertibili \n");
        System.out.println("Definisci il modulo!");
        m = tastiera.nextInt();
        ModArithmetic.setModule(m);
        System.out.println("Gli invertibili modulo "+m+" sono ... ");
        System.out.println(ModArithmetic.numberInvertible());
        System.out.println("\nAMPRG2019 - A presto!");
        return;
    }

}
