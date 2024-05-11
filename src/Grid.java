public class Grid {
    public static void main(String[] args) {

        String firstLine = "+--+--+--+\n|  |  |  |\n";
        String lastLine = "+--+--+--+\n";

        for(int i = 0; i < 3; i++){
            System.out.print(firstLine);
        }

        System.out.print(lastLine);
    }
}
