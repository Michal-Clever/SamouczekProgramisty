package tablice;

public class Main {

    public static   int sumTab (int [] numbers){
        return numbers[0] + numbers[1];
    }

    public static void main(String[] args) {
        String[] daysOfWeek = new String[7];
        daysOfWeek[0] = "poniedziałek";
        daysOfWeek[1] = "wtorek";
        daysOfWeek[2] = "środa";
        daysOfWeek[3] = "czwartek";
        daysOfWeek[4] = "piątek";
        daysOfWeek[5] = "sobota";
        daysOfWeek[6] = "niedziela";

        for (String s : daysOfWeek) {
            System.out.println(s);
        }
       // System.out.println(daysOfWeek[7]);
        String[] wintersMonths = new String[] {"grudzień", "styczeń", "luty"};
        System.out.println(wintersMonths.length);

        int[][] ticTacToeBoard = new int[3][];
        ticTacToeBoard[0] = new int[3];
        ticTacToeBoard[1] = new int[3];
        ticTacToeBoard[2] = new int[3];

        int[]quest = new int[2];
        


    }
}
