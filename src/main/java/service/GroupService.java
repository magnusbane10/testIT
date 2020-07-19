package service;

import model.Group;
import model.Student;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GroupService {

    public List<Student> displayStudentNames(Group group) {
        List<Student> students = group.getStudents();
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        return students;
    }
}
