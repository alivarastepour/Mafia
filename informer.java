import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class informer extends Players{
    public void informing(Players[] players , int max_votes_night , Game game){
        Random modifier = new Random();
        int indicator = modifier.nextInt(100) % 4 ;
//        int indicator = ThreadLocalRandom.current().nextInt();
        boolean is_done = false;
        switch (indicator){
            case 0:
                System.out.println("im case 0");
                for (Players x: players) {
                    if (x.role.equals("mafia") && x.is_alive){
                        System.out.println("first letter of one of alive mafias is : "+x.player_name.charAt(0));
                        is_done = true ;
                        break;
                    }
                }
                if (!is_done){
                    System.out.println("unfortunately all mafias are dead so informer couldnt inform villagers");
                }
            break;
            case 1:
                System.out.println("im case 1");
                for (Players x: players){
                    if (x.votes_gained < max_votes_night && x.votes_gained > 0){
                        System.out.println("a player who mafia tried to kill but couldnt is "+ x.player_name);
                        is_done = true ;
                        break;
                    }
                }
                if (!is_done){
                    System.out.println("informer couldnt find anyone who mafia tried to kill but couldnt");
                }
            break;
            case 2:
                System.out.println("im case 2");
                System.out.println("count of mafias is : "+game.count_of_mafias);
            break;
            case 3:
                System.out.println("im case 3");
                for (Players x:players) {
                    if (x instanceof Joker){
                        System.out.println("first letter of joker's name is " + x.player_name.charAt(0));
                    }
                    is_done = true ;
                }
                if (!is_done){
                    System.out.println("joker is not in the match so informer couldnt reveal first letter of their name");
                }
            break;
        }
    }
    public informer(String player_name, String role) {
        super(player_name, role);
    }
    
}
