import java.util.Scanner;


public class Main {
    static int waitAnger=0;
    static int boom=0;
    static int shoppingItem=0;
    static boolean shopping=true;
    static boolean trueShopping=true;
    static int doneShop=0;
    static boolean shoppingFrenzy=true;
    static int countHell=0;
    static Scanner userStringInput = new Scanner(System.in);
    static Scanner userIntInput=new Scanner(System.in);
    static int gold=100000000;
    static int pA=0;
    static int swordBought=0;
    public static void main(String[] args)
    {
//Hero.test();
        while(shopping)
        {
        doneShop=0;
        swordBought=0;
        gold = (int)(Math.random() * 490) + 10;
        greetUser();
        //System.out.println(WorldGen.charators.get(0).getGold());
        WorldGen.inStock();
        System.out.println("gold: "+gold);
        // while(trueShopping)
        // {
        showStock();
        pA=0;
        // buy();
        // }
        }

    }
    //hello
    public static void greetUser()
    {
    System.out.println("What is your name?");
    String name = userStringInput.nextLine();
    System.out.println("hello "+ name);
    //WorldGen.charators.get(0).setName(name);
    System.out.println();
    WorldGen.summon();
    }
    public static void showStock()
    {
        for (int i =0; i< WorldGen.stock.size(); i++)
        {
            System.out.println("("+(i+1)+") "+ WorldGen.stock.get(i).getWeaponName()+"  "+WorldGen.stock.get(i).getCost());
        }
        // for(Weapon w: WorldGen.stock)
        // {
        //     System.out.println("("+(w+1)+") "+ w.get(w).getWeaponName()+"  "+w.get(w).getCost());
        // }
        // for (int i =0; i< WorldGen.gear.size(); i++)
        // {
        //     System.out.println("("+(i+1)+") "+ WorldGen.gear.get(i).getWeaponName()+"  "+WorldGen.gear.get(i).getCost());
        // }
        shoppingItem = userIntInput.nextInt();
        if(shoppingItem>WorldGen.stock.size())
        {
            showStock();
        }
        // if(shoppingItem>WorldGen.gear.size())
        // {
        //     showStock();
        // }
        System.out.println("");
         buy();
    }
    private static void buy()
    {
        if (boom==0)
        {
            if(doneShop==0)
                {
                    // always go to:https://www.fantasynamegenerators.com/
                int DMHell=0;
                System.out.println("(1) Buy "+ WorldGen.stock.get(shoppingItem-1).getWeaponName());
                //System.out.println("(1) Buy "+ WorldGen.gear.get(shoppingItem-1).getWeaponName());
                System.out.println("(2) Look Around");
                System.out.println("(3) Ask for Another sword");
                System.out.println("(4) Ask for Information.");
                System.out.println("(5) Attack");
                System.out.println("(6) Wait");
                System.out.println("(7) Exit");
                DMHell = userIntInput.nextInt();
                System.out.println();
                    if(DMHell==1)
                        {
                        if(WorldGen.stock.get(shoppingItem-1).getCost()<gold)
                        {
                        gold=gold-WorldGen.stock.get(shoppingItem-1).getCost();
                        System.out.println("You bought "+ WorldGen.stock.get(shoppingItem-1).getWeaponName()+" that can do "+WorldGen.stock.get(shoppingItem-1).getWeaponDamage()+" damage for "+WorldGen.stock.get(shoppingItem-1).getCost()+" gold.");
                        swordBought++;
                        System.out.println("remaning gold: "+gold);
                        WorldGen.stock.remove(shoppingItem-1);
                        System.out.println("");
                        showStock();
                        }
                        // if(WorldGen.gear.get(shoppingItem-1).getCost()<gold)
                        // {
                        // gold=gold-WorldGen.gear.get(shoppingItem-1).getCost();
                        // swordBought++;
                        // System.out.println("You bought "+ WorldGen.gear.get(shoppingItem-1).getWeaponName()+" that can do "+WorldGen.gear.get(shoppingItem-1).getWeaponDamage()+" damage for "+WorldGen.gear.get(shoppingItem-1).getCost()+" gold.");
                        // System.out.println("remaning gold: "+gold);
                        // WorldGen.gear.remove(shoppingItem-1);
                        // System.out.println("");
                        // showStock();
                        // }
                        if(WorldGen.stock.get(shoppingItem-1).getCost()>gold||WorldGen.stock.get(shoppingItem-1).getCost()<0)
                        {
                            Guido();
                        }
                        }
                    else if(DMHell==2)
                        {
                        System.out.println("A small shop with a red awning,");
                        System.out.println("this weapon shop is the home of an old swords vendor.");
                        System.out.println("The shop is laden with swords of all sorts hung from hooks,");
                        System.out.println("or stuffed into crates set up behind the shop");
                        System.out.println("");
                        buy();
                        }
                    else if(DMHell==3)
                        {
                        System.out.println("gold: "+gold);
                        System.out.println("");
                        showStock();
                        }
                    else if(DMHell==4)
                        {
                            String direction = "";
                            int findDirection = (int)(Math.random() * 4);
                            if (findDirection==0)
                            {
                                direction="north";
                            }
                            else if (findDirection==1)
                            {
                                direction="south";
                            }
                            else if (findDirection==2)
                            {
                                direction="east";
                            }
                            else if (findDirection==3)
                            {
                                direction="west";
                            }
                        System.out.println("'There seems to be a goblin camp "+direction+" of the city' says the shopkeeper.");
                        System.out.println("");
                        buy();
                        }
                    else if(DMHell==5)
                        {
                        System.out.println("As you raise your sword to attack, "+WorldGen.stock.get(shoppingItem-1).getWeaponName()+" falls onto your head, killing you instantly.");
                        System.out.println("");
                        doneShop=1;
                        playAgain();
                        }
                    else if(DMHell==6)
                        {
                        waitAnger++;
                        Warlock();
                        buy();
                        }
                        else if(DMHell==7)
                        {
                        System.out.println("You bought " +swordBought+ " swords.");
                        playAgain();
                        
                        }
                    else
                        {
                        System.out.println("You cannot do that");
                        System.out.println("");
                        buy();
                        }
                }

        else if(doneShop==1)
            {
            }
        }
        else {
            
        }
    }
    private static void Warlock()
    {
        if(waitAnger==0)
        {

        }
        else if(waitAnger>0&&waitAnger<4)
        {
            System.out.println("I suggest to not wait any longer.");
            System.out.println("");
            buy();
        }
        else if(waitAnger==4)
        {
            System.out.println("I really suggest to not wait any longer.");
            System.out.println("");
            buy();
        }
        else if(waitAnger==5)
        {
            System.out.println("If you wait one more time you will not like it.");
            System.out.println("");
            buy();
        }
        else if(waitAnger==6)
        {
            System.out.println("*ELDRITCH BLAST*");
            System.out.println("");
            boom =1;
            playAgain();
        }
    }
    private static void Guido()
    {
        if(pA==0)
        {

        
        if (WorldGen.stock.get(shoppingItem-1).getCost()>gold)
        {
        System.out.println("Guido walks into the small shop, his hulking size overshadows you and the shopkeeper.");
        System.out.println("Guido places a huge meaty hand on your shoulder, you feel it screaming in agony as he puts pressure on it.");
        System.out.println("Guido then booms,");
        System.out.println("'You don't have that much money criminal,' *Bang!!*");
        }
        else
        {
        System.out.println("Guido walks into the small shop, his hulking size overshadows you and the shopkeeper.");
        System.out.println("Guido places a huge meaty hand on your shoulder, you feel it screaming in agony as he puts pressure on it.");
        System.out.println("Guido then booms,");
        System.out.println("'You buy with negative gold criminal,' *Bang!!*");
        }
    boom =1;
    shopping=false;
        }
        else {
            boom=0;

            
        }
    }

    private static void playAgain()
    {
        if(boom==0)
        {
            pA=0;
            System.out.println("Do you want to play again?");
            System.out.println();
            System.out.println("(1) Yes");
            System.out.println("(2) No");
            pA= userIntInput.nextInt();
            if(pA==1)
                {
                System.out.println("You continue shopping");
                System.out.println();
                doneShop=1;
                countHell=0;
               // trueShopping=false;
                }
            else if(pA==2)
                {
                System.out.println("Your Jorney continues");
                //trueShopping=false;
                shopping=false;
                }
        }
        else if (boom==1){
            shopping=false;
        }
    }

}