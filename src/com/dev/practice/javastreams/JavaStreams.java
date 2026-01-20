package com.dev.practice.javastreams;

import java.util.*;
import java.util.stream.Collectors;
class Person {
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String city;
    private String name;
    Person(String city,String name) {
        this.city=city;
        this.name=name;
    }
}
public class JavaStreams {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);
        //filter== fetch all numbers from a list that are >5
        List<Integer> result=list.stream().filter(n->n>5).collect(Collectors.toList());
        //[6,7,8]

        //map ==transform s list of strings into to list of their uppercase
        List<String> words=Arrays.asList("apple","banana","mango");
        List<String> resluts=words.stream().map(String::toUpperCase).collect(Collectors.toList());

        //FlatMap == given list of list of strings flatten them into single list of strings
        List<List<String>> listOfList=Arrays.asList(
                Arrays.asList("one","two"),
                Arrays.asList("three","four")
        );
        List<String> resultOf=listOfList.stream().flatMap(Collection::stream).collect(Collectors.toList());

        //distinct ==remove all duplicates
        List<Integer> nums=Arrays.asList(1,2,3,3,4,4,5);
        List<Integer> uniq=nums.stream().distinct().collect(Collectors.toList());

        //sorted == sort list of names
        List<String> listSort=Arrays.asList("john","dev","bob");
        List<String> reslut=listSort.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        //peek == print each element in list while converting them to uppercase
        //       == use for debugging purpose
        List<String> wordsPeek =Arrays.asList("apple","banana","mango");
        List<String> listPk=wordsPeek.stream().peek(word->System.out.println("original: "+word)).map(String::toUpperCase).collect(Collectors.toList());

        //Limit ==fetch the first 3 elemetns in list of integers

        List<Integer> listLt=Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> listInt=listLt.stream().limit(3).collect(Collectors.toList());

        //skip skip the first 4 elements and fetch the remaining elements
        List<Integer> listSkip=Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> listSkl=listSkip.stream().skip(3).collect(Collectors.toList());

        ///////////terminal operatores
        //foreach == print each elements in list ==terminal

        List<String> stringList=Arrays.asList("dev","bev","gev");
        stringList.stream().forEach(word->System.out.println("item::"+word));

        //collect == collect a list of integers into a set
        List<Integer> list1Collect=Arrays.asList(1,2,3,4,4,5);
        Set<Integer> set=list1Collect.stream().collect(Collectors.toSet());

        //reduce == compute the product of all numbers in a list
        List<Integer> numsReduce=Arrays.asList(1,2,3,4,5);
        Optional<Integer> resultRd=numsReduce.stream().reduce((a,b)->a*b);
        //output 120

        //allMatch  == check if all elemts matches the predicate and false otherwise
        List<Integer> listIntAll=Arrays.asList(1,2,3,4,5);
        boolean b=listIntAll.stream().allMatch(k->k>3);
        System.out.println(b); //false

        //anyMatch
        List<Integer> listIntAny=Arrays.asList(1,2,3,4,5);
        boolean ba=listIntAny.stream().allMatch(k->k>2);
        System.out.println(ba); //true

        //nonematch == check if no lements in a list are negative
        List<Integer> listNone=Arrays.asList(1,2,3,4,5);
        boolean bn=listNone.stream().noneMatch(k->k<0);
        System.out.println(bn); //true

        //findFirst === used to retrieve the first element in a stream
        List<String> listStr=Arrays.asList("apple","banana","mango");
        Optional<String> lsi=listStr.stream().filter(word->word.startsWith("b")).findFirst();
        System.out.println(lsi);

        //findAny
        List<String> listStrfa=Arrays.asList("apple","banana","mango");
        Optional<String> lsifa=listStrfa.stream().filter(word->word.startsWith("b")).findFirst();
        System.out.println(lsifa);

        //toArray == convert a list of strings into a array

        List<String> wordsArray=Arrays.asList("apple","banana","cherry");
        String [] array=wordsArray.stream().toArray(String[]::new);

        ///////////////////////////// collectors operator///////////////////////////////
        //joining ==is used to concatenate the elements of a stream into a single String

        List<String> wordsJn=Arrays.asList("apple","banana","mango");
        String resultJn=wordsJn.stream().collect(Collectors.joining(", "));
        // output =="apple,banana,mango"
        String resultJn1=wordsJn.stream().collect(Collectors.joining(", ","[","]"));
        //output == "[apple,banana,mango]"

        //groupinBy == group elemts of the stream by a specified classifier function
        //ex :: group a list of people by their city
        List<Person> peoples =Arrays.asList(
                new Person("john","newyork"),
                new Person("dev","columbus")
        );
        Map<String ,List<Person>> res=peoples.stream().collect(Collectors.groupingBy(Person::getName));
        System.out.println(res);

        //partitioningBy ==














    }
}
