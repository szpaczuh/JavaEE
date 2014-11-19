package com.example.servletsilownia.service;

import java.util.ArrayList;
import java.util.List;

import com.silownia.servletsilownia.domain.Silownia;



public class StorageService {

	public List<Silownia> db = new ArrayList<Silownia>();

	public void add(Silownia silownia) {
		Silownia newSilownia = new Silownia(silownia.getNazwaCwiczenia(), silownia.getCiezar(),
				silownia.getDoswiadczenie(), silownia.getSprzet(), silownia.getPartieciala());
		db.add(newSilownia);
	}

	public List<Silownia> getAllPersons() {
		return db;
	}

}
