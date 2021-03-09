
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
    
    void verificarIntegridad(){
    	Asiento registroA = new Asiento();
    	Motor registroM = new Motor();
    	boolean a;
    	for(int i = 0; i < asientos.length; i++) {
    		
    		if(asientos[i].equals(registroA) && asientos[i].equals(registroM)){
    			a = true;
    		}
    		else
    			a = false;
    		
    	}
    	if (a = true) 
    		System.out.println("Auto original");
    	
    	else
    		System.out.println("Las piezas no son originales");
    			
    }
}


