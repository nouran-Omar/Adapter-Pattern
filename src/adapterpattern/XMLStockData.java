
package adapterpattern;

// Service (Adaptee)
public class XMLStockData {
    public String getXMLData() {
        return   "<stocks>"
                +   "<stock>"
                +       "<symbol>APPL</symbol>"
                +       "<price>175</price>"
                +   "</stock>"
                + "</stocks>";
    }
}


