/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package streams;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // Read in the input file
        XmlReader myXmlReader = new XmlReader("products.xml");

        // Get the ArrayList from the XmlReader
        ArrayList<Product>products= myXmlReader.getProducts();

        // Use Streams to generate the report

        Stream <Product> productStream= products.stream();

        long lengthOfArray= products.stream().count();

        System.out.println("Number of products: "+ lengthOfArray);

        double sum= products.stream()
                        .mapToDouble(Product::getUnitPrice) //convert unitprice to double
                        .sum(); //add all the price of the items
        System.out.println("Total price: "+sum);

        System.out.println("---=== Distinct Products ===---");
        List<String>productList= products.stream()
                                        .map(p-> p.getProductName())
                                            .sorted().distinct()
                                            .collect(Collectors.toList());
                        for (String p: productList)
                          System.out.println(p);

    }
}
