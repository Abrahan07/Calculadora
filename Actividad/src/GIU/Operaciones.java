
package GIU;


public class Operaciones {
    public static String calcular(String num1, String num2, String operador) {
        String salida="";
        
        if (operador.equals("+")){
            salida = String.valueOf(Double.parseDouble(num1)+Double.parseDouble(num2));
        }
        if (operador.equals("-")){
            salida = String.valueOf(Double.parseDouble(num1)-Double.parseDouble(num2));
        } 
        if (operador.equals("*")){
            salida = String.valueOf(Double.parseDouble(num1)*Double.parseDouble(num2));
        } 
        if (operador.equals("/")){
            salida = String.valueOf(Double.parseDouble(num1)/Double.parseDouble(num2));
        } 
        if (operador.equals("%")){
            salida = String.valueOf(Double.parseDouble(num1)%Double.parseDouble(num2));
        }
        return salida;
    }
    
    public static int suma(int a, int b){
        return a+b;
    }
    
    
    
    public static boolean verificarPunto(String numero){
    boolean punto=false;
    for (int i=0; i<numero.length(); i++){
        if (numero.substring(i, i+1).equals(".")){
            punto=true;
            break;
        }
    }
    return punto;
}
}
