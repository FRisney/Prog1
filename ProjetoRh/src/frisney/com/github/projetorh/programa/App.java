package frisney.com.github.projetorh.programa;

import frisney.com.github.projetorh.modelos.Funcionario;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario fun1 = new Funcionario("Cara","mat1","cargo1",100f);
		System.out.println(fun1.getNome());
		System.out.println(fun1.getCargo());
		System.out.println(fun1.getMatricula());
		System.out.println(fun1.getSalario());
	}

}
