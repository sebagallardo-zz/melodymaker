package app;

public enum Notas {
//	D4("Re4", 165, 144), 
//	E5("Mi5", 144, 137), F5("Fa5", 137, 114), G5("Sol5", 114, 107), A5("La5", 107, 84), B5("Si5", 84, 77), C5("Do5", 77, 54), D5("Re5", 54, 47), 
//	E6("Mi6", 47, 24), F6("Fa6", 24, 17), G6("Sol6", 17, 0);
	
	D4("Re4", 220, 184), 
	E5("Mi5", 184, 177), F5("Fa5", 177, 154), G5("Sol5", 154, 147), A5("La5", 147, 124), B5("Si5", 124, 117), C5("Do5", 117, 94), D5("Re5", 94, 87), 
	E6("Mi6", 87, 64), F6("Fa6", 64, 57), G6("Sol6", 57, 23);
	
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
