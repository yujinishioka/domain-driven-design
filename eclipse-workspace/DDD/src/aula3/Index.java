package aula3;

public class Index {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario();
		func1.setIdFuncionario(1);
		func1.setNome("Vinicius");
		func1.setDepartamento("SIOUX");
		func1.setSalario(6000.0);
		func1.setAdmissao("11/4/2022");
		func1.setRg("12.345.678-9");
		System.out.println("ID Funcionario: " + func1.getIdFuncionario());
		System.out.println("Nome: " + func1.getNome());
		System.out.println("Departamento: " + func1.getDepartamento());
		System.out.println("Salario: " + func1.getSalario());
		System.out.println("Admissao: " + func1.getAdmissao());
		System.out.println("RG: " + func1.getRg());

		System.out.println("");
		Funcionario func2 = new Funcionario();
		func2.setIdFuncionario(2);
		func2.setNome("Pedro");
		System.out.println("ID Funcionario: " + func2.getIdFuncionario());
		System.out.println("Nome: " + func2.getNome());
	}

}
