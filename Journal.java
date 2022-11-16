
package journal;

import java.util.ArrayList;
import java.util.Random;

public class Journal {
    
    public static ArrayList<Subject> subjects = new ArrayList<>();
    public static ArrayList<Student> students = new ArrayList<>();    
    
    public static void main(String[] args) {
        
        subjects.add(new Subject("algebra"));
        subjects.add(new Subject("literatura"));
        subjects.add(new Subject("english"));
        
        
        students.add(new Student("Ivan","Ivanov"));
        students.add(new Student("Elena", "Petrova"));
        students.add(new Student("Olga", "Sidorova"));
        
        Random rnd = new Random();
        
        for (Student student : students) {       
            for (int i = 0; i < 10; i++) {
            student.addMark(new Mark(rnd.nextInt(3, 6), subjects.get(rnd.nextInt(subjects.size()))));                       
            } 
        }
       
//        System.out.println(st1.getName() + " " + st1.getSurname() + " " + subjects.get(0) + ": "
//                + JournalLogic.marksToString(st1.getMarks(subjects.get(0))));     
//        System.out.println("average: " + st1.averageMark(subjects.get(0)));         
        
        
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getSurname());
            System.out.println("----------------");
            System.out.println("marks: ");
            System.out.println("----------------");
            for (Subject subject : subjects) {                
                System.out.println(subject + ": " + JournalLogic.marksToString(student.getMarks(subject)));
            }
            System.out.println();
            for (Subject subject : subjects) {
                System.out.println("average: " + subject.getName() + " " + student.averageMark(subject));
            }
            System.out.println();
        }
        
    }    
}
