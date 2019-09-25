
public class Frequencia {

	public Professor professor;
	public Matricula matricula;
	public String data;
	public int aulas;
	public int faltas;
	
	public Frequencia() {
		professor = new Professor();
		matricula = new Matricula();
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String getData() {
		return data;
	}
	
	public void setAulas(int aulas) {
		this.aulas = aulas;
	}
	
	public int getAulas() {
		return aulas;
	}
	
	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	
	public int getFaltas() {
	    return faltas;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Professor =");
		builder.append(professor.toString());
		builder.append("Matricula =");
		builder.append(matricula.toString());
		builder.append("Data =");
		builder.append(data.toString());
		builder.append("Aulas =");
		builder.append(aulas);
		builder.append("Faltas =");
		builder.append(faltas);
		return builder.toString();
	}
}
