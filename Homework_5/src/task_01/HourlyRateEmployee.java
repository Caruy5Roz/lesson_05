package task_01;

public class HourlyRateEmployee extends Employee implements Salary {
	
	private int dailyHourAmount;
	private int workingDaysAmount;
	private double hourRate;
	
	
	public HourlyRateEmployee(String name, String surname, int age, String position, int dailyHourAmount,
			int workingDaysAmount, double hourRate) {
		super(name, surname, age, position);
		this.dailyHourAmount = dailyHourAmount;
		this.workingDaysAmount = workingDaysAmount;
		this.hourRate = hourRate;
	}


	@Override
	public double salary() {
		return dailyHourAmount * workingDaysAmount * hourRate;
	}


	@Override
	public String toString() {
		return "HourlyRateEmployee [dailyHourAmount=" + dailyHourAmount + ", workingDaysAmount=" + workingDaysAmount
				+ ", hourRate=" + hourRate + "]";
	}

}
