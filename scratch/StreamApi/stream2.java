package scratch.StreamApi;
import java.util.stream.*;
import java.util.Arrays;
import java.util.List;

public class stream2 {
    public static void main(String[] args) {
        List<Integer> li=Arrays.asList(23,42,53,36,73,18);
        Stream<Integer> sData=li.stream();

        Stream<Integer> finalData= sData.filter(n->n%2==0).sorted().map(n->n*2);
        finalData.forEach(n->System.out.println(n));

    }
    
}
