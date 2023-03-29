package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


      /*  Stream<Integer> randomNumbers = Stream
                .generate(() -> (new Random()).nextInt(100));

        randomNumbers.limit(20).forEach(System.out::println);*/
/*
        Stream<String> stream=Stream.of("A$B$".split("\\$"));
        stream.forEach(p->System.out.println(p));*/

     /*   List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<=10;i++){
            list.add(i);
        }

        List<Integer> l=list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(l);*/


        List<String> names = new ArrayList<String>();
        names.add("Amith");
        names.add("Suresh");
        names.add("Nagesh");
        names.add("Aarya");
        names.add("Mohsin");
        names.add("arjun");

        //names.stream().filter(s -> s.startsWith("A")).forEach(System.out::println);

        //names.stream().sorted().forEach(System.out::println);

        //names.stream().filter(s->s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);


        // System.out.println(names.stream().filter(s -> s.startsWith("A")).findFirst().get());

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(101, "Associate Software developer","female", 25000,30));
        employeeList.add(new Employee(102, "Software engineer","male", 55000,20));
        employeeList.add(new Employee(103, "Sr Software engineer","male", 75000,29));
        double avaerageSalary = employeeList.stream().mapToInt(Employee::getSalary).average().getAsDouble();
        System.out.println("Average salary of employees:"+avaerageSalary);
        System.out.println("Sum of salaries of employees:"+employeeList.stream().mapToInt(Employee::getSalary).sum());

        System.out.println("Sum of salaries second method:"+employeeList.stream().mapToDouble(Employee::getSalary).sum());

        System.out.println("Employees count:"+ (long) employeeList.size());

        employeeList.stream().filter(i->i.getTitle().equalsIgnoreCase("software engineer")).filter(i->i.getSalary()>30000).forEach(System.out::println);
   System.out.println("--------********-----------");
    employeeList.stream().sorted(Comparator.comparing(Employee::getEmployeeId).reversed()).forEach(System.out::println);
        System.out.println("--------########-----------");
    employeeList.stream().sorted(Comparator.comparing(Employee::getEmployeeId).reversed()).limit(1).forEach(System.out::println);



    System.out.println("Printing the matched numbers");
    List<Integer> numbers=new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(30);
        numbers.add(21);
        numbers.add(56);
        numbers.add(80);
        numbers.add(11);
        numbers.add(80);
        numbers.add(21);

        numbers.stream().filter(i->String.valueOf(i).startsWith("1")).forEach(System.out::println);
        System.out.println("Printing the Distinct numbers");
        numbers.stream().distinct().forEach(System.out::println);
        System.out.println("Printing the Duplicate numbers");
        /*numbers.stream().filter(num -> Collections.frequency(numbers, num) >1)
                .collect(Collectors.toSet()).forEach(System.out::println);*/

        numbers.stream().filter(num->Collections.frequency(numbers,num)>1).distinct().forEach(System.out::println);

        System.out.println("Printing the Second largest number "+ numbers.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList()).get(1));

        System.out.println("Printing the Second smallest number"+numbers.stream().sorted().distinct().collect(Collectors.toList()).get(1));

        Stream.of(10,45,9,3,98,22,3,10).sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(s->System.out.print(s+","));

        System.out.println("Count of employes based on gender");
       Map<String,Long>  count=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
       System.out.println(count);

        Map<String,Double>  averageAge= employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
        System.out.println(averageAge);
    }
}