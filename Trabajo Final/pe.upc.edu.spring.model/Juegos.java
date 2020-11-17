package pe.edu.upc.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="juegos")
public class Juegos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idJuegos;
	
	@NotEmpty(message="No puede estar vacio")
    @NotBlank(message="No puede estar en blanco")
	
	@Column(name="nombre_juegos", nullable=false, length=30)
	private String nombreJuegos;
	
	@ManyToOne
	@JoinColumn(name="id_categoria", nullable = false)
    private Categoria categoria;
	
	//@ManyToOne
	//@JoinColumn(name="id_detalle_venta", nullable = false)
    //private DetalleVenta detalleventa;

	private float Precio;
	
	private int Stock;
	
	public int getIdJuegos() {
		return idJuegos;
	}

	public void setIdJuegos(int idJuegos) {
		this.idJuegos = idJuegos;
	}

	public String getNombreJuegos() {
		return nombreJuegos;
	}

	public void setNombreJuegos(String nombreJuegos) {
		this.nombreJuegos = nombreJuegos;
	}

	public Categoria getCategoria() {
		return categoria;
	}
	
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public float getPrecio() {
		return Precio;
	}

	public void setPrecio(float precio) {
		Precio = precio;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}
	
	//public DetalleVenta GetDetalleVenta() {
		//return detalleventa;
	//}
	
	//public void SetDetalleVenta(DetalleVenta detalleventa) {
		//this.detalleventa = detalleventa;
	//}
}
