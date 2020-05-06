package streams;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class XmlHandler extends DefaultHandler {

    private ArrayList<Product> products = new ArrayList<>();
    private Product currentProduct;  // Reference to the current Product

    @Override
    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) throws SAXException {
        System.out.println("Start element:" + qName);

        // Handle the product element
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("End element:" + qName);

        // Handle the product element
    }

    // Return the ArrayList of all products contained in the input file
    public ArrayList<Product> getProducts() {
        return products;
    }

}


