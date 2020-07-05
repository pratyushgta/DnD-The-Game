import java.util.*;
import java.util.Random;
public class dnd
{
    Scanner sc = new Scanner(System.in);
    Scanner enterScanner = new Scanner(System.in);

    int playerHP;
    String playerName;
    String playerWeapon;
    int monsterHP;
    int magicspell;
    int money;
    int sidemissiontag;
    String prodkey;
    int dodo;
    int exploretag;
    int round;
    int missiontag;
    int admin;
    int easter;

    dnd() //default values
    {
        playerHP=10;
        playerName="";
        playerWeapon="Dagger";
        monsterHP=15;
        magicspell=0;
        money=0;
        sidemissiontag=0;
        prodkey="";
        dodo=0;
        exploretag=0;
        round=0;
        missiontag=0;
        admin=0;
        easter=0;
    }

    void startmenu()
    {
        System.out.println("-----------------------\nSTART MENU\n-----------------------");
        System.out.println("1. Story Mode\n2. Explore\n3. Settings\n4. Exit");
        if(admin==1){
            System.out.println("5. Exit Admin Module");
        }
        int ch=sc.nextInt();
        if(ch==1)
        {
            playerSetUp();
        }
        else if(ch==2)
        {
            explore();
        }
        else if(ch==3)
        {
            if(admin==1)
                settings();
            else
                playersettings();
        }
        else if(ch==4)
        {
            exit();
        }
        else if(ch==5)
        {
            if(admin==1){
                admin=0;
                System.out.println("\nADMIN MODULE DISABLED\n");
                System.out.println("Starting Regular Game...\n");
                startmenu();
            }
            else{
                startmenu();
            }
        }
        else
        {
            startmenu();
        }
    }

    void playerSetUp()
    {
        System.out.println("***********************");
        System.out.println("CUSTOMISE YOUR PLAYER");
        System.out.println("***********************");
        System.out.print("Enter your warrior's name: ");
        playerName=enterScanner.nextLine();
        //money=money+10;
        System.out.println("----------------");
        System.out.println("Your HP: "+ playerHP);
        System.out.println("Current Weapon: "+ playerWeapon);
        System.out.println("$: "+money);
        System.out.println("----------------");

        System.out.println("|Press any key to continue|");
        enterScanner.nextLine();
        senario1();      
    }

    void senario1()
    {
        System.out.println("************************************************");
        System.out.println("CHAPTER 1: A WARRIOR IN NEED IS A WARRIOR INDEED");
        System.out.println("************************************************");
        System.out.println("After passing through the craggy peaks, the road takes a sudden turn to the Victor Palace that towers before you.\nCrumbling towers of stone keep a silent watch over the approach. With abandoned guardhouses and ramshackle cottages,\nthe hamlet looks inhabited for years.");
        System.out.println("Beyond these,a lowered drawbridge, disappearing into the deep fog below; leading to an arched entrance to the castle courtyard.\nThe chains of the drawbridge creak in the wind, their rust-eaten iron straining with the weight.");
        System.out.println("A rotting wooden portcullis, green with growth, hangs in the entry tunnel.\nBeyond this, the main doors of Victor Palace stand open, a rich warm light spilling into the courtyard.");
        System.out.println("\n|Press any key to continue|\n");
        enterScanner.nextLine();
        System.out.println("King Victor: It has been seven brutal years. The town is in dire straits and our army men have turned out to be helpless.");
        System.out.print(playerName+": ");
        enterScanner.nextLine();
        System.out.println("\nKing Victor: Seven years ago, the filthy dragons managed to purloin the magic spell which makes them invincible, from the town's safe.");
        System.out.print(playerName+": ");
        enterScanner.nextLine();
        System.out.println("\nKing Victor: Our little town is running out of resources to sustain and get rid of the dragons.\nFortune favours the brave and so you are our only hope...");
        System.out.print(playerName+": ");
        enterScanner.nextLine();
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println("Objective: Bring back the magic spell from the mighty dragons.\nThey usually linger around the mountains.");        
        System.out.println("---------------------------------------------------------------------------------------------------------");
        money=money+50;
        System.out.println("Your HP: "+ playerHP);
        System.out.println("Current Weapon: "+ playerWeapon);
        System.out.println("$: "+money);
        System.out.println("----------------");
        System.out.println("|Press C to continue|");
        String resp=enterScanner.nextLine();
        if(resp.equals("C"))
        {
            palaceGate();
        }
        else
        {
            easter=1;
            senario1();
        }
    }

    void palaceGate()
    {
        System.out.println("*****************************");
        System.out.println("Welcome to The Victor Palace ");
        System.out.println("*****************************");  
        System.out.println("You are at the gate of the Palace of King Victor.");
        System.out.println("Guards are guarding the Palace gate");
        System.out.println("");
        System.out.println("What would you like to do?");
        System.out.println("");
        System.out.println("1: Talk to the guards");
        System.out.println("2: Attack the guards");
        System.out.println("3: Go to Ding Dong Tower");
        System.out.println("\n------------------------------------------------------------------\n");

        int ch= sc.nextInt();

        if(ch==1)
        {
            if(missiontag==0){
                if(magicspell==1)
                {
                    System.out.println("\n---------------------------------------------------------------------------\n");
                    System.out.println("Guard: You killed the dragon! Unbelievable! It was a huge burden for our town.");
                    System.out.println("Guard: We respect your benevolence and valor. Welcome to the Palace!");
                    System.out.print(playerName+": ");
                    enterScanner.nextLine();
                    System.out.println("\n--------------------------------------------------------------------------------\n");
                    System.out.println("King Victor has awarded you with the Medal of Honour for your courage and loyalty!\n");
                    System.out.println("-------------------------------");
                    System.out.println("MISSION PASSED!\nBonus: $300");
                    money=money+300;
                    System.out.println("-------------------------------");  
                    System.out.println("Your $: "+money);
                    System.out.println("\n|Press any key to continue|");
                    magicspell=0;
                    missiontag=1;
                    tower();
                }
                else
                {
                    System.out.println("Guard 1: Stop! You are not allowed beyond this point.");
                    System.out.print(playerName+": ");
                    String resp=enterScanner.nextLine();
                    System.out.println("Guard 2: Our highness has given you a task to complete. You aren't welcomed before that.");
                    System.out.println("\n------------------------------------------------------------------\n");
                    System.out.println("|Press any key to continue|");
                    enterScanner.nextLine();  
                    palaceGate();

                }
            }
            else{
                System.out.println("Guard 1: Welcome to the palace of King Victor. Would you like to meet the king?");
                System.out.print(playerName+": ");
                String resp=enterScanner.nextLine();
                System.out.println("Guard 2: The king has left for a long voyage to explore far off lands. Please come back later.");
                System.out.println("\n--------------------------------------------------------------------------------------------\n");
                System.out.println("|Press any key to continue...|");
                enterScanner.nextLine();  
                palaceGate();
            }
        }

        else if(ch==2)
        {
            if(playerHP>0)
            {
                System.out.println("Guards: So you've chosen death. No one messes around with the King's men!");
                System.out.println("*The powerful men fought furiously and left you injured*\n(You lose 1 HP)");
                playerHP = playerHP-1;
                System.out.println("Your HP: " + playerHP);
                System.out.println("|Press any key to continue|");
                enterScanner.nextLine();
                palaceGate();
            }
            else
            {
                System.out.println("WASTED!");
                if(money>=49)
                {
                    System.out.println("Please visit Spell Cafe to heal!");
                    System.out.println("----------------");
                    System.out.println("Your HP: "+ playerHP);
                    System.out.println("Current Weapon: "+ playerWeapon);
                    System.out.println("$: "+money);
                    System.out.println("----------------");
                    east();
                }
                else
                {
                    dead();
                }
            }
        }
        else if(ch==3)
        {
            tower();
        }  
        else
            palaceGate();
    }

    void tower()
    {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("***************************");
        System.out.println("Welcome to Ding Dong Tower ");
        System.out.println("***************************");
        System.out.println("Where would you like to head next?");
        System.out.println("1: North- Sipu River");
        System.out.println("2: South- The Palace ");
        System.out.println("3: East- Market");
        System.out.println("4: West- Clove Mountains");
        System.out.println("5: Dodo Port ");
        System.out.println("6: Great Easton Station");
        System.out.println("\n0: Teleport to Start Menu");
        System.out.println("\n------------------------------------------------------------------\n");

        int ch = sc.nextInt();

        if(ch==1){
            north();
        }
        else if(ch==2){
            palaceGate();
        }
        else if(ch==3){
            east();
        }
        else if(ch==4){
            west();
        }
        else if(ch==5){
            dodoport();
        }
        else if(ch==6){
            railwaystation();
        }
        else if(ch==0){
            startmenu();
        }
        else
        {
            tower();
        }
    }

    void north()
    {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("**********************************");
        System.out.println("NORTH: WELCOME TO SIPU RIVERFRONT");
        System.out.println("**********************************");
        System.out.println("Where would you like to head next?");
        System.out.println("1: Visit Friend's House ");
        System.out.println("2: Fishing");
        System.out.println("\n0: Teleport to Start Menu");
        System.out.println("\n------------------------------------------------------------------\n");
        int ch=sc.nextInt();
        if(ch==1)
        {
            if(sidemissiontag==2)
            {
                System.out.println("--------------------------------------------");
                System.out.println("Your friend isn't at home. Come again later!");
                System.out.println("--------------------------------------------");
                System.out.println("|Press any key to continue...|");
                enterScanner.nextLine();
            }
            else{
                System.out.println("*****************************");
                System.out.println("Side Mission: A Helping Hand");
                System.out.println("*****************************");
                System.out.println("Friend: Hey "+playerName+"! Long time no see. Where had you been all this while!?");
                System.out.print(playerName+": ");
                enterScanner.nextLine();
                System.out.println("\nFriend: Oh! So, Whats brings you here, buddy?");
                System.out.print(playerName+": ");
                enterScanner.nextLine();
                System.out.println("\nFriend: Things aren't going great lately. The dragon....");
                System.out.print(playerName+": ");
                enterScanner.nextLine();
                System.out.println("\nFriend: The dragon has blazed all my paddy fields; my livelihood is at stake, I owe a debt of gratitude to my closest friends..\nI am afraid of losing them if I don't payback. Would you help me repay my debts?");
                System.out.print(playerName+": ");
                enterScanner.nextLine();
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("Objective: Help your friend pay off his debts by playing The Lucky Bucky");
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("|Press Y for Yes or N for Next time maybe |");
                String resp=enterScanner.nextLine();
                if(resp.equals("Y"))
                {
                    sidemissiontag=1;
                    gameparlour();
                }
                else if(resp.equals("N"))
                {
                    System.out.println("-------------------------------");
                    System.out.println("MISSION ABORTED");
                    System.out.println("-------------------------------");
                    tower();
                }
            }
        }
        else if(ch==2){
            System.out.println("You: Woof! It is so sunny! I am sweating already.\nFisherman: Hello gentleman! Would you like to go fishing? Y: Yes(-$15)/ N: No");
            String resp=enterScanner.nextLine();
            if(resp.equals("Y"))
            {
                System.out.println("You: Why not!");
                if(money>=15)
                {          
                    money=money-15;
                    fishing();
                }
                else
                {
                    System.out.println("Fisherman: Oh no! You do not have enough money to go fishing!");
                    north();
                }
            }
        }
        else if(ch==0){
            tower();
        }
        else{
            north();
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("\n\n1: Go back to the crossroad");
        System.out.println("\n------------------------------------------------------------------\n");
        int ch1=sc.nextInt();

        if(ch1==1)
        {
            tower();
        }
        else
        {
            north();
        }
    }

    void fishing()
    {
        System.out.println("--------------------");
        System.out.println("Your HP: "+ playerHP);
        System.out.println("Current Weapon: "+ playerWeapon);
        System.out.println("$: "+money);
        System.out.println("********************************");
        System.out.println("         The Fresh Catch        ");
        System.out.println("********************************");
        System.out.println("You have 5 chances to catch as many fishes as possible by entering the distance to throw the bait.\nFor every fish caught, you get $10.");
        System.out.println("------------------------------------------------------------------------------------------------");
        int x=5;
        int fish=0;
        while(x>0&&x<6)
        {
            System.out.println("Enter throw distance");
            int N=sc.nextInt();

            int sr = (int) Math.sqrt(N);
            if(N<50&&sr*sr==N)
            {
                System.out.println("Yay! You caught a fish!");
                fish++;
            }
            else
            {
                System.out.println("Oops! Missed it!");
            }
            x--;
        }
        int reward=fish*10;
        System.out.println("------------------------------------------------");
        System.out.println("You got $"+reward+" for catching "+fish+" fishes");
        System.out.println("------------------------------------------------");
        money=money+reward;
        System.out.println("Your $: "+money);
        System.out.println("\n\n1: Go back to the crossroad");
        System.out.println("\n------------------------------------------------------------------\n");
        int ch1=sc.nextInt();
        if(ch1==1)
        {
            tower();
        }
        else
        {
            north();
        }
    }

    void east()
    {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("*******************************");
        System.out.println("WELCOME TO THE MARKET");
        System.out.println("*******************************");
        System.out.println("1. Visit Arsenal Nation");
        System.out.println("2. Visit Spell Cafe");
        System.out.println("3. Visit Lucky Bucky");
        System.out.println("\n0: Teleport to Start Menu");
        System.out.println("\n------------------------------------------------------------------\n");
        int ch=sc.nextInt();

        if(ch==1)
        {
            System.out.println("**************************");
            System.out.println("Welcome to Arsenal Nation");
            System.out.println("**************************");
            System.out.println("1.Dagger\t$15\n2.Axe\t\t$50\n3.Katana\t$85\n4.Magic Wand\t$200\n\n0.Go Back");
            int choice=enterScanner.nextInt();

            if(choice==1 && money>=15)
            {
                playerWeapon="Knife";
                money=money-15;
                System.out.println("--------------------");
                System.out.println("Your HP: "+ playerHP);
                System.out.println("Current Weapon: "+ playerWeapon);
                System.out.println("$: "+money);
                System.out.println("--------------------");
            }
            else if(choice==2 && money>=50)
            {
                playerWeapon="Axe";
                money=money-75;
                System.out.println("--------------------");
                System.out.println("Your HP: "+ playerHP);
                System.out.println("Current Weapon: "+ playerWeapon);
                System.out.println("$: "+money);
                System.out.println("--------------------");
            }
            else if(choice==3 && money>=85)
            {
                playerWeapon="Katana";
                money=money-50;
                System.out.println("--------------------");
                System.out.println("Your HP: "+ playerHP);
                System.out.println("Current Weapon: "+ playerWeapon);
                System.out.println("$: "+money);
                System.out.println("--------------------");
            }
            else if(choice==4 && money >=200)
            {
                playerWeapon="Magic Wand";
                money=money-200;
                System.out.println("--------------------");
                System.out.println("Your HP: "+ playerHP);
                System.out.println("Current Weapon: "+ playerWeapon);
                System.out.println("$: "+money);
                System.out.println("--------------------");
            }
            else if(choice==0){
                east();
            }
            else
            {
                System.out.println("------------------------------------------------------------");
                System.out.println("Uh oh! You do not have enough money to purchase thagt spell!");
                System.out.println("------------------------------------------------------------");
                System.out.println("|Press any key to continue|");
                enterScanner.nextLine();
            }
        }
        else if(ch==2)
        {
            System.out.println("**********************");
            System.out.println("Welcome to Spell Cafe");
            System.out.println("**********************");
            System.out.println("1.Heal Spell\t$49\n2.Unicorn Brandy\t$175\n\n0.Go Back");
            int choice=sc.nextInt();
            if(choice==1 && money>=49)
            {
                System.out.println("The heal spell has restored your HP!");
                playerHP=10;
                money=money-49;
                System.out.println("--------------------");
                System.out.println("Your HP: "+ playerHP);
                System.out.println("Current Weapon: "+ playerWeapon);
                System.out.println("$: "+money);
                System.out.println("--------------------");
            }
            else if(choice==2 && money>=175)
            {
                System.out.println("The unicorn brandy has increased your HP!");
                playerHP=15;
                money=money-175;
                System.out.println("--------------------");
                System.out.println("Your HP: "+ playerHP);
                System.out.println("Current Weapon: "+ playerWeapon);
                System.out.println("$: "+money);
                System.out.println("--------------------");
            }
            else if(choice==0){
                east();
            }
            else
            {
                System.out.println("------------------------------------------------------------");
                System.out.println("Uh oh! You do not have enough money to purchase thagt spell!");
                System.out.println("------------------------------------------------------------");
                System.out.println("|Press any key to continue|");
                enterScanner.nextLine();
            }
        }
        else if(ch==3)
        {
            System.out.println("***********************");
            System.out.println("Welcome to Lucky Bucky");
            System.out.println("***********************");
            System.out.println("Manager: Would you like to try your luck? Y:Yes(-$100)/ N:NO");
            System.out.println("------------------------------------------------------------");
            String resp=enterScanner.nextLine();
            if(resp.equals("Y"))
            {
                System.out.println("You: No one's got a better luck than me ;)");
                if(money>=100)
                {
                    money=money-100;
                    gameparlour();
                }
                else
                {
                    System.out.println("Host: Uh oh! Looks like you do not have enough money to try your luck!");
                    System.out.println("-----------------------------------------------------------------------");
                    System.out.println("|Press any key to continue|");
                    enterScanner.nextLine();
                }
            }
            else
            {
                System.out.println("\n------------------------------------------------------------------");
                System.out.println("1: Go back to the crossroad");
                System.out.println("------------------------------------------------------------------\n");
                int ch1=sc.nextInt();
                if(ch1==1)
                {
                    tower();
                }
                else
                {
                    east();
                }
            }
        }
        else if(ch==0){
            tower();
        }
        else{
            east();
        }

        System.out.println("\n------------------------------------------------------------------");
        System.out.println("1: Go back to the crossroad");
        System.out.println("------------------------------------------------------------------\n");
        int ch1=sc.nextInt();
        if(ch1==1)
        {
            tower();
        }
        else
        {
            east();
        }
    }

    void gameparlour()
    {
        System.out.println("--------------------");
        System.out.println("Your HP: "+ playerHP);
        System.out.println("Current Weapon: "+ playerWeapon);
        System.out.println("$: "+money);
        System.out.println("--------------------");
        System.out.println("********************************");
        System.out.println("        The Lucky Bucky      ");
        System.out.println("********************************");
        System.out.println("You have 5 chances to guess the 5 lucky numbers ranging from 1 to 100. The numbers generated shall be random.");
        System.out.println("The game is based on your guess and luck. For every number guessed correctly, you get $100. ;)");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        Random rand = new Random();
        int x=5;
        int count=0;
        while(x>0&&x<6)
        {
            System.out.print("Guess a random number: ");
            int no=sc.nextInt();
            int rand_int1 = rand.nextInt(100);
            if(x<100)
            {
                if(no==rand_int1){
                    System.out.println("You won!");
                    count++;
                }
                else{
                    System.out.println("The number was: "+rand_int1);
                    System.out.println("You lost!");
                    x--;
                }
            }
            else
            {
                System.out.println("Number not in range!");
                gameparlour();
            }
        }
        int reward=count*100;
        money=money+reward;

        if(sidemissiontag==1)
        {
            if(count>=1)
            {
                System.out.println("\nYou won $"+reward+" in the game");
                System.out.println("-------------------------------");
                System.out.println("MISSION PASSED!\nBonus: $200");
                money=money+200;
                System.out.println("-------------------------------");  
                System.out.println("Your $: "+money);
                sidemissiontag=2;
            }
            else
            {
                System.out.println("You earned nothing in the game :/");
                System.out.println("-------------------------------");
                System.out.println("       MISSION FAILED :(       ");
                System.out.println("-------------------------------");
                System.out.println("Your $: "+money);
            }
        }
        else
        {
            System.out.println("------------------------------------------------");
            System.out.println("You won $"+reward+" for sucessfully guessing "+count+" numbers!");
            System.out.println("------------------------------------------------");
            System.out.println("Your $: "+money);
        }
        System.out.println("\n------------------------------------------------------------------");
        System.out.println("1: Go back to the crossroad");
        System.out.println("\n------------------------------------------------------------------\n");
        int ch1=sc.nextInt();
        if(ch1==1)
        {
            tower();
        }
        else
        {
            east();
        }
    }

    void dodoport()
    {
        System.out.println("--------------------");
        System.out.println("Your HP: "+ playerHP);
        System.out.println("Current Weapon: "+ playerWeapon);
        System.out.println("$: "+money);
        System.out.println("--------------------");
        System.out.println("********************************");
        System.out.println("      Welcome to DoDo Port      ");
        System.out.println("********************************");
        System.out.println("Where would you like to fly to?");
        System.out.println("\n------LEISURE FLIGHTS------");
        System.out.println("1: Sight-Seeing Tour ");
        System.out.println("2: Clove Mountains- Hill Top ");
        System.out.println("\n0: Teleport to Ding Dong Tower");
        System.out.println("\n------------------------------------------------------------------\n");

        int ch = sc.nextInt();

        if(ch==1){
            System.out.println("-------TICKETS & PRICING-------");
            System.out.println("1. Round Trip\t$5\n0. Return Back");
            int choice=sc.nextInt();
            if(choice==1){
                if(money>=5){
                    money=money-5;
                    System.out.println("Pilot: Are you ready to explore majestic hamlet!?");
                    System.out.println(playerName+": ");
                    enterScanner.nextLine();
                    System.out.println("Pilot: Let's gooooo!...");
                    dodo=1;
                    explore();
                }
                else{
                    System.out.println("------------------------------------");
                    System.out.println("You do not have enough money to fly!");
                    System.out.println("------------------------------------");
                    System.out.println("|Press any key to continue|");
                    enterScanner.nextLine();
                    dodoport();
                }
            }
            else
            {
                dodoport();
            }
        }

        else if(ch==2){
            System.out.println("-------TICKETS & PRICING-------");
            System.out.println("1. One Way\t$100\n2. Round Trip\t$150\n0. Return Back");
            int choice=sc.nextInt();
            if(choice==1){
                if(money>=100){
                    money=money-100;
                    System.out.println("Pilot: Buckle up people! Because we are flying to the grandeur Clove Mountains!");
                    System.out.println(playerName+": ");
                    enterScanner.nextLine();
                    System.out.println("Pilot: Its gonna be deadly epic!...");
                    dodo=1;
                    west();
                }
                else{
                    System.out.println("------------------------------------");
                    System.out.println("You do not have enough money to fly!");
                    System.out.println("------------------------------------");
                    System.out.println("|Press any key to continue|");
                    enterScanner.nextLine();
                    dodoport();
                }
            }
            else if(choice==2){
                if(money>=150){
                    round=1;
                    money=money-150;
                    System.out.println("Pilot: Buckle up, people! Because we are flying to the grandeur Clove Mountains!");
                    System.out.println(playerName+": ");
                    enterScanner.nextLine();
                    System.out.println("Pilot: Its gonna be deadly epic!...");
                    dodo=1;
                    west();
                }
                else{
                    System.out.println("------------------------------------");
                    System.out.println("You do not have enough money to fly!");
                    System.out.println("------------------------------------");
                    System.out.println("|Press any key to continue|");
                    enterScanner.nextLine();
                    dodoport();
                }
            }
            else if(choice==0){
                dodoport();
            }
        }

        else if(ch==0){
            tower();
        }
        else{
            dodoport();
        }
    }

    void railwaystation()
    {
        System.out.println("--------------------");
        System.out.println("Your HP: "+ playerHP);
        System.out.println("Current Weapon: "+ playerWeapon);
        System.out.println("$: "+money);
        System.out.println("--------------------");
        System.out.println("*********************************");
        System.out.println(" Welcome to Great Easton Station ");
        System.out.println("*********************************");
        System.out.println("Where would you like to travel to?");
        System.out.println("\n------INTER-KINGDOM TRAINS------");
        System.out.println("1: Kingdom of Oryn");

        System.out.println("\n0: Teleport to Ding Dong Tower");
        System.out.println("\n------------------------------------------------------------------\n");

        int ch = sc.nextInt();

        if(ch==1){
            System.out.println("-------TICKETS & PRICING-------");
            System.out.println("1. One Way\t$50\n0. Return Back");
            int choice=sc.nextInt();
            if(choice==1){
                if(money>=50){
                    if(missiontag==1){
                        System.out.println("*****WELCOME ON THE ORIENTAL EXPRESS****\nFrom: \tTo:");
                        System.out.println("------------------------------------");
                        System.out.println("Station Master: Have a safe jouney!");
                        System.out.print(playerName+": ");
                        enterScanner.nextLine();
                        System.out.println("------------------------------------");
                        ending();
                    }
                    else{
                        System.out.println("Station Master: No scheduled trains for this destination. The dragon has blown-up the tracks ahead.");  
                        System.out.print(playerName+": ");
                        enterScanner.nextLine();
                        System.out.println("------------------------");
                        railwaystation();
                    }
                }
                else{
                    System.out.println("---------------------------------------");
                    System.out.println("You do not have enough money to travel!");
                    System.out.println("---------------------------------------");
                    System.out.println("|Press any key to continue|");
                    enterScanner.nextLine();
                    railwaystation();
                }
            }
            else if(choice==0){
                railwaystation();
            }
        }
        else if(ch==0){
            tower();
        }
        else{
            railwaystation();
        }
    }

    public void west()
    {
        System.out.println("************************************");
        System.out.println(" WEST: Clove Mountains Base Station");
        System.out.println("************************************");
        if(missiontag==0){
            if(magicspell==0){
                if(dodo==1)
                {
                    System.out.println("###############################");
                    System.out.println("         DRAGON'S LAIR         ");
                    System.out.println("###############################");
                    System.out.println("----------Storyline-------------");
                    System.out.println("Dragon: You've gone off the rails by coming here....");
                    System.out.print(playerName+": ");
                    enterScanner.nextLine();
                    System.out.println("\nDragon: Go right away or else, I'll roast you like peanuts if you don't move your arse.");
                    System.out.print(playerName+": ");
                    enterScanner.nextLine();
                    System.out.println("--------------------------------------------------------------------------------------------------------");
                    System.out.println("Objective: The dragon is hovering in front of you. Beat the tar out of the dragon & get the magic spell.");
                    System.out.println("1: Fight");
                    System.out.println("2: Run Away");
                    System.out.println("\n------------------------------------------------------------------------------------------------------\n");

                    int ch=sc.nextInt();

                    if(ch==1)
                    {
                        fight();
                    }
                    else if(ch==2)
                    {
                        tower();
                    }
                    else
                    {
                        west();
                    }
                }
                else
                {
                    System.out.println("Serviceman: STOP! You cannot go any further. Landslides have destroyed the road leading to the hilltop.");
                    System.out.print(playerName+": ");
                    enterScanner.nextLine();
                    System.out.println("\nServiceman: You can get up there by flying. But beware! Tresspassing in the dragon's territory is more brutal than jumping inside an active volcano!");  
                    System.out.print(playerName+": ");
                    enterScanner.nextLine();
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("|Press any key to continue|");
                    enterScanner.nextLine();
                    tower();
                }
            }
            else{
                System.out.println("You already killed the mighty dragon & acquired the magic spell\nTake it back to the king!");
                System.out.println("\n------------------------------------------------------------------\n");
                System.out.println("1: Towards Crossroad");
                System.out.println("\n------------------------------------------------------------------\n");
                int choice = sc.nextInt();
                if(choice==1){
                    tower();
                }
                else{
                    west();
                }
            }
        }
        else{
            System.out.println("-------------------------------");
            System.out.println("        DRAGON'S DUNGEON       ");
            System.out.println("-------------------------------");
            playerHP=10;
            System.out.println("Resting....\nYour HP has been restored!");
            System.out.println("|Press any key to continue|");
            enterScanner.nextLine();
            tower();
        }
    }

    public void fight()
    {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Your HP: "+ playerHP);
        System.out.println("Dragon's HP: " + monsterHP);
        System.out.println("\n1: Attack");
        System.out.println("2: Run");
        System.out.println("\n------------------------------------------------------------------\n");

        int ch = sc.nextInt();

        if(ch==1)
        {
            attack();
        }
        else if(ch==2)
        {
            tower();
        }
        else
        {
            fight();
        }
    }

    public void attack()//publicrelease1
    {
        int playerDamage =0;

        if(playerWeapon.equals("Dagger")||playerWeapon.equals("Knife")){
            playerDamage = new java.util.Random().nextInt(5);
        }
        else if(playerWeapon.equals("Sword")||playerWeapon.equals("Axe")){
            playerDamage = new java.util.Random().nextInt(6);
        }
        else if(playerWeapon.equals("Katana")){
            playerDamage = new java.util.Random().nextInt(7);
        }
        else if(playerWeapon.equals("Magic Wand")){
            playerDamage = new java.util.Random().nextInt(9);
        }

        System.out.println("You attacked the dragon and gave " +playerDamage + " damage!");
        monsterHP = monsterHP - playerDamage;
        System.out.println("Monster HP: " + monsterHP);
        if(monsterHP<1){ win(); } else if(monsterHP>0){
            int monsterDamage =0;

            monsterDamage = new java.util.Random().nextInt(4);

            System.out.println("The dragon attacked you and gave " +monsterDamage + " damage!");

            playerHP = playerHP - monsterDamage;

            System.out.println("Player HP: " + playerHP);

            if(playerHP<1){ dead(); } else if(playerHP>0){
                fight();
            }
        }

    }

    public void dead(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("WASTED!");
        System.out.println("\n\nGAME OVER!");
        System.out.println("\n------------------------------------------------------------------\n");
        exit();
    }

    public void win(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("YAY! YOU KILLED THE DRAGON!");
        System.out.println("The dragon has dropped the magic spell!");
        System.out.println("------------------------------");
        System.out.println("Press F to pick up the spell");
        System.out.println("------------------------------");
        String pick=enterScanner.nextLine();
        if(pick.equals("F"))
        {
            System.out.println("You picked up the magic spell!\n\n");
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("Objective: Take the magic spell back to King Victor");
            System.out.println("1: Fly back to DoDo Port");
            System.out.println("\n------------------------------------------------------------------\n");
            magicspell = 1;
            int choice = sc.nextInt();
            if(choice==1){
                if(round==1){
                    dodoport();
                }
                else{
                    System.out.println("No DoDo available! Would you like to call one? Y:Yes(-$70)\n: No");
                    String resp=enterScanner.nextLine();
                    if(resp.equals("Y")){
                        if(money>=70){
                            dodo=1;
                            money=money-70;
                            System.out.println("-----------------------------------");
                            System.out.println("DoDo has arrived!\nFlying you back!");
                            System.out.print(playerName+": ");
                            enterScanner.nextLine();
                            System.out.println("-----------------------------------");
                            dodoport();
                        }
                        else{
                            System.out.println("Oops! You do not have enough money!");
                            System.out.println("-----------");
                            System.out.println("GAME OVER!");
                            System.out.println("-----------");
                            exit();
                        }
                    }
                    else{
                        System.out.println("Oops! You weren't able to take the magic spell back to the king!");
                        System.out.println("-----------");
                        System.out.println("GAME OVER!");
                        System.out.println("-----------");
                        exit();
                    }
                }
            }
            else{
                win();
            }
        }
        else
        {
            System.out.print("You left the spell behind");
            System.out.println("------------------------");
            System.out.println("    MISSION FAILED :(   ");
            System.out.println("------------------------");
            magicspell=0;
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("1: Towards DoDo Port");
            System.out.println("\n------------------------------------------------------------------\n");
            int choice = sc.nextInt();
            if(choice==1){
                dodoport();
            }
            else{
                west();
            }
        }
    }

    public void ending(){
        System.out.println("******CHAPTER II******");
        System.out.println("     Coming soon.... ");
        System.out.println("\n\n--------------THE END-----------------");
        System.out.println("*****************DUNGEONS & DRAGONS***************");
        System.out.println("\n\n          A game by Pratyush Kumar            ");    
    }

    public void exit()
    {
        System.out.println("-------Goodbye!-------");
    }

    private void settings()
    {
        System.out.println("-----------------------");
        System.out.println("DEVELOPER GAME SETTINGS ");
        System.out.println("-----------------------");
        System.out.println("1. Update Player HP\n2. Update Monster HP\n3. Update Player Money\n4. Check Game Version\n\n0. Go Back to Start Menu");
        System.out.println("-----------------------------------------------------------------------------");
        int ch=sc.nextInt();

        if(ch==1)
        {
            System.out.println("Default Player HP: 10");
            System.out.print("Enter new Player HP: ");
            playerHP=sc.nextInt();
            System.out.println("  Update Successful! ");
            System.out.println("Loading Game.....");
            settings();
        }
        else if(ch==2)
        {
            System.out.println("Default Monster HP: 15");
            System.out.print("Enter new Player HP: ");
            monsterHP=sc.nextInt();
            System.out.println("  Update Successful! ");
            System.out.println("Loading Game.....");
            settings();
        }
        else if(ch==4)
        {
            System.out.println("Current Version: v1.0.0");
            System.out.println("Current Developer Version: v1.0.0");
            System.out.println("Released   on  : 5 JULY 2020   ");
            System.out.println("Check out the GitHub page of the game for latest updates!");
            settings();
        }
        else if(ch==3)
        {
            System.out.println("Default Player Money(at start): 0");
            System.out.print("Enter new Player money: ");
            money=sc.nextInt();
            System.out.println("  Update Successful! ");
            System.out.println("Loading Game.....");
            settings();
        }
        else if(ch==0){
            startmenu();
        }
        else{
            settings();
        }
    }

    void explore()
    {
        System.out.println("**********************************");
        System.out.println("  WELCOME TO THE TOWN OF KAZA   ");
        System.out.println("**********************************");
        System.out.println("Forged on the Northern side of Kingdom Vanaheim, on the banks of river Sipu and surrounded by Clove Mountains on the west,\n the hamlet of Kaza is home to a population of around 200 people, led by King Victor.\n");
        System.out.println("With its settlements of galvanized steel rooftops, decaying walls and foggy surroundings, Kaza has a desolate atmosphere.\nThe main attraction is the Ding Dong Tower, which was built 55 years ago and designed by wood elves.\n");
        System.out.println("Kaza has an advancing economy, which is mainly supported by alchemy, fishing and crafting. But their biggest strengths are\nhighly skilled thieving and rare wood production. In the swinging sixties, when casinos opened in Kaza, people were convinced that");
        System.out.println("they had found the ideal way of earning a living without actually having to do any work. \n");
        System.out.println("On one side of the planet, everything is lush and beautiful- and there is virtually no prey.\nOn the other side of the town, on top of the Clove Mountains, everything is scorched. Dragons have annihilated much of the other species.\n");
        System.out.println("Kaza lacks people skilled in war. The king's men have been trying to reach the capital of the Kingdom for centuries,\nbut they cannot cross the mountains, as their skin would melt under the heat of the powerful and mighty Dragons.");
        System.out.println("This once beautiful place is beginning to fall apart due to pack wars. There's someone who needs to end this.\n");
        System.out.println("|Press any key to continue|");
        enterScanner.nextLine();
        System.out.println("Guide: So, ladies & gentlemen, hold on to your breath because we are about to fly past the iconic Ding Dong Tower!");
        System.out.print("Respond: ");
        enterScanner.nextLine();
        System.out.println("\nGuide: The North of the hamlet is where you will find the settlements- beautiful dwarf-built bamboo houses roofed in slate.\nThose old, filthy rowing boats you see there, docked besides the river Sipu are meant for fishing.\nRiver Sipu, once filled with freshwater fishes; now you won't even find planktons.");
        System.out.print("Respond: ");
        enterScanner.nextLine();
        System.out.println("\nGuide: We are now flying above the famous and the only market, east of the town. From weapons to artillery, magic spells to magic 'powder';\nyou'll find everything here!\nAnd that's Lucky Bucky, every youngster's hangout place. Here, the wealthy win big while the poor remain poor.");
        System.out.print("Respond: ");
        enterScanner.nextLine();
        System.out.println("\nGuide: Look down people...before your eyes pop out, that's the majestic Palace of King Victor.\nAnd yes! that's where you get executed if you don't follow the rules here. Be careful, you'll thank me later. ");
        System.out.print("Respond: ");
        enterScanner.nextLine();
        System.out.println("\nGuide: Last but not the least, at the horizon you could see the Clove Mountains. Bravest of the brave fear climbing up that\nnasty little thing. Don't ever try to go up the top unless you wanna get 'roasted'.");  
        System.out.print("Respond: ");
        enterScanner.nextLine();
        System.out.println("\nGuide:Okay, impoverished people, that's what you get for what you pay for. Don't forget to tip me otherwise I'll throw you in that 'dungeon'...");  
        System.out.print("Respond: ");
        enterScanner.nextLine();

        System.out.println("\n|Press any key to continue|");
        enterScanner.nextLine();
        if(dodo==1){
            dodoport();
        }
        else{
            startmenu();
        }
    }

    private void admincenter()
    {
        System.out.print("Enter Unique Key: ");
        String uniquekey=enterScanner.nextLine();
        if(uniquekey.equals("ADmIn")){
            System.out.println("***********************");
            System.out.println("Admin Module Activated");
            System.out.println("***********************");
            admin=1;
            startmenu();
        }
        else{
            System.out.println("\nAccess Denied");
            System.out.println("\nLoading Regular Game...\n");
            startmenu();
        }
    }

    public void playersettings()
    {
        System.out.println("-----------------------");
        System.out.println("     GAME SETTINGS     ");
        System.out.println("-----------------------");
        System.out.println("1.Change Difficulty level\n2.Player Stats\n3.Game Controls\n4.Game Version\n\n0.Go Back to Start Menu");
        System.out.println("-----------------------------------------------------------------------------");
        int ch=sc.nextInt();
        String difficultylvl="As Easy As Saying Chickens";
        if(ch==1)
        {
            System.out.println("Current Difficulty Level: "+difficultylvl);
            System.out.println("\nChoose different difficulty level:");
            System.out.println("1. As Easy As Saying Chickens\n2. Work Your Fingers To The Bone\n3. Blood, Sweat and Tears");
            int choice=sc.nextInt();
            if(choice==1){
                playerHP=10;
                monsterHP=15;
                difficultylvl="As Easy As Saying Chickens";
                System.out.println("  Update Successful! ");
                System.out.println("Loading Game.....");
                playersettings();
            }
            if(choice==2){
                playerHP=10;
                monsterHP=18;
                difficultylvl="Work Your Fingers To The Bone";
                System.out.println("  Update Successful! ");
                System.out.println("Loading Game.....");
                playersettings();
            }
            if(choice==3){
                playerHP=10;
                monsterHP=20;
                difficultylvl="Blood, Sweat and Tears";
                System.out.println("  Update Successful! ");
                System.out.println("Loading Game.....");
                playersettings();
            }
        }
        else if(ch==2){
            System.out.println("Player HP: "+ playerHP);
            System.out.println("Current Weapon: "+ playerWeapon);
            System.out.println("$: "+money);
            if(missiontag==1){
                System.out.println("Medal of Honour unlocked!");
            }
            if(easter==1){
                System.out.println("\nWow! You found the easter egg!");
            }
            else{
                System.out.println("\nYou haven't discovered the easter egg, yet.\nGood Lucky finding it ;)");
            }
            System.out.println("\n|Press any key to continue|");
            enterScanner.nextLine();
            playersettings();
        }
        else if(ch==3){
            System.out.println("Keyboard Controls:");
            System.out.println("Since this is a text based game, you won't require arrow keys to control.\nInstead, you control your in-game character via a set of instructions that appear on screen.\nPlease remember, some commands might be case sensitive and can result in an error if not entered in the correct case.");
            System.out.println("\n|Press any key to continue|");
            enterScanner.nextLine();
            playersettings();
        }
        else if(ch==4){
            System.out.println("Current Version: v1.0.0");
            System.out.println("Released   on  : 5 JULY 2020");
            System.out.println("Check out the GitHub page of the game for latest updates!");
            playersettings();
        }
        else if(ch==0){
            startmenu();
        }
        else{
            playersettings();
        }
    }

    void auth()
    {
        System.out.println("\nWelcome to Dungeons & Dragons, a text-based, open world game with an adventurous storyline and a thrilling gameplay.");
        System.out.println("From the thrills to sound of geese calling at night, to the whispering wind through the pines, to the unexpected red of mistletoe on an oak;\nembark on an action-packed adventure in worlds of swords and sorcery.\nDelve into an immersive experience as you explore the mysterious little town of Kaza, full of various elements of surprise.\n");
        System.out.println("|Press any key to continue|");
        prodkey=sc.nextLine();
        if(prodkey.equals("admin"))
        {
            admincenter();
        }
        else
        {
            System.out.println("\n");
            startmenu();
        }
    }

    public static void main(String[] args)
    {
        dnd ob=new dnd();
        System.out.println("*****************************");
        System.out.println("      DUNGEONS & DRAGONS       ");
        System.out.println(" *****************************");
        ob.auth();
    }
}