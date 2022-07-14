package Zahlen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/zahlen")
public class ZahlenController {

    List<Integer> zahlen = Arrays.asList(9, 1, 8, 2, 7, 3, 6, 4, 5);

    @GetMapping("sorted")
    public List getSortedList() {

        List<Integer> sortedList = (List<Integer>) zahlen.stream()
                .sorted()
                .collect(Collectors.toList());

        return sortedList;
    }
}
