/*
Name: Shriman Selvamani, Hickson Frimpong, Edward Lue, Yash Kolli
Computing ID: ss5qt, haf3md , eyl4qaq, ysk6dw
*/

import java.util.HashSet;

public class Solution {
    public static boolean validTicTacToe(String[] board) {
    	int numWinnersX = 0;
    	int numWinnersO = 0;
    	int numX = 0;
    	int numO = 0;
    	
    	boolean[][] lastmove = new boolean[3][3];
    	for(int i = 0; i<3;i++) {
    		for(int j =0; j<3;j++) {
    			lastmove[i][j]=false;
    		}
    	}
    	
    	String[][] arr = new String[3][3];
    	arr[0][0] = board[0].substring(0,1);
    	arr[0][1] = board[0].substring(1,2);
    	arr[0][2] = board[0].substring(2);
    	arr[1][0] = board[1].substring(0,1);
    	arr[1][1] = board[1].substring(1,2);
    	arr[1][2] = board[1].substring(2);
    	arr[2][0] = board[2].substring(0,1);
    	arr[2][1] = board[2].substring(1,2);
    	arr[2][2] = board[2].substring(2);
    	
    	for(int i = 0; i < arr.length; i++) {
    		for(int j = 0; j < arr[0].length; j++) {
    			if(arr[i][j].equals("X")) {
    				numX++;
    			}
    			if(arr[i][j].equals("O")) {
    				numO++;
    			}
    		}
    	}
    	for(int i = 0; i<3;i++) {
    		if(board[i].charAt(0) == board[i].charAt(1) && board[i].charAt(0)== board[i].charAt(2)&&board[i].charAt(0)!=' ') {
    			if(!(lastmove[i][0] || lastmove[i][1] ||lastmove[i][2])){
    				if(board[i].charAt(0)=='X')
    					numWinnersX++;
    				else
    					numWinnersO++;
    			}
    			lastmove[i][0]=true;
    			lastmove[i][1]=true;
    			lastmove[i][2]=true;
    		}
    	}
    	for(int i = 0; i<3;i++) {
    		if(board[0].charAt(i) == board[1].charAt(i) && board[0].charAt(i)== board[2].charAt(i)&&board[0].charAt(i)!=' ') {
    			if(!(lastmove[0][i] || lastmove[1][i] ||lastmove[2][i])){
    				if(board[0].charAt(i)=='X')
    					numWinnersX++;
    				else
    					numWinnersO++;
    			}
	    		lastmove[0][i]=true;
	    		lastmove[1][i]=true;
	    		lastmove[2][i]=true;
    		}
    	}
    	if(board[0].charAt(0)==board[1].charAt(1)&&board[0].charAt(0)==board[2].charAt(2)&&board[0].charAt(0)!=' ') {
    		if(!(lastmove[0][0] || lastmove[1][1] ||lastmove[2][2])){
				if(board[0].charAt(0)=='X')
					numWinnersX++;
				else
					numWinnersO++;
	    		lastmove[0][0]=true;
	    		lastmove[1][1]=true;
	    		lastmove[2][2]=true;
    		}
    	}
    	if(board[2].charAt(0)==board[1].charAt(1)&&board[2].charAt(0)==board[0].charAt(2)&&board[2].charAt(0)!=' ') {
    		if(!(lastmove[2][0] || lastmove[1][1] ||lastmove[0][2])){
				if(board[2].charAt(0)=='X')
					numWinnersX++;
				else
					numWinnersO++;
	    		lastmove[2][0]=true;
	    		lastmove[1][1]=true;
	    		lastmove[0][2]=true;
    		}
    	}
    	if(numWinnersX+numWinnersO>1)
    		return false;
    	if(numWinnersX==1 && numX!=numO+1)
    		return false;
    	if(numWinnersO==1 && numX!=numO)
    		return false;
    	if(numO>numX)
    		return false;
    	if(numX > numO+1)
    		return false;
    	return true;
    }
    
    public static void main(String args[]) {
    	String[] test = {"XOX", "OOX", "XXO"};
    	String[] test2 = {"X  ","   ","   "};
//    	System.out.println(validTicTacToe(test));
    	System.out.println(validTicTacToe(test2));

    }
}