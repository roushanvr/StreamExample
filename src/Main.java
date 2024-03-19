import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");

        List<Integer> list= Arrays.asList(5,2,6,7,3,1);
        int sumResult=list.stream().filter(n->n%2==0).reduce(0,(a,b)->(a+b));
        System.out.println(sumResult);

        int sumResult1=list.stream().filter(n->n%2==0).mapToInt(i->i).sum();
        System.out.println(sumResult1);

        int productResult=list.stream().reduce(1,(a,b)-> a*b);
        System.out.println(productResult);


        List<List<Integer>> list1=Arrays.asList(Arrays.asList(1,3,2),Arrays.asList(4,5,1),Arrays.asList(8,7));
        List<Integer> sortedDataData=list1.stream().flatMap(innerlist -> innerlist.stream()).sorted().collect(Collectors.toList());
        System.out.println(sortedDataData);

        List<List<Integer>> list2=Arrays.asList(Arrays.asList(1,3,2),Arrays.asList(4,5,1),Arrays.asList(8,7));
        list2.stream().flatMap(innerlist1->innerlist1.stream()).sorted().forEach(n-> System.out.println(n));
        //list2.stream().forEach(n-> System.out.println(n));

        list2.stream().flatMap(innerlist1->innerlist1.stream()).filter(n -> n%4==0).forEach(n-> System.out.println(n));

    }

}
//filter method takes an object of Predicate interface.
//map method takes an object of Function interface.
//reduce method takes an object of BinaryOperator interface.