package task_01;

public class FixedSalaryEmployee extends Employee implements Salary {

	public double monthSalary;
	public int workingDaysInMonth;
	public int actuallyWorkedDays;
	
	
	public FixedSalaryEmployee(String name, String surname, int age, String position, double monthSalary,
			int workingDaysInMonth, int actuallyWorkedDays) {
		super(name, surname, age, position);
		this.monthSalary = monthSalary;
		this.workingDaysInMonth = workingDaysInMonth;
		this.actuallyWorkedDays = actuallyWorkedDays;
	}


	@Override
	public double salary() {
		return monthSalary/workingDaysInMonth * actuallyWorkedDays;
	}


	@Override
	public String toString() {
		return "FixedSalaryEmployee [monthSalary=" + monthSalary + ", workingDaysInMonth=" + workingDaysInMonth
				+ ", actuallyWorkedDays=" + actuallyWorkedDays + "]";
	}
	
}
