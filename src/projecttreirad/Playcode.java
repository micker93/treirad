package projecttreirad;
import java.util.Scanner;

public class Playcode extends Game{

    
   //play methoden som är själva "core" till spelet
    public void play(){
 
        int spot;
        boolean spottaken;
        Players newplayer=new Players();
        
        newplayer.playernames();
        System.out.println("Player 'X' or " + newplayer.getName1() + " will start! " + " and " + newplayer.getName2() + " will go after" );
      
    while(spottaken=true){
        
        super.drawboard();
        super.checkwinner();
        System.out.println(newplayer.setplayer(player)+  " choose a spot:");
        
        System.out.print("Spot: ");
        Scanner input=new Scanner(System.in);
        spot=input.nextInt();
        spottaken=super.postaken(spot);
        pos[spot]=newplayer.setplayer(player);
        super.changeplayer();        
        count++;
        
        System.out.println("Round: " + getCount());
        System.out.println("-------------------------");
    }
  
    }
}
