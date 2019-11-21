package EJEMPLO;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the "LECTURA" database table.
 * 
 */
@Entity
@Table(name="\"LECTURA\"")
@NamedQuery(name="LecturaAuditoria.findAll", query="SELECT l FROM LecturaAuditoria l")
public class LecturaAuditoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"IDROW\"")
	private Long idrow;

	@Column(name="\"ANIO\"")
	private Integer anio;

	@Column(name="\"CONSUMOACTUAL\"")
	private Integer consumoactual;

	@Column(name="\"CONSUMOANTERIOR\"")
	private Integer consumoanterior;

	@Column(name="\"CONSUMOSMES\"")
	private Integer consumosmes;

	@Column(name="\"COSTOMES\"")
	private BigDecimal costomes;

	@Column(name="\"ESTADO\"")
	private Boolean estado;

	@Column(name="\"FACTUALIZACION\"")
	private Timestamp factualizacion;

	@Column(name="\"FECHALECTURA\"")
	private String fechalectura;

	@Column(name="\"ID\"")
	private Integer id;

	@Column(name="\"IDESTADOLECTURA\"")
	private String idestadolectura;

	@Column(name="\"IDMEDIDOR\"")
	private Integer idmedidor;

	@Column(name="\"IDTARIFACONSUMO\"")
	private Integer idtarifaconsumo;

	@Column(name="\"MES\"")
	private String mes;

	@Column(name="\"RESPONSABLE\"")
	private BigDecimal responsable;

	@Column(name="\"TOTALPAGAR\"")
	private BigDecimal totalpagar;

	@Column(name="\"USUARIOACTUALIZACION\"")
	private String usuarioactualizacion;

	public LecturaAuditoria() {
	}

	public Long getIdrow() {
		return this.idrow;
	}

	public void setIdrow(Long idrow) {
		this.idrow = idrow;
	}

	public Integer getAnio() {
		return this.anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public Integer getConsumoactual() {
		return this.consumoactual;
	}

	public void setConsumoactual(Integer consumoactual) {
		this.consumoactual = consumoactual;
	}

	public Integer getConsumoanterior() {
		return this.consumoanterior;
	}

	public void setConsumoanterior(Integer consumoanterior) {
		this.consumoanterior = consumoanterior;
	}

	public Integer getConsumosmes() {
		return this.consumosmes;
	}

	public void setConsumosmes(Integer consumosmes) {
		this.consumosmes = consumosmes;
	}

	public BigDecimal getCostomes() {
		return this.costomes;
	}

	public void setCostomes(BigDecimal costomes) {
		this.costomes = costomes;
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

	public String getFechalectura() {
		return this.fechalectura;
	}

	public void setFechalectura(String fechalectura) {
		this.fechalectura = fechalectura;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIdestadolectura() {
		return this.idestadolectura;
	}

	public void setIdestadolectura(String idestadolectura) {
		this.idestadolectura = idestadolectura;
	}

	public Integer getIdmedidor() {
		return this.idmedidor;
	}

	public void setIdmedidor(Integer idmedidor) {
		this.idmedidor = idmedidor;
	}

	public Integer getIdtarifaconsumo() {
		return this.idtarifaconsumo;
	}

	public void setIdtarifaconsumo(Integer idtarifaconsumo) {
		this.idtarifaconsumo = idtarifaconsumo;
	}

	public String getMes() {
		return this.mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public BigDecimal getResponsable() {
		return this.responsable;
	}

	public void setResponsable(BigDecimal responsable) {
		this.responsable = responsable;
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

}