package task_01;

public class Main {

	public static void main(String[] args) {
		
		HourlyRateEmployee hre = new HourlyRateEmployee("Petro", "Petrenko", 22, "warehouseman", 10, 21, 15.3);
		System.out.println("���������� ������: " + hre + " �� �������: " + hre.salary());
		
		FixedSalaryEmployee fse = new FixedSalaryEmployee("Oleg", "Bondar", 32, "shiftmanager", 4600, 22, 19);
		System.out.println("Գ������� ������: " + fse + " �� �������: " + fse.salary());
		
		

	}

}
