package mattius;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class StreamIntro {

    public Stream<Student> buildStudents() {
        Student jackie = new Student("Jackie", 3.75);
        Student kyle = new Student("Kyle", 2.8);
        Student bob = new Student("Bob", 4.0);
        Student diana = new Student("Diana", 3.92);
        Student ralph = new Student("Ralph", 1.7);

        Stream<Student> streamResult =
                Stream.<Student>builder()
                        .add(jackie)
                        .add(kyle)
                        .add(bob)
                        .add(diana)
                        .add(ralph)
                        .build();
        return streamResult;
    }

    public  List<String> filterEmptyStrings(List<String> inputList) {

        // create filtered copy of the original list
        List<String> filtered = inputList.stream()
                .filter(x -> !x.isEmpty())
                .collect(Collectors.toList());

        return filtered;
    }

}
