package arreglo;

import clase.Producto;

import java.util.ArrayList;

public class ArregloProductos {
	
	//  Atributo privado
	private ArrayList <Producto> prod;
	//  Constructor
    public ArregloProductos() {
    	prod = new ArrayList <Producto> ();
    }
	//  Operaciones públicas básicas
	public void adicionar(Producto x) {
		prod.add(x);
	}
	public int tamanio() {
		return prod.size();
	}
	public Producto obtener(int i) {
		return prod.get(i);
	}
	//  Operaciones públicas complementarias
	public double total() {
    	double suma = 0.0;
    	for (int i=0; i<tamanio(); i++)
        	suma += obtener(i).subtotal();
	    return suma;
    }
	public double igvTotal() {
		double suma = 0.0;
    	for (int i=0; i<tamanio(); i++)
        	suma += obtener(i).igv();
	    return suma;
	}
	public double totalidad(){
		return igvTotal()+total();
	}
}
