package EJEMPLO;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the "TRANSACCION" database table.
 * 
 */
@Entity
@Table(name="\"TRANSACCION\"")
@NamedQuery(name="TransaccionAuditoria.findAll", query="SELECT t FROM TransaccionAuditoria t")
public class TransaccionAuditoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"IDROW\"")
	private Long idrow;

	@Column(name="\"ESTADO\"")
	private Boolean estado;

	@Column(name="\"FACTUALIZACION\"")
	private Timestamp factualizacion;

	@Column(name="\"ID\"")
	private Integer id;

	@Column(name="\"IDESTADOTRANSACCION\"")
	private Integer idestadotransaccion;

	@Column(name="\"IDLECTURA\"")
	private Integer idlectura;

	@Column(name="\"IDRECIBO\"")
	private Integer idrecibo;

	@Column(name="\"OBSERVACION\"")
	private String observacion;

	@Column(name="\"SALDO\"")
	private BigDecimal saldo;

	@Column(name="\"TOTALPAGAR\"")
	private BigDecimal totalpagar;

	@Column(name="\"USUARIOACTUALIZACION\"")
	private String usuarioactualizacion;

	@Column(name="\"VALORRECIBIDO\"")
	private BigDecimal valorrecibido;

	public TransaccionAuditoria() {
	}

	public Long getIdrow() {
		return this.idrow;
	}

	public void setIdrow(Long idrow) {
		this.idrow = idrow;
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

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdestadotransaccion() {
		return this.idestadotransaccion;
	}

	public void setIdestadotransaccion(Integer idestadotransaccion) {
		this.idestadotransaccion = idestadotransaccion;
	}

	public Integer getIdlectura() {
		return this.idlectura;
	}

	public void setIdlectura(Integer idlectura) {
		this.idlectura = idlectura;
	}

	public Integer getIdrecibo() {
		return this.idrecibo;
	}

	public void setIdrecibo(Integer idrecibo) {
		this.idrecibo = idrecibo;
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

	public BigDecimal getTotalpagar() {
		return this.totalpagar;
	}

	public void setTotalpagar(BigDecimal totalpagar) {
		this.totalpagar = totalpagar;
	}

	public String getUsuarioactualizacion() {
		return this.usuarioactualizacion;
	}

	public void setUsuarioactualizacion(String usuarioactualizacion) {
		this.usuarioactualizacion = usuarioactualizacion;
	}

	public BigDecimal getValorrecibido() {
		return this.valorrecibido;
	}

	public void setValorrecibido(BigDecimal valorrecibido) {
		this.valorrecibido = valorrecibido;
	}

}