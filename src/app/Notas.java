package app;

public enum Notas {
	
	D5("Re4", 220, 184), E5("Mi5", 184, 177), F5("Fa5", 177, 154), G5("Sol5", 154, 147), A5("La5", 147, 124), B5("Si5", 124, 117), 
	C6("Do5", 117, 94), D6("Re5", 94, 87), E6("Mi6", 87, 64), F6("Fa6", 64, 57), G6("Sol6", 57, 23);
	
	private String name;
	private int a;
	private int b;
	
	Notas(String name, int a, int b){
		this.setName(name);
		this.a = a;
		this.b = b;
	}
	
	public boolean is(int position){
		return (position < a && position >= b);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
