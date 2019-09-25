
public class Fase {

	public Curso curso;
	public int fase;
	
	public Fase() {
		curso = new Curso();
	}
	public void setFase(int fase) {
		this.fase = fase;
	}
	
	public int getFase() {
		return fase;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fase =");
		builder.append(fase);
		builder.append("Curso =");
		builder.append(curso.toString());
		return builder.toString();
	}
}
