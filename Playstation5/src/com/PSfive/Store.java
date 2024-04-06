package com.PSfive;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {

    Scanner sc = new Scanner(System.in);
    String g_name;
    String g_description;
    double g_price;
    String g_releaseDate;
    String g_developer;
    double g_size;

    public Store(String g_name, String g_description, double g_price, String g_releaseDate, String g_developer,
            double g_size) {
        this.g_name = g_name;
        this.g_description = g_description;
        this.g_price = g_price;
        this.g_releaseDate = g_releaseDate;
        this.g_developer = g_developer;
        this.g_size = g_size;
    }

    public Store() {

    }

    static List<Store> actionGames = new ArrayList<>();
    static List<Store> role_playingGames = new ArrayList<>();
    static List<Store> strategyGames = new ArrayList<>();
    static List<Store> adventureGames = new ArrayList<>();
    static List<Store> simulationGames = new ArrayList<>();

    @Override
    public String toString() {

        System.out.println("");
        return g_name + "\nDescription: " + g_description + "\nPrice: Rs." + g_price + "\nRelease Date: "
                + g_releaseDate + "\nDeveloped And Published By: " + g_developer + "\nInstall Size: " + g_size + "GB";
    }

    public void gameStore() {
        for (int i = 0; i < 50; i++) {
            System.out.print("            -");
        }
        System.out.println();
        System.out.println(
                "                                                                                                        GAME STORE");
        for (int i = 0; i < 50; i++) {
            System.out.print("            -");
        }
        System.out.println("");
        System.out.println("Choose the Genre of games you would like:");
        System.out.println("");
        System.out.println("1) Action");
        System.out.println("2) Role-Playing");
        System.out.println("3) Strategy");
        System.out.println("4) Adventure");
        System.out.println("5) Simulation");
        System.out.println("6) Go back to Home Page");

        int n = sc.nextInt();

        switch (n) {
            case 1:
                action();
                actionGame();

                break;
            case 2:
                role();
                rolePlaying();
                break;
            case 3:
                strategy();
                strategyGame();
                break;
            case 4:
                adventure();
                adventureGame();
                break;
            case 5:
                // simulationGame();
                break;
            case 6:
                // homePage();
                break;

            default:
                break;
        }
    }

    public static void actionGame() {
        for (int i = 0; i < 50; i++) {
            System.out.print("            -");
        }
        System.out.println();
        System.out.println(
                "                                                                                                        ACTION GAMES");
        for (int i = 0; i < 50; i++) {
            System.out.print("            -");
        }
        System.out.println("");
        System.out.println(
                "Action Games are fast paced and require quick reflexes, often involving combat or other forms of physical activity.");
        System.out.println("");
        int count = 1;
        for (Store game : actionGames) {
            System.out.println(count++ + ". " + game);
        }

    }

    public static void action() {
        actionGames.add(new Store("NARAKA: BLADEPOINT",
                "Dive into the legends of the Far East in NARAKA: BLADEPOINT",
                1999.0, "21/08/2021", "NetEase Games Global Co., Ltd.", 35.0));
        actionGames.add(new Store("HELLDIVERS 2", "The Galaxy's Last Line of Offence.", 2499.0, "08/02/24",
                "Arrowhead Game Studios", 100.0));

        actionGames.add(new Store("BORDERLANDS 3",
                "The original shooter-looter returns, packing bazillions of guns and a mayhem-fueled adventure! Blast through new worlds and enemies as one of four new Vault Hunters.",
                2990.0, "13/03/20", "Gearbox Software", 75.0));

        actionGames.add(new Store("TEKKEN 8",
                "Get ready for the next chapter in the legendary fighting game franchise, TEKKEN 8.", 4199.0,
                "26/01/24", "Bandai Namco Studios Inc.", 100.0));
        actionGames.add(new Store("DRAGON'S DOGMA 2",
                "Dragon's Dogma 2 is a single player, narrative driven action-RPG that challenges the players to choose their own experience - from the appearance of their Arisen, their vocation, their party, how to approach different situations and more - in a truly immersive fantasy world.",
                4474.0, "22/03/24", "CAPCOM Co., Ltd.", 149.0));

    }

    public static void rolePlaying() {
        for (int i = 0; i < 50; i++) {
            System.out.print("            -");
        }
        System.out.println();
        System.out.println(
                "                                                                                                      ROLE-PLAYING GAMES");
        for (int i = 0; i < 50; i++) {
            System.out.print("            -");
        }
        System.out.println("");
        System.out.println(
                "Role-playing games (RPGs) are interactive storytelling experiences where players embody characters, navigate narratives, and engage in strategic combat or exploration within fictional worlds.");
        System.out.println("");
        int count = 1;
        for (Store game : role_playingGames) {
            System.out.println(count++ + ". " + game);
        }
    }

    public static void role() {
        role_playingGames.add(new Store("THE ELDER SCROLL ONLINE",
                "Join over 22 million players in the award-winning online multiplayer RPG and experience limitless adventure in a persistent Elder Scrolls world. Battle",
                399.0, "04/04/14", "ZeniMax Online Studios", 105));
        role_playingGames.add(new Store("ENSHROUDED",
                "You are Flameborn, last ember of hope of a dying race. Awaken, survive the terror of a corrupting fog, and reclaim the lost beauty of your kingdom.",
                1299.0, "24/01/24", "Keen Games GmbH", 60));
        role_playingGames.add(new Store("ELDEN RING",
                "THE NEW FANTASY ACTION RPG. Rise, Tarnished, and be guided by grace to brandish the power of the Elden Ring and become an Elden Lord in the Lands Between.",
                3599, "25/01/22", "Bandai Namco Entertainment", 60));
        role_playingGames.add(new Store("Summoners War: Chronicles",
                "The King of Rahil is looking for a Summoner to protect the kingdom against Tefo's enormous conspiracy.",
                657, "10/11/22", "Com2uS", 10));
        role_playingGames.add(new Store("PATH OF EXILE",
                "ou are an Exile, struggling to survive on the dark continent of Wraeclast, as you fight to earn power that will allow you to exact your revenge against those who wronged you.",
                2099, "23/10/13", "Grinding Gear Games", 40));
    }

    public static void strategyGame() {
        for (int i = 0; i < 50; i++) {
            System.out.print("            -");
        }
        System.out.println();
        System.out.println(
                "                                                                                                   STRATEGY GAMES");
        for (int i = 0; i < 50; i++) {
            System.out.print("            -");
        }
        System.out.println("");
        System.out.println(
                "Strategy games are video games that challenge players to employ tactical thinking, resource management, and planning to outmaneuver opponents or achieve specific objectives within various settings and scenarios.");
        System.out.println("");
        int count = 1;
        for (Store game : strategyGames) {
            System.out.println(count++ + ". " + game);
        }

    }

    public static void strategy() {
        strategyGames.add(new Store("PLANET ZOO",
                "Build a world for wildlife in Planet Zoo. From the developers of Planet Coaster and Zoo Tycoon comes the ultimate zoo sim.",
                537, "05/11/19", "Frontier Developments", 16));
        strategyGames.add(new Store("DOTA 2",
                "Every day, millions of players worldwide enter battle as one of over a hundred Dota heroes. And no matter if it's their 10th hour of play or 1,000th, there's always something new to discover.",
                0, "09/07/13", "Valve", 60));
        strategyGames.add(new Store("STELLARIS",
                "Explore a galaxy full of wonders in this sci-fi grand strategy game from Paradox Development Studios. Interact with diverse alien races, discover strange new worlds with unexpected events and expand the reach of your empire. Each new adventure holds almost limitless possibilities.",
                2199, "09/05/16", "Paradox Development Studio", 10));
        strategyGames.add(new Store("UNO",
                "UNO makes its return with new exciting features! Match cards by color or value and play action cards to change things up. Race against others to empty your hand before everyone else in Classic play or customize your experience with House Rules.",
                499, "03/01/17", "Ubisoft Entertainment", 3));
        strategyGames.add(new Store("CRUSADER KINGS III",
                "Love, fight, scheme, and claim greatness. Determine your noble house’s legacy in the sprawling grand strategy of Crusader Kings III.",
                2699, "01/08/19", "Paradox Development Studio", 8));

    }

    public static void adventureGame() {
        for (int i = 0; i < 50; i++) {
            System.out.print("            -");
        }
        System.out.println();
        System.out.println(
                "                                                                                                   ADVENTUROUS GAMES");
        for (int i = 0; i < 50; i++) {
            System.out.print("            -");
        }
        System.out.println("");
        System.out.println(
                "Adventurous games are immersive experiences where players embark on thrilling journeys, explore diverse landscapes, encounter unique characters, and unravel mysteries while navigating through captivating storylines and overcoming challenges.");
        int count = 1;
        for (Store games : adventureGames) {
            System.out.println(count++ + ". " + games);
        }

    }

    public static void adventure() {

    }

}