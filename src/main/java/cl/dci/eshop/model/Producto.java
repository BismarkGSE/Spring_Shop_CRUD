package cl.dci.eshop.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String nombre;
    @Column
    private Double precio;

    @OneToMany(mappedBy = "producto", cascade = CascadeType.MERGE)
    private List<ProductoCarrito> productoCarritos;

    public Producto(){
        this.productoCarritos = new ArrayList<>();
    }

    public Producto(String nombre, Double precio){
        this.nombre = nombre;
        this.precio = precio;
        this.productoCarritos = new ArrayList<>();
    }

	public List<ProductoCarrito> getProductoCarritos() {
        return productoCarritos;
    }

    public void setProductoCarritos(List<ProductoCarrito> productoCarritos) {
        this.productoCarritos = productoCarritos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
}
