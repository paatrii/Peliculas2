package Pelicula2;

import java.sql.*;
import java.time.Year;

public class Pelicula {
	
	private String titulo;
	
	private Year agno;
	
	private String sinopsis;
	
	private Genero genero;
	
	private String pais;
	
	public Trailer trailer;
	
	public Pelicula() {
		trailer = new Trailer();
		
	}
	
	public enum Genero
	{
		drama, comedia, accion, terror, romance, aventra, sciFi
	}

}
