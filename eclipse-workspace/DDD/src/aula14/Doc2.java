package aula14;

/**
 * 
 * @author Yuji Nishioka
 * @version 1.0
 * @since 08/24/2022
 * 
 * Example in class about JavaDocs
 *
 */

public class Doc2 {
	
	/**
	 * Attribute salary - save the salary of a employee
	 */
	private double salary;

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	/**
	 * Show the values a employee receive in a day
	 * 
	 * @author Yuji Nishioka
	 * @since 08/24/2022
	 * @version 1.0
	 * 
	 * @param totalDays
	 * @param distance
	 * @return byDay
	 */
	public double helpCost(int totalDays, double distance) {
		double byDay = getSalary() / 30;
		return byDay;
	}
	
	/**
	 * Metodo de calculo da bonificacao
	 * Criterios:
	 * 	* total de vendas < que R$ 25 mil = 5%
	 *  * total de vendas > que R$ 25 mil = 10%
	 *  
	 *  @author Yuji Nishioka
	 *  @param valorVenda: double (vendas do mes)
	 *  @return salario: double (salario bruto)
	 */
	public double calculaBonificacao(double valorVenda) {
		if(valorVenda < 25000) {
			return getSalary() * 0.05;
		}else {
			return getSalary() * 0.1;
		}
	}
}
