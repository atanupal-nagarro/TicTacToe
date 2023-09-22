// Tic-Tac-Toe Game - "You can never win"
import java.util.*;
public class Main {
    static String[] board;
    static String turn;

    // Check winner for rows, columns and diagonals for 3 consecutive "X" or "O"
    static String checkWinner() {
        for (int ctr=0; ctr < 8; ctr++) {
            String line=null;
            switch (ctr) {
                case 0:
                    line=board[0] + board[1] + board[2];
                    break;
                case 1:
                    line=board[3] + board[4] + board[5];
                    break;
                case 2:
                    line=board[6] + board[7] + board[8];
                    break;
                case 3:
                    line=board[0] + board[3] + board[6];
                    break;
                case 4:
                    line=board[1] + board[4] + board[7];
                    break;
                case 5:
                    line=board[2] + board[5] + board[8];
                    break;
                case 6:
                    line=board[0] + board[4] + board[8];
                    break;
                case 7:
                    line=board[2] + board[4] + board[6];
                    break;}
            //For X winner
            if (line.equals("XXX"))
                return "X";
                // For O winner
            else if (line.equals("OOO"))
                return "O";}
        for (int ctr=0; ctr < 9; ctr++) {
            if (Arrays.asList(board).contains(
                    String.valueOf(ctr + 1))) {
                break;} else if (ctr == 8) {
                return "draw";}}
        // To enter the X Or O at the exact place on board.
        if (turn.equals("X")) {
            System.out.println(
                    turn + "'s turn; enter a slot number to place "
                            + turn + " in:");
        }
        else
        {
            System.out.println("Computer has played the move and placed \"O\"");
        }
        return null;}

    // To print out the board.
	/*
	|-----|-----|-----|
	|  1  |  2  |  3  |
	|-----------------|
	|  4  |  5  |  6  |
	|-----------------|
	|  7  |  8  |  9  |
	|-----|-----|-----|
	*/
    static void printBoard() {
        System.out.println("|-----|-----|-----|");
        System.out.println("|  " + board[0] + "  |  "
                + board[1] + "  |  " + board[2]
                + "  |");
        System.out.println("|-----------------|");
        System.out.println("|  " + board[3] + "  |  "
                + board[4] + "  |  " + board[5]
                + "  |");
        System.out.println("|-----------------|");
        System.out.println("|  " + board[6] + "  |  "
                + board[7] + "  |  " + board[8]
                + "  |");
        System.out.println("|-----|-----|-----|");}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Scanner in2 = null;
        String again = null;
        int numInput;
        do {board=new String[9];

            numInput=10;
            turn="X";
            String winner=null;
            //initializing numbers in board
            for (int ctr=0; ctr < 9; ctr++) {board[ctr]=String.valueOf(ctr + 1);}
            System.out.println("Welcome to Tic Tac Toe game - You can never win !!!");
            printBoard();
            System.out.println("Player(X) will play first. Please enter a slot number to place X in:");
            while (winner == null) {
                //in = new Scanner(System.in);
                //Scanner in = new Scanner(System.in);

                // Exception handling.
                // numInput will take input from user like from 1 to 9.
                // If it is not in range from 1 to 9.
                // then it will show you an error, eg "Invalid input."


                {if (turn.equals("O")) {
                    /*
                      Winning moves
                     */
                    /*
                    'First row
                    */
                    if (board[0].equals("O") && board[2].equals("O") && !((board[1].equals("O")) || board[1].equals("X"))) {
                        numInput=2;} else if (board[0].equals("O") && board[1].equals("O") && !((board[2].equals("O")) || board[2].equals("X"))) {
                        numInput=3;} else if (board[2].equals("O") && board[1].equals("O") && !((board[0].equals("O")) || board[0].equals("X"))) {
                        numInput=1;}
                    /*
                    'Second row
                    */
                    else if (board[3].equals("O") && board[5].equals("O") && !((board[4].equals("O")) || board[4].equals("X"))) {
                        numInput=5;} else if (board[3].equals("O") && board[4].equals("O") && !((board[5].equals("O")) || board[5].equals("X"))) {
                        numInput=6;} else if (board[5].equals("O") && board[4].equals("O") && !((board[3].equals("O")) || board[3].equals("X"))) {
                        numInput=4;}
                    /*
                    'Third row
                            */
                    else if (board[6].equals("O") && board[8].equals("O") && !((board[7].equals("O")) || board[7].equals("X"))) {
                        numInput=8;} else if (board[6].equals("O") && board[7].equals("O") && !((board[8].equals("O")) || board[8].equals("X"))) {
                        numInput=9;} else if (board[8].equals("O") && board[7].equals("O") && !((board[6].equals("O")) || board[6].equals("X"))) {
                        numInput=7;}
                    /*
                    First column
                     */
                    else if (board[0].equals("O") && board[6].equals("O") && !((board[3].equals("O")) || board[3].equals("X"))) {
                        numInput=4;} else if (board[0].equals("O") && board[3].equals("O") && !((board[6].equals("O")) || board[6].equals("X"))) {
                        numInput=7;} else if (board[6].equals("O") && board[3].equals("O") && !((board[0].equals("O")) || board[0].equals("X"))) {
                        numInput=1;}
/*
                    Second column
                     */
                    else if (board[1].equals("O") && board[7].equals("O") && !((board[4].equals("O")) || board[4].equals("X"))) {
                        numInput=3;} else if (board[1].equals("O") && board[4].equals("O") && !((board[7].equals("O")) || board[7].equals("X"))) {
                        numInput=8;} else if (board[7].equals("O") && board[4].equals("O") && !((board[1].equals("O")) || board[1].equals("X"))) {
                        numInput=2;}
/*
                    Third column
                     */
                    else if (board[2].equals("O") && board[8].equals("O") && !((board[5].equals("O")) || board[5].equals("X"))) {
                        numInput=4;} else if (board[2].equals("O") && board[5].equals("O") && !((board[8].equals("O")) || board[8].equals("X"))) {
                        numInput=9;} else if (board[8].equals("O") && board[5].equals("O") && !((board[2].equals("O")) || board[2].equals("X"))) {
                        numInput=3;}
 /*
                    First diagonal
                     */
                    else if (board[0].equals("O") && board[8].equals("O") && !((board[4].equals("O")) || board[4].equals("X"))) {
                        numInput=5;} else if (board[0].equals("O") && board[4].equals("O") && !((board[8].equals("O")) || board[8].equals("X"))) {
                        numInput=9;} else if (board[8].equals("O") && board[4].equals("O") && !((board[0].equals("O")) || board[0].equals("X"))) {
                        numInput=1;}
 /*
                    Second diagonal
                     */
                    else if (board[6].equals("O") && board[2].equals("O") && !((board[4].equals("O")) || board[4].equals("X"))) {
                        numInput=5;} else if (board[6].equals("O") && board[4].equals("O") && !((board[2].equals("O")) || board[2].equals("X"))) {
                        numInput=3;} else if (board[2].equals("O") && board[4].equals("O") && !((board[6].equals("O")) || board[6].equals("X"))) {
                        numInput=7;}
/*
Defending moves
 */
/*
                    'First row
                            */
                    else if (board[0].equals("X") && board[2].equals("X") && !((board[1].equals("X")) || board[1].equals("O"))) {
                        numInput=2;} else if (board[0].equals("X") && board[1].equals("X") && !((board[2].equals("X")) || board[2].equals("O"))) {
                        numInput=3;} else if (board[2].equals("X") && board[1].equals("X") && !((board[0].equals("X")) || board[0].equals("O"))) {
                        numInput=1;}
                    /*
                    'Second row
                    */
                    else if (board[3].equals("X") && board[5].equals("X") && !((board[4].equals("X")) || board[4].equals("O"))) {
                        numInput=5;} else if (board[3].equals("X") && board[4].equals("X") && !((board[5].equals("X")) || board[5].equals("O"))) {
                        numInput=6;} else if (board[5].equals("X") && board[4].equals("X") && !((board[3].equals("X")) || board[3].equals("O"))) {
                        numInput=4;}
                    /*
                    'Third row
                            */
                    else if (board[6].equals("X") && board[8].equals("X") && !((board[7].equals("X")) || board[7].equals("O"))) {
                        numInput=8;} else if (board[6].equals("X") && board[7].equals("X") && !((board[8].equals("X")) || board[8].equals("O"))) {
                        numInput=9;} else if (board[8].equals("X") && board[7].equals("X") && !((board[6].equals("X")) || board[6].equals("O"))) {
                        numInput=7;}
                    /*
                    First column
                     */
                    else if (board[0].equals("X") && board[6].equals("X") && !((board[3].equals("X")) || board[3].equals("O"))) {
                        numInput=4;} else if (board[0].equals("X") && board[3].equals("X") && !((board[6].equals("X")) || board[6].equals("O"))) {
                        numInput=7;} else if (board[6].equals("X") && board[3].equals("X") && !((board[0].equals("X")) || board[0].equals("O"))) {
                        numInput=1;}
/*
                    Second column  new numInput=5;
                     */
                    else if (board[1].equals("X") && board[7].equals("X") && !((board[4].equals("X")) || board[4].equals("O"))) {
                        numInput=5;} else if (board[1].equals("X") && board[4].equals("X") && !((board[7].equals("X")) || board[7].equals("O"))) {
                        numInput=8;} else if (board[7].equals("X") && board[4].equals("X") && !((board[1].equals("X")) || board[1].equals("O"))) {
                        numInput=2;}
/*
                    Third column
                     */
                    else if (board[2].equals("X") && board[8].equals("X") && !((board[5].equals("X")) || board[5].equals("O"))) {
                        numInput=6; /*corrected*/} else if (board[2].equals("X") && board[5].equals("X") && !((board[8].equals("X")) || board[8].equals("O"))) {
                        numInput=9;} else if (board[8].equals("X") && board[5].equals("X") && !((board[2].equals("X")) || board[2].equals("O"))) {
                        numInput=3;}
 /*
                    First diagonal
                     */
                    else if (board[0].equals("X") && board[8].equals("X") && !((board[4].equals("X")) || board[4].equals("O"))) {
                        numInput=5;} else if (board[0].equals("X") && board[4].equals("X") && !((board[8].equals("X")) || board[8].equals("O"))) {
                        numInput=9;} else if (board[8].equals("X") && board[4].equals("X") && !((board[0].equals("X")) || board[0].equals("O"))) {
                        numInput=1;}
 /*
                    Second diagonal
                     */
                    else if (board[6].equals("X") && board[2].equals("X") && !((board[4].equals("X")) || board[4].equals("O"))) {
                        numInput=5;} else if (board[6].equals("X") && board[4].equals("X") && !((board[2].equals("X")) || board[2].equals("O"))) {
                        numInput=3;} else if (board[2].equals("X") && board[4].equals("X") && !((board[6].equals("X")) || board[6].equals("O"))) {
                        numInput=7;}
                    //move 2 - 1
                    else if  (!board[0].equals("X") && board[1].equals("X") && !board[2].equals("X") && !board[3].equals("X") && !board[4].equals("X") && !board[5].equals("X") && !board[6].equals("X") && !board[7].equals("X") && !board[8].equals("X") && !board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && !board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=5;}
                    //move 2 - 2
                    else if  (!board[0].equals("X") && !board[1].equals("X") && board[2].equals("X") && !board[3].equals("X") && !board[4].equals("X") && !board[5].equals("X") && !board[6].equals("X") && !board[7].equals("X") && !board[8].equals("X") && !board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && !board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=5;}
                    //move 2 - 3
                    else if  (!board[0].equals("X") && !board[1].equals("X") && !board[2].equals("X") && board[3].equals("X") && !board[4].equals("X") && !board[5].equals("X") && !board[6].equals("X") && !board[7].equals("X") && !board[8].equals("X") && !board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && !board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=5;}
                    //move 2 - 4
                    else if  (!board[0].equals("X") && !board[1].equals("X") && !board[2].equals("X") && !board[3].equals("X") && !board[4].equals("X") && board[5].equals("X") && !board[6].equals("X") && !board[7].equals("X") && !board[8].equals("X") && !board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && !board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=5;}
                    //move 2 - 5
                    else if  (!board[0].equals("X") && !board[1].equals("X") && !board[2].equals("X") && !board[3].equals("X") && !board[4].equals("X") && !board[5].equals("X") && board[6].equals("X") && !board[7].equals("X") && !board[8].equals("X") && !board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && !board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=5;}
                    //move 2 - 6
                    else if  (!board[0].equals("X") && !board[1].equals("X") && !board[2].equals("X") && !board[3].equals("X") && !board[4].equals("X") && !board[5].equals("X") && !board[6].equals("X") && board[7].equals("X") && !board[8].equals("X") && !board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && !board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=5;}
                    //move 2 - 7
                    else if  (!board[0].equals("X") && !board[1].equals("X") && !board[2].equals("X") && !board[3].equals("X") && !board[4].equals("X") && !board[5].equals("X") && !board[6].equals("X") && !board[7].equals("X") && board[8].equals("X") && !board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && !board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=5;}
                    //move 2 - 8
                    else if  (!board[0].equals("X") && !board[1].equals("X") && !board[2].equals("X") && !board[3].equals("X") && board[4].equals("X") && !board[5].equals("X") && !board[6].equals("X") && !board[7].equals("X") && !board[8].equals("X") && !board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && !board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=1;}
                    //move 2 - 9 - newly added
                    else if  (board[0].equals("X") && !board[1].equals("X") && !board[2].equals("X") && !board[3].equals("X") && !board[4].equals("X") && !board[5].equals("X") && !board[6].equals("X") && !board[7].equals("X") && !board[8].equals("X") && !board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && !board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=5;}
                    //move 4 - 1
                    else if  (!board[0].equals("X") && !board[1].equals("X") && !board[2].equals("X") && !board[3].equals("X") && board[4].equals("X") && !board[5].equals("X") && !board[6].equals("X") && !board[7].equals("X") && board[8].equals("X") && board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && !board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=3;}
                    //move 1 new !board[0].equals("O")      board[4].equals("O")
                    else if  (board[0].equals("X") && !board[1].equals("X") && !board[2].equals("X") && !board[3].equals("X") && !board[4].equals("X") && !board[5].equals("X") && !board[6].equals("X") && !board[7].equals("X") && board[8].equals("X") && !board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=2;}
                    //move 2
                    else if  (!board[0].equals("X") && !board[1].equals("X") && board[2].equals("X") && !board[3].equals("X") && board[4].equals("X") && !board[5].equals("X") && board[6].equals("X") && !board[7].equals("X") && !board[8].equals("X") && !board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=4;}
                    //move 3
                    else if  (!board[0].equals("X") && !board[1].equals("X") && !board[2].equals("X") && !board[3].equals("X") && !board[4].equals("X") && board[5].equals("X") && !board[6].equals("X") && board[7].equals("X") && !board[8].equals("X") && !board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=9;}
                    //1-4
                    else if  (!board[0].equals("X") && !board[1].equals("X") && !board[2].equals("X") && !board[3].equals("X") && board[4].equals("X") && !board[5].equals("X") && !board[6].equals("X") && !board[7].equals("X") && board[8].equals("X") && board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && !board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=3;}
                    //2
                    else if  (board[0].equals("X") && !board[1].equals("X") && !board[2].equals("X") && !board[3].equals("X") && !board[4].equals("X") && !board[5].equals("X") && !board[6].equals("X") && !board[7].equals("X") && board[8].equals("X") && !board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=2;}
                    //3
                    else if  (!board[0].equals("X") && !board[1].equals("X") && board[2].equals("X") && !board[3].equals("X") && !board[4].equals("X") && !board[5].equals("X") && board[6].equals("X") && !board[7].equals("X") && board[8].equals("X") && !board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=4;}
                    //4
                    else if  (!board[0].equals("X") && !board[1].equals("X") && !board[2].equals("X") && !board[3].equals("X") && !board[4].equals("X") && board[5].equals("X") && !board[6].equals("X") && board[7].equals("X") && board[8].equals("X") && !board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=9;}
                    //new moves
                    else if  (!board[0].equals("X") && board[1].equals("X") && !board[2].equals("X") && board[3].equals("X") && !board[4].equals("X") && !board[5].equals("X") && board[6].equals("X") && !board[7].equals("X") && board[8].equals("X") && board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && board[7].equals("O") && !board[8].equals("O")) {
                        numInput=3;}
                    //new moves
                    else if  (!board[0].equals("X") && !board[1].equals("X") && !board[2].equals("X") && board[3].equals("X") && board[4].equals("X") && !board[5].equals("X") && !board[6].equals("X") && !board[7].equals("X") && board[8].equals("X") && board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && !board[4].equals("O") && board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=3;}
                    //new moves
                    else if  (board[0].equals("X") && !board[1].equals("X") && board[2].equals("X") && board[3].equals("X") && !board[4].equals("X") && !board[5].equals("X") && !board[6].equals("X") && board[7].equals("X") && !board[8].equals("X") && !board[0].equals("O") && board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && board[4].equals("O") && !board[5].equals("O") && board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=6;}
                    //new moves
                    else if  (board[0].equals("X") && board[1].equals("X") && !board[2].equals("X") && !board[3].equals("X") && !board[4].equals("X") && board[5].equals("X") && board[6].equals("X") && !board[7].equals("X") && !board[8].equals("X") && !board[0].equals("O") && !board[1].equals("O") && board[2].equals("O") && board[3].equals("O") && board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=8;}
                    //new moves
                    else if  (!board[0].equals("X") && board[1].equals("X") && board[2].equals("X") && board[3].equals("X") && !board[4].equals("X") && !board[5].equals("X") && !board[6].equals("X") && !board[7].equals("X") && board[8].equals("X") && board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && board[4].equals("O") && board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=7;}
                    //new moves
                    else if  (board[0].equals("X") && !board[1].equals("X") && board[2].equals("X") && !board[3].equals("X") && !board[4].equals("X") && board[5].equals("X") && !board[6].equals("X") && board[7].equals("X") && !board[8].equals("X") && !board[0].equals("O") && board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && board[8].equals("O")) {
                        numInput=4;}
                    //new moves
                    else if  (board[0].equals("X") && !board[1].equals("X") && !board[2].equals("X") && !board[3].equals("X") && !board[4].equals("X") && board[5].equals("X") && !board[6].equals("X") && !board[7].equals("X") && !board[8].equals("X") && !board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=3;}
                    //new moves
                    else if  (board[0].equals("X") && !board[1].equals("X") && !board[2].equals("X") && !board[3].equals("X") && !board[4].equals("X") && !board[5].equals("X") && !board[6].equals("X") && board[7].equals("X") && !board[8].equals("X") && !board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=7;}
                    //new moves
                    else if  (!board[0].equals("X") && !board[1].equals("X") && board[2].equals("X") && board[3].equals("X") && !board[4].equals("X") && !board[5].equals("X") && !board[6].equals("X") && !board[7].equals("X") && !board[8].equals("X") && !board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=1;}
                    //new moves
                    else if  (!board[0].equals("X") && board[1].equals("X") && !board[2].equals("X") && !board[3].equals("X") && !board[4].equals("X") && !board[5].equals("X") && !board[6].equals("X") && !board[7].equals("X") && board[8].equals("X") && !board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=3;}
                    //new moves
                    else if  (!board[0].equals("X") && board[1].equals("X") && !board[2].equals("X") && !board[3].equals("X") && !board[4].equals("X") && !board[5].equals("X") && board[6].equals("X") && !board[7].equals("X") && board[8].equals("X") && !board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && board[7].equals("O") && !board[8].equals("O")) {
                        numInput=4;}
                    //new moves
                    else if  (!board[0].equals("X") && !board[1].equals("X") && !board[2].equals("X") && board[3].equals("X") && !board[4].equals("X") && !board[5].equals("X") && !board[6].equals("X") && !board[7].equals("X") && board[8].equals("X") && !board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=7;}
                    //new moves
                    else if  (!board[0].equals("X") && !board[1].equals("X") && board[2].equals("X") && board[3].equals("X") && !board[4].equals("X") && !board[5].equals("X") && !board[6].equals("X") && board[7].equals("X") && board[8].equals("X") && !board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && board[4].equals("O") && board[5].equals("O") && board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=1;}
                    //new moves
                    else if  (board[0].equals("X") && !board[1].equals("X") && !board[2].equals("X") && !board[3].equals("X") && !board[4].equals("X") && board[5].equals("X") && board[6].equals("X") && !board[7].equals("X") && !board[8].equals("X") && !board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && board[3].equals("O") && board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=2;}
                    //new moves
                    else if  (!board[0].equals("X") && board[1].equals("X") && !board[2].equals("X") && !board[3].equals("X") && board[4].equals("X") && !board[5].equals("X") && board[6].equals("X") && !board[7].equals("X") && board[8].equals("X") && board[0].equals("O") && !board[1].equals("O") && board[2].equals("O") && !board[3].equals("O") && !board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && board[7].equals("O") && !board[8].equals("O")) {
                        numInput=4;}
                    //new moves
                    else if  (!board[0].equals("X") && !board[1].equals("X") && !board[2].equals("X") && !board[3].equals("X") && !board[4].equals("X") && board[5].equals("X") && board[6].equals("X") && !board[7].equals("X") && !board[8].equals("X") && !board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=9;}
                    //new moves
                    else if  (board[0].equals("X") && !board[1].equals("X") && !board[2].equals("X") && !board[3].equals("X") && !board[4].equals("X") && board[5].equals("X") && board[6].equals("X") && board[7].equals("X") && !board[8].equals("X") && !board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && board[3].equals("O") && board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && board[8].equals("O")) {
                        numInput=2;}
                    //new moves
                    else if  (board[0].equals("X") && !board[1].equals("X") && board[2].equals("X") && !board[3].equals("X") && !board[4].equals("X") && !board[5].equals("X") && !board[6].equals("X") && board[7].equals("X") && !board[8].equals("X") && !board[0].equals("O") && board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=4;}
                    //new moves
                    else if  (!board[0].equals("X") && !board[1].equals("X") && !board[2].equals("X") && board[3].equals("X") && !board[4].equals("X") && board[5].equals("X") && !board[6].equals("X") && !board[7].equals("X") && !board[8].equals("X") && !board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=3;}
                    //new moves
                    else if  (!board[0].equals("X") && board[1].equals("X") && !board[2].equals("X") && !board[3].equals("X") && !board[4].equals("X") && !board[5].equals("X") && !board[6].equals("X") && board[7].equals("X") && !board[8].equals("X") && !board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=9;}
                    //new moves
                    else if  (!board[0].equals("X") && !board[1].equals("X") && board[2].equals("X") && !board[3].equals("X") && !board[4].equals("X") && !board[5].equals("X") && board[6].equals("X") && !board[7].equals("X") && !board[8].equals("X") && !board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=8;}
                    //new moves
                    else if  (!board[0].equals("X") && !board[1].equals("X") && board[2].equals("X") && !board[3].equals("X") && !board[4].equals("X") && !board[5].equals("X") && !board[6].equals("X") && board[7].equals("X") && !board[8].equals("X") && !board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=9;}
                    //new moves
                    else if  (!board[0].equals("X") && board[1].equals("X") && !board[2].equals("X") && !board[3].equals("X") && !board[4].equals("X") && !board[5].equals("X") && board[6].equals("X") && !board[7].equals("X") && !board[8].equals("X") && !board[0].equals("O") && !board[1].equals("O") && !board[2].equals("O") && !board[3].equals("O") && board[4].equals("O") && !board[5].equals("O") && !board[6].equals("O") && !board[7].equals("O") && !board[8].equals("O")) {
                        numInput=1;}
                } else {
                    //in = new Scanner(System.in);

                    try {
                        numInput=in.nextInt();} catch (InputMismatchException e) {
                        System.out.println("Input is not INT, please re-enter slot number:");
                        in=new Scanner(System.in);
                        //turn = "X";
                        continue;}
                    catch(NoSuchElementException e)
                    {System.out.println("Exiting the game!");
                        System.exit(0);}

                    if (!(numInput > 0 && numInput <= 9)) {
                        System.out.println("Please enter integer number between 1 and 9, please re-enter slot number:");
                        continue;}

                    if (String.valueOf(numInput).length() != 1) {
                        System.out.println("Please enter 1 digit number only, please re-enter slot number:");
                        continue;
                    }}}
                // This game has two player X and O (Computer).

                //if (turn.equals("O")) {
                if (board[numInput - 1].equals(
                        String.valueOf(numInput))) {
                    board[numInput - 1]=turn;

                    if (turn.equals("X")) {
                        turn="O";
                    } else {
                        turn="X";
                    }
                    printBoard();
                    winner=checkWinner();
                } else {
                    System.out.println("Slot already taken, please re-enter slot number....");}
                //}
                /*in.close();*/}

            // If no one win or lose from both player X and O.
            // then here is the logic to print "draw".
            if (winner.equalsIgnoreCase("draw")) {
                System.out.println("It's a draw! Thanks for playing.");}

            // For winner -to display Congratulations! message.
            else if (winner.equalsIgnoreCase("O")) {
                System.out.println("Computer won! Thanks for playing.");} else if (winner.equalsIgnoreCase("X")) {
                System.out.println("Congratulations! You have won! Thanks for playing.");}
            do
            {
            System.out.println("Want to play again (y/n)? Please enter either \"y\" or \"n\" only (case-insensitive)");
            try {
                in2=new Scanner(System.in);
                again = in2.nextLine();
            } catch(NoSuchElementException e)
            {System.out.println("Exiting the game!");
                System.exit(0);}
            } while (!again.equalsIgnoreCase("y") && !again.equalsIgnoreCase("n"));

        } while (again.equalsIgnoreCase("y"));
        in.close();
        in2.close();}}