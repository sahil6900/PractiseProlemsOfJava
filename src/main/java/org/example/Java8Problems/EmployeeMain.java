package org.example.Java8Problems;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1,"sahil","ecommerce",1000000));
        list.add(new Employee(3,"ankit","logistic",6000000));
        list.add(new Employee(2,"saurabh","secutiy",4000000));
        list.add(new Employee(5,"akshay","banking",6000000));
        list.add(new Employee(6,"kartik","banking",3000000));
        list.add(new Employee(7,"jai","secutiy",2000000));
        list.add(new Employee(4,"shankar","ecommerce",8000000));

//        List<String> collect = list.stream().sorted(Collections.reverseOrder((o1, o2) -> (int)
//                (o1.getSalary() - o2.getSalary()))).limit(2).collect(Collectors.mapping(Employee::getName, Collectors.toList()));
//
//        System.out.println("Collect"+ collect);

//        Map<String, Long> collect1 = list.stream().collect(Collectors.toMap(Employee::getName, Employee::getSalary));
//        System.out.println(collect1);
//
//        Map.Entry<Long, List<String>> longListEntry = collect1.entrySet().stream().
//                collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList()))).
//                entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList()).
//                get(0);
//
//        System.out.println(longListEntry);


        Map.Entry<Long, List<String>> longListEntry = list.stream().collect(Collectors.groupingBy(Employee::getSalary, Collectors.mapping(Employee::getName, Collectors.toList())))
                .entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList()).get(0);

        System.out.println(longListEntry);

        //System.out.println(result(1,list));

    }

    public static Employee result(int num, List<Employee> list){
        return list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(Collectors.toList()).get(num);
    }


//    public static Map<String,List<Employee>> result1(int num, List<Employee> list){
//        return
//    }
}
