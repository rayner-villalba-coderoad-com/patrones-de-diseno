public class Main {

    public static void main(String[] args) {
       // System.out.println("Inventario de Floreria UPB!!!");

         //Step 1 Read data
        String CSV_PATH = "data/warehouse-stock.csv";
        FileReaderInventory fileReaderInventory  = new FileReaderInventory(CSV_PATH);
        String csvRecords = fileReaderInventory.readFileContent();

        System.out.println(csvRecords);
        // Step 2 Interpret or parse data
        FeedStockCounterCsv feedStockCounterCsv = new FeedStockCounterCsv();
        System.out.println(feedStockCounterCsv.totalStock(csvRecords));

       String JSON_PATH = "data/warehouse-stock.json";
       FileReaderInventory fileReaderInventoryJson  = new FileReaderInventory(JSON_PATH);
       String jsonRecords =  fileReaderInventoryJson.readFileContent();

       FeedStockCounterJson feedStockCounterJson = new FeedStockCounterJson();
       System.out.println(feedStockCounterJson.totalStock(jsonRecords));

        //System.out.println(jsonRecords);
    }

}