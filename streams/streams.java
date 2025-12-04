package streams;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.print.attribute.standard.RequestingUserName;
// import records.*;

import Oops.runTime;

import java.lang.*;

interface uppercase{
    String process(String input);
}

public class streams{

    public static void main(String args[]) throws InterruptedException, ExecutionException
    {
        List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7);

        //List<Integer> output = ls.stream().filter(n->n%2==0).collect(Collectors.toList());

       // System.out.println(output);
        // forEach:System.out.println(output);
        //System.out.println(Runtime.getRuntime().availableProcessors());   
        // output.forEach(n->System.out.println(n));

        // ls.parallelStream().peek(
        //     num->System.out.println(
        //         "Number: "+num+" Thread: "+Thread.currentThread().getName()
        //     )
        // ).forEach(num -> {});


        // ForkJoinPool commonPool = new ForkJoinPool(4);

        // commonPool.submit(
        //     ()->{
        //         ls.parallelStream().peek(
        //             num->System.out.println(
        //                 "Number: "+num+" Thread: "+Thread.currentThread().getName()
        //             )
        //         ).forEach(num -> {});
        //     }
        // ).get();
        //commonPool.shutdown();


        // ls.sort((a,b)->a.compareTo(b));
        // System.out.println(ls);



        // uppercase process = input -> input.toUpperCase();
        // System.out.println(process.process("hello"));


        //imutable list
        // List<String> list = List.of("apple","banana","cherry");
        // list.add("date"); // This will throw UnsupportedOperationException
        // System.out.println(list);

        // List<String> list = Arrays.asList("apple","banana","cherry");
        // list.add("date"); // This will throw UnsupportedOperationException
        // System.out.println(list);

        // List<String> list = ["apple","banana","cherry"];
        // list.add("date"); // This will throw UnsupportedOperationException
        // System.out.println(list);

        // List<String> list= new ArrayList<>();
        // list.add("apple");
        // list.add("banana");
        // list.add("cherry");
        // System.out.println(list);

        // List<String> list = Arrays.asList("apple","banana","cherry");
        // System.out.println(list);

        //mutable list
        // List<String> mutableList = new ArrayList<>(list);
        // mutableList.add("date");
        // System.out.println(mutableList);

        // List<String> list = Stream.of("apple","banana","cherry")
        //                             .collect(Collectors.toList());
        //                             list.add("date");
        //                             list.add("fig");
        // System.out.println(list);


        record Product(String name, double price) {};
        // List<Product> products = List.of(
        //     new Product("Laptop", 999.99),
        //     new Product("Smartphone", 499.49),
        //     new Product("Tablet", 299.99)
        // );

        // Map<String, Double> productPriceMap = products.stream().collect(
        //     Collectors.groupingBy(Product::name,
        //         Collectors.mapping(
        //             Product::price,
        //             Collectors.reducing(0.0000, Double::sum)
        //         )
        // )
        // );
        // System.out.println(productPriceMap);

    

        List<Product> product = List.of(
            new Product("Laptop", 1000),
            new Product("Smartphone", 500),
            new Product("Tablet", 300),
            new Product("Laptop", 1200),
            new Product("Smartphone", 700)
        );

        // Map<String,Double> totalPriceMap = product.stream().collect(
        //     Collectors.groupingBy(Product::name,
        //     Collectors.summingDouble(Product::price)
               
        //     )

        // );

        // System.out.println(totalPriceMap);

        Map<String,Double> summerise = product.stream().collect(
            Colletors.groupingBy(Product::name,Collectors.summarizingInt(Product::price))
        );

        System.out.print(summerise);
        






    }

}