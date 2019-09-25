
public class Disciplina {

	public Fase fase;
	public String disciplina;
	
	public Disciplina () {
		fase = new Fase();
	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Disciplina =");
		builder.append(disciplina);
		builder.append("Fase =");
		builder.append(fase);
		return builder.toString();
  }
}
