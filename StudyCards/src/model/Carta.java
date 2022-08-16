package model;

public class Carta {
	private String frente;
	private String verso;
	private String titulo;
	
	public Carta(String[] carta) {
		this.titulo = carta[0];
		this.frente = carta[1];
		this.verso = carta[2];
	}

	public String getFrente() {
		return frente;
	}

	public void setFrente(String frente) {
		this.frente = frente;
	}

	public String getVerso() {
		return verso;
	}

	public void setVerso(String verso) {
		this.verso = verso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
}
