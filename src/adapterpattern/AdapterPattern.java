
package adapterpattern;

public class AdapterPattern {

    public static void main(String[] args) {
        XMLStockData xmlStockData = new XMLStockData();

        // Use the Adapter to bridge XML data with JSON-based analytics
        JSONAnalytics adapter = new XMLToJSONAdapter(xmlStockData);
        
        // The Adapter handles XML-to-JSON conversion internally
        adapter.processJSON(null); 
    }  
}


