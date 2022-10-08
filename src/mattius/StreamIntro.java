package mattius;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntro {

    public  List<String> filterEmptyStrings(List<String> inputList) {

        // create filtered copy of the original list
        List<String> filtered = inputList.stream()
                .filter(x -> !x.isEmpty())
                .collect(Collectors.toList());

        return filtered;
    }

}
