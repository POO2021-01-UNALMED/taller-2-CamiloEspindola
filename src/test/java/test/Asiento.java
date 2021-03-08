package test; 

public class Asiento {

	String color;
	int precio;
	int registro;

	void cambiarColor(String color) {
		if (color.equals("rojo"))
			this.color = color;
		if (color.equals("verde"))
			this.color = color;
		if (color.equals("amarillo"))
			this.color = color;
		if (color.equals("negro"))
			this.color = color;
		if (color.equals("blanco"))
			this.color = color;
	}
	
	
	//Tener en cuenta para la Clase Asiento que: 
		//- El método de instancia cambiarColor(), recibirá un argumento String que será el 
		//valor a asignar al atributo color del objeto, tenga en cuenta que los únicos 
		//valores permitidos para cambiar el color serán rojo, verde, amarillo, negro y 
		//blanco, cualquier otro color no cambiara el color del Asiento. 
	

}

