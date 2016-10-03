package app;

public class BufferFigura {

	private Figuras figura;
	private int x;
	private int y;
	
	public BufferFigura(Figuras f, int posx, int posy){
		this.figura = f;
		this.x = posx;
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
	
	
	
}
