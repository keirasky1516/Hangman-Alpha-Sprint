import java.util.Scanner;

public class HangmanAlphaSprint {
    public static void main(String[] args){

    Scanner keyboard=new Scanner(System.in);
    int numberoftries=8;
    String player2;
    String input;
    String secretWord = new String();
    String playerGuess;
    int wrongGuess;
    wrongGuess=numberoftries;
       /* for(int i = 0; i<secretWord.length(); i++) {
        } String a,b,c,d,e,f,g,h,i,j,k,l,m,n,p,q,r,s,t,u,v,w,x,y,z;*/
    System.out.println("Welcome to hangman, would you like to play?");
    keyboard.nextLine();
    System.out.println("Great! Player 1 will guess the word chosen by player 2 in 8 or less guesses. If player one guesses" +
            "the word correctly then they win, but if not player 2 wins.");
    System.out.println("please enter a word player 2");
        secretWord=keyboard.nextLine();
        System.out.println("Thank you! Now player 1 guess a letter");
        playerGuess = keyboard.nextLine();

        System.out.println("Guess is correct: "+ checkLetter(playerGuess,secretWord));

        if(wrongGuess==1);
        System.out.println("Sorry that letter is not found");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");

        System.out.println("7 guesses left. Guess another letter");
        playerGuess=keyboard.nextLine();

         if(wrongGuess==2);
            System.out.println("Sorry that letter is not found");
            System.out.println(" -------------------");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");

            System.out.println("6 guesses left. Guess another letter");
            playerGuess=keyboard.nextLine();

            if(wrongGuess==3);
            System.out.println("Sorry that letter is not found");
            System.out.println(" -------------------");
            System.out.println(" |                 (   )   ");
            System.out.println(" |               (       )  ");
            System.out.println(" |                 (   )    ");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");

            System.out.println("5 guesses left. Try again");
            playerGuess=keyboard.nextLine();

            if(wrongGuess==4);
        System.out.println("Sorry that letter is not found");
        System.out.println(" -------------------");
        System.out.println(" |                 (   )   ");
        System.out.println(" |               (       )  ");
        System.out.println(" |                 (   )    ");
        System.out.println(" |                   |       ");
        System.out.println(" |                   |       ");
        System.out.println(" |                   |        ");
        System.out.println(" |                   |        ");
        System.out.println(" |                   |        ");
        System.out.println(" |                   |        ");
        System.out.println(" |                           ");
        System.out.println(" |                           ");

        System.out.println("4 guesses left. Try again");
        playerGuess=keyboard.nextLine();

        if(wrongGuess==5);
        System.out.println("Sorry that letter is not found");
        System.out.println(" -------------------");
        System.out.println(" |                 (   )   ");
        System.out.println(" |               (       )  ");
        System.out.println(" |                 (   )    ");
        System.out.println(" |                   |       ");
        System.out.println(" |                   |       ");
        System.out.println(" |                   |         ");
        System.out.println(" |                   |       ");
        System.out.println(" |                   |        ");
        System.out.println(" |                   |        ");
        System.out.println(" |                  (       ");
        System.out.println(" |                 (          ");

        System.out.println("3 guesses left. Try again");
        playerGuess=keyboard.nextLine();

        if(wrongGuess==6);
        System.out.println("Sorry that letter is not found");
        System.out.println(" -------------------");
        System.out.println(" |                 (   )   ");
        System.out.println(" |               (       )  ");
        System.out.println(" |                 (   )    ");
        System.out.println(" |                   |       ");
        System.out.println(" |                   |       ");
        System.out.println(" |                   |         ");
        System.out.println(" |                   |       ");
        System.out.println(" |                   |        ");
        System.out.println(" |                   |        ");
        System.out.println(" |                  ( )      ");
        System.out.println(" |                 (   )       ");

        System.out.println("2 guesses left. Try again");
        playerGuess=keyboard.nextLine();

        if(wrongGuess==7);
        System.out.println("Sorry that letter is not found");
        System.out.println(" -------------------");
        System.out.println(" |                 (   )   ");
        System.out.println(" |               (       )  ");
        System.out.println(" |                 (   )    ");
        System.out.println(" |                   |       ");
        System.out.println(" |                   |       ");
        System.out.println(" |                  (|         ");
        System.out.println(" |                (  |       ");
        System.out.println(" |              (    |        ");
        System.out.println(" |                   |        ");
        System.out.println(" |                  ( )      ");
        System.out.println(" |                 (   )       ");

        System.out.println("1 guess left. Try again");
        playerGuess=keyboard.nextLine();

        if(wrongGuess==8);
        System.out.println("Sorry that letter is not found");
        System.out.println(" -------------------");
        System.out.println(" |                 (   )   ");
        System.out.println(" |               (       )  ");
        System.out.println(" |                 (   )    ");
        System.out.println(" |                   |       ");
        System.out.println(" |                   |       ");
        System.out.println(" |                  (|)         ");
        System.out.println(" |                (  |  )     ");
        System.out.println(" |              (    |    )    ");
        System.out.println(" |                   |        ");
        System.out.println(" |                  ( )      ");
        System.out.println(" |                 (   )       ");

        System.out.println("Game over. Player 2 wins.");





        }
        public static boolean checkLetter(String letter, String secretWord){

        if(secretWord.contains(letter)){
            return true;
        }
        return false;
}

}
