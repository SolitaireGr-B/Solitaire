package nl.quintor.solitaire.ui;

import nl.quintor.solitaire.game.moves.Move;
import nl.quintor.solitaire.game.moves.Quit;
import nl.quintor.solitaire.models.state.GameState;

import java.util.Collection;
import java.util.Scanner;

public class MyUI implements UI{
    public static void readInput(){
        Scanner input = new Scanner(System.in);
        if(input.next() == "q"){
            new Quit();
        }
    }
    @Override
    public void setMessage(String message) {
    System.out.println(message);
    }

    @Override
    public void setErrorMessage(String message) {
    System.out.print(message);
    }

    @Override
    public void refresh(GameState gameState) {
    System.out.print(gameState);
    }

    @Override
    public String refreshAndRequestMove(GameState gameState, Collection<Move> moves) {
        gameState.getMoves();
        return moves.toString();
    }
}
