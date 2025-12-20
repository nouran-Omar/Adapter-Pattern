
package adapterpattern;

// Adapter (Bridges Client Interface and Service)
public class XMLToJSONAdapter  implements JSONAnalytics {
    private XMLStockData xmlStockData;

    public XMLToJSONAdapter(XMLStockData xmlStockData) {
        this.xmlStockData = xmlStockData;
    }

    @Override
    public void processJSON(String jsonData) {
       // Convert XML to JSON
        String xmlData = xmlStockData.getXMLData();
        String jsonDataConverted = convertXMLToJSON(xmlData);

        // Use the Analytics Library with the converted JSON data
        new AnalyticsLibrary().processJSON(jsonDataConverted);
    }

    private String convertXMLToJSON(String xmlData) {
        // Simulate XML-to-JSON conversion
        return "{ \"stocks\": [ { \"symbol\": \"APPL\", \"price\": 175 } ] }";
    }
}


