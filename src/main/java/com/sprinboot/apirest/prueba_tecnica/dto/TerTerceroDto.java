package com.sprinboot.apirest.prueba_tecnica.dto;

import com.sprinboot.apirest.prueba_tecnica.modelo.entidades.TerTercero;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class TerTerceroDto {

	private Long terIderegistro;

    @NotNull(message = "Documento es requerido")
    @Size(max = 20)
    private String terDocumento;

    @NotNull (message = "Nombre es requerido")
    @Size(max = 50)
    private String terNombre;

    @NotNull (message = "Apellido es requerido")
    @Size(max = 50)
    private String terApellido;

    @NotNull (message = "Celular es requerido")
    @Size(max = 10)
    private String terTelcelular;

    @NotNull (message = "Correo es requerido")
    @Size(max = 200)
    private String terCorreo;

	public TerTerceroDto() {
		super();
	}
	
	

	public TerTerceroDto(TerTercero terceroEntidad) {
		this.terIderegistro = terceroEntidad.getTerIderegistro();
		this.terDocumento = terceroEntidad.getTerDocumento();
		this.terNombre = terceroEntidad.getTerNombre();
		this.terApellido = terceroEntidad.getTerApellido();
		this.terTelcelular = terceroEntidad.getTerTelcelular();
		this.terCorreo = terceroEntidad.getTerCorreo();
	}



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
    
    
}
