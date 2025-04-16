package Day26_02;

public class Main extends Calculator1 {

	public static void main(String[] args) {
		Main run= new Main();
		run.acceptNumbers();
		Addition a= new Addition();
		a.add();
		run.showResult();
//		division d= new division();
//		d.div();
		Multiply m= new Multiply();
		m.Mul();
		run.showResult();
		Substractiion s= new Substractiion();
		s.sub();
		run.showResult();
	}

}
