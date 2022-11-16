
package journal;
import java.util.ArrayList;

public class Student {
    
    private String name;
    private String surname;
    
    private ArrayList<Mark> marks = new ArrayList<>();

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        marks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void addMark(Mark mark){
        marks.add(mark);
    } 
    
    public Mark getMark(int index){
        return marks.get(index);
    }
    
    public ArrayList<Mark> getMarks(Subject subject){
        ArrayList<Mark> result = new ArrayList<>();
        for (Mark mark : marks) {
            if(mark.getSubject().getName().equals(subject.getName())){
                result.add(mark);
            }            
        }
        return result;
    }
    
    public String marksToString(){
        if(marks.isEmpty())
            return "Empty";        
        StringBuilder sb = new StringBuilder(); 
        for (int i = 0; i < marks.size() - 1; i++) {
            sb.append(marks.get(i).getSubject().getName());
            sb.append(":");
            sb.append(marks.get(i).getValue());
            sb.append(",");
        }
        sb.append(marks.get(marks.size() - 1).getSubject().getName());
        sb.append(":");
        sb.append(marks.get(marks.size() - 1).getValue());
        return sb.toString();
    }
    
    public double averageMark(Subject subject){
        int sum = 0, count = 0;
        for (Mark mark : getMarks(subject)) {        
            sum += mark.getValue();
            count++;                           
        }
        if(count == 0) return 0;
        double average = (double)sum/count;
        return average;
    }   
      
    

    @Override
    public String toString() {
        return  ( name + " " + surname + ", marks=" + marks);
    }   
    
}
