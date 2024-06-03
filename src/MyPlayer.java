import java.awt.*;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MyPlayer {
    public Chip[][] gameBoard;
    public String board;
    public int[] columns;
    public ArrayList<Board> boards = new ArrayList<Board>();
    public ArrayList<Board> deathboards = new ArrayList<Board>();
    Board a100 = new Board(1, 0, 0, 0, 0, "death");


    public MyPlayer() {
        columns = new int[10];
        deathboards.add(a100);

        System.out.println(boards);


        for (int a = 1; a < 4; a++) {
            for (int b = 0; b < 4; b++) {
                for (int c = 0; c < 4; c++) {
                    if (a >= b && b >= c) {
                        int A = a;
                        int B = b;
                        int C = c;
                        System.out.println("Board");
                        System.out.println(a + " " + b + " " + c);
                        Board boards1 = new Board(a, 0, b, c, 0, "");
                        boards.add(boards1);
                        System.out.println("resulting boards");
                        for (int p = C - 1; p > -1; p--) {

                            System.out.println(A + " " + B + " " + p);
                            for (int x = 0; x < deathboards.size(); x++) {
                                if (A == deathboards.get(x).column1 && B == deathboards.get(x).column2 && p == deathboards.get(x).column3) {
                                    System.out.println("Death Board Found");
                                    boards1.life = "life";

                                    //ABp is deathboard - abc equals current board
                                    if (a - A > 0) {
                                        boards1.columns = 0;
                                        boards1.rows = A;
                                    } else {
                                        if (b - B > 0) {
                                            boards1.columns = 1;
                                            boards1.rows = B;
                                        } else {
                                            if (c - p > 0) {
                                                boards1.columns = 2;
                                                boards1.rows = p;
                                            }
                                        }
                                    }
                                }
                            }

                        }
                        for (int p = B - 1; p > -1; p--) {
                            if (C > p) {
                                C = p;

                            }
//                            if(p>a){
//                                p=a;
//                            }

                            System.out.println(A + " " + p + " " + C);
                            for (int x = 0; x < deathboards.size(); x++) {
                                if (A == deathboards.get(x).column1 && p == deathboards.get(x).column2 && C == deathboards.get(x).column3) {
                                    System.out.println("Death Board Found");
                                    boards1.life = "life";
                                    //ApC is deathboard - abc equals current board

                                    if (a - A > 0) {
                                        boards1.columns = 0;
                                        boards1.rows = A;
                                    } else {
                                        if (b - p > 0) {
                                            boards1.columns = 1;
                                            boards1.rows = p;
                                        } else {
                                            if (c - C > 0) {
                                                boards1.columns = 2;
                                                boards1.rows = C;
                                            }
                                        }
                                    }
                                }
                            }


                        }
                        C = c;
                        B = b;
                        for (int p = A - 1; p > -1; p--) {
                            if (B > p) {
                                B = p;

                            }
                            if (C > p) {
                                C = p;
                            }
                            System.out.println(p + " " + B + " " + C);

                            for (int x = 0; x < deathboards.size(); x++) {
                                if (p == deathboards.get(x).column1 && B == deathboards.get(x).column2 && C == deathboards.get(x).column3) {
                                    System.out.println("Death Board Found");
                                    boards1.life = "life";
                                    //pBC is deathboard - abc equals current board
                                    if (a - p > 0) {
                                        boards1.columns = 0;
                                        boards1.rows = p;
                                    } else {
                                        if (b - B > 0) {
                                            boards1.columns = 1;
                                            boards1.rows = B;
                                        } else {
                                            if (c - C > 0) {
                                                boards1.columns = 2;
                                                boards1.rows = C;
                                            }
                                        }
                                    }
                                }
                            }

                        }

                        /*if (A = 1) {
                            if (B = 0) {
                                if (C = 0) {
                                    System.out.println("Death Board");
                                }
                            }
                        }*/
                        if (boards1.life.equals("")) {
                            boards1.life = "death";
                            deathboards.add(boards1);
                            if (c > 0) {
                                boards1.columns = 2;
                                boards1.rows = c - 1;
                            } else {
                                if (b > 0) {
                                    boards1.columns = 1;
                                    boards1.rows = b - 1;
                                } else {
                                    if (a > 0) {
                                        boards1.columns = 0;
                                        boards1.rows = a - 1;
                                    }
                                }

                            }


                        }
                        // System.out.println(a + " "+b +" " + c);
                    }
                }
            }
        }

            for (int x = 0; x < boards.size(); x++) {
                boards.get(x).printInfo();
            }


//        for(int x=1;x<=19;x++){
//            if(x = 1,1,1 && x=x-1){
//                ResultSet 1,1,0; 1,0,0;
//
//            }
//            if(x=2,2,2 && x = x-1){
//                ResultSet 2,2,1; 2,2,0; 1,1,1;2,1,1;
//            }
//
//
//        }
            /***
             * This code will run just once, when the game opens.
             * Add your code here.
             */
        }

        public Point move (Chip[][]pBoard){

            System.out.println("MyPlayer Move");
            // System.out.println("MyPlayer Move");
            gameBoard = pBoard;
            int column = 0;
            int row = 0;

            row = 1;
            column = 1;

            /***
             * This code will run each time the "MyPlayer" button is pressed.
             * Add your code to return the row and the column of the chip you want to take.
             * You'll be returning a data type called Point which consists of two integers.
             */

            Point myMove = new Point(row, column);
            return myMove;
        }

    }
