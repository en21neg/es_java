
/**
 * class ModArithmetic:
 * funzioni e operazioni per un'aritmetica
 * modulo ... da definire!
 * 
 * Nota.
 * Quando possibile si lavorerà 
 * con i rappresentanti canonici,
 * ovvero con numeri compresi tra 0 e il modulo (escluso)
 *
 * @author (AMPRG)
 * @version (2019)
 */
public class ModArithmetic
{
    private static int M;
    
    static void setModule(int modulo){
        M = modulo;
        return;
    }

    /**
     * Calcolo del massimo comun divisore
     *
     * @param  x  intero >0
     * @param  y  intero >0
     * @return    MCD
     */
    static int gcd(int x, int y)
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
     * Calcolo della somma
     *
     * @param  x  0 <= x < M
     * @param  y  0 <= x < M
     * @return    x+y modulo M
     */
    static int sum(int x, int y)
    {
        int z = (x+y)%M;
        return z;
    }

    /**
     * Calcolo del prodotto
     *
     * @param  x  0 <= x < M
     * @param  y  0 <= x < M
     * @return    x*y modulo M
     */
    static int prod(int x, int y)
    {
        int z = (x*y)%M;
        return z;
    }
    
    /*
     * Altre funzioni e operazioni utili ...
     */
    
    /**
     * Verifica di invertibiita'
     *
     * @param  x  0 <= x < M
     * @return    true se e' invertibile
     */
    static boolean isInvertible(int x)
    {
        boolean z = false;
        int k = 1;
        while ((!z) && (k<M)){
            z = (prod(x,k)==1);
            k++;
        }
        return z;
    }

    /**
     * Conta gli invertibili modulo M
     *
     * @param     (nessuno)
     * @return    intero >0, numero degli invertibili
     */
    static int numberInvertible()
    {
        int numero = 1;
        for (int elemento = 2; elemento < M; elemento++){
            if (isInvertible(elemento)) numero++;
        }
        return numero;
    }

}
    