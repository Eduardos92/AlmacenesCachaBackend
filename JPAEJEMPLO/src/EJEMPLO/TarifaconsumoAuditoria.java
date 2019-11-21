package EJEMPLO;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the "TARIFACONSUMO" database table.
 * 
 */
@Entity
@Table(name="\"TARIFACONSUMO\"")
@NamedQuery(name="TarifaconsumoAuditoria.findAll", query="SELECT t FROM TarifaconsumoAuditoria t")
public class TarifaconsumoAuditoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"IDROW\"")
	private Long idrow;

	@Column(name="\"COSTO\"")
	private BigDecimal costo;

	@Column(name="\"DESCRIPCION\"")
	private String descripcion;

	@Column(name="\"ESTADO\"")
	private Boolean estado;

	@Column(name="\"FACTUALIZACION\"")
	private Timestamp factualizacion;

	@Column(name="\"ID\"")
	private Integer id;

	@Column(name="\"OBSERVACION\"")
	private String observacion;

	@Column(name="\"USUARIOACTUALIZACION\"")
	private String usuarioactualizacion;

	@Column(name="\"VALORFINAL\"")
	private Integer valorfinal;

	@Column(name="\"VALORINICIAL\"")
	private Integer valorinicial;

	public TarifaconsumoAuditoria() {
	}

	public Long getIdrow() {
		return this.idrow;
	}

	public void setIdrow(Long idrow) {
		this.idrow = idrow;
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

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getUsuarioactualizacion() {
		return this.usuarioactualizacion;
	}

	public void setUsuarioactualizacion(String usuarioactualizacion) {
		this.usuarioactualizacion = usuarioactualizacion;
	}

	public Integer getValorfinal() {
		return this.valorfinal;
	}

	public void setValorfinal(Integer valorfinal) {
		this.valorfinal = valorfinal;
	}

	public Integer getValorinicial() {
		return this.valorinicial;
	}

	public void setValorinicial(Integer valorinicial) {
		this.valorinicial = valorinicial;
	}

}