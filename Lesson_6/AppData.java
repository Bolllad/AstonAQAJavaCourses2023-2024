public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    @Override
    public String toString() {
        String result = "";
        for (String headerItem : header) {
            result += headerItem + ";";
        }
        result = result.substring(0, result.length() - 1) + "\n";

        for (int[] row : data) {
            String subResult = "";
            for (int colum : row) {
                subResult += colum + ";";
            }
            result += subResult.substring(0, subResult.length() - 1) + "\n";
        }

        return result;
    }
}
