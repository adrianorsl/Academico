
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa ee = new Pessoa();
		
		ee.setNome(" Mestre Ioda ");
		ee.setCpf(111111111);
		System.out.println(ee);
		
		Professor aa = new Professor();
		
		aa.setNome(" Mestre Ioda ");
		aa.setCpf(222222222);
		System.out.println(aa);
		
		DisciplinaLecionada bb = new DisciplinaLecionada();
		
		bb.setAno(2019);
		bb.setSemestre(02);
		System.out.println(bb);
		
		Disciplina cc = new Disciplina();
		
		cc.setDisciplina("POOI");
		System.out.println(cc);
	}

}
