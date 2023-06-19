package clase;

public class Producto {
	
	//  Atributos privados
	private float precio;
	private int cantidad;
	private String nombre;	
	//  Constructor
    public Producto(String nombre, float precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setprecio(float precio) {
		this.precio = precio;
	}
	public void setcantidad(int cant) {
		this.cantidad = cant;
	}

	public String getNombre() {
		return nombre;
	}
	public float getprecio() {
		return precio;
	}
	public float getcantidad() {
		return cantidad;
	}	    		
	//  Operaciones públicas
	public double subtotal() {
		return (precio*cantidad);
	}
	public double igv(){
		return (subtotal()*0.18);
	}
	
	

}