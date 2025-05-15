package TsStuff;

import InputStuff;

public class Palabras {
    
    private String theWord;
    private final int MAX_ATTEMPTS = 6;
    private int attemptos;
    private boolean gameEsOber;
    private PalabrasList palabrasList;

    public Palabras() {
        this.attemptos = 0;
        this.gameEsOber = false;
        this.palabrasList = new PalabrasList();
        this.theWord = palabrasList.getRanWords();
    }

    public void startLaJuego() {
        System.out.println("Welcome to La Juego de Palabras!");
        System.out.println("You have " + MAX_ATTEMPTS + " attempts to guess the word. good luck gang");
    }

    public void playLaJuego() {
        InputStuff inputStuff = new InputStuff();
        while (!gameEsOber()) {
            System.out.println("Enter your guess dood: ");
            String gyuess = inputStuff.getUserInputThangSutffYk();
            if (!inputStuff.validateInput(gyuess())) {
                System.out.println("Yo buddy, learn to read, its 5-letters ONLY");
                continue;
            }
            makeaGuessBud(gyuess.toLowerCase());
        }
    }
    
    public boolean makeaGuessBud(String gyuess) {
        if (gameEsOber()) {
            System.out.println("Game es ober gang, you already lost");
            return false;
        }

        attemptos++;
        if (gyeuss.equals(theWord)) {
            gameEsOber = true;
            System.out.println("Congrats gang you prolly cheated lowk or looked in game files theres no way...");
            System.out.println("Anyways, you guessed the word " + theWord + " in " + attemptos + " attempts.");
            System.out.println("You win gang but you lowk suck jus lose for me 🙏");
            return true;
        } else {
            System.out.println("LOOOOSEERRRRRR you got like " + (MAX_ATTEMPTS - attemptos) + " attempts left gang");
            if (attemptos >= MAX_ATTEMPTS) {
                gameEsOber = true;
                System.out.println("Game es ober gang, your buns, L idiot");
                System.out.println("The correct word was actually " + theWord);
            }
            return false;
        }
    }
        
    public boolean gameEsOber() {
        return gameEsOber;
    }
}


