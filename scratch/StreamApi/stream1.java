package scratch.StreamApi;
 
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stream1 {
    public static void main(String[] args) {
        List<Integer> li=Arrays.asList(23,32,43,45,65);
        Stream<Integer> dataStream=li.stream();

        dataStream.forEach(n->System.out.println(n));
    }
    
}
