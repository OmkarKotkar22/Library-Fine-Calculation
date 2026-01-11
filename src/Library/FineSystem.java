/*Q3. Library Fine Calculation – Interface with Rules
Interface: FineCalculator
Method:
calculateFine(int daysLate)
Implementing Classes:
Book
Fine = ₹2 × daysLate
Magazine
Fine = ₹3 × daysLate
ResearchPaper
Fine = ₹5 × daysLate
If daysLate > 10 → add extra ₹50
Task:
Accept 8 items (mix of all types).
Calculate fine and print details.
Find total fine collected.
Explanation:
Covers:
Interface method overriding
Logical conditions inside implementing classes
Summation of results
Mixing different classes via interface reference
*/

package Library;
import java.util.*;
public class FineSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Size of Array: ");
		int size = sc.nextInt();
		
		FineCalculator fine[] = new FineCalculator[size];
		int days[] = new int[size];
		double totalfine = 0;
		
        System.out.println("Enter "+size+" items (1=Book, 2=Magazine, 3=ResearchPaper):");
        
        for(int i = 0; i < size; i++)
        {
        		System.out.print("Items " +(i+1)+" type: ");
        		int type = sc.nextInt();
        		
        		System.out.print("Enter the Day Late: ");
        		int day = sc.nextInt();
        		days[i] = day;
        		
        		if(type == 1)
        			fine[i] = new Book();
        		else if(type == 2)
        			fine[i] = new Magazine();
        		else
        			fine[i] = new ResearchPaper();
        }
        
        System.out.println("\n---------------- Fine Details ----------------");
        System.out.println("Item | Type           | Days Late | Fine (₹)");
        System.out.println("----------------------------------------------");
        
        for(int i = 0; i < size; i++)
        {
        		double fines = fine[i].calculateFine(days[i]);
        		totalfine = totalfine + fines;
        		
        		System.out.printf(" %2d  | %-14s | %9d | %.2f\n",
        	            i+1, fine[i].getItemType(), days[i], fines);
        }
        
        System.out.println("----------------------------------------------"); 
        System.out.println("Total Fine Collected: ₹" + totalfine); 
        System.out.println("----------------------------------------------");
	}
}
