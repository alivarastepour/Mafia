import java.util.Scanner;

public class Main {
    public static int index = 0 ;
    public static boolean is_game_created = false ;
    static Scanner scanner = new Scanner(System.in);
    //-----------------------------
    public static String[] create_game(){
        //this method split the names
        //and then puts them in an array
        Game game = new Game();
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
                                user_not_found = false ;
                            } else {
                                System.out.println("all players have role");
                            }
                            break;
                        } else {
                            user_not_found = true ;
                        }
                    }
                    if (user_not_found)
                        System.out.println("user not found");
                }
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
                                user_not_found = false ;
                            } else {
                                System.out.println("all players have role");
                            }
                            break;
                        } else {
                            user_not_found = true ;
                        }
                    }
                    if (user_not_found)
                        System.out.println("user not found");
                }
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
                                user_not_found = false ;
                            } else {
                                System.out.println("all players have role");
                            }
                            break;
                        } else {
                            user_not_found = true ;
                        }
                    }
                    if (user_not_found)
                        System.out.println("user not found");
                }
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
                                user_not_found = false ;
                            } else {
                                System.out.println("all players have role");
                            }
                            break;
                        } else {
                            user_not_found = true ;
                        }
                    }
                    if (user_not_found)
                        System.out.println("user not found");
                }
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
                                System.out.println("hi mdfk!");
                                user_not_found = false ;
                            } else {
                                System.out.println("all players have role");
                            }
                            break;
                        } else {
                            user_not_found = true ;
                        }
                    }
                    if (user_not_found)
                        System.out.println("user not found");
                }
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
                                user_not_found = false ;
                            } else {
                                System.out.println("all players have role");
                            }
                            break;
                        } else {
                            user_not_found = true ;
                        }
                    }
                    if (user_not_found)
                        System.out.println("user not found");
                }
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
                                user_not_found = false ;
                            } else {
                                System.out.println("all players have role");
                            }
                            break;
                        } else {
                            user_not_found = true ;
                        }
                    }
                    if (user_not_found)
                        System.out.println("user not found");
                }
                    break;
            default:
                System.out.println("role not found");
                    break;
        }
    }
    public static void main(String[] args) {
        String[] list_of_players = null;//retrieve the output of create_game func.
        String[] players_name = null ;//removes the unwanted array element(explained in a comment in line 15)
        Players[] players = null ;//creates an array of players to be upcasted afterwards
        while (true){
            String Command ;
            Command = scanner.next();
                switch (Command){
                    case "create_game":
                        list_of_players = create_game();
                        players_name = new String[list_of_players.length-1];
                        players = new Players[list_of_players.length-1];
                        for (int i = 0; i < players_name.length; i++) {//instantiates the array
                            list_of_players[i] = list_of_players[i+1];
                            players_name[i] = list_of_players[i];
                        }
                    break;
                    case "role_assign":
                        role_assign(players_name , players);
                    break;
                }
        }
    }
}
