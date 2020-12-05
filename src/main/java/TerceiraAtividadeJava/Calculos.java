package TerceiraAtividadeJava;

/**
 *
 * @Jorge Eduardo
 */

public class Calculos {    
    // método para somar.
    private static double soma(double pValue[]){
        double vResultado = 0;
   	 
        for(int i = 0; i < pValue.length; i++){
            vResultado = vResultado + pValue[i];
        }
        
        return vResultado;
    }
    
    // método para média. 
    private double media(double pValue[]) {
        double vMedia = 0;
        double vSoma = 0;
   	 
        vSoma = this.soma(pValue);
        vMedia = vSoma/pValue.length;
   	 
        return vMedia; 
    }
    
    // método para calcular a variancia
    private double variancia(double pValue[]) {
    	double vMedia = this.media(pValue);
        double vDiferenca = 0;
        int vTamanho = 0;
        
        vTamanho = pValue.length;
    
        for (int i = 0; i < vTamanho; i++)  
            vDiferenca += (pValue[i] - vMedia) * (pValue[i] - vMedia);
     	 
            return (double) vDiferenca / vTamanho;
    }
    
    // método para calcular o desvio padrão
    private double desvioPadrao(double pValue[]) {
        return Math.sqrt(this.variancia(pValue));// raiz quadrada da variancia
    }

    // método para imprimir o resultado
    public void Resultado() {
        double vArray[] = {3,5,7,9,10,12,17};
    
	System.out.println("Resultado do somatório.....: " + this.soma(vArray));    
	System.out.println("Resultado da média é.......: " + this.media(vArray));    
	System.out.println("Resultado da variância é...: " + this.variancia(vArray));
	System.out.println("Resulado do desvio padrão é: " + this.desvioPadrao(vArray));
    }
}
