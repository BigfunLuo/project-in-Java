package bus;

import java.util.Comparator;

public class SerialNoPredicate implements Comparator<bike> {
	public int compare(bike b1, bike b2) 
    { 
        if(b1.getSno()>b2.getSno()) 
        return +1;    
        else if(b1.getSno()<b2.getSno())
		return -1;
        else if(b1.getSno()==b2.getSno())
        	return 0;
		return 0;
		} 
}
