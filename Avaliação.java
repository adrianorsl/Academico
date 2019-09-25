
public class Avaliação {

	public Professor professor;
	public Matricula matricula;
	public float nota;
	public float peso;
	
	public Avaliação() {
		professor = new Professor();
		matricula = new Matricula();
	}
	
	public void setNota(float nota) {
		this.nota = nota;
	}
	
	
	public float getNota() {
		return nota;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public float getPeso() {
		return peso;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Professor =");
		builder.append(professor.toString());
		builder.append("Matricula =");
		builder.append(matricula.toString());
		builder.append("Nota =");
		builder.append(nota);
		builder.append("Peso =");
		builder.append(peso);
		return builder.toString();
	}
}
