package com.theatre.models;

public class SpectacolManager {

	public boolean addSpectacol(Spectacol spec) {
		SpectacolDAO sd = new SpectacolDAO();
		boolean ok = sd.addSpectacol(spec);
		return ok;
	}

	public boolean deleteSpectacol(Spectacol spec) {
		SpectacolDAO sd = new SpectacolDAO();
		boolean ok = sd.deleteSpectacol(spec.getTitlu());
		return ok;
	}

	public boolean updateSpectacol(Spectacol spec) {
		SpectacolDAO sd = new SpectacolDAO();
		boolean ok = sd.updateSpectacol(spec);
		return ok;
	}
}
