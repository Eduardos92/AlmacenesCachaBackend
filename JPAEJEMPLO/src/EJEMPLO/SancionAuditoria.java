package EJEMPLO;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the "SANCION" database table.
 * 
 */
@Entity
@Table(name="\"SANCION\"")
@NamedQuery(name="SancionAuditoria.findAll", query="SELECT s FROM SancionAuditoria s")
public class SancionAuditoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"ID\"")
	private Integer id;

	@Column(name="\"COSTO\"")
	private BigDecimal costo;

	@Column(name="\"DESCRIPCION\"")
	private String descripcion;

	@Column(name="\"ESTADO\"")
	private Boolean estado;

	@Column(name="\"FACTUALIZACION\"")
	private Timestamp factualizacion;

	@Column(name="\"FCREACION\"")
	private Timestamp fcreacion;

	@Column(name="\"FECHA\"")
	private Timestamp fecha;

	@Column(name="\"IDMEDIDOR\"")
	private Integer idmedidor;

	@Column(name="\"OBSERVACION\"")
	private String observacion;

	@Column(name="\"SALDO\"")
	private BigDecimal saldo;

	@Column(name="\"USUARIOACTUALIZACION\"")
	private String usuarioactualizacion;

	@Column(name="\"USUARIOCREACION\"")
	private String usuariocreacion;

	public SancionAuditoria() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getCosto() {
		return this.costo;
	}

	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Timestamp getFactualizacion() {
		return this.factualizacion;
	}

	public void setFactualizacion(Timestamp factualizacion) {
		this.factualizacion = factualizacion;
	}

	public Timestamp getFcreacion() {
		return this.fcreacion;
	}

	public void setFcreacion(Timestamp fcreacion) {
		this.fcreacion = fcreacion;
	}

	public Timestamp getFecha() {
		return this.fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	public Integer getIdmedidor() {
		return this.idmedidor;
	}

	public void setIdmedidor(Integer idmedidor) {
		this.idmedidor = idmedidor;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public BigDecimal getSaldo() {
		return this.saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public String getUsuarioactualizacion() {
		return this.usuarioactualizacion;
	}

	public void setUsuarioactualizacion(String usuarioactualizacion) {
		this.usuarioactualizacion = usuarioactualizacion;
	}

	public String getUsuariocreacion() {
		return this.usuariocreacion;
	}

	public void setUsuariocreacion(String usuariocreacion) {
		this.usuariocreacion = usuariocreacion;
	}

}