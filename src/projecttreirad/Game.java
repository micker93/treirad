package projecttreirad;
import java.util.Scanner;

public class Game{
   
    protected int  count;
    protected char player;
    protected int  xscore;
    protected int  oscore;
    protected char pos[]=new char[10];
    
    public void newboard(){        
    
        char allpos[]={'0','1','2','3','4','5','6','7','8','9'};      
        player='X';
        for (int i = 1; i < 10; i++) 
            pos[i]=allpos[i];
    }
    
     public String drawboard(){
       
        System.out.println( "\n\n" );
        System.out.println(  "\n\n" );
        System.out.println(  "\n\n\t\t" +pos [1] + "   | " +pos [2]+ "  | " +pos [3]);
        System.out.println(  " \t\t    |    |   " );
        System.out.println(  " \t\t ___|____|___ " );
        System.out.println(  "\n\n\t\t" +pos [4]+ "   | " +pos [5]+ "  | " +pos [6]);
        System.out.println(  " \t\t    |    |   " );
        System.out.println(  " \t\t ___|____|___ " );
        System.out.println(  "\n\n\t\t" +pos [7]+ "   | " +pos [8]+ "  | " +pos [9]);
        System.out.println(  " \t\t    |    |   " );
        System.out.println(  " \t\t    |    |   " );
        System.out.println(  "\n\n" );
        return "board";
    } 
    
    //method som kollar vilken av spelarna har vunnit
    public char checkwinner(){

        char win='\u0000';
        char draw='|';  
        Players scoreplayer=new Players();
        
        //check if player X wins        
        if (pos[1] == 'X' && pos[2] == 'X' && pos[3] == 'X') win='X'; 
        if (pos[4] == 'X' && pos[5] == 'X' && pos[6] == 'X') win='X';
        if (pos[7] == 'X' && pos[8] == 'X' && pos[9] == 'X') win='X'; 
        if (pos[1] == 'X' && pos[4] == 'X' && pos[7] == 'X') win='X';
        if (pos[2] == 'X' && pos[5] == 'X' && pos[8] == 'X') win='X';
        if (pos[3] == 'X' && pos[6] == 'X' && pos[9] == 'X') win='X';
        if (pos[1] == 'X' && pos[5] == 'X' && pos[9] == 'X') win='X';
        if (pos[3] == 'X' && pos[5] == 'X' && pos[7] == 'X') win='X';
            
            if(win=='X')
            {            
               System.out.println("X wins the game " + scoreplayer.getName1() + " !!!");
               xscore++;      
               System.out.println("Score: " + scoreplayer.setxScore(xscore));
               count=0;
               newboard();
               drawboard();
               changeplayer();
               return win; 
            }  
            
        //check if player O wins
        if (pos[1] == 'O' && pos[2] == 'O' && pos[3] == 'O') win = 'O';
        if (pos[4] == 'O' && pos[5] == 'O' && pos[6] == 'O') win = 'O';
        if (pos[7] == 'O' && pos[8] == 'O' && pos[9] == 'O') win = 'O';
        if (pos[1] == 'O' && pos[4] == 'O' && pos[7] == 'O') win = 'O';
        if (pos[2] == 'O' && pos[5] == 'O' && pos[8] == 'O') win = 'O';
        if (pos[3] == 'O' && pos[6] == 'O' && pos[9] == 'O') win = 'O';
        if (pos[1] == 'O' && pos[5] == 'O' && pos[9] == 'O') win = 'O';
        if (pos[3] == 'O' && pos[5] == 'O' && pos[7] == 'O') win = 'O';
            
            if (win == 'O' )       
            {
               System.out.println("O wins the game!!!" + scoreplayer.getName2());  
               oscore++;
               System.out.println("Score : " + scoreplayer.setoScore(oscore));
               count=0;
               newboard();
               drawboard();         
               changeplayer();
               return win;       
            }
           
            //check if the game is a draw
            if(count==9)
            {  
               System.out.println("Draw!");   
               count=0;
               newboard();
               drawboard();
               return draw;
            }
            return  win;
    }

    //method som kollar om en ruta är tagen    
    public boolean postaken(int spot){
        
        if (pos[spot]=='X' || pos[spot]=='O')       
        {
            System.out.println("The spot is taken! choose another spot");
            changeplayer();
            return true;
        }
        else   
            return false;
    }
    
    public void changeplayer(){
        
        if(player=='X')player='O';
        else
            player='X';     
    }  
       
    public int getCount(){
     
        return count;
    }    
}
