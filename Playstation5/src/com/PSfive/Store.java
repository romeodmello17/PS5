package com.PSfive;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store implements PaymentMethod {
    PSregistration psregistration = new PSregistration();

    static Store store = new Store();
    // Homepage homepage = new Homepage();

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

    static List<Store> cart = new ArrayList<>();
    static List<Store> library = new ArrayList<>();
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

    public void gameStore() throws Exception {
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
                simulation();
                simulationGame();
                break;
            case 6:
                Homepage hp = new Homepage();
                hp.displayHomePage();
                break;

            default:
                System.err.println("Invalid Option! Try Again.");
                gameStore();
                break;
        }
    }

    public void displayCartOption() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter 1 to Display Cart");
        System.out.println("Enter 2 to Go back");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                displayCart();
                break;
            case 2:
                gameStore();
            default:
                System.err.println("Invalid Option! Try Again.");
                displayCartOption();
                break;
        }
    }

    public void displayCart() throws Exception {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 50; i++) {
            System.out.print("            -");
        }
        System.out.println();
        System.out.println(
                "                                                                                                       YOUR CART");
        for (int i = 0; i < 50; i++) {
            System.out.print("            -");
        }
        System.out.println("");
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
            gameStore();
        } else {
            System.out.println("Your cart contains the following games:");
            int index = 1;
            for (Store game : cart) {
                System.out.println(index + ". " + game.g_name + " " + game.g_price);
                index++;
            }

        }
        double total = 0;
        for (Store t : Store.cart) {
            total += t.g_price;
        }
        System.out.println("Total Amount : Rs." + total);

        System.out.println("");
        System.out.println("Enter 1 for Proceed to Payment");
        System.out.println("Enter 2 to Go Back");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                payment();
                break;
            case 2:
                gameStore();
                break;
            default:
                System.err.println("Invalid Option! Try Again.");
                displayCart();
                break;
        }

    }

    public void creditCardPayment() {

    }

    public void payPalPayment() {

    }

    public void upiPayment() {

    }

    public void payment() throws Exception {
        PaymentMethod credit = new Payments();
        PaymentMethod paypal = new Payments();
        PaymentMethod upi = new Payments();

        for (int i = 0; i < 50; i++) {
            System.out.print("            -");
        }
        System.out.println();
        System.out.println(
                "                                                                                                  PAYMENT OPTIONS      ");
        for (int i = 0; i < 50; i++) {
            System.out.print("            -");
        }
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter 1 for Credit Card Payment");
        System.out.println("Enter 2 for PayPal");
        System.out.println("Enter 3 for UPI");
        System.out.println("Enter 4 to go to cart");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                credit.creditCardPayment();
                break;
            case 2:
                paypal.payPalPayment();
                break;
            case 3:
                upi.upiPayment();
                break;
            case 4:
                displayCart();
                break;
            default:
                System.err.println("Invalid Option! Try Again.");
                payment();
                break;
        }
    }

    public void afterPayment() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter 1 to Go to Your Library");
        System.out.println("Enter 2 to Go to Game Store");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                myLibrary();
                break;
            case 2:
                gameStore();
                break;
            default:
                System.err.println("Invalid Option! Try Again.");
                afterPayment();
                break;
        }

    }

    public void addLibrary() {
        Store.library.addAll(Store.cart);
        Store.cart.clear();
    }

    public void myLibrary() throws Exception {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 50; i++) {
            System.out.print("            -");
        }
        System.out.println();
        System.out.println(
                "                                                                                                  YOUR GAMES      ");
        for (int i = 0; i < 50; i++) {
            System.out.print("            -");
        }
        System.out.println("");

        if (Store.library.isEmpty()) {
            System.out.println("");
            System.out.println("Your Library is empty.");
            System.out.println("Add some Games to your Library.");
            System.out.println("");
            store.gameStore();
        } else {
            System.out.println("Your Library contains the following games:");
            int index = 1;
            for (Store game : Store.library) {
                System.out.println(index + ". " + game.g_name);
                index++;
            }

        }
        System.out.println("");
        System.out.println("Enter 1 for Game Store");
        System.out.println("Enter 2 to Exit");
        int choice = sc.nextInt();
        if (choice == 1) {
            store.gameStore();
        } else if (choice == 2) {
            System.out.println("PS5 Exiting....");
            Thread.sleep(1000);
            System.exit(0);
        }else{
            System.out.println("Enter Above Option Only");
            myLibrary();
        }
    }

    /*******************************
     * Methods for Games (Genres)
     * 
     *******************************/
    // --------------------------------------------------------------------Action

    public static void actionGame() throws Exception {
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
        store.actionCartOption();
    }

    public void actionCart() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of games you want to add to cart (separated by spaces):");
        String input = sc.nextLine();
        String[] gameNumbers = input.split(" ");
        for (String gameNumber : gameNumbers) {
            try {
                int index = Integer.parseInt(gameNumber);
                if (index > 0 && index <= actionGames.size()) {
                    Store gameToAdd = actionGames.get(index - 1);
                    cart.add(gameToAdd);
                    System.out.println(gameToAdd.g_name + " added to cart.");
                } else {
                    System.out.println("Invalid game index: " + index);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + gameNumber);
            }
        }
        store.displayCartOption();
    }

    public void actionCartOption() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter 1 to Cart");
        System.out.println("Enter 2 to Go back");
        int input = sc.nextInt();
        sc.nextLine();
        switch (input) {
            case 1:
                if (psregistration.isRegistered == true) {
                    action();
                    actionCart();
                } else {
                    System.out.println("Please Sign Up to Proceed");
                    psregistration.signIn();
                    action();
                    actionGame();

                }
                break;
            case 2:
                gameStore();
            default:
                System.err.println("Invalid Option! Try Again.");
                actionCartOption();
                break;
        }
    }

    public void action() {
        actionGames.clear();

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

    // ---------------------------------------------------------------------Role-Playing

    public static void rolePlaying() throws Exception {
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
        store.roleCartOption();
    }

    public void rolePlayingCart() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of games you want to add to cart (separated by spaces):");
        String input = sc.nextLine();
        String[] gameNumbers = input.split(" ");
        for (String gameNumber : gameNumbers) {
            try {
                int index = Integer.parseInt(gameNumber);
                if (index > 0 && index <= role_playingGames.size()) {
                    Store gameToAdd = role_playingGames.get(index - 1);
                    cart.add(gameToAdd);
                    System.out.println(gameToAdd.g_name + " added to cart.");
                } else {
                    System.out.println("Invalid game index: " + index);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + gameNumber);
            }
        }
        store.displayCartOption();
    }

    public void roleCartOption() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter 1 to Cart");
        System.out.println("Enter 2 to Go back");
        int input = sc.nextInt();
        sc.nextLine();
        switch (input) {
            case 1:
                if (psregistration.isRegistered == true) {
                    role();
                    rolePlayingCart();
                } else {
                    System.out.println("Please Sign Up to Proceed");
                    psregistration.signIn();
                    role();
                    rolePlaying();
                }

                break;
            case 2:
                gameStore();
            default:
                System.err.println("Invalid Option! Try Again.");
                roleCartOption();
                break;
        }
    }

    public static void role() {
        role_playingGames.clear();

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

    // ---------------------------------------------------------------Strategy Games

    public static void strategyGame() throws Exception {
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
        store.strategyCartOption();

    }

    public void strategyCart() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of games you want to add to cart (separated by spaces):");
        String input = sc.nextLine();
        String[] gameNumbers = input.split(" ");
        for (String gameNumber : gameNumbers) {
            try {
                int index = Integer.parseInt(gameNumber);
                if (index > 0 && index <= strategyGames.size()) {
                    Store gameToAdd = strategyGames.get(index - 1);
                    cart.add(gameToAdd);
                    System.out.println(gameToAdd.g_name + " added to cart.");
                } else {
                    System.out.println("Invalid game index: " + index);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + gameNumber);
            }
        }
        store.displayCartOption();
    }

    public void strategyCartOption() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter 1 to Cart");
        System.out.println("Enter 2 to Go back");
        int input = sc.nextInt();
        sc.nextLine();
        switch (input) {
            case 1:
                if (psregistration.isRegistered == true) {

                    strategy();
                    strategyCart();
                } else {
                    System.out.println("Please Sign Up to Proceed");
                    psregistration.signIn();
                    strategy();
                    strategyGame();
                }
                break;
            case 2:
                gameStore();
            default:
                System.err.println("Invalid Option! Try Again.");
                strategyCartOption();
                break;
        }
    }

    public static void strategy() {

        strategyGames.clear();

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
                "Love, fight, scheme, and claim greatness. Determine your noble house's legacy in the sprawling grand strategy of Crusader Kings III.",
                2699, "01/08/19", "Paradox Development Studio", 8));

    }

    // --------------------------------------------------------------------------Adventure

    public static void adventureGame() throws Exception {
        Scanner sc = new Scanner(System.in);
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
        System.out.println("");
        int count = 1;
        for (Store games : adventureGames) {
            System.out.println(count++ + ". " + games);
        }

        store.adventureCartOption();
    }

    public void adventureCart() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of games you want to add to cart (separated by spaces):");
        String input = sc.nextLine();
        String[] gameNumbers = input.split(" ");
        for (String gameNumber : gameNumbers) {
            try {
                int index = Integer.parseInt(gameNumber);
                if (index > 0 && index <= adventureGames.size()) {
                    Store gameToAdd = adventureGames.get(index - 1);
                    cart.add(gameToAdd);
                    System.out.println(gameToAdd.g_name + " added to cart.");
                } else {
                    System.out.println("Invalid game index: " + index);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + gameNumber);
            }
        }
        store.displayCartOption();
    }

    public void adventureCartOption() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter 1 to Cart");
        System.out.println("Enter 2 to Go back");
        int input = sc.nextInt();
        sc.nextLine();
        switch (input) {
            case 1:
                if (psregistration.isRegistered == true) {
                    adventure();
                    adventureCart();
                } else {
                    System.out.println("Please Sign Up to Proceed");
                    psregistration.signIn();
                    adventure();
                    adventureGame();
                }
                break;
            case 2:
                gameStore();
            default:
                System.err.println("Invalid Option! Try Again.");
                adventureCartOption();
                break;
        }
    }

    public static void adventure() {
        adventureGames.clear();

        adventureGames.add(new Store("BALDUR'S GATE 3",
                "Baldur's Gate 3 is a story-rich, party-based RPG set in the universe of Dungeons & Dragons, where your choices shape a tale of fellowship and betrayal, survival and sacrifice, and the lure of absolute power.",
                2999, "03/08/23", "Larian Studios", 150));
        adventureGames.add(new Store("LETHAL COMPANY",
                "A co-op horror about scavenging at abandoned moons to sell scrap to the Company.", 480, "24/10/23",
                "Zeekerss", 1));
        adventureGames.add(new Store("STREET FIGHTER 6",
                "Here comes Capcom's newest challenger! Street Fighter™ 6 launches worldwide on June 2nd, 2023 and represents the next evolution of the Street Fighter series! Street Fighter 6 spans three distinct game modes, including World Tour, Fighting Ground and Battle Hub.",
                3999, "01/01/23", "CAPCOM Co., Ltd.", 60));
        adventureGames.add(new Store("CONTENT WARNING",
                "Film your friends doing scary things to become SpöökTube famous! (strongly advised to not go alone)",
                400, "01/04/24", "Landfall Publishing", 6));
        adventureGames.add(new Store("TOM CLANCY'S THE DIVISION 2",
                "HISTORY WILL REMEMBER In Tom Clancy's The Division 2, the fate of the free world is on the line. Lead a team of elite agents into a post-pandemic Washington DC to restore order and prevent the collapse of the city.",
                1499, "12/01/23", "Ubisoft", 77));

    }

    // ------------------------------------------------------------------------------Simulation

    public static void simulationGame() throws Exception {
        for (int i = 0; i < 50; i++) {
            System.out.print("            -");
        }
        System.out.println();
        System.out.println(
                "                                                                                                   SIMULATION GAMES");
        for (int i = 0; i < 50; i++) {
            System.out.print("            -");
        }
        System.out.println("");
        System.out.println(
                "Simulation games provide immersive experiences where players can simulate various real-world or fantastical activities, environments, or scenarios, allowing them to engage in realistic or imaginative simulations of life, business, nature, or other aspects, often emphasizing strategy, creativity, and decision-making.");
        System.out.println("");
        int count = 1;
        for (Store games : simulationGames) {
            System.out.println(count++ + ". " + games);
        }
        store.simulationCartOption();
    }

    public void simulationCart() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of games you want to add to cart (separated by spaces):");
        String input = sc.nextLine();
        String[] gameNumbers = input.split(" ");
        for (String gameNumber : gameNumbers) {
            try {
                int index = Integer.parseInt(gameNumber);
                if (index > 0 && index <= simulationGames.size()) {
                    Store gameToAdd = simulationGames.get(index - 1);
                    cart.add(gameToAdd);
                    System.out.println(gameToAdd.g_name + " added to cart.");
                } else {
                    System.out.println("Invalid game index: " + index);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + gameNumber);
            }
        }
        store.displayCartOption();
    }

    public void simulationCartOption() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter 1 to Cart");
        System.out.println("Enter 2 to Go back");
        int input = sc.nextInt();
        sc.nextLine();
        switch (input) {
            case 1:
            if(psregistration.isRegistered==true){
                simulation();
                simulationCart();
            } else {
                System.out.println("Please Sign Up to Proceed");
                psregistration.signIn();
                simulation();
                simulationGame();
            }
                break;
            case 2:
                gameStore();
            default:
                System.err.println("Invalid Option! Try Again.");
                simulationCartOption();
                break;
        }
    }

    public static void simulation() {

        simulationGames.clear();

        simulationGames.add(new Store("ARMA 3",
                "Experience true combat gameplay in a massive military sandbox. Deploying a wide variety of single- and multiplayer content, over 20 vehicles and 40 weapons, and limitless opportunities for content creation, this is the PC's premier military game.",
                1999, "12/09/12", "Bohemia Interactive", 70));
        simulationGames.add(new Store("WAR THUNDER",
                "War Thunder is the most comprehensive free-to-play, cross-platform, MMO military game dedicated to aviation, armoured vehicles, and naval craft, from the early 20th century to the most advanced modern combat units.",
                0, "12/08/13", "Gaijin Entertainment", 95));
        simulationGames.add(new Store("NBA 2K24",
                "Experience hoops culture in NBA 2K24. Enjoy loads of action and limitless personalized MyPLAYER options in MyCAREER. Build your perfect lineup in MyTEAM.",
                3299, "07/09/23", "Visula Concepts 2K", 150));
        simulationGames.add(new Store("SUPERMARKET SIMULATOR",
                "Run your own supermarket. Stock shelves, set prices as you'd like, take payments, hire staff, expand and design your store. Online orders & delivery, shoplifters, security, local market are upcoming.",
                610, "20/02/24", "Nokta Games", 5));
        simulationGames.add(new Store("THE SIMS 4",
                "Play with life and discover the possibilities. Unleash your imagination and create a world of Sims that's wholly unique. Explore and customize every detail from Sims to homes-and much more.",
                0, "02/09/14", "Maxis Arts", 51));

    }

}

// System.out.println("");
// Scanner sc = new Scanner(System.in);
// System.out.println("1) Add Games to cart");
// System.out.println("2) Go Back");
// int option = sc.nextInt();
// switch (option) {
// case 1:

// break;

// default:
// break;
// }

// }

// public void options() {

// }