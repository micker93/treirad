package projecttreirad;
import java.util.Scanner;


public class Players extends Game{
    
    protected String name1;
    protected String name2;
    Scanner firstname=new Scanner(System.in);
    Scanner secoundname=new Scanner(System.in);

    
    public char getplayer(){       
    
        return player;
    }

    public char setplayer(char c){
        
        this.player=c;
        return c;
    }
    
    public String getName1(){

        return name1;
    }

    public String getName2(){

        return name2;
    }

    public int getoScore(){
        
        return oscore;
        
    }
     
    public int setoScore(int c){
        
        this.oscore=c;
        return c;
        
    }
    
    public int getxScore(){
        
        return xscore;
        
    }

    public int setxScore(int c){
        
       this.xscore=c;
       return c;
        
    }

   public int xplusplus(){
       
       xscore++;
       return xscore;
   }
   
   public int  oplusplus(){
       
       oscore++;
       return oscore;
   }
   
   public void promptname1(){
       
       name1=firstname.nextLine();
   }
   
   public void promptname2(){
       
       name2=secoundname.nextLine();
   }

   public void playernames(){
       
         System.out.println("First players name who is going to be 'X': ");         
         promptname1();

         System.out.println("Second players name who is going to be 'O': ");
         promptname2();
         
         System.out.println("Welcome " + getName1() + " you will be player X and " + getName2() + " will be player O!");  
         
   }

}

