import java.io.*;

public class Lesson_6 {
    static public void main(String[] args) {
        String file = "Lesson_6//appdata.csv";

        save(new AppData(new String[]{"Value1", "Value2", "Value3"}, new int[][]{
                {1561, 2512, 12415},
                {123, 673456, 8734},
                {3467, 2667, 623}}), file);

        AppData appData = read(file);
        System.out.println(appData.toString());
    }

    static AppData read(String file) {
        BufferedReader reader = null;
        String line = "";

        try {
            reader = new BufferedReader(new FileReader(file));
            int[][] data = new int[reader.readLine().split(";").length][(int) reader.lines().count()];

            reader = new BufferedReader(new FileReader(file));
            if ((line = reader.readLine()) != null) {
                String[] header = line.split(";");
                int row = 0;

                while ((line = reader.readLine()) != null){
                    int colum = 0;
                    for (String value : line.split(";")) {
                        data[row][colum] = Integer.parseInt(value);
                        colum++;
                    }
                    row++;
                }

                return new AppData(header, data);
            } else {
                return null;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static void save(AppData data, String file) {
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter(file));
            writer.write(data.toString());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
