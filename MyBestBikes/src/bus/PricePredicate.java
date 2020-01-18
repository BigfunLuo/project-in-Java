package bus;

import java.util.Comparator;

public class PricePredicate implements Comparator<bike> {
	public int compare(bike b1, bike b2) 
    { 
        if(b1.getPrice()>b2.getPrice()) 
        return +1;    
        else if(b1.getPrice()<b2.getPrice())
		return -1;
        else if(b1.getPrice()==b2.getPrice())
        	return 0;
		return 0;
		} 

}

