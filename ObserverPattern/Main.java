import java.util.ArrayList; import java.util.List;

interface Observer { void update(String message); }
class Student implements Observer { private String name;
public Student(String name) {
    this.name = name;
}

@Override
public void update(String message) {
    System.out.println(name + " received: " + message);
}
}
class Course { private List<Observer> students = new ArrayList<>();
public void subscribe(Observer student) {
    students.add(student);
}

public void unsubscribe(Observer student) {
    students.remove(student);
}

public void publishAnnouncement(String message) {
    for (Observer student : students) {
        student.update(message);
    }
}
}
public class Main {
     public static void main(String[] args) { 
        Course course = new Course();
    Observer student1 = new Student("Reham");
    Observer student2 = new Student("Mona");

    course.subscribe(student1);
    course.subscribe(student2);

    course.publishAnnouncement("Quiz tomorrow!");
}
}