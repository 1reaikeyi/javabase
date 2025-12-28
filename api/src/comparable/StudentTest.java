package comparable;

import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0]= new Student("猴子",1,160);
        students[1]= new Student("紫霞",2,10);
        students[2]= new Student("墨子",3,140);
        students[3]= new Student("韩信",4,160);
//        Arrays.sort(students);
//        Arrays.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getId()-o2.getId();
//            }
//        });
//        Arrays.sort(students, (Student o1, Student o2) ->{
//                return o1.getId()-o2.getId();
//
//        });
        Arrays.sort(students, Student::compareTo);

        System.out.println("Arrays.toString(students) = " + Arrays.toString(students));
    }
    
}
