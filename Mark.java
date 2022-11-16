package journal;

public class Mark {
    
    private int value;
    private Subject subj;  
    

    public Mark(int value, Subject subj) {
        this.value = value;
        this.subj = subj;        
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Subject getSubject() {
        return subj;
    }

    public void setSubject(Subject subj) {
        this.subj = subj;
    }    

    @Override
    public String toString() {
        return  (subj + " " + value);
    }
    
    
}
