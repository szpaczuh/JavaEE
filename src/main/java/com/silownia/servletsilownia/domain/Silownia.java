package com.silownia.servletsilownia.domain;

public class Silownia {

	public String getPartieciala() {
		return partieciala;
	}

	public void setPartieciala(String partieciala) {
		this.partieciala = partieciala;
	}

	private String nazwaCwiczenia;
	private int ciezar;
	private String doswiadczenie;
	private String sprzet;
	private String partieciala;

	public Silownia(String nazwaCwiczenia, int ciezar, String doswiadczenie,
			String Sprzet, String partie) {
		this.nazwaCwiczenia = nazwaCwiczenia;
		this.ciezar = ciezar;
		this.doswiadczenie = doswiadczenie;
		this.sprzet = Sprzet;
		this.partieciala = partie;
	}

	public String getNazwaCwiczenia() {
		return nazwaCwiczenia;
	}

	public void setNazwaCwiczenia(String nazwaCwiczenia) {
		this.nazwaCwiczenia = nazwaCwiczenia;
	}

	public int getCiezar() {
		return ciezar;
	}

	public void setCiezar(int ciezar) {
		this.ciezar = ciezar;
	}

	public String getDoswiadczenie() {
		return doswiadczenie;
	}

	public void setDoswiadczenie(String doswiadczenie) {
		this.doswiadczenie = doswiadczenie;
	}

	public String getSprzet() {
		return sprzet;
	}

	public void setSprzet(String sprzet) {
		this.sprzet = sprzet;
	}

	public Silownia() {
		super();
	}

}
