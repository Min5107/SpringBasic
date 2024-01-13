package hello.core;

import lombok.Getter;
import lombok.Setter;

import java.util.SortedMap;

@Getter
@Setter
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();

        helloLombok.setName("James");
        helloLombok.setAge(10);

        System.out.println("이름 : " + helloLombok.getName() + " 나이 : " + helloLombok.getAge());
    }
}
