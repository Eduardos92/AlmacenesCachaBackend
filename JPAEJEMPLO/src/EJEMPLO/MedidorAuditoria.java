package EJEMPLO;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "MEDIDOR" database table.
 * 
 */
@Entity
@Table(name="\"MEDIDOR\"")
@NamedQuery(name="MedidorAuditoria.findAll", query="SELECT m FROM MedidorAuditoria m")
public class MedidorAuditoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"IDROW\"")
	private Long idrow;

	@Column(name="\"CALLEPRINCIPAL\"")
	private String calleprincipal;

	@Column(name="\"CALLESECUNDARIA\"")
	private String callesecundaria;

	@Column(name="\"CANTON\"")
	private String canton;

	@Column(name="\"ESTADO\"")
	private Boolean estado;

	@Column(name="\"FACTUALIZACION\"")
	private Timestamp factualizacion;

	@Column(name="\"ID\"")
	private Integer id;

	@Column(name="\"IDESTADOMEDIDOR\"")
	private Integer idestadomedidor;

	@Column(name="\"IDPERSONA\"")
	private Integer idpersona;

	@Column(name="\"LATITUD\"")
	private double latitud;

	@Column(name="\"LONGITUD\"")
	private double longitud;

	@Column(name="\"NUMERO\"")
	private String numero;

	@Column(name="\"OBSERVACION\"")
	private String observacion;

	@Column(name="\"PARROQUIA\"")
	private String parroquia;

	@Column(name="\"PROVINCIA\"")
	private String provincia;

	@Column(name="\"SECTOR\"")
	private String sector;

	@Column(name="\"USUARIOACTUALIZACION\"")
	private String usuarioactualizacion;

	public MedidorAuditoria() {
	}

	public Long getIdrow() {
		return this.idrow;
	}

	public void setIdrow(Long idrow) {
		this.idrow = idrow;
	}

	public String getCalleprincipal() {
		return this.calleprincipal;
	}

	public void setCalleprincipal(String calleprincipal) {
		this.calleprincipal = calleprincipal;
	}

	public String getCallesecundaria() {
		return this.callesecundaria;
	}

	public void setCallesecundaria(String callesecundaria) {
		this.callesecundaria = callesecundaria;
	}

	public String getCanton() {
		return this.canton;
	}

	public void setCanton(String canton) {
		this.canton = canton;
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

	public Integer getIdestadomedidor() {
		return this.idestadomedidor;
	}

	public void setIdestadomedidor(Integer idestadomedidor) {
		this.idestadomedidor = idestadomedidor;
	}

	public Integer getIdpersona() {
		return this.idpersona;
	}

	public void setIdpersona(Integer idpersona) {
		this.idpersona = idpersona;
	}

	public double getLatitud() {
		return this.latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return this.longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
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

	public String getSector() {
		return this.sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getUsuarioactualizacion() {
		return this.usuarioactualizacion;
	}

	public void setUsuarioactualizacion(String usuarioactualizacion) {
		this.usuarioactualizacion = usuarioactualizacion;
	}

}