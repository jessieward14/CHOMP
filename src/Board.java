public class Board {

    int column1;
    int column2;
    int column3;
   int rows;
   String life;
   int columns;
   //int number;


   public Board(int pcolumn1, int prows, int pcolumn2, int pcolumn3, int pcolumns, String plife){
       column1 = pcolumn1;
       column2 = pcolumn2;
       column3 = pcolumn3;
       rows=prows;
       columns = pcolumns;
       life = plife;

    }
    public void printInfo(){
        System.out.println("This board is board " +column1+column2+column3 + ". The move I would make is " + rows + columns +". This board is a " + life + " board.");
    }

}