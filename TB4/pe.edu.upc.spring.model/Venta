package pe.edu.upc.spring.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "venta")
public class Venta implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull
    @Past(message="No puedes seleccionar un dia que NO existe")
    @Temporal(TemporalType.DATE)
    @Column(name="fecha_venta")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaVenta;
	
	private float monto;
	
	@ManyToOne
	@JoinColumn(name="id_user", nullable = false)
	private User user;
	
	@ManyToOne
	@JoinColumn(name="id_pago", nullable = false)
	private Pago pago;

	public Date getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public Pago getPago() {
		return pago;
	}
	
	public void setPago(Pago pago) {
		this.pago = pago;
	}
}
