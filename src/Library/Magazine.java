package Library;

public class Magazine implements FineCalculator {
	
	public double calculateFine(int daysLate)
	{
		double Fine = 3 * daysLate;
		if(daysLate > 10)
		{
			Fine = Fine + 50;
		}
		return Fine;
	}
	
	public String getItemType() {
        return "Magazine";
    }
}
