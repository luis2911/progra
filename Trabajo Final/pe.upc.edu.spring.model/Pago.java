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
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "pago")
public class Pago implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPago;

	@NotNull
	@Future(message = "Debe escoger una fecha futura para el vencimiento del pago")
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_vencimiento")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaVencimientoPago;

	@NotEmpty(message = "No puede estar vacio")
	@NotBlank(message = "No puede estar en blanco")
	private String TitularTarjeta;

	private long NumeroTarjeta;

	private int CVV;

	private int cantidad;

	private Float preciototal;

	@ManyToOne
	@JoinColumn(name = "idtpago", nullable = false)
	private TipodePago tipodepago;

	@ManyToOne
	@JoinColumn(name = "nombre_juegos", nullable = false)
	private Juegos juegos;

	public TipodePago getTipodepago() {
		return tipodepago;
	}

	public void setTipodepago(TipodePago tipodepago) {
		this.tipodepago = tipodepago;
	}

	public String getTitularTarjeta() {
		return TitularTarjeta;
	}

	public void setTitularTarjeta(String titularTarjeta) {
		TitularTarjeta = titularTarjeta;
	}

	public Date getFechaVencimientoPago() {
		return fechaVencimientoPago;
	}

	public void setFechaVencimientoPago(Date fechaVencimientoPago) {
		this.fechaVencimientoPago = fechaVencimientoPago;
	}

	public int getIdPago() {
		return idPago;
	}

	public void setIdPago(int idPago) {
		this.idPago = idPago;
	}

	public long getNumeroTarjeta() {
		return NumeroTarjeta;
	}

	public void setNumeroTarjeta(long numeroTarjeta) {
		NumeroTarjeta = numeroTarjeta;
	}

	public int getCVV() {
		return CVV;
	}

	public void setCVV(int cVV) {
		CVV = cVV;
	}

	public TipodePago getTipodePago() {
		return tipodepago;
	}

	public void setTipodePago(TipodePago tipodepago) {
		this.tipodepago = tipodepago;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Juegos getJuegos() {
		return juegos;
	}

	public void setJuegos(Juegos juegos) {
		this.juegos = juegos;
	}

	public Float getPreciototal() {
		return preciototal;
	}

	public void setPreciototal(Float preciototal) {
		this.preciototal = preciototal;
	}

}
