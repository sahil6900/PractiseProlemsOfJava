package org.example.Java8Problems;

import java.util.*;
import java.util.stream.Collectors;

public class StudentMainClass {
    public static void main(String[] args) {

        List<Student> al = new ArrayList<>();

        List<Integer> integers = Arrays.asList (10 , 50 , 65 , 90 , 79);
        al.add (new Student (1,"sahil","Mechanical",integers));

        List<Integer> integers1 = Arrays.asList (40 , 66 , 78 , 89 , 91);
        al.add (new Student (2,"darshan","Electrical",integers1));

        List<Integer> integers2 = Arrays.asList (46 , 56 , 75 , 88 , 98);
        al.add (new Student (3,"dhananjay","Mechanical",integers2));

        List<Integer> integers3 = Arrays.asList (67 , 66 , 74 , 82 , 93);
        al.add (new Student (4,"shashank","Electrical",integers3));

        List<Integer> integers4 = Arrays.asList (67 , 66 , 74 , 82 , 93);
        al.add (new Student (5,"ketan","IT",integers4));

        List<String> electrical = al.stream().filter(dept -> dept.getDepartmentName().equals("Electrical")).
                collect(Collectors.mapping(Student::getName, Collectors.toList()));

        System.out.println(electrical);

        System.out.println("------------------------xxxxxxxxxxxxxxxxxxxxxxxx--------------------------------");

        int sum = al.stream().flatMap(student -> student.getMarks().stream()).mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        System.out.println("------------------------xxxxxxxxxxxxxxxxxxxxxxxx--------------------------------");

        Map<String, List<Double>> collect = al.stream().
                collect(Collectors.groupingBy(Student::getName, Collectors.mapping(m -> m.getMarks().
                        stream().mapToDouble(Integer -> Integer.intValue()).average().orElse(0.0), Collectors.toList())));

        System.out.println("------------------------xxxxxxxxxxxxxxxxxxxxxxxx--------------------------------");
        List<Student> list = al.stream().sorted(Comparator.comparing(Student::getName).
                thenComparing(Student::getDepartmentName)).collect(Collectors.toList());

        System.out.println(collect);

        System.out.println("------------------------xxxxxxxxxxxxxxxxxxxxxxxx--------------------------------");

        System.out.println(list);

        System.out.println("------------------------xxxxxxxxxxxxxxxxxxxxxxxx--------------------------------");

        al.stream().map(stud->stud.getName()).sorted(Collections.reverseOrder()).forEach(System.out::println);

        System.out.println("------------------------xxxxxxxxxxxxxxxxxxxxxxxx--------------------------------");

        List<Integer> list1 = Arrays.asList(1,2,3,5,6,7,4,3,2,5,6,8,9,10,11,2,3,5,7,3,2,4,5,3,2,1,2);

        double average = list1.stream().mapToInt(Integer::intValue).summaryStatistics().getAverage();

        System.out.println("Average is " +average);

        List<Integer> duplicates = list1.stream().collect(Collectors.groupingBy(e->e,Collectors.counting())).entrySet().
                stream().filter(k->k.getKey()>1).map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println(duplicates);

        System.out.println("------------------------xxxxxxxxxxxxxxxxxxxxxxxx--------------------------------");
    }
}
