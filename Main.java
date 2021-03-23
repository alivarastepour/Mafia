import java.util.Scanner;
public class Main {
    public static int index = 0 ;
    public static boolean is_game_created = false ;
    public static boolean is_game_started = false ;
    public static Game game ;
    static Scanner scanner = new Scanner(System.in);
    //-----------------------------
    //-----------------------------
    public static String[] create_game(){
        //this method split the names
        //and then puts them in an array
        game = new Game();
        game.player_names_user_input_String = scanner.nextLine();//gets all names in 1 string
        game.player_names_user_input_array = game.player_names_user_input_String.split(" ");//splits them to array elements
        is_game_created = true ;//gotta know whether the game is created or not
        return game.player_names_user_input_array ;//returns an array of player names(consider that first element of this array is just a blank line)
        
    }
    //-----------------------------
    public static void role_assign(String[] players_name , Players[] players){
        String name = scanner.next();//user name
        String role = scanner.next();//user role
        boolean user_not_found = false ;//whether the user was found or not
        switch (role){
            case "joker":
                if (!is_game_created){//game should have been created before assigning roles
                    System.out.println("no game created");
                }
                else {
                    for (String s : players_name) {
                        if (name.equals(s)) {//check whether user name input is valid
                            if (players.length > index) {//avoid program to face arrayOutOfBound exception
                                players[index] = new Joker(name, role);//upcasting to make a new obj.
                                index++;
                                user_not_found = false ;
                            } else {
                                System.out.println("all players have role");
                                user_not_found = false ;
                            }
                            break;
                        } else {
                            user_not_found = true ;
                        }
                        
                    }
                    if (user_not_found)
                        System.out.println("user not found");
    
                }
                //-----------------------------all other cases are just as the same------------------------------
                    break;
            case "villager":
                if (!is_game_created){
                    System.out.println("no game created");
                }
                else {
                    for (String s : players_name) {
                        if (name.equals(s)) {
                            if (players.length > index) {
                                players[index] = new villager(name, role);
                                index++;
                            } else {
                                System.out.println("all players have role");
                            }
                            user_not_found = false ;
                            break;
                        } else {
                            user_not_found = true ;
                        }
                    }
                    if (user_not_found)
                        System.out.println("user not found");
                }
                game.count_of_villagers++;
                    break;
            case "detective":
                if (!is_game_created){
                    System.out.println("no game created");
                }
                else {
                    for (String s : players_name) {
                        if (name.equals(s)) {
                            if (players.length > index) {
                                players[index] = new detective(name, role);
                                index++;
                            } else {
                                System.out.println("all players have role");
                            }
                            user_not_found = false ;
                            break;
                        } else {
                            user_not_found = true ;
                        }
                    }
                    if (user_not_found)
                        System.out.println("user not found");
                }
                game.count_of_villagers++;
                    break;
            case "doctor":
                if (!is_game_created){
                    System.out.println("no game created");
                }
                else {
                    for (String s : players_name) {
                        if (name.equals(s)) {
                            if (players.length > index) {
                                players[index] = new doctor(name, role);
                                index++;
                            } else {
                                System.out.println("all players have role");
                            }
                            user_not_found = false ;
                            break;
                        } else {
                            user_not_found = true ;
                        }
                    }
                    if (user_not_found)
                        System.out.println("user not found");
                }
                game.count_of_villagers++;
                break;
            case "bulletproof":
                if (!is_game_created){
                    System.out.println("no game created");
                }
                else {
                    for (String s : players_name) {
                        if (name.equals(s)) {
                            if (players.length > index) {
                                players[index] = new bulletproof(name, role);
                                index++;
                            } else {
                                System.out.println("all players have role");
                            }
                            user_not_found = false ;
                            break;
                        } else {
                            user_not_found = true ;
                        }
                    }
                    if (user_not_found)
                        System.out.println("user not found");
                }
                game.count_of_villagers++;
                    break;
            case "mafia":
                if (!is_game_created){
                    System.out.println("no game created");
                }
                else {
                    for (String s : players_name) {
                        if (name.equals(s)) {
                            if (players.length > index) {
                                players[index] = new mafia(name, role);
                                index++;
                            } else {
                                System.out.println("all players have role");
                            }
                            user_not_found = false ;
                            break;
                        } else {
                            user_not_found = true ;
                        }
                    }
                    if (user_not_found)
                        System.out.println("user not found");
                }
                game.count_of_mafias++;
                    break;
            case "godfather":
                if (!is_game_created){
                    System.out.println("no game created");
                }
                else {
                    for (String s : players_name) {
                        if (name.equals(s)) {
                            if (players.length > index) {
                                players[index] = new godfather(name, role);
                                index++;
                            } else {
                                System.out.println("all players have role");
                            }
                            user_not_found = false ;
                            break;
                        } else {
                            user_not_found = true ;
                        }
                    }
                    if (user_not_found)
                        System.out.println("user not found");
                }
                game.count_of_mafias++;
                break;
            case "silencer":
                if (!is_game_created){
                    System.out.println("no game created");
                }
                else {
                    for (String s : players_name) {
                        if (name.equals(s)) {
                            if (players.length > index) {
                                players[index] = new silencer(name, role);
                                index++;
                            } else {
                                System.out.println("all players have role");
                            }
                            user_not_found = false ;
                            break;
                        } else {
                            user_not_found = true ;
                            
                        }
                    }
                    if (user_not_found)
                        System.out.println("user not found");
                }
                game.count_of_mafias++;
                break;
            default:
                System.out.println("role not found");
                    break;
        }
    }
    //-----------------------------
    public static boolean votee_voter_validation(String player , Players[] players){//voter and votee name should be among the players
        boolean votee_voter_validation = true ;
        for (Players p: players) {
            if (p.player_name.equals(player)){
                votee_voter_validation = true ;
                break;
            }
            else{
                votee_voter_validation = false ;
            }
        }
        return votee_voter_validation ;
    }
    //-----------------------------
    public static boolean votee_voter_aliveness(String player , Players[] players){//voter and votee should be alive
        boolean votee_voter_aliveness = true ;
        for (int i = 0; i < players.length; i++) {
            if (player.equals(players[i].player_name)){
                votee_voter_aliveness = players[i].is_alive ;
                break;
            }
        }
        return votee_voter_aliveness ;
    }
    //-----------------------------
    public static boolean votee_voter_silence(String player , Players[] players){//voter should not be silenced
        boolean silenced = false ;
        for (int i = 0; i < players.length; i++) {
            if (players[i].player_name.equals(player)){
                silenced = players[i].is_silenced ;
                break;
            }
        }
        return silenced ;
    }
    //-----------------------------
    public static void i_have_voted(String player , Players[] players){//one vote per day is valid
        for (int i = 0; i < players.length; i++) {
            if (player.equals(players[i].player_name)){
                players[i].already_voted = true ;
                break;
            }
        }
    }
    //-----------------------------
    public static boolean have_i_voted(String player , Players[] players){//to check whether the player has already voted
        boolean have_i_voted = false ;
        for (int i = 0; i < players.length; i++) {
            if (player.equals(players[i].player_name)){
                have_i_voted = players[i].already_voted ;
            }
        }
        return have_i_voted ;
    }
    //-----------------------------
    public static void i_have_gained_a_vote(String player , Players[] players){//number of votes that each person grabs matters
        for (int i = 0; i < players.length; i++) {
            if (players[i].player_name.equals(player)){
                players[i].votes_gained++ ;
            }
        }
    }
    //-----------------------------
    public static void start_game(Players[] players){
        if (!is_game_created || index  < players.length){//first make sure game is created and all players have role
            if (!is_game_created){
                System.out.println("no game created");
            }
            else if (index  < players.length){
                System.out.println("one or more player does not have role");
            }
        }
        else{
            is_game_created = true ;
        }
        if (is_game_created && index == players.length){//prints roles and names of players
            for (Players player: players) {
                System.out.println(player.player_name + " : " + player.role);
            }
            is_game_started = true ;
        }
    }
    //-----------------------------
    public static void voting(Players[] players) {
        int num_of_votes = 0;
        while (num_of_votes < index) {
            String voter = scanner.next();
            String votee = scanner.next();
            boolean voter_validation = votee_voter_validation(voter, players);
            boolean votee_validation = votee_voter_validation(votee, players);
            while (!voter_validation) {
                System.out.println("voter not found,re_enter the voter name");
                voter = scanner.next();
                voter_validation = votee_voter_validation(voter, players);
            }
            while (!votee_validation) {
                System.out.println("votee not found,re_enter the votee name");
                votee = scanner.next();
                votee_validation = votee_voter_validation(votee, players);
            }
            boolean voter_aliveness = votee_voter_aliveness(voter , players);
            boolean votee_aliveness = votee_voter_aliveness(votee , players);
            while (!voter_aliveness){
                System.out.println("voter is dead! re_enter the voter name");
                voter = scanner.next();
                voter_aliveness = votee_voter_aliveness(voter , players) ;
            }
            while (!votee_aliveness){
                System.out.println("votee is dead! re_enter the votee name");
                votee = scanner.next();
                votee_aliveness = votee_voter_aliveness(votee , players) ;
            }
            boolean voter_silence = votee_voter_silence(voter , players) ;
            while (voter_silence){
                System.out.println("voter is silenced! re-enter the voter name ");
                voter = scanner.next();
                voter_silence = votee_voter_silence(voter , players) ;
            }
            boolean already_voted = have_i_voted(voter , players);
            while (already_voted){
                System.out.println("voter has already voted.re-enter the voter name");
                voter = scanner.next();
                already_voted = have_i_voted(voter , players);
            }
            i_have_voted(voter , players);
            i_have_gained_a_vote(votee , players);
            num_of_votes++;
            
        }
        num_of_votes = 0 ;
    }
        //-----------------------------
        public static void main (String[]args){
            String[] list_of_players = null;//retrieve the output of create_game func.
            String[] players_name = null;//removes the unwanted array element(explained in a comment in line 15)
            Players[] players = null;//creates an array of players to be upcasted afterwards
            while (true) {
                String Command;
                Command = scanner.next();
                switch (Command) {
                    case "create_game":
                        list_of_players = create_game();
                        players_name = new String[list_of_players.length - 1];
                        players = new Players[list_of_players.length - 1];
                        for (int i = 0; i < players_name.length; i++) {//instantiates the array
                            list_of_players[i] = list_of_players[i + 1];
                            players_name[i] = list_of_players[i];
                        }
                        System.out.println("game created with " + players_name.length + " players");
                        break;
                    case "role_assign":
                        role_assign(players_name, players);
                        break;
                    case "start_game":
                        start_game(players);
                        if (is_game_started && is_game_created) {
                            voting(players);
                        }
                        break;
                }
            }
        }
    }
