package streams;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.stream.Stream;

public class XmlHandler extends DefaultHandler {

    private ArrayList<Product> products = new ArrayList<>();
    private Product currentProduct;  // Reference to the current Product

    @Override
    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) throws SAXException {
        //System.out.println("Start element:" + qName);

        // Handle the product element
        if (qName.equals("product")) {
            // Get product attributes
            String name = attributes.getValue("name");
            String isbn = attributes.getValue("isbn");
            String price = attributes.getValue("unitPrice");
            String type = attributes.getValue("taxable");

            // Instantiate the current Product based on taxable attribute
            if (attributes.getValue("taxable") != null && type.contentEquals("true")) {
                currentProduct = new TaxableProduct(name, isbn, Double.parseDouble(price));

            } else {
                currentProduct = new NonTaxableProduct(name, isbn, Double.parseDouble(price));
            }
        }
        }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
       // System.out.println("End element:" + qName);

        // Handle the product element
        if (qName.equals("product")){
            products.add(currentProduct);
        }

    }

    // Return the ArrayList of all products contained in the input file
    public ArrayList<Product> getProducts() {
        return products;
    }

}


