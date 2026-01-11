package Library;

public class ResearchPaper implements FineCalculator {
	
	public double calculateFine(int daysLate)
	{
		double Fine = 5 * daysLate;
		if(daysLate > 10)
		{
			Fine = Fine + 50;
		}
		return Fine;
	}
	
	public String getItemType() {
        return "Research Paper";
    }
}
