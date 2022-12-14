package br.com.school.models;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class School {
    private String name;
    private Set<Person> students = new HashSet<>();
    private Map<Integer, Student> numberRegistration = new HashMap<>();
    public Set<Teacher> teachers = new HashSet<>();

    public School(String name) {
        this.name = name;
    }

    public void registration(Student student) {
        this.students.add(student);
        this.numberRegistration.put(student.getNumberRegistration(), student);
    }
    public void registrationTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public String getName() {
        return name;
    }

    public Set<Person> getStudents() {
        return students;
    }

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public Student searchForRegistration(int number) {
        return numberRegistration.get(number);
    }

    @Override
    public String toString() {
        return "Escola: " +
                ", Nome: " + name + '\'' +
                ", alunos: " + students +
                ", numeroMatricula: " + numberRegistration;
    }
}
