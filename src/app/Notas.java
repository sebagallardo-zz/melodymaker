package app;

public enum Notas {
	D4("Re4", 165, 145), 
	E5("Mi5", 145, 135), F5("Fa5", 135, 115), G5("Sol5", 115, 105), A5("La5", 105, 85), B5("Si5", 85, 75), C5("Do5", 75, 55), D5("Re5", 55, 45), 
	E6("Mi6", 45, 25), F6("Fa6", 25, 15), G6("Sol6", 15, 0);

	private String name;
	private int a;
	private int b;
	
	Notas(String name, int a, int b){
		this.setName(name);
		this.a = a;
		this.b = b;
	}
	
	public boolean is(int position){
		return (position < a && position > b);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
