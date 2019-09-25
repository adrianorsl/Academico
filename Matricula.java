
public class Matricula  {

	public int numero;
	public DisciplinaLecionada disciplinaLecionada;
	public Aluno aluno;
	
	public Matricula() {
		disciplinaLecionada = new DisciplinaLecionada();
		aluno = new Aluno();
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Disciplina Lecionada =");
		builder.append(disciplinaLecionada.toString());
		builder.append("Aluno =");
		builder.append(aluno.toString());
		builder.append("Matricula =");
		builder.append(numero);
		return builder.toString();
	}
	
	
}

