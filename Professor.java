
public class Professor extends Pessoa {

	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Professor ");
	    builder.append(super.toString());
	    builder.append("]");
	    return builder.toString();
	}
}
