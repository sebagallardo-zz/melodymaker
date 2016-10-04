package app;

public enum Figuras {
	
	Redonda("Redonda", "w"), Blanca("Blanca", "h"), Negra("Negra", "q"), Corchea("Corchea", "i"), Semicorchea("Semicorchea", "s"), Fusa("Fusa", "t"), Semifusa("Semifusa", "x");
	
	private String name;
	private String key;
	private String file;

	Figuras(String name, String key){
		this.setName(name);
		this.setFile("/icons/" + name + ".png");
		this.setKey(key);
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

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return this.getKey();
	}
}
