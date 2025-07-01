package com.sprinboot.apirest.prueba_tecnica.modelo.entidades;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ter_tercero")
public class TerTercero implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
    @Id
    @Column(name = "ter_ideregistro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long terIderegistro;

    @Column(name = "ter_documento")
    private String terDocumento;

    @Column(name = "ter_nombre")
    private String terNombre;

    @Column(name = "ter_apellido")
    private String terApellido;

    @Column(name = "ter_telcelular")
    private String terTelcelular;
    
    @Column(name = "ter_correo")
    private String terCorreo;

	public Long getTerIderegistro() {
		return terIderegistro;
	}

	public void setTerIderegistro(Long terIderegistro) {
		this.terIderegistro = terIderegistro;
	}

	public String getTerDocumento() {
		return terDocumento;
	}

	public void setTerDocumento(String terDocumento) {
		this.terDocumento = terDocumento;
	}

	public String getTerNombre() {
		return terNombre;
	}

	public void setTerNombre(String terNombre) {
		this.terNombre = terNombre;
	}

	public String getTerApellido() {
		return terApellido;
	}

	public void setTerApellido(String terApellido) {
		this.terApellido = terApellido;
	}

	public String getTerTelcelular() {
		return terTelcelular;
	}

	public void setTerTelcelular(String terTelcelular) {
		this.terTelcelular = terTelcelular;
	}

	public String getTerCorreo() {
		return terCorreo;
	}

	public void setTerCorreo(String terCorreo) {
		this.terCorreo = terCorreo;
	}

	public TerTercero() {
		super();
	}
    
}
