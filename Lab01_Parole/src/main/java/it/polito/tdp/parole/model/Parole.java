package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
	
	List<String> elenco;
	long ti, tf;
	
		
	public Parole() {
		//TODO
		
		elenco = new LinkedList<String>();
	}
	
	public long addParola(String p) {
		//TODO
		
		ti = System.nanoTime();
		elenco.add(p);
		tf = System.nanoTime();
		
		Collections.sort(elenco);
		
		return tf-ti;
	}
	
	public long removeParola(String p) {
		//TODO
		
		ti = System.nanoTime();
		elenco.remove(p);
		tf = System.nanoTime();
		
		Collections.sort(elenco);
		
		return tf-ti;
	}
	
	public List<String> getElenco() {
		//TODO
		
		return elenco;
	}
	
	public void reset() {
		// TODO
		
		elenco.clear();
	}

}
