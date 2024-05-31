import java.util.Scanner;
class TextAnimation 
{

    static String def = "\u001B[0m";
    static String bold="\033[0;1m";
    static String blink ="\u001B[5m";
    static String yellow ="\u001B[33m";
    static String red = "\u001B[31m";
    static String blue = "\u001B[34m";
    static String green = "\u001B[32m";
    static String orange="\u001B[38;5;202m";
    static String purple = "\u001B[35m";
    static String skblue = "\u001B[36m";

       //FOR TEXT ANIMATION
    static void animateText(String text, int delay) 
    {
        for (char c : text.toCharArray()) 
        {
        System.out.print(c);
        try 
        {
        Thread.sleep(delay);
        } 
        catch (InterruptedException e) 
        {
        e.printStackTrace();
        }
        }
    }

    //FOR CLEARCANSOLE
    static void clearConsole() 
    {
        try 
        {
        final String os = System.getProperty("os.name");
        if (os.contains("Windows")) 
        {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } 
        else 
        {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        }
        } 
        catch (final Exception e) 
        {
        e.printStackTrace();
        }
    }

     //INTRO TEXT 
  static void Animation()
   {
        String asciiArt = 
            red +
            "                                                                                                       ************                                                                                               \n" +
            "                                                                                                       *************                                                                                              \n" +
            "                                                                                                     ****************                                                                                             \n" +
            "                                                                                                     ****************                                                                                             \n" +
            "                                                                                                       *************                                                                                              \n" +
            "                                                                                                       *************                                                                                              \n" +
            "                                                                                                       *************                                                                                              \n" +
            "                                                                                                       *************                                                                                              \n" +
            "                                                                                                       *************                                                                                              \n" +
            "                                                                                                       *************                                                                                              \n" +
            "                                                                                                       *************                                                                                              \n" +
            "                                                                                                       *************                                                                                              \n" +
            "                                                                                                       *************                                                                                              \n" +
            "                                                                                                       *************                                                                                              \n" +
            "                                                                                                       *************                                                                                              \n" +
            "                                                                                                       *************                                                                                              \n" +
            "                                                                                                       *************                                                                                              \n" +
            "                                                                                                       *************                                                                                              \n" +
            "                                                                                                       *************                                                                                              \n" +
            "                                                                                                      **************                                                                                              \n" +
            "                                                                                                  **********************                                                                                          \n" +
            "                                                                                              *******************************                                                                                     \n" +
            "                                                                                            ***********************************                                                                                   \n" +
            "                                                                                           *************************************                                                                                  \n" +
            "                                                                                           *************************************                                                                                  \n" +
            "                                                                                           ********                    *********                                                                                  \n" +
            "                                                                                           *******                       *******                                                                                  \n" +
            "                                                                                           ******                         ******                                                                                  \n" +
            "                                                                                           *****                           *****                                                                                  \n" +
            "                                                                                           *****                            ****                                                                                  \n" +
            "                                                                                           ****                             ****                                                                                  \n" +
            "                                                                                           ***                              ****                                                                                  \n" +
            "                                                                                           ***                               ***                                                                                  \n" +
            "                                                                                           ***                              ****                                                                                  \n" +
            "                                                                                           ***                              ****                                                                                  \n" +
            "                                                                                           ****                            *****                                                                                  \n" +
            "                                                                                           *****                          ******                                                                                  \n" +
            "                                                                                           ******                        *******                                                                                  \n" +
            "                                                                                           *******                     *********                                                                                  \n" +
            "                                                                                           *********                  **********                                                                                  \n" +
            bold+"\u001B[5m"+red+"                                                * * * * * * *    * *           * *  "+def+red+"       ************            *************  "+bold+"\u001B[5m"+red+"      * *           * *     * * * * *   * * *     * *     * * * * * *           \n" +
            bold+"\u001B[5m"+red+"                                               * * * * * * *      * *         * *   "+def+red+"       ***************      ****************  "+bold+"\u001B[5m"+red+"      * *           * *     * * * * *   * ** *    * *     * * * * * *           \n" +
            bold+"\u001B[5m"+red+"                                              * * *                * *       * *    "+def+red+"       *****************   *****************  "+bold+"\u001B[5m"+red+"      * *           * *        * *      * * * *   * *     * *                   \n" +
            bold+"\u001B[5m"+red+"                                              * * *                 * *     * *     "+def+red+"       *****************   *****************  "+bold+"\u001B[5m"+red+"      * *  * * * *  * *        * *      * *  * *  * *     * * * * * *           \n" +
            bold+"\u001B[5m"+red+"                                              * * *                  * *   * *      "+def+red+"       *****************   *****************  "+bold+"\u001B[5m"+red+"      * * * * * * * * *        * *      * *   * * * *     * * * * * *           \n" +
            bold+"\u001B[5m"+red+"                                              * * *                   * * * *       "+def+red+"       *****************   *****************  "+bold+"\u001B[5m"+red+"      * ** *     * ** *        * *      * *    * ** *     * *                   \n" +
            bold+"\u001B[5m"+red+"                                               * * * * * * *           * * *        "+def+red+"       *****************   *****************  "+bold+"\u001B[5m"+red+"      * * *       * * *     * * * * *   * *     * * *     * * * * * *           \n" +
            bold+"\u001B[5m"+red+"                                                * * * * * * *           * *         "+def+red+"       *****************   *****************  "+bold+"\u001B[5m"+red+"      * *           * *     * * * * *   * *      * **     * * * * * *           \n" +
            "                                                                                   "+def+red+"        *****************   *****************                                                                                  \n" +
            "                                                                                   "+def+red+"        *****************   *****************                                                                                  \n" +
            "                                                                                   "+def+red+"        *****************   *****************                                                                                  \n" +
            "                                                                                   "+def+red+"        ****************    *****************                                                                                  \n" +
            "                                                                                   "+def+red+"        ****************    *****************                                                                                  \n"+def+
            "                                                                                                                                                                                                                  \n" +
            "                                                                                                                                                                                                                  \n" +
            bold+"\u001B[5m"+blue+"                                                                          * ** *       * ** *           * *            * * * * * *   * * * * * *                                                                  \n" +
            bold+"\u001B[5m"+blue+"                                                                          * * * *     * * * *          * * *           * * * * * *   * * * * * *                                                                  \n" +
            bold+"\u001B[5m"+blue+"                                                                          * *   * * * *   * *         * * * *          * *     * *       * *                                                                      \n" +
            bold+"\u001B[5m"+blue+"                                                                          * *    * * *    * *        * *   * *         * * * * *         * *                                                                      \n" +
            bold+"\u001B[5m"+blue+"                                                                          * *             * *       * * * * * *        * * * * *         * *                                                                      \n" +
            bold+"\u001B[5m"+blue+"                                                                          * *             * *      * * * * * * *       * *    * *        * *                                                                      \n" +
            bold+"\u001B[5m"+blue+"                                                                          * *             * *     * *         * *      * *     * *       * *                                                                      \n" +
            bold+"\u001B[5m"+blue+"                                                                          * *             * *    * *           * *     * *     * *       * *                                                     "+def;
        


        animateText(asciiArt, 1);
        System.out.print(def);

         
    }
}

class LoginPage  extends TextAnimation
{
    private static int MinRandom =1000;
    private static int MaxRandom =9999;
    private static int MaxAttempts =1;
    
      // MOBILE NUMBER VALIDATION
    static boolean MobileNumberValidation(Long MobileNumber)
    {
         if(MobileNumber>=6000000000L && MobileNumber <=9999999999L)
         {
           return true;
         }
         else
         {
         return false;
         }
    }

    // OTP GENERATION
    int RandomNumber(int min,int max)
    {
         int randomNum = min + (int) (Math.random() * (max - min));
         return randomNum;
    }

      //WELCOME PAGE AND MOBILE NUMBER AND OTP VALIDATION PAGE FOR USER LOGIN
    static void loginpage()
    {
        LoginPage obj = new LoginPage();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\n");
         System.out.println(bold+blue+"                ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
         System.out.println(bold+green+"                **                                                                                   WELCOME TO CV WINEMART                                                                             **");
         System.out.println(bold+blue+"                ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"+def);     

         System.out.println(def);
         String getstarted=bold+green+"\n\t\t\t\t\t\t\t\t"+"        --------------------------------GET STARTED----------------------------\n";
         TextAnimation.animateText(getstarted, 40);
        int NumberofAttempts=4;
        boolean jj =true;
        System.out.println(bold+green+"\n\t\t\t\t\t\t\t\t"+"        "+"-------------------ARE YOU 21 YEARS OF AGE OR OLDER?-------------------\n");
        while(jj)
        {
        System.out.print(bold+green+"\t\t\t\t\t\t\t\t"+"        "+"CHOOSE((1)YES OR (2)NO "+bold+red);
        String name =sc.next();
        if(name.equals("1"))
        {
        while(true)
        {
            jj =false;
        System.out.println(bold+green+"\n\t\t\t\t\t\t\t\t"+"        ---------------Enter your mobile number below to get OTP---------------\n");
        System.out.print(bold+green+"\t\t\t\t\t\t\t\t        +91"+red);
        long MobileNumber =sc.nextLong();
        if(MobileNumberValidation(MobileNumber))
        {
              int RandomNum = obj.RandomNumber(MinRandom,MaxRandom);
                                                              
              String otpsent=bold+green+"\n\t\t\t\t\t\t\t\t"+"        ------------------CV Winemart] OTP SENT SUCCESSFULLY-------------------\n";
              TextAnimation.animateText(otpsent, 40);
              System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t      [CV Winemart] Your OTP for CV Winemart Login is\n\t\t\t\t\t\t\t\t\t\t\t\t           "+bold+red+RandomNum+def+bold+green+"\n\t\t\t\t\t\t\t\t\t\t          This OTP is valid for 5 minutes only. \n");
                for(int Attempt=3;Attempt>=MaxAttempts;Attempt--)
                {
                System.out.println(bold+green+"\n\t\t\t\t\t\t\t\t"+"        "+"Enter your OTP (Attempts Remaining : "+bold+Attempt+bold+green+")\n");
                System.out.print("\t\t\t\t\t\t\t\t"+"        "+bold+green+"OTP: "+bold+red);
                int OTP =sc.nextInt();
                  if(RandomNum ==OTP)
                  {
                    String otpvalidation=bold+yellow+"\n\t\t\t\t\t\t\t\t"+"        ----------------------OTP VALIDATION SUCCESSFULLY----------------------\n";
                        TextAnimation.animateText(otpvalidation, 40);
                        TextAnimation.clearConsole();
                        //DASHBOARD BEGINS
                        WineOrderingApp.obj.Dashboard();
                         return;
                  }
                  else
                  {
                    if(Attempt!=1)
                    {
                    String invalidotp="\n\t\t\t\t\t\t\t\t"+"        -----------------Invalid OTP. Please enter a valid OTP.----------------";
                    TextAnimation.animateText(invalidotp, 40);
                    }
                           
                  NumberofAttempts--;
                  }
                }
             if(NumberofAttempts==MaxAttempts)
             {
             String tomanyattempts="\n\t\t\t\t\t\t\t\t"+"        ---------TOO MANY INCORRECT ATTEMPTS. TRY AGAIN AFTER 24 HOURS---------\n";
             TextAnimation.animateText(tomanyattempts, 40);
             return;
             }
        }
        else
        {
          String notvalid="\n\t\t\t\t\t\t\t\t"+"        ------------------PLEASE ENTER A VALID MOBILE NUMBER-------------------\n";
          TextAnimation.animateText(notvalid, 40);

        }
        }
        }
        else if(name.equals("2"))
        {
        String ll="\n\t\t\t\t\t\t\t\t"+"        "+"-------YOU MUST BE ATLEAST 21 YEARS OLD TO BUY IN APP PURCHASES!-------";
        TextAnimation.animateText(ll,40);
        System.exit(0);
        }
        else
        {
          System.out.println(WineOrderingApp.bold+WineOrderingApp.red+"\n\t\t\t\t\t\t\t\t        PLEASE ENTER A VALID OPTION!\n");   
        }
        }
    }
}
 
class Wine 
{
    private String WineName;
    private double WinePrice;

    Wine(String wineName, double winePrice) 
    {
        this.WineName = wineName;
        this.WinePrice = winePrice;
    }

    String GetName() 
    {
        return WineName;
    }

    double GetPrice() 
    {
        return WinePrice;
    }
}

class ShoppingCart 
{
    static WineOrderingApp obj = new WineOrderingApp();
    private Wine[] items = new Wine[40];
    static int tt6=0;
    static int tt7=0;
    static int tt8=0;
    static int tt9 =0;

     int itemCount = 0;
     int quantity;
    void addItem(Wine wine) 
    {
            System.out.print(WineOrderingApp.bold+WineOrderingApp.green+"\n\t\t\t\t\t\t\t\t        SELECT QUANTITY : "+WineOrderingApp.bold+WineOrderingApp.red);
            quantity = WineOrderingApp.sc.nextInt(); 
            if(quantity==0)
            {
                System.out.println(WineOrderingApp.bold+WineOrderingApp.red+"\n\t\t\t\t\t\t\t\t        PLEASE ENTER A VALID OPTION!");
            }
            else 
            {
        if ((itemCount+quantity)<=items.length) 
        {
            
            if(itemCount<=items.length)
            {
            for (int i = 0; i < quantity; i++) 
            {
                items[itemCount++] = wine;
                
            }
               System.out.println(WineOrderingApp.bold+WineOrderingApp.red+"\n\t\t\t\t\t\t\t\t        "+wine.GetName()+" "+WineOrderingApp.bold+WineOrderingApp.green+" * "+quantity);
               String abcde = "\n\t\t\t\t\t\t\t\t        "+WineOrderingApp.bold+WineOrderingApp.green+"ADDED TO YOUR CART!                          \n";
               TextAnimation.animateText(abcde,40);
               System.out.print("\n\t\t\t\t\t\t\t\t        "+WineOrderingApp.bold+WineOrderingApp.green+"TOTAL CART ITEMS : "+WineOrderingApp.bold+WineOrderingApp.red+itemCount+WineOrderingApp.bold+WineOrderingApp.green+"       REMAINING CART CAPACITY : "+WineOrderingApp.bold+WineOrderingApp.red+(40-itemCount)+"\n");
            }  
        }

        else if(itemCount==40)
        {
        String cartworn=WineOrderingApp.bold+WineOrderingApp.red+"\n\t\t\t\t\t\t\t\t        SORRY, YOUR CART IS FULL. YOU CANNOT  ADD MORE THAN 40 ITEMS.             \n"+
                        WineOrderingApp.bold+WineOrderingApp.green+"\n\t\t\t\t\t\t\t\t        FOR DELETING ITEMS OR CLEARING CART OPEN CART TAB\n";
        TextAnimation.animateText(cartworn,40);
        System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+WineOrderingApp.bold+WineOrderingApp.green+"(PRESS 11) TO OPEN CART"); 
        }  
        else
            {
             String cartworn=WineOrderingApp.bold+WineOrderingApp.red+"\n\t\t\t\t\t\t\t\t        SORRY YOU CANNOT  ADD MORE THAN 40 ITEMS INTO CART.             \n";
             TextAnimation.animateText(cartworn,40);
            }
        }
        
        
    }

    Wine getItem(int index) 
    {
        if (index >= 0 && index < itemCount) 
        {
            return items[index];
        } 
        else 
        {
            return null;
        }
    }

    public double calculateTotal() 
    {
        double total = 0.0;
        for (int i = 0; i < itemCount; i++) 
        {
            total += items[i].GetPrice();
        }
        return total;
    }

      
     public double gst()
      {
             double gst1 =8/100.0*calculateTotal();
            double gst =(int)gst1+calculateTotal();

          return gst;
      }
      
      double discount()
      {
           return (int)8/100.0*calculateTotal();
      }
    


    void clearcart()
    {

        for(int i=0;i<itemCount;i++)
        {
            items[i]=null;
        }
        itemCount=0;
        String cartclear= "\n\n\t\t\t\t\t\t\t\t        "+WineOrderingApp.bold+WineOrderingApp.red+"                       YOUR CART IS CLEARED!                           \n";
        TextAnimation.animateText(cartclear,40);

                 tt6=1;
                 if(tt6==1)
                 {
                 vieworder();
                tt6=0;
                }
    }

    void deleteItem() 
    {
        if (itemCount > 0) 
        {
            System.out.print(WineOrderingApp.bold+WineOrderingApp.green+"\n\t\t\t\t\t\t\t\t"+"        "+"ENTER THE ITEM NUMBER YOU WANT TO DELETE :"+WineOrderingApp.bold+WineOrderingApp.red);
            int itemNumber = WineOrderingApp.sc.nextInt();
            if (itemNumber >= 1 && itemNumber <= itemCount) 
            {
                
                System.out.println(WineOrderingApp.bold+WineOrderingApp.green+"\t\t\t\t\t\t\t\t"+"        "+"REMOVING " +WineOrderingApp.bold+WineOrderingApp.def+items[itemNumber - 1].GetName() +WineOrderingApp.bold+WineOrderingApp.green+" FROM YOUR CART!");
                items[itemNumber - 1] = null;
                Rearrenging();
                itemCount--;
                tt6=1;
                 if(tt6==1)
                 {
                 vieworder();
                tt6=0;
                }   
            } 
            else 
            {
                System.out.println(WineOrderingApp.bold+WineOrderingApp.red+"\n\t\t\t\t\t\t\t\t"+"        "+"INVALID ITEM NUMBER. PLEASE ENTER A NUMBER BETWEEN 1 AND " + itemCount + ".");
            }
        } 
        else 
        {
            System.out.println(WineOrderingApp.bold+WineOrderingApp.green+"\t\t\t\t\t\t\t\t"+"        "+"YOUR CART IS EMPTY NOTHING TO DELETE!");
        }
    }
     private void Rearrenging() {
        Wine[] newItems = new Wine[items.length];
        int newIndex = 0;

        for (int i = 0; i < items.length; i++) 
        {
            if (items[i] != null) 
            {
                newItems[newIndex] = items[i];
                newIndex++;
            }
        }

        items = newItems;
    }

void vieworder() 
    {
    
        boolean reload =true;
        while(reload)
        {
        TextAnimation.clearConsole();
        obj.tt3=1;
        String  cart =WineOrderingApp.bold+WineOrderingApp.orange+"\n\t\t\t\t\t\t\t\t"+"        "+"----------------------------- OPENING CART ----------------------------\n\n\n"+WineOrderingApp.bold+WineOrderingApp.green;
        TextAnimation.animateText(cart,40);                     
        if(itemCount!=0)
        {
        System.out.println(WineOrderingApp.bold+WineOrderingApp.green+"\n\t\t\t\t\t\t\t\t"+"        -----------------------------------------------------------------------\n");
        System.out.println(WineOrderingApp.bold+WineOrderingApp.green+"\t\t\t\t\t\t\t\t"+"        "+"YOUR ORDERS :");   
        for (int i = 0; i < itemCount; i++) 
        {
            Wine item = getItem(i);
            String k="";
            if (item != null) 
            {
                if(i<9)
                {
                    k="0";
                }
                System.out.println(WineOrderingApp.bold+WineOrderingApp.green+"\n\t\t\t\t\t\t\t\t"+"        "+k+(i + 1) + ") "+WineOrderingApp.bold+WineOrderingApp.def+item.GetName()+ "  ----> " +item.GetPrice()+" Rs. ");
            }
        }
        System.out.println(WineOrderingApp.bold+WineOrderingApp.green+"\n\t\t\t\t\t\t\t\t"+"        -----------------------------------------------------------------------");
        System.out.println(WineOrderingApp.bold+WineOrderingApp.green+"\t\t\t\t\t\t\t\t"+"        "+"TOTAL ITEMS : "+WineOrderingApp.bold+WineOrderingApp.def+itemCount+WineOrderingApp.bold+WineOrderingApp.green+"                             "+"TOTAL BILL IS : " +WineOrderingApp.bold+WineOrderingApp.def+calculateTotal()+"Rs.");
        System.out.println(WineOrderingApp.bold+WineOrderingApp.green+"\t\t\t\t\t\t\t\t"+"        -----------------------------------------------------------------------\n");
        break;
        }
        else
        {
          System.out.print("\t\t\t\t\t\t\t\t"+"        "+WineOrderingApp.bold+WineOrderingApp.red+"                           YOUR CART IS EMPTY");
          break;
        }
        

    }
    }

    void vieworder1() 
    {
        if(tt7==0)
        {
         billing.Custdetails();
        }
        else
        {
            billing.Billing();
        }
        obj.tt3=1;             
        if(itemCount!=0)
        {
        
        System.out.printf("%55s","|"+WineOrderingApp.bold+WineOrderingApp.green+" S.NO   "+WineOrderingApp.def+"  |");System.out.printf(WineOrderingApp.bold+WineOrderingApp.green+"%36s","YOUR ORDERS");System.out.printf(WineOrderingApp.def+"%37s","|");System.out.printf(WineOrderingApp.bold+WineOrderingApp.green+"%60s","TOTAL AMOUNT");System.out.printf(WineOrderingApp.def+"%37s\n","|");
        System.out.println("                            --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");   
        for (int i = 0; i < itemCount; i++) 
        {
            Wine item = getItem(i);
            String k="";
            if (item != null) 
            {
                if(i<9)
                {
                    k="0";
                }
                System.out.printf("%29s %1s       | ","|",k+(i + 1));System.out.printf("%1s"," ");System.out.printf("%-70s|",item.GetName());System.out.printf("%20s","----->");System.out.printf("%37s",item.GetPrice());System.out.printf("%40s\n","|");
            }
        }
         System.out.println("                            --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
         System.out.print("                            |");System.out.printf(WineOrderingApp.bold+WineOrderingApp.green+"%45s %-2s","TOTAL ITEMS"+WineOrderingApp.def+" : ",itemCount);System.out.printf(WineOrderingApp.bold+WineOrderingApp.green+"%91s","TOTAL BILL IS :");System.out.printf(WineOrderingApp.def+"%-45s",calculateTotal());System.out.println("|");
         System.out.println("                            --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
         
        System.out.print("                            |");System.out.printf("%-130s","");System.out.printf(WineOrderingApp.bold+WineOrderingApp.green+"%1s","GST : ");System.out.printf(WineOrderingApp.def+"%-44s",discount());System.out.println("|");
        System.out.println("                            --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.print("                            |");System.out.printf("%-121s","");System.out.printf(WineOrderingApp.bold+WineOrderingApp.green+"%1s","GRAND TOTAL : ");System.out.printf(WineOrderingApp.def+"%-45s",gst());System.out.println("|");
         System.out.println("                            --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
        else
        {
          System.out.print("\t\t\t\t\t\t\t\t"+"        "+WineOrderingApp.bold+WineOrderingApp.red+"                           YOUR CART IS EMPTY");
         
        }
       

    }

    void billingoptions()
    {
       boolean t =true;
        while(t)
        {
            if(tt8==1)
            {
            vieworder1();
            tt8=0;
            }
             System.out.println(WineOrderingApp.bold+WineOrderingApp.green+"                            1) PROCEED TO PAY"+WineOrderingApp.bold+WineOrderingApp.green);
             System.out.println(WineOrderingApp.bold+WineOrderingApp.green+"                            0) BACK TO CART"+WineOrderingApp.bold+WineOrderingApp.green);
             System.out.print(WineOrderingApp.bold+WineOrderingApp.green+"                            CHOOSE YOUR OPTION: "+WineOrderingApp.bold+WineOrderingApp.red);
        String c =WineOrderingApp.sc.next();
        switch(c)
        {
        case "0":
            t =false;
            tt9=1;
        break;
        case "1" :
           PaymentGatway.paymentmodels();
        break;

        default :
        String validoption3 =WineOrderingApp.bold+WineOrderingApp.red+"\n\t\t\t\t\t\t\t\t"+"                             PLEASE SELECT A VALID CHOICE!                     \n";
        TextAnimation.animateText(validoption3,40);
        break;
        }
        } 
    }
    
}
interface Payment
{
    void Cashondelivery();
    void Gpay();
    void phonepay();
}
class PaymentGatway implements Payment
{
    static Scanner sc=new Scanner(System.in);
    static Payment obj2 =new PaymentGatway();
    static billing obj1 = new billing();
    static double total=1000;
    static boolean tr;
    static void  intro()
    {
        TextAnimation.clearConsole();
        String Payementgatway =WineOrderingApp.bold+WineOrderingApp.green+"\n\t\t\t\t\t\t\t\t"+"        "+"----------------------- OPENING PAYEMENT GATEWAY ----------------------\n\n";
        TextAnimation.animateText(Payementgatway,40);
        System.out.println(WineOrderingApp.bold+WineOrderingApp.green+"\n\t\t\t\t\t\t\t\t"+"        -----------------------------------------------------------------------");
        System.out.println(WineOrderingApp.bold+WineOrderingApp.green+"\n\t\t\t\t\t\t\t\t"+"        1) FOR CASH ON DELIVERY");
        System.out.println(WineOrderingApp.bold+WineOrderingApp.green+"\n\t\t\t\t\t\t\t\t"+"        2) FOR GOOGLE PAY");
        System.out.println(WineOrderingApp.bold+WineOrderingApp.green+"\n\t\t\t\t\t\t\t\t"+"        3) FOR PHONE PE");
        System.out.println(WineOrderingApp.bold+WineOrderingApp.green+"\n\t\t\t\t\t\t\t\t"+"        -----------------------------------------------------------------------");
        System.out.println(WineOrderingApp.bold+WineOrderingApp.green+"\n\t\t\t\t\t\t\t\t"+"        0) FOR PREVIOUS MENU");
        System.out.print(WineOrderingApp.bold+WineOrderingApp.green+"\n\t\t\t\t\t\t\t\t"+"        CHOOSE YOUR OPTION : "+WineOrderingApp.bold+WineOrderingApp.red);

    }
    static void paymentmodels()
    {
        intro();
        tr =true;
        while(tr)
        {
         
        String option=sc.next();
        switch(option)
        {
            case "1":
            
                
                obj2.Cashondelivery();
                break;
            
            case "2":
            
                obj2.Gpay();
                break;
            
            case "3":
                obj2.phonepay();
                break;
            case "0" :
               tr =false;
               ShoppingCart.tt8=1;
               break;   
            default:
            String validoption1 =WineOrderingApp.bold+WineOrderingApp.red+"\n\t\t\t\t\t\t\t\t"+"                             PLEASE SELECT A VALID CHOICE!                     \n";
            TextAnimation.animateText(validoption1,40);
            break;
        }
        }
            
    }
    public void Cashondelivery()
    {
        System.out.println("\n\t\t\t\t\t\t\t\t"+WineOrderingApp.bold+WineOrderingApp.green+"        YOUR TOTAL BILL IS "+WineOrderingApp.bold+WineOrderingApp.red+WineOrderingApp.obj.gst());
        String pay1 = "\n\t\t\t\t\t\t\t\t"+WineOrderingApp.bold+WineOrderingApp.green+"        YOUR ORDER HAS BEEN SUCCESSUFFY PLACED\n"+
                      "\n\t\t\t\t\t\t\t\t"+WineOrderingApp.bold+WineOrderingApp.green+"        YOUR ORDER ID IS : "+WineOrderingApp.bold+WineOrderingApp.red+obj1.TransID();
         TextAnimation.animateText(pay1,40);
            tr =false;

            System.exit(0);
    }
    public void Gpay()
    {
        boolean pay1 =true;
        System.out.println(WineOrderingApp.bold+WineOrderingApp.green+"\n\t\t\t\t\t\t\t\t"+"        YOUR TOTAL BILL IS "+WineOrderingApp.bold+WineOrderingApp.red+WineOrderingApp.obj.gst());
        while(pay1)
        {
        System.out.print(WineOrderingApp.bold+WineOrderingApp.green+"\n\t\t\t\t\t\t\t\t"+"        PLASE ENTER A UPI ADDRESS(Only @axl,@oksbi) : "+WineOrderingApp.bold+WineOrderingApp.red);
        String upi=sc.next();
        if(upi.length()>=8)
        {
        if(upi.charAt(upi.length()-4)=='@' && upi.charAt(upi.length()-3)=='a' && upi.charAt(upi.length()-2)=='x' && upi.charAt(upi.length()-1)=='l' || upi.charAt(upi.length()-6)=='@' && upi.charAt(upi.length()-5)=='o' && upi.charAt(upi.length()-4)=='k' && upi.charAt(upi.length()-3)=='s'&& upi.charAt(upi.length()-2)=='b' && upi.charAt(upi.length()-1)=='i')
        {
                System.out.println(WineOrderingApp.bold+WineOrderingApp.green+"\n\t\t\t\t\t\t\t\t"+"        UPI ADDRESS IS VALIDATED SUCCESSFULLY ");
                pay1 =false;
                    tr =false;
                    String pay2 =WineOrderingApp.bold+WineOrderingApp.green+"\n\t\t\t\t\t\t\t\t"+"        YOUR PAYMENT HAS BEEN COMPLETED SUCCESSFULLY,THANK YOU \n"+
                    WineOrderingApp.bold+WineOrderingApp.green+"\n\t\t\t\t\t\t\t\t"+"        YOUR ORDER HAS BEEN SUCCESSFULLY PLACED\n"+
                    WineOrderingApp.bold+WineOrderingApp.green+"\n\t\t\t\t\t\t\t\t"+"        YOUR ORDER ID IS : "+WineOrderingApp.bold+WineOrderingApp.red+obj1.TransID();
                    TextAnimation.animateText(pay2,40);


                    System.exit(0);
            
        }
         else
        {
               String pay3 = WineOrderingApp.bold+WineOrderingApp.red+"\n\t\t\t\t\t\t\t\t"+"        INVALID UPI ADDRESS PLEASE TRY AGAIN!\n";
               TextAnimation.animateText(pay3,40);
        }
        }
            else
            {
                String pay4 = WineOrderingApp.bold+WineOrderingApp.red+"\n\t\t\t\t\t\t\t\t"+"        INVALID UPI ADDRESS PLEASE TRY AGAIN!\n";
                TextAnimation.animateText(pay4,40);
            }
            
    }
    }
    public void phonepay()
    {
        boolean pay1 =true;
        System.out.println(WineOrderingApp.bold+WineOrderingApp.green+"\n\t\t\t\t\t\t\t\t"+"        YOUR TOTAL BILL IS "+WineOrderingApp.bold+WineOrderingApp.red+WineOrderingApp.obj.gst());
        while(pay1)
        {
            
        System.out.print(WineOrderingApp.bold+WineOrderingApp.green+"\n\t\t\t\t\t\t\t\t"+"        PLASE ENTER A UPI ADDRESS(Only @ybl,@axl) :"+WineOrderingApp.bold+WineOrderingApp.red);
        String upi =sc.next();
            if(upi.length()>=8)
            {
            if(upi.charAt(upi.length()-4)=='@' && upi.charAt(upi.length()-3)=='y' && upi.charAt(upi.length()-2)=='b' && upi.charAt(upi.length()-1)=='l' || upi.charAt(upi.length()-4)=='@' && upi.charAt(upi.length()-3)=='a' && upi.charAt(upi.length()-2)=='x' && upi.charAt(upi.length()-1)=='l')
            {
                 System.out.println(WineOrderingApp.bold+WineOrderingApp.green+"\n\t\t\t\t\t\t\t\t"+"        UPI ADDRESS IS VALIDATED SUCCESSFULLY ");
                 pay1 =false;
                    tr =false;
                    String pay3 =WineOrderingApp.bold+WineOrderingApp.green+"\n\t\t\t\t\t\t\t\t"+"        YOUR PAYMENT HAS BEEN COMPLETED SUCCESSFULLY,THANK YOU \n"+
                    WineOrderingApp.bold+WineOrderingApp.green+"\n\t\t\t\t\t\t\t\t"+"        YOUR ORDER HAS BEEN SUCCESSFULLY PLACED\n"+
                    WineOrderingApp.bold+WineOrderingApp.green+"\n\t\t\t\t\t\t\t\t"+"        YOUR ORDER ID IS : "+WineOrderingApp.bold+WineOrderingApp.red+obj1.TransID();
                    TextAnimation.animateText(pay3,40);
             System.exit(0);
            }
            else
            {
                String pay4 = WineOrderingApp.bold+WineOrderingApp.red+"\n\t\t\t\t\t\t\t\t"+"        INVALID UPI ADDRESS PLEASE TRY AGAIN!\n";
                TextAnimation.animateText(pay4,40);
            }
            }
            else
            {
                String pay4 = WineOrderingApp.bold+WineOrderingApp.red+"\n\t\t\t\t\t\t\t\t"+"        INVALID UPI ADDRESS PLEASE TRY AGAIN!\n";
                TextAnimation.animateText(pay4,40);
            }
        }
    

}
}

class WineOrderingApp extends ShoppingCart
{
     static Scanner sc = new Scanner(System.in);
     static String def = "\u001B[0m";
     static String bold="\033[0;1m";
     static String blink ="\u001B[5m";
     static String yellow ="\u001B[33m";
     static String red = "\u001B[31m";
     static String blue = "\u001B[34m";
     static String green = "\u001B[32m";
     static String orange="\u001B[38;5;202m";
     static String purple = "\u001B[35m";
     static String skblue = "\u001B[36m";
     static int tt1 =0;
     static int tt2 =0;
     static int tt3 =0;
     static int tt4 =0;
     static int fetch1=0;
     static int fetch2=0;
    
      
       //FOR ORDER WINING TAB

      private static Wine BlendersPride   = new Wine("BLENDERS PRIDE RESERVE COLLECTION WHISKY (750 ML)",1325);
      private static Wine ghost           = new Wine("GHOST Dark Herbal RUM (750 ML)",730);
      private static Wine absolutecitron  = new Wine("ABSOLUTE CITRON LEMON FAVOURED VODKA (750ML)",1910);   
      private static Wine Signature       = new Wine("SIGNATURE PREMIER GRAIN WHISKY (750 ML)",1060);
      private static Wine becardi         = new Wine("Becardi Apple Original Apple RUM (750 ML)",1150);
      private static Wine ketel           = new Wine("KETEL ONE VODKA   (750ML)",1900);
      private static Wine jhonnie         = new Wine("JOHNNIE WALKER RED LABEL BLENDED SCOTCH WHISKY (750 ML)",1800);
      private static Wine commander       = new Wine("Commander N Chief Matured XXX RUM (750 ML)",700); 

      static void CVWinemart11()
      {
      String open1 =bold+orange+"\n\t\t\t\t\t\t\t\t"+"        "+"------------------OPENING CV Winemart - KPHB Phase 1-------------------\n\n"+def;
      TextAnimation.animateText(open1,40);
      System.out.println(bold+green+"\n\t\t\t\t\t\t\t\t"+"        -----------------------------------------------------------------------");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"MENU :\n");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"1) "+bold+def+BlendersPride.GetName()+"       --> "+BlendersPride.GetPrice()+"Rs.");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"2) "+bold+def+ghost.GetName()+"                          --> "+ghost.GetPrice()+" Rs.");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"3) "+bold+def+absolutecitron.GetName()+"            --> "+absolutecitron.GetPrice()+"Rs.");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"4) "+bold+def+Signature.GetName()+ "                 --> "+Signature.GetPrice()+"Rs.");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"5) "+bold+def+becardi.GetName()+"               --> "+becardi.GetPrice()+"Rs.");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"6) "+bold+def+ketel.GetName()+"                               --> "+ketel.GetPrice()+"Rs.");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"7) "+bold+def+jhonnie.GetName()+" --> "+jhonnie.GetPrice()+"Rs.");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"8) "+bold+def+commander.GetName()+"              --> "+commander.GetPrice()+" Rs."); 
      System.out.println(bold+green+"\n\t\t\t\t\t\t\t\t"+"        -----------------------------------------------------------------------");
      
      }

      private static Wine papers          = new Wine("100 PIPERS DELUXE BLENDED SCOTCH WHISKY (750 ML)",2050);
      private static Wine soldierspride   = new Wine("Soldier’s Pride XXX Classic Rum (750 ML)",700);
      private static Wine smirnoff        = new Wine("SMIRNOFF TRIPLE DISTILLED VODKA (750 ML)",1040);
      private static Wine allseasons      = new Wine("ALL SEASONS GOLDEN COLLECTION RESERVE WHISKY (750 ML)",710);
      private static Wine seagrams        = new Wine("Seagram’s Imperial Red Rum (750 ML)",780);
      private static Wine stumbras        = new Wine("STUMBRAS CENTENARY VODKA  (6 BOTTLE) (700ML)",2035);
      private static Wine blackandwhite   = new Wine("BLACK & WHITE BLENDED SCOTCH WHISKY (750 ML)",2210);
      private static Wine rumnintynine    = new Wine("RUM 99 Ninety Nine XXX RUM (750 ML",770);


      static void CVWinemart22()
      {
      String open2 =bold+orange+"\n\t\t\t\t\t\t\t\t"+"        "+"------------------OPENING CV Winemart - Near LULU Mall-----------------\n\n"+def;
      TextAnimation.animateText(open2,40);
      System.out.println(bold+green+"\n\t\t\t\t\t\t\t\t"+"        -----------------------------------------------------------------------");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"MENU :\n");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"1) "+bold+def+papers.GetName()+"       --> "+papers.GetPrice()+"Rs.");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"2) "+bold+def+soldierspride.GetName()+"               --> "+soldierspride.GetPrice()+" Rs.");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"3) "+bold+def+smirnoff.GetName()+"               --> "+smirnoff.GetPrice()+"Rs.");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"4) "+bold+def+allseasons.GetName()+"  --> "+allseasons.GetPrice()+" Rs.");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"5) "+bold+def+seagrams.GetName()+"                    --> "+seagrams.GetPrice()+" Rs.");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"6) "+bold+def+stumbras.GetName()+"           --> "+stumbras.GetPrice()+"Rs.");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"7) "+bold+def+blackandwhite.GetName()+"           --> "+blackandwhite.GetPrice()+"Rs.");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"8) "+bold+def+rumnintynine.GetName()+"                     --> "+rumnintynine.GetPrice()+" Rs.");
      System.out.println(bold+green+"\n\t\t\t\t\t\t\t\t"+"        -----------------------------------------------------------------------");
      }

      private static Wine redlady         = new Wine("Red Lady XXX Rum (750 ML)",1040);
      private static Wine ciroc           = new Wine("CIROC SNAP FROST VODKA (750ML)",3800);
      private static Wine jackies         = new Wine("Jackies Crown Black Finest Blended RUM (750ML)",850);
      private static Wine greygoose       = new Wine("GREY GOOSE VODKA (6 BOTTLE) (750ML)",3285);
      private static Wine mcdowells       = new Wine("Mc Dowell’s No 1 Cariba Premium Gold RUM (750ML)",750);
      private static Wine skyvodka        = new Wine("SKYY VODKA (750ML)",8940);
      private static Wine  chivas         = new Wine("CHIVAS REGAL EXTRA SCOTCH WHISKY (6 BOTTLE) (750 ML)",4670);
      private static Wine oldmonk         = new Wine("Old Monk Apple Rum (750ML)",870);


      static void CVWinemart33()
      {
      String open3 =bold+orange+"\n\t\t\t\t\t\t\t\t"+"        "+"------------------OPENING CV Winemart - Near Mehfill-------------------\n\n"+def;
      TextAnimation.animateText(open3,40);
      System.out.println(bold+green+"\n\t\t\t\t\t\t\t\t"+"        -----------------------------------------------------------------------");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"MENU :\n");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"1) "+bold+def+redlady.GetName()+"                            --> "+redlady.GetPrice()+"Rs.");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"2) "+bold+def+ciroc.GetName()+"                       --> "+ciroc.GetPrice()+"Rs.");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"3) "+bold+def+jackies.GetName()+"       --> "+jackies.GetPrice()+" Rs.");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"4) "+bold+def+greygoose.GetName()+"                  --> "+greygoose.GetPrice()+"Rs.");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"5) "+bold+def+mcdowells.GetName()+"     --> "+mcdowells.GetPrice()+" Rs.");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"6) "+bold+def+skyvodka.GetName()+"                                   --> "+skyvodka.GetPrice()+"Rs.");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"7) "+bold+def+chivas.GetName()+" --> "+chivas.GetPrice()+"Rs.");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"8) "+bold+def+oldmonk.GetName()+"                           --> "+oldmonk.GetPrice()+" Rs.");
      System.out.println(bold+green+"\n\t\t\t\t\t\t\t\t"+"        -----------------------------------------------------------------------");
      } 


      private static Wine m2magic         = new Wine("M2 MAGIC MOMENTS VERVE ORANGE PREMIUM FLAVOURED VODKA (750ML)",1000); 
      private static Wine teachers        = new Wine("TEACHERS 50 BLENDED SCOTCH WHISKY (375ML)",1240);
      private static Wine absolutevodka   = new Wine("ABSOLUTE VODKA (750ML)",1755);
      private static Wine lackgodtriple   = new Wine("LACK DOG TRIPLE GOLD RESERVE BLENDED SCOTCH WHISKY (750 ML)",2795);
      private static Wine magicmoment     = new Wine("MAGIC MOMENT PURE GRAIN VODKA (750ML)",800);
      private static Wine RoyalChallenge  = new Wine("Royal Challenge (1Ltr)",980);


      static void CVWinemart44()
      {
      String open4 =bold+orange+"\n\t\t\t\t\t\t\t\t"+"        "+"-------------------OPENING CV Winemart - Near DMart--------------------\n\n"+def;
      TextAnimation.animateText(open4,40);
      System.out.println(bold+green+"\n\t\t\t\t\t\t\t\t"+"        -----------------------------------------------------------------------");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"MENU :\n");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"1) "+bold+def+m2magic.GetName()+" --> "+m2magic.GetPrice()+"Rs.");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"2) "+bold+def+teachers.GetName()+"                     --> "+teachers.GetPrice()+"Rs.");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"3) "+bold+def+absolutevodka.GetName()+"                                        --> "+absolutevodka.GetPrice()+"Rs.");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"4) "+bold+def+lackgodtriple.GetName()+"   --> "+lackgodtriple.GetPrice()+"Rs.");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"5) "+bold+def+magicmoment.GetName()+"                         --> "+magicmoment.GetPrice()+" Rs.");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"6) "+bold+def+RoyalChallenge.GetName()+"                                        --> "+RoyalChallenge.GetPrice()+" Rs.");
      System.out.println(bold+green+"\n\t\t\t\t\t\t\t\t"+"        -----------------------------------------------------------------------");
      }

     void MainMenu2()
      {
      System.out.println(bold+green+"\n\t\t\t\t\t\t\t\t"+"        -----------------------------------------------------------------------");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+"1) ORDER CVWINE");
      System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+"2) CART");
      System.out.println(bold+green+"\n\t\t\t\t\t\t\t\t"+"        -----------------------------------------------------------------------");
      System.out.print("\n\t\t\t\t\t\t\t\t"+"        "+"0) EXIT APPLICATION");
      }

      
      void Back1()
      {
       
        boolean t =true;
        super.vieworder();
        while(t)
        {
            if(super.tt9==1)
            {
            super.vieworder();
            super.tt9=0;
            }
            System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"0) FOR PREVIOUS MENU       ");
            if(super.itemCount!=0)
            {
            System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"1) CLEAR CART       \n");
            System.out.println("\t\t\t\t\t\t\t\t"+"        "+bold+green+"2) FOR DELETING ITEM       \n");
            System.out.println("\t\t\t\t\t\t\t\t"+"        "+bold+green+"3) PROCEED TO PAY       ");
            }
            System.out.print("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"CHOOSE OPTION: "+bold+red);
        String c =sc.next();
        switch(c)
        {
        case "0":
        t =false;
        tt2=1;
        TextAnimation.clearConsole();
        break;
        case "1" :
            tt2=1;
            obj.clearcart();
            break;
        case "2" :
            tt2=1;
            obj.deleteItem();
            break; 
        case "3" :
            tt2=1;
            super.vieworder1();
            super.billingoptions();
        break;   
        default :
        String validoption3 =bold+red+"\n\t\t\t\t\t\t\t\t"+"                             PLEASE SELECT A VALID CHOICE!                     \n";
        TextAnimation.animateText(validoption3,40);
        break;
        }
        }

      }


      void DisplayWine()
      {
        TextAnimation.clearConsole();
        if(fetch2==0)
        {
            FetchingLocation1();
        }
        NearCVWineMarts2();
        boolean dis =true;
        while(dis)
        {
        
            if(tt4==1)
            {
            NearCVWineMarts2();
            tt4=0;
            }
            System.out.print(bold+green+"\n\t\t\t\t\t\t\t\t"+"        "+"CHOOSE YOUR OPTION : "+bold+red);
        String displaywine =sc.next();

        switch(displaywine)
        {
                case "1" :
                orderWine1();
                break;
                case "2" :
                orderWine2();
                break;
                case "3" :   
                orderWine3();
                break;
                case "4" :
                orderWine4();
                break;
                 case "0" :
                    fetch2=1;
                 dis=false;
                 tt3=1;
                 backtodashboard();
                 break ;
                 default :
                 String validoption1 =bold+red+"\n\t\t\t\t\t\t\t\t"+"                             PLEASE SELECT A VALID CHOICE!                     \n";
                 TextAnimation.animateText(validoption1,40);
                 break;
        } 
        } 
      }

   void backtodashboard()
   {
       String backtodashboard =bold+orange+"\n\t\t\t\t\t\t\t\t"+"        "+"-------------------------------GOING BACK------------------------------\n"+bold+green;
       TextAnimation.animateText(backtodashboard,40);
       TextAnimation.clearConsole();
   }

    void orderWine1() 
    {
        CVWinemart11();
        boolean select = true;
        while (select) 
        {
            if(tt4==1)
            {
              CVWinemart11();
              tt4=0;  
            }
            System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"(PRESS 0) TO BACK PREVIOUS MENU"); 
            System.out.print("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"(PRESS 1 -8) FOR SELECTING ITEMS ABOVE");
            System.out.print(bold+green+"\n\n\t\t\t\t\t\t\t\t"+"        "+"CHOOSE YOUR OPTION : "+bold+red);
            String wineIndex = sc.next();
            sc.nextLine();
            switch(wineIndex)
            {
                 
                 case "1"  :
                 super.addItem(BlendersPride);
                 break;

                 case "2"  :
                 super.addItem(ghost);
                 break;

                 case "3"  :
                 super.addItem(absolutecitron);
                 break;

                 case "4"  :
                 super.addItem(Signature);
                 break;

                 case "5"  :
                 super.addItem(becardi);
                 break;

                 case "6"  :
                 super.addItem(ketel);
                 break;

                 case "7"  :
                 super.addItem(jhonnie);
                 break;

                 case "8"  :
                 super.addItem(commander);
                 break;

                 case "11" :
                 tt4=1;
                 Back1(); 
                 break;

                 case "0" :
                 tt4=1;
                 select = false;
                 TextAnimation.clearConsole();
                 break;

                 default :
                 String option1 =bold+red+"\n\t\t\t\t\t\t\t\t"+"        PLEASE SELECT A VALID CHOICE!                     \n";
                 TextAnimation.animateText(option1,40);
                 break;
                

            }
        }
    }


void orderWine2() 
    {
        CVWinemart22();
        boolean select = true;
        while (select) 
        {
            if(tt4==1)
            {
              CVWinemart22();
              tt4=0;  
            }
            System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"(PRESS 0) TO BACK PREVIOUS MENU"); 
            System.out.print("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"(PRESS 1 -8) FOR SELECTING ITEMS ABOVE");
            System.out.print(bold+green+"\n\n\t\t\t\t\t\t\t\t"+"        "+"CHOOSE YOUR OPTION : "+bold+red);
            String wineIndex = sc.next();
            sc.nextLine();
            switch(wineIndex)
            {
                 
                 case "1"  :
                 super.addItem(papers);
                 break;

                 case "2"  :
                 super.addItem(soldierspride);
                 break;

                 case "3"  :
                 super.addItem(smirnoff);
                 break;

                 case "4"  :
                 super.addItem(allseasons);
                 break;

                 case "5"  :
                 super.addItem(seagrams);
                 break;

                 case "6"  :
                 super.addItem(stumbras);
                 break;

                 case "7"  :
                 super.addItem(blackandwhite);
                 break;

                 case "8"  :
                 super.addItem(rumnintynine);
                 break;

                 case "11" :
                 tt4=1;
                 super.vieworder();
                 Back1();
                 break;

                 case "0" :
                 tt4=1;
                 select = false;
                 TextAnimation.clearConsole();
                 break;

                 default :
                 String option1 =bold+red+"\n\t\t\t\t\t\t\t\t"+"        PLEASE SELECT A VALID CHOICE!                     \n";
                 TextAnimation.animateText(option1,40);
                 break;
                

            }
        }
    }



    void orderWine3() 
    {
        CVWinemart33();
        boolean select = true;
        while (select) 
        {
            if(tt4==1)
            {
              CVWinemart33();
              tt4=0;  
            }
            System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"(PRESS 0) TO BACK PREVIOUS MENU"); 
            System.out.print("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"(PRESS 1 -8) FOR SELECTING ITEMS ABOVE");
            System.out.print(bold+green+"\n\n\t\t\t\t\t\t\t\t"+"        "+"CHOOSE YOUR OPTION : "+bold+red);
            String wineIndex = sc.next();
            sc.nextLine();
            switch(wineIndex)
            {
                 
                 case "1"  :
                 super.addItem(redlady);
                 break;

                 case "2"  :
                 super.addItem(ciroc);
                 break;

                 case "3"  :
                 super.addItem(jackies);
                 break;

                 case "4"  :
                 super.addItem(greygoose);
                 break;

                 case "5"  :
                 super.addItem(mcdowells);
                 break;

                 case "6"  :
                 super.addItem(skyvodka);
                 break;

                 case "7"  :
                 super.addItem(chivas);
                 break;

                 case "8"  :
                 super.addItem(oldmonk);
                 break;

                 case "11" :
                 tt4=1;
                 super.vieworder();
                 Back1();
                 break; 

                 case "0" :
                 tt4=1;
                 select = false;
                 TextAnimation.clearConsole();
                 break;

                 default :
                 String option1 =bold+red+"\n\t\t\t\t\t\t\t\t"+"        PLEASE SELECT A VALID CHOICE!                     \n";
                 TextAnimation.animateText(option1,40);
                 break;
                

            }
        }
    }


    void orderWine4() 
    {
        CVWinemart44();
        boolean select = true;
        while (select) 
        {
            if(tt4==1)
            {
            CVWinemart44();
              tt4=0;  
            }
            System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"(PRESS 0) TO BACK PREVIOUS MENU"); 
            System.out.print("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"(PRESS 1 -8) FOR SELECTING ITEMS ABOVE");
            System.out.print(bold+green+"\n\n\t\t\t\t\t\t\t\t"+"        "+"CHOOSE YOUR OPTION : "+bold+red);
            String wineIndex = sc.next();
            sc.nextLine();
            switch(wineIndex)
            {
                 
                 case "1"  :
                 super.addItem(m2magic);
                 break;

                 case "2"  :
                 super.addItem(teachers);
                 break;
 
                 case "3"  :
                 super.addItem(absolutevodka);
                 break;

                 case "4"  :
                 super.addItem(lackgodtriple);
                 break;

                 case "5"  :
                 super.addItem(magicmoment);
                 break;

                 case "6"  :
                 super.addItem(RoyalChallenge);
                 break;

                 case "11" :
                 tt4=1;
                 super.vieworder();
                 Back1();
                 break;

                 case "0" :
                 tt4=1;
                 select = false;
                 TextAnimation.clearConsole();
                 break;

                 default :
                 String option1 =bold+red+"\n\t\t\t\t\t\t\t\t"+"        PLEASE SELECT A VALID CHOICE!                     \n";
                 TextAnimation.animateText(option1,40);
                 break;
                

            }
        }
    }


    void Dashboard()
    {
      
      String opendashboard =bold+orange+"\n\t\t\t\t\t\t\t\t"+"        "+"---------------------OPENING CV WINEMART DASHBOARD---------------------\n"+bold+green;
      TextAnimation.animateText(opendashboard,50);
      MainMenu2();
      boolean value =true;
      while(value)
      {
        
        if(tt3==1)
        {
            String opendashboard1 =bold+orange+"\n\t\t\t\t\t\t\t\t"+"        "+"---------------------OPENING CV WINEMART DASHBOARD---------------------\n"+bold+green;
           TextAnimation.animateText(opendashboard1,40);
        MainMenu2();
        tt3=0;
        }
      System.out.print(bold+green+"\n\n\t\t\t\t\t\t\t\t"+"        "+"CHOOSE YOUR OPTION : "+bold+red);
      String select =sc.next();
      switch(select)
      {
                
                 case "1" :
                 DisplayWine();
                 break;
                 case "2" :
                 Back1();
                 break;
                 case "0" :
                 value =false;
                 String thankyou =bold+orange+"\n\t\t\t\t\t\t\t\t"+"        ------------THANK YOU FOR USING CVWINE MART HAVA A NICE DAY------------\n";
                 TextAnimation.animateText(thankyou,40);
                 break;
                 default :
                    String validoption =bold+red+"\n\t\t\t\t\t\t\t\t"+"                             PLEASE SELECT A VALID CHOICE!                     ";
                    TextAnimation.animateText(validoption,40);
                    break;
                
                 

      }

      
      }

    }

   
    void FetchingLocation1()
    {
    String LocationFentching =bold+orange+"\n\t\t\t\t\t\t\t\t"+"        -------------------------ANALIZING YOUR LOCATION-----------------------\n\n"+
    bold+green+"\n\t\t\t\t\t\t\t\t"+"        YOUR CURRENT LOCATION IS :"+bold+red+" HYDERABAD,KPHB COLONY 1st PHASE\n\n"+
                                          bold+green+"\t\t\t\t\t\t\t\t"+"        --BASED ON YOUR LOCATION 5KM  RADIOUS CV Winemarts ARE LISTED BELOW--\n\n";
    TextAnimation.animateText(LocationFentching, 40);
    System.out.println();
    }
    

    void NearCVWineMarts2()
   {
      String a=" ";
    
    if(fetch2==1)
    {
       a= "CURRENT LOCATION:"+bold+red+"KPHB COLONY 1st PHASE";
    }
    
   System.out.println(bold+green+"\n\t\t\t\t\t\t\t\t"+"        -----------------------------------------------------------------------");
   System.out.println("\t\t\t\t\t\t\t\t"+"        "+bold+green+"CVWINE MARTS :                  "+a+"                                                     \n");
   System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"1)"+bold+def+" CV Winemart - KPHB Phase 1   ----- 1.5Km far\n");
   System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"2)"+bold+def+" CV Winemart - Near LULU Mall ----- 2.2Km far\n");
   System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"3)"+bold+def+" CV Winemart - Near Mehfill   ----- 3.7Km far\n");
   System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"4)"+bold+def+" CV Winemart - Near DMart     ----- 4.3Km far\n");
   System.out.println("\n\t\t\t\t\t\t\t\t"+"        "+bold+green+"0) BACK TO MAIN MENU");
   System.out.println(bold+green+"\t\t\t\t\t\t\t\t"+"        -----------------------------------------------------------------------");
   }

}

class billing 
{
    static Scanner sc = new Scanner(System.in);
    static String name;
    static Long phone;
    static String hno;
    static String land;
    static String city;

    static String TransID()
    {
         String sum ="";
        String alphanumeric ="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for(int i=0;i<=27;i++)
        {
        int a =(int)(Math.random()*alphanumeric.length()-1);
        char b =alphanumeric.charAt(a);
            sum =sum+b;
        
        }
        return sum;
    }

    static long invoiceid()
    {
      long invoiceid=(long)(Math.random()*1000000000);
       return invoiceid;
    }

    static void Custdetails()
    {
      System.out.println("\n\t\t\t\t\t\t\t\t" +WineOrderingApp.bold+WineOrderingApp.green+"        " + "FOR PROCESSING YOUR ORDER FILL BELOW OPTIONS");
     
      boolean loop1 =true;
      while(loop1)
      {
         System.out.print("\n\t\t\t\t\t\t\t\t" + "        " +WineOrderingApp.bold+WineOrderingApp.green+ "ENTER YOUR FULL NAME: "+WineOrderingApp.bold+WineOrderingApp.red); 
         name =sc.nextLine();
         if(name.length()<=22)
         {
            loop1 =false; 
            boolean loop2 =true;
            while(loop2)
            {
              System.out.print("\n\t\t\t\t\t\t\t\t"+WineOrderingApp.bold+WineOrderingApp.green+"        ENTER YOUR MOBILE NUMBER : "+WineOrderingApp.bold+WineOrderingApp.red);
              phone =sc.nextLong();
              if(phone>=6000000000L&& phone<=9999999999L)
              {
                loop2 =false;
                boolean loop3 =true;
                System.out.println("\n\t\t\t\t\t\t\t\t"+WineOrderingApp.bold+WineOrderingApp.green+"        ENTER YOUR ADDRESS :"+WineOrderingApp.bold+WineOrderingApp.red);
                while(loop3)
                {
                   System.out.print("\n\t\t\t\t\t\t\t\t"+WineOrderingApp.bold+WineOrderingApp.green+"        H-NO : "+WineOrderingApp.bold+WineOrderingApp.red);
                   sc.nextLine();
                   hno =sc.nextLine();
                   if(hno.length()<=22)
                   {
                       loop3 =false;
                       boolean loop4 =true;
                       while(loop4)
                       {
                         System.out.print("\n\t\t\t\t\t\t\t\t"+WineOrderingApp.bold+WineOrderingApp.green+"        ENTER NEAREST LANDMARK : "+WineOrderingApp.bold+WineOrderingApp.red);
                         land = sc.nextLine();
                         if(land.length()<=22)
                         {
                             loop4 =false;
                             boolean loop5 = true;
                             while(loop5)
                             {
                                System.out.print("\n\t\t\t\t\t\t\t\t"+WineOrderingApp.bold+WineOrderingApp.green+"        ENTER YOUR CITY NAME : "+WineOrderingApp.bold+WineOrderingApp.red);
                                city =sc.nextLine();
                                if(city.length()<=22)
                                {
                                  loop5 =false;
                                  TextAnimation.clearConsole();
                                  ShoppingCart.tt7=1;
                                  billing.Billing();
                                  return;
                                }
                                else
                                {
                                  System.out.println("\n\t\t\t\t\t\t\t\t"+WineOrderingApp.bold+WineOrderingApp.red+"        ENTER VALID CITY");  
                                }
                             }
                         }
                         else
                         {
                             System.out.println("\n\t\t\t\t\t\t\t\t"+WineOrderingApp.bold+WineOrderingApp.red+"        ENTER VALID LANDMARK"); 
                         }
                         
                       }
                   }
                   else
                   {
                     System.out.println("\n\t\t\t\t\t\t\t\t"+WineOrderingApp.bold+WineOrderingApp.red+"        ENTER VALID HOUSE NUMBER");  
                   }
                }
              }
              else
              {
                System.out.println("\n\t\t\t\t\t\t\t\t"+WineOrderingApp.bold+WineOrderingApp.red+"        ENTER A VALID NUMBER"); 
              }
            }
         }
         else
         {
         System.out.println("\n\t\t\t\t\t\t\t\t"+WineOrderingApp.bold+WineOrderingApp.red+"        PLEASE ENTER YOUR NAME CONTAINING ONLY 22 CHARACTERS OR LESS."); 
         }
      }
       
        
    }

    static void Billing()
    {
        if(ShoppingCart.tt7!=0)
        {
        TextAnimation.clearConsole();
        }
        String bill ="                            "+WineOrderingApp.bold+WineOrderingApp.green+"-----------------------------------------------------------------------------------GENERATING  BILL-----------------------------------------------------------------------------------\n\n\n";
        TextAnimation.animateText(bill,35);
        long currentTimeMillis = System.currentTimeMillis();
        java.util.Date currentDate = new java.util.Date(currentTimeMillis);
        String a ="| CV Winemart - KPHB Phase 1";
        String b ="| CV Winemart - Near LULU Mall";
        String c ="| CV Winemart - Near Mehfill";
        String d ="| CV Winemart - Near DMart";
        String f ="| NEAR KUKATPALLY &KPHB CVWINEMARTS";
      System.out.println(WineOrderingApp.def+"                            --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
      System.out.println("                            |                                                                                       "+WineOrderingApp.bold+WineOrderingApp.green+"BILL"+WineOrderingApp.def+"                                                                                         |");            
      System.out.println("                            --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
      System.out.println("                            | "+WineOrderingApp.bold+WineOrderingApp.green+"COMPANY NAME :"+WineOrderingApp.def+"CV WINEMART                                                                                                                             "+WineOrderingApp.bold+WineOrderingApp.green+"BILLING DATE AND TIME :"+WineOrderingApp.def+"      |");
      System.out.println("                            | "+WineOrderingApp.bold+WineOrderingApp.green+"ADDRESS :"+WineOrderingApp.def+"                                                                                                                                             "+currentDate+" |");
      System.out.println("                            | 2nd Floor,Raheja MindSpace,                                                                                                                                                        |");
      System.out.println("                            | HITEC CITY, Madhapur,                                                                                                                                 "+WineOrderingApp.bold+WineOrderingApp.green+"INVOICE ID : "+WineOrderingApp.def+invoiceid()+"       |");
      System.out.println("                            | TELANGANA-500081;                                                                                                                                                                  |");
      System.out.println("                            | E-Mail: support@cvwinemart.com                                                                                                                        "+WineOrderingApp.bold+WineOrderingApp.green+"TRANSACTION ID :             "+WineOrderingApp.def+"|");
      System.out.println("                            | PHONE NO : +91-18077143143                                                                                                                            "+TransID()+" |");
      System.out.println("                            --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
      System.out.println("                            |                                                                                      "+WineOrderingApp.bold+WineOrderingApp.green+"SHIPPING"+WineOrderingApp.def+"                                                                                      |");
      System.out.println("                            --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
      System.out.println("                            | "+WineOrderingApp.bold+WineOrderingApp.green+"FROM :"+WineOrderingApp.def+"                                                                                                                                                "+WineOrderingApp.bold+WineOrderingApp.green+"TO CUSTOMER DETAILS :"+WineOrderingApp.def+"        |");
      System.out.printf("%56s",a);System.out.printf("%124s"," ");System.out.printf("%6s",WineOrderingApp.bold+WineOrderingApp.green+"NAME  :");System.out.printf(WineOrderingApp.def+"%-22s",name);System.out.println("|");
      System.out.printf("%58s",b);System.out.printf("%122s"," ");System.out.print(WineOrderingApp.bold+WineOrderingApp.green+"PHONE :"+WineOrderingApp.def+"+91");System.out.printf("%-19s",phone);System.out.println("|");
      System.out.printf("%56s",c);System.out.printf(WineOrderingApp.bold+WineOrderingApp.green+"%131s","H-NO  :");System.out.printf(WineOrderingApp.def+"%-22s",hno);System.out.println("|");
      System.out.printf("%54s",d);System.out.printf(WineOrderingApp.bold+WineOrderingApp.green+"%133s","LDMK  :");System.out.printf(WineOrderingApp.def+"%-22s",land);System.out.println("|");
      System.out.printf("%63s",f);System.out.printf(WineOrderingApp.bold+WineOrderingApp.green+"%124s","CITY  :");System.out.printf(WineOrderingApp.def+"%-22s",city);System.out.println("|");
      System.out.println("                            | HYDERABAD                                                                                                                                                                          |");
      System.out.println("                            --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
      

     }
   }

class CVWinemart
{



  public static void main(String args[])
  {
    LoginPage obj = new LoginPage();
    obj.Animation();
    obj.loginpage();
     //WineOrderingApp.obj. Dashboard();
    
    

  }
}