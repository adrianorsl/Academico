
public class DisciplinaLecionada {

	public Disciplina disciplina;
	public Professor professor;
	public int ano;
	public int semestre;
	
	public DisciplinaLecionada() {
		professor = new Professor();
		disciplina = new Disciplina();
	}
	
	
	
	public int getAno() {
		return ano;
		
	}
	
	public void setAno(int ano) {
		this.ano = ano;
		
	}
	
	
	public int getSemestre() {
		return semestre;
	}
	
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Professor =");
		builder.append(professor);
		builder.append("Disciplina =");
		builder.append(disciplina);
		builder.append(" Ano = ");
		builder.append(ano);
		builder.append(" Semestre = ");
		builder.append(semestre);
		return builder.toString();
	}
	
	
}
