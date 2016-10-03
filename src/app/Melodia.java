package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Melodia {
	private List<Nota> notas;
	private String melodia;
	
	public Melodia(){
		this.setNotas(new ArrayList<Nota>());
		this.setMelodia("");
	}

	public List<Nota> getNotas() {
		return notas;
	}

	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}
	
	public String getMelodia() {
		return melodia;
	}

	public void setMelodia(String melodia) {
		this.melodia = melodia;
	}

	public void addNota(Nota nota){
		getNotas().add(nota);
		
		Collections.sort(getNotas(), new Comparator<Nota>(){

			public int compare(Nota n1, Nota n2) {
				return n1.getX() - n2.getX();
			}
			
		});
	}

	@Override
	public String toString() {
		setMelodia("");
		for (Nota nota : getNotas()) {
			setMelodia(getMelodia() + nota.getNota().name() + nota.getFigura() + " ");
		}
		return getMelodia();
	}

	public void clear() {
		getNotas().clear();
		setMelodia("");
	}
}
