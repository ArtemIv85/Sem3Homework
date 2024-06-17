import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

public class StudentGroupIteretor implements Iterator<Student> {
private StudentGroup studentGroup;
private int index =0;

    public StudentGroupIteretor(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    private Student[] getStudents(){
    String[] names = studentGroup.students.toString().split(" ");
    Student[] students = new Student[names.length];

    int count =0;
    for (String name: names) {
        students[count] = new Student(name,count);
        count++;

    }
    return  students;
}
    @Override
    public boolean hasNext() {
            return index< getStudents().length;
    }

    @Override
    public Student next() {
        Student[] students = getStudents();
        return students[index++];
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }


}
