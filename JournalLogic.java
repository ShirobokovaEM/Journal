
package journal;

import java.util.ArrayList;

public class JournalLogic {
    
    public static String marksToString(ArrayList<Mark> marks){       
        
        if(marks.isEmpty())
            return "";
        
        StringBuilder sb = new StringBuilder();     
        for (Mark mark : marks) {            
            sb.append(mark.getValue());
            sb.append(" ");
        } 
        return sb.toString();        
    }
    
}
