import java.util.Scanner;

public class Main {
    
    private static int index = 0;//to hold number of players
    
    private static boolean is_game_created = false;//gotta know if game is created or not
    
    private static boolean is_game_started = false;//gotta know is game started or not
    
    private static Game game;//to build an obj. from Game class
    
    static Scanner scanner = new Scanner(System.in);
    
    private static String[] create_game() { //this method split the names and then puts them in an array
        
        game = new Game();
        game.player_names_user_input_String = scanner.nextLine();//gets all names in 1 string
        game.player_names_user_input_array = game.player_names_user_input_String.split(" ");//splits them to array elements
        is_game_created = true;//gotta know whether the game is created or not
        return game.player_names_user_input_array;//returns an array of player names(consider that first element of this array is just a blank line)
        
        
    }
    
    private static void role_assign(String[] players_name, Players[] players) {
        //this method creates obj. from different subclasses of player class using a name and a role
        String name = scanner.next();//user name
        String role = scanner.next();//user role
        boolean user_not_found = false;//whether the user was found or not
        switch (role) {
            case "joker":
                if (!is_game_created) {//game should have been created before assigning roles
                    System.out.println("no game created");
                } else {
                    for (String s : players_name) {
                        if (name.equals(s)) {//check whether user name input is valid
                            if (players.length > index) {//avoid program to face arrayOutOfBound exception
                                players[index] = new Joker(name, role);//upcasting to make a new obj.
                                index++;
                            } else {
                                System.out.println("all players have role");
                            }
                            user_not_found = false;
                            break;
                        } else {
                            user_not_found = true;
                        }
                        
                    }
                    if (user_not_found)
                        System.out.println("user not found");
                    
                }
                //-----------------------------all other cases are just as the same------------------------------
                break;
            case "villager":
                if (!is_game_created) {
                    System.out.println("no game created");
                } else {
                    for (String s : players_name) {
                        if (name.equals(s)) {
                            if (players.length > index) {
                                players[index] = new villager(name, role);
                                index++;
                            } else {
                                System.out.println("all players have role");
                            }
                            user_not_found = false;
                            break;
                        } else {
                            user_not_found = true;
                        }
                    }
                    if (user_not_found)
                        System.out.println("user not found");
                }
                game.count_of_villagers++;
                break;
            case "detective":
                if (!is_game_created) {
                    System.out.println("no game created");
                } else {
                    for (String s : players_name) {
                        if (name.equals(s)) {
                            if (players.length > index) {
                                players[index] = new detective(name, role);
                                players[index].should_be_awake_at_night = true;
                                index++;
                            } else {
                                System.out.println("all players have role");
                            }
                            user_not_found = false;
                            break;
                        } else {
                            user_not_found = true;
                        }
                    }
                    if (user_not_found)
                        System.out.println("user not found");
                }
                game.count_of_villagers++;
                break;
            case "doctor":
                if (!is_game_created) {
                    System.out.println("no game created");
                } else {
                    for (String s : players_name) {
                        if (name.equals(s)) {
                            if (players.length > index) {
                                players[index] = new doctor(name, role);
                                players[index].should_be_awake_at_night = true;
                                index++;
                            } else {
                                System.out.println("all players have role");
                            }
                            user_not_found = false;
                            break;
                        } else {
                            user_not_found = true;
                        }
                    }
                    if (user_not_found)
                        System.out.println("user not found");
                }
                game.count_of_villagers++;
                break;
            case "bulletproof":
                if (!is_game_created) {
                    System.out.println("no game created");
                } else {
                    for (String s : players_name) {
                        if (name.equals(s)) {
                            if (players.length > index) {
                                players[index] = new bulletproof(name, role);
                                index++;
                            } else {
                                System.out.println("all players have role");
                            }
                            user_not_found = false;
                            break;
                        } else {
                            user_not_found = true;
                        }
                    }
                    if (user_not_found)
                        System.out.println("user not found");
                }
                game.count_of_villagers++;
                break;
            case "mafia":
                if (!is_game_created) {
                    System.out.println("no game created");
                } else {
                    for (String s : players_name) {
                        if (name.equals(s)) {
                            if (players.length > index) {
                                players[index] = new mafia(name, role);
                                players[index].should_be_awake_at_night = true;
                                index++;
                            } else {
                                System.out.println("all players have role");
                            }
                            user_not_found = false;
                            break;
                        } else {
                            user_not_found = true;
                        }
                    }
                    if (user_not_found)
                        System.out.println("user not found");
                }
                game.count_of_mafias++;
                break;
            case "godfather":
                if (!is_game_created) {
                    System.out.println("no game created");
                } else {
                    for (String s : players_name) {
                        if (name.equals(s)) {
                            if (players.length > index) {
                                players[index] = new godfather(name, role);
                                players[index].should_be_awake_at_night = true;
                                index++;
                            } else {
                                System.out.println("all players have role");
                            }
                            user_not_found = false;
                            break;
                        } else {
                            user_not_found = true;
                        }
                    }
                    if (user_not_found)
                        System.out.println("user not found");
                }
                game.count_of_mafias++;
                break;
            case "silencer":
                if (!is_game_created) {
                    System.out.println("no game created");
                } else {
                    for (String s : players_name) {
                        if (name.equals(s)) {
                            if (players.length > index) {
                                players[index] = new silencer(name, role);
                                players[index].should_be_awake_at_night = true;
                                index++;
                            } else {
                                System.out.println("all players have role");
                            }
                            user_not_found = false;
                            break;
                        } else {
                            user_not_found = true;
                            
                        }
                    }
                    if (user_not_found)
                        System.out.println("user not found");
                }
                game.count_of_mafias++;
                break;
            case "informer":
                if (!is_game_created) {
                    System.out.println("no game created");
                } else {
                    for (String s : players_name) {
                        if (name.equals(s)) {
                            if (players.length > index) {
                                players[index] = new informer(name, role);
                                players[index].should_be_awake_at_night = false;
                                index++;
                            } else {
                                System.out.println("all players have role");
                            }
                            user_not_found = false;
                            break;
                        } else {
                            user_not_found = true;
                            
                        }
                    }
                    if (user_not_found)
                        System.out.println("user not found");
                }
                game.count_of_villagers++;
                break;
            default:
                System.out.println("role not found");
                break;
        }
    }
    
    private static boolean votee_voter_validation(String player, Players[] players) {
        //voter and votee name should be among the players
        boolean votee_voter_validation = true;
        for (Players p : players) {
            if (p.player_name.equals(player)) {
                votee_voter_validation = true;
                break;
            } else {
                votee_voter_validation = false;
            }
        }
        return votee_voter_validation;
    }
    
    private static boolean votee_voter_aliveness(String player, Players[] players) {
        //voter and votee should be alive
        boolean votee_voter_aliveness = true;
        for (Players value : players) {
            if (player.equals(value.player_name)) {
                votee_voter_aliveness = value.is_alive;
                break;
            }
        }
        return votee_voter_aliveness;
    }
    
    private static boolean votee_voter_silence(String player, Players[] players) {
        //voter should not be silence
        boolean silenced = false;
        for (Players value : players) {
            if (value.player_name.equals(player)) {
                silenced = value.is_silenced;
                break;
            }
        }
        return silenced;
    }
    
    private static void i_have_voted(String player, Players[] players) {
        //one vote per day is valid
        for (Players value : players) {
            if (player.equals(value.player_name)) {
                value.already_voted = true;
                break;
            }
        }
    }
    
    private static boolean have_i_voted(String player, Players[] players) {
        //to check whether the player has already voted
        boolean have_i_voted = false;
        for (Players value : players) {
            if (player.equals(value.player_name)) {
                have_i_voted = value.already_voted;
            }
        }
        return have_i_voted;
    }
    
    private static void i_have_gained_a_vote(String player, Players[] players) {
        //number of votes that each person grabs matters
        for (Players value : players) {
            if (value.player_name.equals(player)) {
                value.votes_gained++;
            }
        }
    }
    
    private static boolean joker_was_killed_at_day(Players[] players) {
        //if joker gets killed during day he will win
        boolean joker_was_killed_at_day = false;
        for (Players player : players) {
            if (player instanceof Joker) {
                joker_was_killed_at_day = ((Joker) player).killed_at_day;
            }
        }
        return joker_was_killed_at_day;
    }
    
    private static boolean should_be_awake_night(String player, Players[] players) {
        //only members of mafia should be awake at nights
        boolean should_be_awake_night = false;
        for (Players value : players) {
            if (player.equals(value.player_name)) {
                should_be_awake_night = value.should_be_awake_at_night;
            }
        }
        return should_be_awake_night;
    }
    
    private static void at_night_several_votes(Players[] players, String night, String who_to_kill) {
        //members of mafia can vote several times at night though their last vote will be considered
        for (Players player : players) {
            if (night.equals(player.player_name)) {
                if (player.already_voted) {
                    for (Players value : players) {
                        if (player.already_voted_to.equals(value.player_name)) {
                            value.votes_gained--;
                        }
                    }
                }
            }
        }
        for (Players player : players) {
            if (who_to_kill.equals(player.player_name)) {
                player.votes_gained++;
            }
            if (night.equals(player.player_name)) {
                player.already_voted_to = who_to_kill;
                player.already_voted = true;
            }
        }
    }
    
    private static String validating(Players[] players) {
        String user = scanner.next();
        boolean user_validation = votee_voter_validation(user, players);
        while (!user_validation) {
            System.out.println("user " + user + " not found,re_enter the name");
            user = scanner.next();
            user_validation = votee_voter_validation(user, players);
        }
        boolean user_aliveness = votee_voter_aliveness(user, players);
        while (!user_aliveness) {
            System.out.println("user " + user + " is already dead! re_enter the name");
            user = scanner.next();
            user_aliveness = votee_voter_aliveness(user, players);
        }
        return user;
    }
    
    private static void start_game(Players[] players) {
        if (!is_game_created || index < players.length) {//first make sure game is created and all players have role
            if (!is_game_created) {
                System.out.println("no game created");
            } else if (index < players.length) {
                System.out.println("one or more player does not have role");
            }
        } else {
            is_game_created = true;
        }
        if (is_game_created && index == players.length) {//prints roles and names of players
            is_game_started = true;
        }
    }
    
    private static void voting(Players[] players) {
        //this method handles voting process
        //voting at days
        int num_of_votes = 0;
        boolean joker_kill_time = joker_was_killed_at_day(players);
        while (!joker_kill_time && ((game.count_of_mafias != 0) && game.count_of_villagers >= game.count_of_mafias)) {
            if (game.is_it_day) {
                System.out.println("day : " + game.num_of_Day);
                for (Players player : players) {
                    if (player.is_silenced) {
                        System.out.println(player.player_name + " is silenced");
                    }
                }
                for (Players player : players) {//prints every one alive
                    if (player.is_alive) {
                        System.out.println(player.player_name + " : " + player.role);
                    }
                }
                inner_loop:
                while (num_of_votes < index) {
                    String voter = scanner.next();
                    if (voter.equals("end_vote")) {
                        break inner_loop;
                    }
                    if (voter.equals("get_game_state")) {
                        System.out.println("num of villagers : " + game.count_of_villagers);
                        System.out.println("num of mafias : " + game.count_of_mafias);
                        voter = scanner.next();
                    }
                    String votee = scanner.next();
                    boolean voter_validation = votee_voter_validation(voter, players);
                    boolean votee_validation = votee_voter_validation(votee, players);
                    while (!voter_validation) {
                        System.out.println("voter not found,re_enter the voter name");
                        voter = scanner.next();
                        if (voter.equals("end_vote")) {
                            break inner_loop;
                        }
                        voter_validation = votee_voter_validation(voter, players);
                    }
                    while (!votee_validation) {
                        System.out.println("votee not found,re_enter the votee name");
                        votee = scanner.next();
                        votee_validation = votee_voter_validation(votee, players);
                    }
                    boolean voter_aliveness = votee_voter_aliveness(voter, players);
                    boolean votee_aliveness = votee_voter_aliveness(votee, players);
                    while (!voter_aliveness) {
                        System.out.println("voter is dead! re_enter the voter name");
                        voter = scanner.next();
                        if (voter.equals("end_vote")) {
                            break inner_loop;
                        }
                        voter_aliveness = votee_voter_aliveness(voter, players);
                    }
                    while (!votee_aliveness) {
                        System.out.println("votee is dead! re_enter the votee name");
                        votee = scanner.next();
                        votee_aliveness = votee_voter_aliveness(votee, players);
                    }
                    boolean voter_silence = votee_voter_silence(voter, players);
                    while (voter_silence) {
                        System.out.println("voter is silenced! re-enter the voter name ");
                        voter = scanner.next();
                        if (voter.equals("end_vote")) {
                            break inner_loop;
                        }
                        voter_silence = votee_voter_silence(voter, players);
                    }
                    boolean already_voted = have_i_voted(voter, players);
                    while (already_voted) {
                        System.out.println("voter has already voted.re-enter the voter name");
                        voter = scanner.next();
                        if (voter.equals("end_vote")) {
                            break inner_loop;
                        }
                        already_voted = have_i_voted(voter, players);
                    }
                    i_have_voted(voter, players);
                    i_have_gained_a_vote(votee, players);
                    num_of_votes++;
                }
                int max_votes = players[0].votes_gained;//to find the player with more votes
                int index_max_votes = 0;//to know their index in array
                for (int i = 1; i < players.length; i++) {//to check who has more votes
                    if (players[i].votes_gained > max_votes) {
                        max_votes = players[i].votes_gained;
                        index_max_votes = i;
                    }
                }
                int equal_votes = 0;
                for (Players player : players) {
                    if (player.votes_gained == max_votes)
                        equal_votes++;
                }
                if (equal_votes == 1) {//one and only one max vote will cause s.one to die
                    if (players[index_max_votes].role.equals("joker")) {
                        System.out.println("joker won !");
                        joker_kill_time = true;
                    } else {
                        players[index_max_votes].is_alive = false;
                        System.out.println(players[index_max_votes].player_name + " died with " + players[index_max_votes].votes_gained + " votes");
                        index--;
                        if (players[index_max_votes].role.equals("mafia") || players[index_max_votes].role.equals("silencer") || players[index_max_votes].role.equals("godfather")) {
                            game.count_of_mafias--;
                        } else {
                            game.count_of_villagers--;
                        }
                    }
                } else {//different players with same max votes will cause no one to die
                    System.out.println("no one died!");
                }
                for (Players player : players) {//they have voted once and now the iteration is finished
                    player.already_voted = false;
                    player.votes_gained = 0;
                    player.is_silenced = false;
                }
                if (game.count_of_mafias == 0 || game.count_of_villagers <= game.count_of_mafias) {
                    if (game.count_of_villagers <= game.count_of_mafias) {
                        System.out.println("mafia won!");
                        
                    } else {
                        System.out.println("villagers won!");
                    }
                    System.exit(0);
                }
                num_of_votes = 0;
                game.num_of_Day++;
                game.is_it_day = false;//it will cause the game to ignore the day (IF) in loop
            } else {
                System.out.println("night " + game.num_of_Night);
                for (Players player : players) {//prints those who should be awake at night
                    if (player.is_alive && player.should_be_awake_at_night) {
                        System.out.println(player.player_name + " : " + player.role);
                    }
                }
                String night;
                //voting at nights
                x:
                while (game.count_of_mafias != 0 && game.count_of_villagers >= game.count_of_mafias) {
                    night = scanner.next();
                    if (night.equals("end_night")) {
                        System.out.println("is god willing to swap characters?");
                        String swap_characters = scanner.next();
                        if (swap_characters.equals("yes")) {
                            swap_character(players);
                        }
                        break;
                    }
                    if (night.equals("get_game_state")) {
                        System.out.println("num of villagers : " + game.count_of_villagers);
                        System.out.println("num of mafias : " + game.count_of_mafias);
                        night = scanner.next();
                    }
                    boolean night_validation = votee_voter_validation(night, players);
                    while (!night_validation) {
                        System.out.println("player " + night + " not found.re-enter the name");
                        night = scanner.next();
                        if (night.equals("end_night")) {
                            System.out.println("is god willing to swap characters?");
                            String swap_characters = scanner.next();
                            if (swap_characters.equals("yes")) {
                                swap_character(players);
                            }
                            break;
                        }
                        night_validation = votee_voter_validation(night, players);
                    }
                    boolean night_aliveness = votee_voter_aliveness(night, players);
                    while (!night_aliveness) {
                        System.out.println("player " + night + " is dead.re-enter the name");
                        night = scanner.next();
                        if (night.equals("end_night")) {
                            System.out.println("is god willing to swap characters?");
                            String swap_characters = scanner.next();
                            if (swap_characters.equals("yes")) {
                                swap_character(players);
                            }
                            break;
                        }
                        night_aliveness = votee_voter_aliveness(night, players);
                    }
                    boolean should_be_awake_night = should_be_awake_night(night, players);
                    while (!should_be_awake_night) {
                        System.out.println("player " + night + " cant wake up during night.re-enter the name");
                        night = scanner.next();
                        if (night.equals("end_night")) {
                            System.out.println("is god willing to swap characters?");
                            String swap_characters = scanner.next();
                            if (swap_characters.equals("yes")) {
                                swap_character(players);
                            }
                            break;
                        }
                        should_be_awake_night = should_be_awake_night(night, players);
                    }
                    //with each input an action will take place . the following loop will handle it.
                    for (Players player : players) {
                        if (night.equals(player.player_name)) {
                            switch (player.role) {
                                case "doctor" -> {
                                    String to_be_saved = validating(players);
                                    for (Players value : players) {
                                        if (to_be_saved.equals(value.player_name)) {
                                            value.saved_by_doctor = true;
                                            break;
                                        }
                                    }
                                }
                                case "silencer" -> {
                                    if (((silencer) player).first_job) {
                                        for (Players value : players) {
                                            value.is_silenced = false;
                                        }
                                        String who_to_silent = validating(players);
                                        for (Players value : players) {
                                            if (who_to_silent.equals(value.player_name)) {
                                                value.is_silenced = true;
                                                break;
                                            }
                                        }
                                        ((silencer) player).first_job = false;
                                        continue x;
                                    }
                                    if (!((silencer) player).first_job) {
                                        String who_to_kill = validating(players);
                                        at_night_several_votes(players, night, who_to_kill);
                                        ((silencer) player).first_job = true;
                                        continue x;
                                    }
                                }
                                case "detective" -> {
                                    String who_to_detect = validating(players);
                                    boolean al_de = ((detective) player).already_detected;
                                    if (al_de) {
                                        System.out.println("detective has already detected");
                                        continue x;
                                    }
                                    for (Players value : players) {
                                        if (night.equals(value.player_name)) {
                                            ((detective) value).already_detected = true;
                                        }
                                    }
                                    for (Players value : players) {
                                        if (who_to_detect.equals(value.player_name)) {
                                            if (value.role.equals("mafia") || value.role.equals("silencer")) {
                                                System.out.println("yes");
                                            } else {
                                                System.out.println("no");
                                            }
                                        }
                                    }
                                }
                                case "mafia", "godfather" -> {
                                    String who_to_kill = validating(players);
                                    at_night_several_votes(players, night, who_to_kill);
                                }
                                default -> System.out.println("role not found");
                            }
                        }
                    }
                }
                int max_vote_night = players[0].votes_gained;
                int index_max_votes = 0;
                for (int i = 0; i < players.length; i++) {
                    if (players[i].votes_gained >= max_vote_night) {
                        max_vote_night = players[i].votes_gained;
                        index_max_votes = i;
                    }
                }
                int num_of_same_max_votes = 0;
                for (Players value : players) {
                    if (max_vote_night == value.votes_gained) {
                        num_of_same_max_votes++;
                    }
                }
                int[] index_same = new int[2];
                if (num_of_same_max_votes == 2) {
                    int q = 0;
                    for (int i = 0; i < players.length; i++) {
                        if (players[i].votes_gained == max_vote_night) {
                            index_same[q] = i;
                            q++;
                        }
                    }
                }
                if (num_of_same_max_votes == 1) {
                    if (players[index_max_votes].saved_by_doctor) {
                        System.out.println("mafia tried to kill " + players[index_max_votes].player_name + " but couldnt");
                        players[index_max_votes].saved_by_doctor = false;
                    } else if (players[index_max_votes].role.equals("informer")) {
                        System.out.println(players[index_max_votes].player_name + " died with " + players[index_max_votes].votes_gained + " votes");
                        System.out.println("they were informer");
                        players[index_max_votes].is_alive = false;
                        game.count_of_villagers--;
                        ((informer) players[index_max_votes]).informing(players, max_vote_night, game);
                    } else if (players[index_max_votes].role.equals("bulletproof")) {
                        if (((bulletproof) players[index_max_votes]).remaining_spare_life == 1) {
                            System.out.println("mafia tried to kill " + players[index_max_votes].player_name + " but couldnt");
                            ((bulletproof) players[index_max_votes]).remaining_spare_life = 0;
                        } else {
                            System.out.println(players[index_max_votes].player_name + " died with " + players[index_max_votes].votes_gained + " votes");
                            players[index_max_votes].is_alive = false;
                            game.count_of_villagers--;
                        }
                    } else {
                        System.out.println(players[index_max_votes].player_name + " died with " + players[index_max_votes].votes_gained + " votes");
                        players[index_max_votes].is_alive = false;
                        game.count_of_villagers--;
                    }
                } else if (num_of_same_max_votes == 2) {
                    if (players[index_same[0]].saved_by_doctor && !players[index_same[1]].saved_by_doctor) {
                        System.out.println(players[index_same[1]].player_name + " died with " + players[index_same[1]].votes_gained);
                        players[index_same[1]].is_alive = false;
                        game.count_of_villagers--;
                    } else if (!players[index_same[0]].saved_by_doctor && players[index_same[1]].saved_by_doctor) {
                        System.out.println(players[index_same[0]].player_name + " died with " + players[index_same[0]].votes_gained);
                        players[index_same[0]].is_alive = false;
                        game.count_of_villagers--;
                    }
                } else {
                    System.out.println("no one died. more than 2 same votes");
                }
                for (Players player : players) {
                    player.saved_by_doctor = false;
                    player.votes_gained = 0;
                    player.already_voted = false;
                    player.already_voted_to = "";
                    if (player instanceof detective) {
                        (((detective) player).already_detected) = false;
                    }
                    game.swapped_chars = false;
                }
                if (game.count_of_mafias == 0 || game.count_of_villagers <= game.count_of_mafias) {
                    if (game.count_of_villagers <= game.count_of_mafias) {
                        System.out.println("mafia won!");
                    } else {
                        System.out.println("villagers won!");
                    }
                    System.exit(0);
                }
                game.num_of_Night++;
                game.is_it_day = true;
            }
        }
    }
    
    private static void swap_character(Players[] players) {
        //if god decide to swap chars
        String first, last;
        first = scanner.next();
        last = scanner.next();
        boolean first_validation = votee_voter_validation(first, players);
        while (!first_validation) {
            System.out.println("player to be swapped not found.re-enter the name");
            first = scanner.next();
            first_validation = votee_voter_validation(first, players);
        }
        boolean first_aliveness = votee_voter_aliveness(first, players);
        while (!first_aliveness) {
            System.out.println("player to be swapped is already dead.re-enter the name");
            first = scanner.next();
            first_aliveness = votee_voter_aliveness(first, players);
        }
        boolean last_validation = votee_voter_validation(last, players);
        while (!last_validation) {
            System.out.println("player to be swapped not found.re-enter the name");
            last = scanner.next();
            last_validation = votee_voter_validation(last, players);
        }
        boolean last_aliveness = votee_voter_aliveness(last, players);
        while (!last_aliveness) {
            System.out.println("player to be swapped is already dead.re-enter the name");
            last = scanner.next();
            last_aliveness = votee_voter_aliveness(last, players);
        }
        for (Players player : players) {
            if (player.player_name.equals(first)) {
                player.player_name = "holder";
            }
        }
        for (Players player : players) {
            if (player.player_name.equals(last)) {
                player.player_name = first;
            }
        }
        for (Players player : players) {
            if (player.player_name.equals("holder"))
                player.player_name = last;
        }
        
        System.out.println("swapped chars between " + first + " and " + last);
        game.swapped_chars = true;
    }
    
    public static void main(String[] args) {
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
                case "assign_role":
                    role_assign(players_name, players);
                    break;
                case "start_game":
                    start_game(players);
                    if (is_game_started && is_game_created) {
                        voting(players);
                    }
                    break;
                default:
                    System.out.println("undefined command");
                    break;
            }
        }
    }
}
