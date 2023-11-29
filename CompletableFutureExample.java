/**
 * Imagine you are collecting puzzle pieces from different sources (friends) to create a complete puzzle.
 * 
 * 1. Getting the Puzzle Pieces (CompletableFuture.completedFuture):
 *    - You already have one puzzle piece that says "Hello."
 *    - You know your other friend will get a piece in 2 seconds, and it will say "World."
 * 
 * 2. Putting the Puzzle Pieces Together (Chaining CompletableFuture):
 *    - Now, you want to combine these pieces into one big puzzle that says "Hello World."
 * 
 * 3. Waiting for the Puzzle to be Ready (Main thread waiting):
 *    - You decide to wait until the puzzle is complete.
 *    - After waiting, you finally have the complete puzzle, and it says "Hello World."
 */

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
    public static void main(String[] args) {
        // 1. Getting the Puzzle Pieces (CompletableFuture.completedFuture):
        CompletableFuture<String> yourPiece = CompletableFuture.completedFuture("Hello");
        CompletableFuture<String> friend2Piece = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "World";
        });

        // 2. Putting the Puzzle Pieces Together (Chaining CompletableFuture):
        CompletableFuture<String> combinedPuzzle = yourPiece.thenCompose(result1 ->
                friend2Piece.thenApplyAsync(result2 -> result1 + " " + result2)
        );

        // 3. Waiting for the Puzzle to be Ready (Main thread waiting):
        try {
            String result = combinedPuzzle.get();
            System.out.println("Combined Puzzle: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
