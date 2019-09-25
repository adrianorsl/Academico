
public class Curso {

	public String nome;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Curso =");
		builder.append(nome.toString());
		return builder.toString();
}
}
