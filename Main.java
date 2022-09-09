public class Main {

    public static void main(String[] args) {

        //array declaration
        char[][] chart = new char[4][13];

        //method call
        //need to store the array returned into the char array declared
        chart = make_forward();

        //need to display the 2d array
        //going to use for loops
        //for(int x; x < value; x++)
        //starting at int x, while x is less than the value, increment x
        //++ means add one
        //since we have a 2d array, need to do a nested for loop
        //nested for loop is a loop inside of a loop
        for(int row = 0; row < 4; row++){
            for(int column = 0; column < 13; column++ ){

                //display what is at the specific row and column
                System.out.print(chart[row][column]);
            }
            System.out.println();
        }
        //stores the return of the mirrored array
        char[][] mirror = new char[4][13];

        mirror = make_mirror(chart);

        for(int row = 0; row < 4; row++) {
            for (int column = 0; column < 13; column++) {

                //display what is at the specific row and column
                System.out.print(mirror[row][column]);
            }
            System.out.println();
        }
        //displays collision
        for(int row = 0; row < 4; row++) {
            //displays original
            for (int column = 0; column < 13; column++) {

                System.out.print(chart[row][column]);
            }
            //display mirrored
            for (int column = 0; column < 13; column++) {

                System.out.print(mirror[row][column]);
            }
            System.out.println();
        }
    }

    //need to make a new method that will return a mirrored version of a
    //given array
    public static char[][] make_mirror(char[][] chart){
        char[][] mirror = new char[4][13];

        for(int row = 0; row <4; row++){

            int count = 0;
            for(int column = 12; column >= 0; column--) {
                mirror[row][count]=chart[row][column];

                if(mirror[row][count] == '('){
                    mirror[row][count] = ')';
                }
                else if(mirror[row][count] == ')'){
                    mirror[row][count] = '(';
                }
                else if(mirror[row][count] == '/'){
                    mirror[row][count] = '\\';
                }
                else if(mirror[row][count] == '\\'){
                    mirror[row][count] = '/';
                }
                count++;
            }
        }
        return mirror;
    }

    public static char[][] make_forward()
    {
        //array[row][column]
        char[][] pixel = new char[4][13];
        pixel[0][0]=' ';
        pixel[0][1]=' ';
        pixel[0][2]='_';
        pixel[0][3]='_';
        pixel[0][4]='_';
        pixel[0][5]='_';
        pixel[0][6]='_';
        pixel[0][7]='_';
        pixel[0][8]=' ';
        pixel[0][9]=' ';
        pixel[0][10]=' ';
        pixel[0][11]=' ';
        pixel[0][12]=' ';
        pixel[1][0]=' ';
        pixel[1][1]='/';
        pixel[1][2]='|';
        pixel[1][3]='_';
        pixel[1][4]='|';
        pixel[1][5]='|';
        pixel[1][6]='_';
        pixel[1][7]='\\';
        pixel[1][8]='\'';
        pixel[1][9]='.';
        pixel[1][10]='_';
        pixel[1][11]='_';
        pixel[1][12]=' ';
        pixel[2][0]='(';
        pixel[2][1]=' ';
        pixel[2][2]=' ';
        pixel[2][3]=' ';
        pixel[2][4]='_';
        pixel[2][5]=' ';
        pixel[2][6]=' ';
        pixel[2][7]=' ';
        pixel[2][8]=' ';
        pixel[2][9]='_';
        pixel[2][10]=' ';
        pixel[2][11]='_';
        pixel[2][12]='\\';
        pixel[3][0]='=';
        pixel[3][1]='\'';
        pixel[3][2]='-';
        pixel[3][3]='(';
        pixel[3][4]='_';
        pixel[3][5]=')';
        pixel[3][6]='-';
        pixel[3][7]='-';
        pixel[3][8]='(';
        pixel[3][9]='_';
        pixel[3][10]=')';
        pixel[3][11]='-';
        pixel[3][12]='\'';
        return pixel;
    }
}
