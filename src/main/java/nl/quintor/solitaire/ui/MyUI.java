package nl.quintor.solitaire.ui;

import nl.quintor.solitaire.Main;
import nl.quintor.solitaire.game.moves.Move;
import nl.quintor.solitaire.game.moves.Quit;
import nl.quintor.solitaire.models.state.GameState;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class MyUI implements UI{
    public static void readInput(List keys){
        Scanner input = new Scanner(System.in);
        if(input.next() == keys.get(0)){//if input ==
            //Stop het spel
            System.out.println("rip game");
        }else if(input.next() != keys.get(0)){
            System.out.print("hmm");
        }
    }
    @Override
    public void setMessage(String message) {
    System.out.print("\r");
    System.out.print(message);
    }

    @Override
    public void setErrorMessage(String message) {
    System.out.print("\r");
    System.out.print(message);
    }

    @Override
    public void refresh(GameState gameState) {
    System.out.print("\r");
    System.out.print(gameState);
    }

    @Override
    public String refreshAndRequestMove(GameState gameState, Collection<Move> moves) {
    gameState.getMoves();
    return moves.toString();
    }
}
