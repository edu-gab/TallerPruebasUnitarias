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
	
	//Test que comprueba el calculo del salario dependiendo del trabajador si usa otra moneda
	public void testEurocs() {
		assertEquals(381.75f,supervisorEuro.cs());
		
	}
	// Test que comprueba el calculo del salario del Empleado tipo Worker
	public void testcsWorker() {
		assertEquals(400f,empleado.cs());
	}
	
	// Test que comprueba el calculo del salario del Empleado tipo Worker
	public void testcsSupervisor() {
		assertEquals(401.75f,supervisor.cs());
	}
	
	public void testcsManager() {
		assertEquals(403.5f,gerente.cs());
	}
	
	// Test para cuando el mes es impar
    public void testMonthOdd() {
        // Como ejemplo, se usó el mes 9 (Septiembre)
        assertEquals(400f + 386.0f/12*2, empleado.cs());
    }
    
    // Test para cuando el mes es par
    public void testMonthEven() {
        // Como ejemplo, se usó el mes 8 (Agosto)
        assertEquals(400f, empleado.cs());
    }
    
    // Test para el constructor de Employee
    public void testEmployeeConstructor() {
        Employee testEmployee = new Employee(500, "USD", 10, EmployeeType.Manager);
        assertEquals(500f+ (10 * 0.7F), testEmployee.cs()); // Asegurar que se creó correctamente
    }
	
}


