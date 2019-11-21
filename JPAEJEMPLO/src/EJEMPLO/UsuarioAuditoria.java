package EJEMPLO;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "USUARIO" database table.
 * 
 */
@Entity
@Table(name="\"USUARIO\"")
@NamedQuery(name="UsuarioAuditoria.findAll", query="SELECT u FROM UsuarioAuditoria u")
public class UsuarioAuditoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"IDROW\"")
	private Long idrow;

	@Column(name="\"CONTRASENIA\"")
	private String contrasenia;

	@Column(name="\"ESTADO\"")
	private Boolean estado;

	@Column(name="\"FACTUALIZACION\"")
	private Timestamp factualizacion;

	@Column(name="\"ID\"")
	private Integer id;

	@Column(name="\"IDPERSONA\"")
	private Integer idpersona;

	@Column(name="\"IDTIPOUSUARIO\"")
	private Integer idtipousuario;

	@Column(name="\"NOMBRE\"")
	private String nombre;

	@Column(name="\"TOKEN\"")
	private String token;

	@Column(name="\"USUARIOACTUALIZACION\"")
	private String usuarioactualizacion;

	public UsuarioAuditoria() {
	}

	public Long getIdrow() {
		return this.idrow;
	}

	public void setIdrow(Long idrow) {
		this.idrow = idrow;
	}

	public String getContrasenia() {
		return this.contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
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

	public Integer getIdpersona() {
		return this.idpersona;
	}

	public void setIdpersona(Integer idpersona) {
		this.idpersona = idpersona;
	}

	public Integer getIdtipousuario() {
		return this.idtipousuario;
	}

	public void setIdtipousuario(Integer idtipousuario) {
		this.idtipousuario = idtipousuario;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUsuarioactualizacion() {
		return this.usuarioactualizacion;
	}

	public void setUsuarioactualizacion(String usuarioactualizacion) {
		this.usuarioactualizacion = usuarioactualizacion;
	}

}