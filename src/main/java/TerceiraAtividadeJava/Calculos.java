package TerceiraAtividadeJava;

/**
 *
 * @Jorge Eduardo
 */

public class Calculos {    
    // m�todo para somar.
    private static double soma(double pValue[]){
        double vResultado = 0;
   	 
        for(int i = 0; i < pValue.length; i++){
            vResultado = vResultado + pValue[i];
        }
        
        return vResultado;
    }
    
    // m�todo para m�dia. 
    private double media(double pValue[]) {
        double vMedia = 0;
        double vSoma = 0;
   	 
        vSoma = this.soma(pValue);
        vMedia = vSoma/pValue.length;
   	 
        return vMedia; 
    }
    
    // m�todo para calcular a variancia
    private double variancia(double pValue[]) {
    	double vMedia = this.media(pValue);
        double vDiferenca = 0;
        int vTamanho = 0;
        
        vTamanho = pValue.length;
    
        for (int i = 0; i < vTamanho; i++)  
            vDiferenca += (pValue[i] - vMedia) * (pValue[i] - vMedia);
     	 
            return (double) vDiferenca / vTamanho;
    }
    
    // m�todo para calcular o desvio padr�o
    private double desvioPadrao(double pValue[]) {
        return Math.sqrt(this.variancia(pValue));// raiz quadrada da variancia
    }

    // m�todo para imprimir o resultado
    public void Resultado() {
        double vArray[] = {3,5,7,9,10,12,17};
    
	System.out.println("Resultado do somat�rio.....: " + this.soma(vArray));    
	System.out.println("Resultado da m�dia �.......: " + this.media(vArray));    
	System.out.println("Resultado da vari�ncia �...: " + this.variancia(vArray));
	System.out.println("Resulado do desvio padr�o �: " + this.desvioPadrao(vArray));
    }
}
