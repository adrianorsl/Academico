
public class Aluno extends Pessoa {

	public Curso curso;
	
	public Aluno() {
		curso = new Curso();
		
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Curso =");
		builder.append(curso.toString());
	    builder.append(super.toString());
	    builder.append("]");
	    return builder.toString();
	}

}
