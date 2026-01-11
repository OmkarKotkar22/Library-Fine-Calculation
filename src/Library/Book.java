package Library;

public class Book implements FineCalculator {
	
	public double calculateFine(int daysLate)
	{
		double Fine = 2 * daysLate;
		if(daysLate > 10)
		{
			Fine = Fine + 50;
		}
		return Fine;
	}
	public String getItemType() {
        return "Book";
    }
}
