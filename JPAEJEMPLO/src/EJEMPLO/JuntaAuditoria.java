package EJEMPLO;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the "JUNTA" database table.
 * 
 */
@Entity
@Table(name="\"JUNTA\"")
@NamedQuery(name="JuntaAuditoria.findAll", query="SELECT j FROM JuntaAuditoria j")
public class JuntaAuditoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"ID\"")
	private Integer id;

	@Column(name="\"CANTON\"")
	private String canton;

	@Column(name="\"DESCRIPCION\"")
	private String descripcion;

	@Column(name="\"DIRECCION\"")
	private String direccion;

	@Column(name="\"ESTADO\"")
	private Boolean estado;

	@Column(name="\"FACTUALIZACION\"")
	private Timestamp factualizacion;

	@Column(name="\"FCREACION\"")
	private Timestamp fcreacion;

	@Column(name="\"MORA\"")
	private BigDecimal mora;

	@Column(name="\"OBSERVACION\"")
	private String observacion;

	@Column(name="\"PAIS\"")
	private String pais;

	@Column(name="\"PARROQUIA\"")
	private String parroquia;

	@Column(name="\"PROVINCIA\"")
	private String provincia;

	@Column(name="\"RUC\"")
	private String ruc;

	@Column(name="\"SECTOR\"")
	private String sector;

	@Column(name="\"SIGLASUNIDADMEDIDA\"")
	private String siglasunidadmedida;

	@Column(name="\"TELEFONO\"")
	private String telefono;

	@Column(name="\"UNIDADMEDIDA\"")
	private String unidadmedida;

	@Column(name="\"USUARIOACTUALIZACION\"")
	private String usuarioactualizacion;

	@Column(name="\"USUARIOCREACION\"")
	private String usuariocreacion;

	public JuntaAuditoria() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCanton() {
		return this.canton;
	}

	public void setCanton(String canton) {
		this.canton = canton;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
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

	public BigDecimal getMora() {
		return this.mora;
	}

	public void setMora(BigDecimal mora) {
		this.mora = mora;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getParroquia() {
		return this.parroquia;
	}

	public void setParroquia(String parroquia) {
		this.parroquia = parroquia;
	}

	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getRuc() {
		return this.ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getSector() {
		return this.sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getSiglasunidadmedida() {
		return this.siglasunidadmedida;
	}

	public void setSiglasunidadmedida(String siglasunidadmedida) {
		this.siglasunidadmedida = siglasunidadmedida;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getUnidadmedida() {
		return this.unidadmedida;
	}

	public void setUnidadmedida(String unidadmedida) {
		this.unidadmedida = unidadmedida;
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