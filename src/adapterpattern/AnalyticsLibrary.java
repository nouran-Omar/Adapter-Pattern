package adapterpattern;

// Service Implementation (Analytics Library)
public class AnalyticsLibrary implements JSONAnalytics {
    @Override
    public void processJSON(String jsonData) {
        System.out.println("Processing JSON data: " + jsonData);
    }
}

