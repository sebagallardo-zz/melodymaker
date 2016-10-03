package app;

public enum Notas {
	A("La", 105, 85), B("Si", 85, 75), C("Do", 75, 55), D("Re", 55, 45), E("Mi", 145, 135), F("Fa", 135, 115), G("Sol", 115, 105),
	E2("Mi2", 45, 25), F2("Fa2", 25, 15);
	
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
