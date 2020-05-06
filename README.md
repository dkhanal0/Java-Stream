# CSC 241 Streams
In this assignment, we will Java Streams to produce a 
simple set of reports about product data. The XML Parser will be used 
to read the contents of an input file and add the entries to 
an ArrayList. The main() method will use this ArrayList to
generate streams.

Implement all the classes and methods defined in the specification below.

## Specification

### XmlHandler
The `startElement()` and `endElment()` methods must be modified to 
instantiate products, then add them to an ArrayList.

### XmlReader
This class has been modified slightly from a previous assignment, but no further 
modifications should be necessary

### Other Classes
The following classes are required. However, they can be copied from a recent 
assignment and should need no modification
- NonTaxableProduct
- Product
- TaxableNy (interface)
- TaxableProduct

### Main
This class contains the `main()` method. This method will produce Streams 
and generate the report. The report should look like this using
the `products.xml` file (located in the root directory of the project) as
input:
```$xslt
Number of products: 5
Total price: 4.95
---=== Distinct Products ===---
Almond Joy
Reeses
Snickers
```
## Testing
GitHub will run a series of tests comparing the output of your program
with the example above. If necessary, use the error messages detailed in the
testing to isolate and correct errors.
