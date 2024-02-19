public class Main {

    public static void main(String[] args) {
        System.out.println("Inventario de Floreria UPB!!!");


        String CSV_PATH = "data/warehouse-stock.csv";
        FileReaderInventory fileReaderInventory  = new FileReaderInventory(CSV_PATH);
        String csvRecords = fileReaderInventory.readFileContent();

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