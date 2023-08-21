import junit.framework.TestCase;

public class Test extends TestCase {
	
	Employee empleado = new Employee(400, "USD", 5, EmployeeType.Worker);
	Employee supervisor = new Employee(400, "USD", 5, EmployeeType.Supervisor); 
	Employee gerente = new Employee(400, "USD", 5, EmployeeType.Manager);
	Employee supervisorEuro = new Employee(400, "EUR", 5, EmployeeType.Supervisor);
	
	//Test que comprueba el bono de fin de año del Empleado tipo Worker
	public void testBonusWorker() {
		assertEquals(386f, empleado.CalculateYearBonus());
	}
	
	//Test que comprueba el bono de fin de año del Empleado tipo Supervisor
	public void testBonusSupervisor() {
		assertEquals(593f, supervisor.CalculateYearBonus());
	}
	
	//Test que comprueba el bono de fin de año del Empleado tipo Manager
	public void testBonusGerente() {
		assertEquals(786f, gerente.CalculateYearBonus());
	}
	
	//Test que comprueba el bono de fin de año del Empleado si usa otro moneda
	public void testEuro() {
		assertEquals(573f, supervisorEuro.CalculateYearBonus());
	}
}


