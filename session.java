public class session {
	
	private String nombre;
	private String password;
	
	public session(String nombre, String password){
		this.nombre = nombre;
		this.password = password;
	}
	public session() {
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nNombre del entrenador: ");
		sb.append(nombre);
		sb.append("\nContraseña del entrenador: ");
		sb.append(password);
		return sb.toString();
	}
	

}