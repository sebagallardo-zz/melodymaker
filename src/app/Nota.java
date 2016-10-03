package app;

public class Nota {

	private Notas nota;
	private Figuras figura;
	private int x;
	private int y;
	
	public Nota(Notas n, Figuras f, int posx, int posy){
		this.setNota(n);
		this.setFigura(f);
		this.setX(posx);
		this.setY(posy);
	}

	public Figuras getFigura() {
		return figura;
	}

	public void setFigura(Figuras figura) {
		this.figura = figura;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		// se resta para ajustar la imagen en el plano
		this.y = y - 27;
	}

	public Notas getNota() {
		return nota;
	}

	public void setNota(Notas nota) {
		this.nota = nota;
	}
	
	
	
}
