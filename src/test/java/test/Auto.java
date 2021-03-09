
package test; 

public class Auto {
  
	String modelo;
	int precio;
	
	Asiento[] asientos;
	String marca;
    Motor motor;
    int registro;
    public static int cantidadCreados;
    
    
    int cantidadAsientos() {
    	int a = 0;
    	for (int i = 0; i < asientos.length; i++) {
    		if (asientos[i] != null) {
    			a++;
    		}
		}
    	return a;
    }
    
    public void verificarIntegridad(){
    	Auto registroA = new Auto();
    	Motor registroM = new Motor();
    	int a = 0;
    	for(int i = 0; i < asientos.length; i++) {
    		
    		if(asientos[i].equals(registroA.registro) && asientos[i].equals(registroM.registro)){
    			a = 0;
    		}
    		else
    			a = 1;
    		    break;
    	}
    	if (a == 0) 
    		System.out.println("Auto original");
    	
    	else
    		System.out.println("Las piezas no son originales");
    			
    }
}


