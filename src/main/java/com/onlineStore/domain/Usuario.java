package com.onlineStore.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "usuarios")
public class Usuario {

	@Id
	private String id;
	private String nombre;
	private String apellido;
	private String direccion;
	private String curp;
//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	public String getNombre() {
//		return nombre;
//	}
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}
//	public String getApellido() {
//		return apellido;
//	}
//	public void setApellido(String apellido) {
//		this.apellido = apellido;
//	}
//	public String getDireccion() {
//		return direccion;
//	}
//	public void setDireccion(String direccion) {
//		this.direccion = direccion;
//	}
//	public String getCurp() {
//		return curp;
//	}
//	public void setCurp(String curp) {
//		this.curp = curp;
//	}
//	public Usuario(String id, String nombre, String apellido, String direccion, String curp) {
//		super();
//		this.id = id;
//		this.nombre = nombre;
//		this.apellido = apellido;
//		this.direccion = direccion;
//		this.curp = curp;
//	}
//	public Usuario() {
//		// TODO Auto-generated constructor stub
//	}

	
	//Mongo Collection
	
//	{
//	    "_id" : ObjectId("5e7bbfb8b65e9917278f5020"),
//	    "nombre" : "Edmundo",
//	    "apellido" : "Carrillo",
//	    "direccion" : "San Angel",
//	    "curp" : "CABE921129RE"
//	}
//	
	
}
