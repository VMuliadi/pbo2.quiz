package pbo.quiz;

public class Cell {

    /*
     Nama    :   Vinsen Muliadi
     NIM     :   135314003
     */
    private String cell;

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String process(String cellResult) {
        String resultString = null;
        if (cellResult.startsWith("=")) {
            int panjang = cellResult.length();
            resultString = cellResult.substring(1, panjang);
        }

        if (resultString.contains("*")) {
            String temp[] = resultString.split("\\*");
            String firstCharacter = temp[0];
            String secondCharacter = temp[1];
            double firstDouble = Double.valueOf(firstCharacter);
            double secondDouble = Double.valueOf(secondCharacter);
            double resultDouble = firstDouble * secondDouble;
            resultString = String.valueOf(resultDouble);
        }

        if (resultString.contains("+")) {
            String temp[] = resultString.split("\\+");
            String firstCharacter = temp[0];
            String secondCharacter = temp[1];
            double firstDouble = Double.valueOf(firstCharacter);
            double secondDouble = Double.valueOf(secondCharacter);
            double resultDouble = firstDouble + secondDouble;
            resultString = String.valueOf(resultDouble);
        }

        if (resultString.contains("-")) {
            String temp[] = resultString.split("\\-");
            String firstCharacter = temp[0];
            String secondCharacter = temp[1];
            double firstDouble = Double.valueOf(firstCharacter);
            double secondDouble = Double.valueOf(secondCharacter);
            double resultDouble = firstDouble - secondDouble;
            resultString = String.valueOf(resultDouble);
        }

        if (resultString.contains("/")) {
            String temp[] = resultString.split("\\/");
            String firstCharacter = temp[0];
            String secondCharacter = temp[1];
            double firstDouble = Double.valueOf(firstCharacter);
            double secondDouble = Double.valueOf(secondCharacter);
            double resultDouble = firstDouble / secondDouble;
            resultString = String.valueOf(resultDouble);
        }
        return resultString;
    }
}
