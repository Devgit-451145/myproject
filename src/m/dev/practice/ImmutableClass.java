package m.dev.practice;

import java.util.ArrayList;
import java.util.List;

final class ImmutableClass {
    private final String name;
    private final List<Object> nameList;
    ImmutableClass(String name, List<Object> nameList) {
        this.name = name;
        this.nameList = nameList;
    }
    public String getName() {
        return name;
    }
    public List<Object> getNameList() {
        return new ArrayList<>(nameList);
    }

    public static void main(String[] args) {
        List<Object> names=new ArrayList<>();
        names.add("dev1");
        names.add("keka");
        ImmutableClass aClass=new ImmutableClass("dev",names);
        aClass.getNameList().add("ooo");
        System.out.println(aClass.getNameList());
        List<Object> names1=new ArrayList<>();
        names1.add("uuuu");
        names1.add("90900");

        ImmutableClass aClass1=new ImmutableClass("dev",names1);
        aClass1.getNameList().add("ooo");
        System.out.println(aClass1.getNameList());


    }
}
