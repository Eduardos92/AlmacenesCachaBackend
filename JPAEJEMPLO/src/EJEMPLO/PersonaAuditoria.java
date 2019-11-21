package EJEMPLO;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the "PERSONA" database table.
 * 
 */
@Entity
@Table(name="\"PERSONA\"")
@NamedQuery(name="PersonaAuditoria.findAll", query="SELECT p FROM PersonaAuditoria p")
public class PersonaAuditoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"IDROW\"")
	private Long idrow;

	@Column(name="\"APELLIDO\"")
	private String apellido;

	@Column(name="\"CALLEPRINCIPAL\"")
	private String calleprincipal;

	@Column(name="\"CALLESECUNDARIA\"")
	private String callesecundaria;

	@Column(name="\"CANTON\"")
	private String canton;

	@Column(name="\"CELULAR\"")
	private String celular;

	@Column(name="\"CORREOELECTRONICO\"")
	private String correoelectronico;

	@Column(name="\"ESTADO\"")
	private Boolean estado;

	@Temporal(TemporalType.DATE)
	@Column(name="\"FACTUALIZACION\"")
	private Date factualizacion;

	@Column(name="\"FECHANACIMIENTO\"")
	private String fechanacimiento;

	@Column(name="\"ID\"")
	private Integer id;

	@Column(name="\"IDCATEGORIAINGRESO\"")
	private Integer idcategoriaingreso;

	@Column(name="\"IDENTIFICACION\"")
	private String identificacion;

	@Column(name="\"IDESTADOCIVIL\"")
	private Integer idestadocivil;

	@Column(name="\"IDTIPOPERSONA\"")
	private Integer idtipopersona;

	@Column(name="\"NOMBRE\"")
	private String nombre;

	@Column(name="\"OBSERVACION\"")
	private String observacion;

	@Column(name="\"PAIS\"")
	private String pais;

	@Column(name="\"PARROQUIA\"")
	private String parroquia;

	@Column(name="\"PROVINCIA\"")
	private String provincia;

	@Column(name="\"SECTOR\"")
	private String sector;

	@Column(name="\"SEXO\"")
	private String sexo;

	@Column(name="\"TELEFONO\"")
	private String telefono;

	@Column(name="\"USUARIOACTUALIZACION\"")
	private String usuarioactualizacion;

	public PersonaAuditoria() {
	}

	public Long getIdrow() {
		return this.idrow;
	}

	public void setIdrow(Long idrow) {
		this.idrow = idrow;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
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

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCorreoelectronico() {
		return this.correoelectronico;
	}

	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}

	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Date getFactualizacion() {
		return this.factualizacion;
	}

	public void setFactualizacion(Date factualizacion) {
		this.factualizacion = factualizacion;
	}

	public String getFechanacimiento() {
		return this.fechanacimiento;
	}

	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdcategoriaingreso() {
		return this.idcategoriaingreso;
	}

	public void setIdcategoriaingreso(Integer idcategoriaingreso) {
		this.idcategoriaingreso = idcategoriaingreso;
	}

	public String getIdentificacion() {
		return this.identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public Integer getIdestadocivil() {
		return this.idestadocivil;
	}

	public void setIdestadocivil(Integer idestadocivil) {
		this.idestadocivil = idestadocivil;
	}

	public Integer getIdtipopersona() {
		return this.idtipopersona;
	}

	public void setIdtipopersona(Integer idtipopersona) {
		this.idtipopersona = idtipopersona;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public String getSector() {
		return this.sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getUsuarioactualizacion() {
		return this.usuarioactualizacion;
	}

	public void setUsuarioactualizacion(String usuarioactualizacion) {
		this.usuarioactualizacion = usuarioactualizacion;
	}

}