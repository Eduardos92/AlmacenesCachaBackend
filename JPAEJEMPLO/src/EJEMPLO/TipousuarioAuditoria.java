package EJEMPLO;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "TIPOUSUARIO" database table.
 * 
 */
@Entity
@Table(name="\"TIPOUSUARIO\"")
@NamedQuery(name="TipousuarioAuditoria.findAll", query="SELECT t FROM TipousuarioAuditoria t")
public class TipousuarioAuditoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"ID\"")
	private Integer id;

	@Column(name="\"DESCRIPCION\"")
	private String descripcion;

	@Column(name="\"ESTADO\"")
	private Boolean estado;

	@Column(name="\"FACTUALIZACION\"")
	private Timestamp factualizacion;

	@Column(name="\"FCREACION\"")
	private Timestamp fcreacion;

	@Column(name="\"USUARIOACTUALIZACION\"")
	private String usuarioactualizacion;

	@Column(name="\"USUARIOCREACION\"")
	private String usuariocreacion;

	public TipousuarioAuditoria() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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