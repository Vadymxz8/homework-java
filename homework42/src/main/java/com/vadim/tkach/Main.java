package com.vadim.tkach;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String[] studentNames = {"Ivan", "Mariya", "Petro", "Olga"};
        int[] studentAges = {19, 22, 20, 25, 21};
        double[] studentGrades = {3.5, 4.8, 5.0, 4.2, 3.9};

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < studentNames.length; i++) {
            students.add(new Student(studentNames[i], studentAges[i], studentGrades[i]));
        }

        // 1. Фільтруйте студентів, які мають середню оцінку (grade) менше 4.0.
        List<Student> gradeLessThan4 = students.stream()
                .filter(s -> s.getGrade() < 4.0)
                .toList();
        System.out.println("Оцінка < 4.0: " + gradeLessThan4);

        // 2. Знайдіть студента з найвищою оцінкою.
        Optional<Student> bestStudent = students.stream()
                .max(Comparator.comparingDouble(Student::getGrade));
        bestStudent.ifPresent(s -> System.out.println("Best student: " + s));

        // 3. Підрахуйте кількість студентів, які старші за 20 років.
        long olderThan20 = students.stream()
                .filter(s -> s.getAge() > 20)
                .count();
        System.out.println("Older then 20 years: " + olderThan20);

        // 4. Створіть список імен студентів, відсортованих за середньою оцінкою у спадному порядку.
        List<String> namesSortedByGradeDesc = students.stream()
                .sorted(Comparator.comparingDouble(Student::getGrade).reversed())
                .map(Student::getName)
                .toList();
        System.out.println("name in DESC order of rating: " + namesSortedByGradeDesc);

        // 5. Знайдіть, чи є хоча б один студент із середньою оцінкою 5.0.
        boolean hasPerfectStudent = students.stream()
                .anyMatch(s -> s.getGrade() == 5.0);
        System.out.println("Student with rating 5.0: " + hasPerfectStudent);

        // 6. Виведіть імена студентів, які мають оцінку більше ніж 4.0.
        System.out.println("names with rating > 4.0:");
        students.stream()
                .filter(s -> s.getGrade() > 4.0)
                .map(Student::getName)
                .forEach(System.out::println);

    }
}