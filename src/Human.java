/**
 * 
 * @author vijai
 *
 */
import java.util.Scanner;

public class Human extends Player{

public Human(){
}



public void takeTurn(String[][] board) {

    Scanner s = new Scanner(System.in);

    boolean turn = true;

    while(turn){
        System.out.println("please enter row");
        int row = s.nextInt();
        System.out.println("please enter col");
        int col = s.nextInt();
        System.out.print("you entered "+row+" "+col);
        System.out.println();
        if(board[row - 1][col - 1] != "x" && board[row - 1][col - 1] != "o"){
            board[row - 1][col - 1] = idMark;
            turn = false;
        } 
        else {
            System.out.println("Already Marker here! please try again!");
        }
    }
} 

} 