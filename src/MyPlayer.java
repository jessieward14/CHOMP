import java.awt.*;
import java.sql.ResultSet;

public class MyPlayer {
    public Chip[][] gameBoard;
    public String board;
    public int[] columns;

    public MyPlayer() {
        columns = new int[10];


        for(int a=1; a<4;a++){
            for(int b=0;b<4;b++){
                for(int c=0;c<4;c++){
                    if(a>=b && b>=c){
                        System.out.println("Board");
                        System.out.println(a + " "+b +" " + c);
                        System.out.println("resulting boards");
                        for(int p=2;p>-1; p--){

                            System.out.println(a + " "+b +" " + p);

                        }
                        for(int p=2;p>-1; p--){
                            if(c>p){
                                c=p;

                            }
                            if(p>a){
                                p=a;
                            }

                            System.out.println(a + " "+p +" " + c);



                        }
                        for(int p=2;p>-1;p--){

                        }

                    }
                   // System.out.println(a + " "+b +" " + c);
                }
            }
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

    public Point move(Chip[][] pBoard) {

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
