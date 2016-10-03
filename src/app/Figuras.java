package app;

public enum Figuras {
	
	Redonda("Redonda"), Blanca("Blanca"), Negra("Negra"), Corchea("Corchea"), Semicorchea("Semicorchea"), Fusa("Fusa"), Semifusa("Semifusa");
	
	private String name;
	private String file;
	
	Figuras(String name){
		this.setName(name);
		this.setFile("icons/" + name + ".png");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}
}
