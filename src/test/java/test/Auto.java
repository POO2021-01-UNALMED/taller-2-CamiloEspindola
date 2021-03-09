
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
    
    String verificarIntegridad(){
    	Auto registroA = new Auto();
    	Motor registroM = new Motor();
    	int a = 0;
    	
    	
    	for(int i = 0; i < asientos.length; i++) {
    		
    	    if(asientos[i].registro == (registroA.registro) && asientos[i].registro==(registroM.registro)&&registroA.registro==registroM.registro){
    			a = 0;
    		}
    		else
    			a = 1;
    		    break;
    	}
    	String b ="Auto original";
    	String c ="Las piezas no son originales";
    	if (a == 0) 
    		return b;
    	else
    		return c;
    			
    }
}


