package nl.quintor.solitaire.ui;

import nl.quintor.solitaire.Main;
import nl.quintor.solitaire.game.moves.Move;
import nl.quintor.solitaire.game.moves.Quit;
import nl.quintor.solitaire.models.state.GameState;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class MyUI implements UI{
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
    public String refreshAndRequestMove(GameState gameState, Collection<Move> moves, List<String> keys) {
        setMessage("stuff");
        refresh(gameState);
        Scanner input = new Scanner(System.in);
        String playerInput = null;
        if(input.next().equalsIgnoreCase(keys.get(0))){
            //Stop het spel
            playerInput = "Q";
            System.out.print("rip game");
        }else if(!input.next().equalsIgnoreCase(keys.get(0))){
            System.out.print("hmm");
        }
        return playerInput;
    }
}
