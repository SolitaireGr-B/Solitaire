package nl.quintor.solitaire.ui;

import nl.quintor.solitaire.game.moves.Move;
import nl.quintor.solitaire.models.state.GameState;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

/**
 * The basic UI interface, which can be used to implement a suitable UI using any technology.
 */
public interface UI{
    private static void clrscr(){
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                System.out.print("\033\143");
        } catch (IOException | InterruptedException ex) {
            throw new RuntimeException("Screen clearing error");
        }
    }
    /**
     * Set a message to show the player the next time {@link #refresh(GameState)} is called. This message
     * should be shown as a non-error message.
     *
     * @param message message to show the player
     */
    void setMessage(String message);

    /**
     * Set an error message to show the player the next time {@link #refresh(GameState)} is called. This
     * message should be shown as an error.
     *
     * @param message error message to show the player
     */
    void setErrorMessage(String message);

    /**
     * Signals to the UI implementation that the game state has changed. The UI may or may not refresh more often.
     *
     * @param gameState the game state to be visualized by the UI
     */
    void refresh(GameState gameState);

    /**
     * Signals to the UI implementation that the game state has changed, and that player input is expected. The UI may
     * or may not refresh more often.
     *
     * @param gameState the game state to be visualized by the UI
     * @param moves the moves that are possible in this game state
     * @param keys
     * @return String representation of the player request
     */
    String refreshAndRequestMove(GameState gameState, Collection<Move> moves, List<String> keys);
}