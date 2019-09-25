
public class Pessoa {

	
	private String nome;
	private int cpf;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nome =");
		builder.append(nome.toString());
		builder.append("Cpf =");
		builder.append(cpf);
		return builder.toString();
	}
	
}
