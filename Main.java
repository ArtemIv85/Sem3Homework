//� Создать класс Студент
//� Создать класс УчебнаяГруппа
//� Создать класс УчебнаяГруппаИтератор, заставив его реализовать
//интерфейс Iterator
//� Реализовать его контракты (включая удаление)

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Student student1 =  new Student("Иван",1);
        Student student2 =  new Student("Николай",2);
        Student student3 =  new Student("Матвей",3);
        Student student4 =  new Student("Сергей",4);
        Student student5 =  new Student("Владлен",5);
        Student student6 =  new Student("Никита",6);
        Student student7 =  new Student("Александр",7);
        Student student8 =  new Student("Алексей",8);
        Student student9 =  new Student("Илья",9);
        //Создание групп
        StudentGroup studentgroup1 = new StudentGroup();
        studentgroup1.addStudent(student1);
        studentgroup1.addStudent(student2);
        studentgroup1.addStudent(student3);
        StudentGroup studentgroup2 = new StudentGroup();
        studentgroup2.addStudent(student4);
        studentgroup2.addStudent(student5);
        StudentGroup studentgroup3 = new StudentGroup();
        studentgroup3.addStudent(student6);
        studentgroup3.addStudent(student7);
        studentgroup3.addStudent(student8);
        studentgroup3.addStudent(student9);

        System.out.println(studentgroup1);
        System.out.println(studentgroup3.students.size());



        //создание потоков
        StreemGroup streem1 = new StreemGroup();
        streem1.addGroup(studentgroup1);
        streem1.addGroup(studentgroup2);
        System.out.println(streem1);
        StreemGroup streem2 = new StreemGroup();
        streem2.addGroup(studentgroup3);

//вывод списка потоков по количеству групп
        ArrayList<StreemGroup> arr = new ArrayList<>(List.of(streem1,streem2));
        Collections.sort(arr,new StreamComparator());
        System.out.println("Отсортированный список потоков");
        System.out.println(arr);





         //System.out.println(studentgroup1.students);
//
//        Iterator<Student> iterator = new StudentGroupIteretor(studentgroup);
//
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        for (Student student: studentgroup){
//            System.out.println(student);
//        }






    }
}
