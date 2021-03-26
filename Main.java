import java.util.Scanner;
public class Main {
    public static int index = 0 ;
    public static boolean is_game_created = false ;
    public static boolean is_game_started = false ;
    public static Game game ;
    static Scanner scanner = new Scanner(System.in);
    //-----------------------------
    //-----------------------------
    public static String[] create_game(){ //this method split the names and then puts them in an array
       
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
                                players[index].should_be_awake_at_night = true ;
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
                                players[index].should_be_awake_at_night = true ;
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
                                players[index].should_be_awake_at_night = true ;
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
                                players[index].should_be_awake_at_night = true ;
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
                                players[index].should_be_awake_at_night = true ;
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
    public static boolean joker_was_killed_at_day(Players[] players){
        boolean joker_was_killed_at_day = false ;
        for (int i = 0; i < players.length; i++) {
            if (players[i] instanceof Joker){
                joker_was_killed_at_day = ((Joker) players[i]).killed_at_day;
            }
        }
        return joker_was_killed_at_day ;
    }
    //-----------------------------
    public static boolean should_be_awake_night(String player , Players[] players){
        boolean should_be_awake_night = false ;
        for (int i = 0; i < players.length; i++) {
            if (player.equals(players[i].player_name)){
                should_be_awake_night = players[i].should_be_awake_at_night ;
            }
        }
        return should_be_awake_night;
    }
    //-----------------------------
    public static void at_night_several_votes(Players[] players , String night , String who_to_kill){
        for (int j = 0; j < players.length; j++) {
            if (night.equals(players[j].player_name)){
                if (players[j].already_voted){
                    for (int k = 0; k < players.length; k++) {
                        if (players[j].already_voted_to.equals(players[k].player_name)){
                            players[k].votes_gained--;
                        }
                    }
//                    players[j].already_voted_to = who_to_kill ;
                }
            }
        }
        for (int j = 0; j < players.length; j++) {
            if (who_to_kill.equals(players[j].player_name)){
                players[j].votes_gained++;
            }
            if (night.equals(players[j].player_name)){
                players[j].already_voted_to = who_to_kill ;
                players[j].already_voted = true ;
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
            is_game_started = true ;
        }
    }
    //-----------------------------
    public static void voting(Players[] players) {
        int num_of_votes = 0;
        boolean joker_kill_time = joker_was_killed_at_day(players) ;
        while (!joker_kill_time && ((game.count_of_mafias != 0) && game.count_of_villagers >= game.count_of_mafias) ){
            if (game.is_it_day){
                System.out.println("day : " + game.num_of_Day);
                for (int i = 0; i < players.length; i++) {//prints every one alive
                    if (players[i].is_alive){
                        System.out.println(players[i].player_name + " : " + players[i].role);
                    }
                }
                inner_loop : while (num_of_votes < index) {
                    String voter = scanner.next();
                    if (voter.equals("end_vote")){
                        break inner_loop;
                    }
                    String votee = scanner.next();
                    boolean voter_validation = votee_voter_validation(voter, players);
                    boolean votee_validation = votee_voter_validation(votee, players);
                    while (!voter_validation) {
                        System.out.println("voter not found,re_enter the voter name");
                        voter = scanner.next();
                        if (voter.equals("end_vote")){
                            break inner_loop;
                        }
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
                        if (voter.equals("end_vote")){
                            break inner_loop;
                        }
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
                        if (voter.equals("end_vote")){
                            break inner_loop;
                        }
                        voter_silence = votee_voter_silence(voter , players) ;
                    }
                    boolean already_voted = have_i_voted(voter , players);
                    while (already_voted){
                        System.out.println("voter has already voted.re-enter the voter name");
                        voter = scanner.next();
                        if (voter.equals("end_vote")){
                            break inner_loop;
                        }
                        already_voted = have_i_voted(voter , players);
                    }
                    i_have_voted(voter , players);
                    i_have_gained_a_vote(votee , players);
                    num_of_votes++;
        
                }
                int max_votes = players[0].votes_gained ;//to find the player with more votes
                int index_max_votes = 0 ;//to know their index in array
                for (int i = 1; i < players.length; i++) {//to check who has more votes
                        if (players[i].votes_gained > max_votes){
                            max_votes = players[i].votes_gained ;
                            index_max_votes = i ;
                        }
                }
                int equal_votes = 0 ;
                for (int i = 0; i < players.length; i++) {
                    if (players[i].votes_gained == max_votes)
                        equal_votes++;
                }
                if (equal_votes == 1){//one and only one max vote will cause s.one to die
                    if (players[index_max_votes].role.equals("joker")){
                        System.out.println("joker won !");
                        joker_kill_time = true ;
                    }
                    else{
                        players[index_max_votes].is_alive = false ;
                        System.out.println(players[index_max_votes].player_name + " died with " + players[index_max_votes].votes_gained + " votes");
                        index--;
                        if (players[index_max_votes].role.equals("mafia") || players[index_max_votes].role.equals("silencer") || players[index_max_votes].role.equals("godfather")){
                            game.count_of_mafias--;
                        }
                        else {
                            game.count_of_villagers--;;
                        }
                    }
                }
                else {//different players with same max votes will cause no one to die
                    System.out.println("no one died!");
                }
                for (int i = 0; i < players.length; i++) {//they have voted once and now the iteration is finished
                    players[i].already_voted = false ;
                    players[i].votes_gained = 0 ;
                    players[i].is_silenced = false ;
                }
                if (game.count_of_mafias == 0 || game.count_of_villagers <= game.count_of_mafias){
                    if (game.count_of_villagers <= game.count_of_mafias){
                        System.out.println("mafia won!");
                    }
                    else{
                        System.out.println("villagers won!");
                    }
                    System.exit(0);
                }
                num_of_votes = 0 ;
                game.num_of_Day++;
                game.is_it_day = false ;//it will cause the game to ignore the day (IF) in loop
            }

            else {
                System.out.println("night " + game.num_of_Night);
                for (int i = 0; i < players.length; i++) {//prints those who should be awake at night
                    if (players[i].is_alive && players[i].should_be_awake_at_night){
                        System.out.println(players[i].player_name + " : " + players[i].role);
                    }
                }
                String night ;
                while (game.count_of_mafias != 0 && game.count_of_villagers >= game.count_of_mafias){
//                    System.out.println("u have passed through night");
                    night = scanner.next();
                    if (night.equals("end_night")){
                        break;
                    }
                    boolean night_validation = votee_voter_validation(night ,players) ;
                    while (!night_validation){
                        System.out.println("player not found.re-enter the name");
                        night = scanner.next();
                        if (night.equals("end_night")){
                            break;
                        }
                        night_validation = votee_voter_validation(night ,players) ;
                    }
                    boolean night_aliveness = votee_voter_aliveness(night , players) ;
                    while (!night_aliveness){
                        System.out.println("player is dead.re-enter the name");
                        night = scanner.next();
                        if (night.equals("end_night")){
                            break;
                        }
                        night_aliveness = votee_voter_aliveness(night , players) ;
                    }
                    boolean should_be_awake_night = should_be_awake_night(night , players) ;
                    while (!should_be_awake_night){
                        System.out.println("player cant wake up during night.re-enter the name");
                        night = scanner.next();
                        if (night.equals("end_night")){
                            break;
                        }
                        should_be_awake_night = should_be_awake_night(night , players) ;
                    }
                    for (int i = 0; i < players.length; i++) {
                        if (night.equals(players[i].player_name)){
                            switch (players[i].role){
                                case "doctor":
                                    String to_be_saved = scanner.next();
                                    boolean to_be_saved_validation = votee_voter_validation(to_be_saved , players) ;
                                    while (!to_be_saved_validation){
                                        System.out.println("the one to be saved not found,re_enter the voter name");
                                        to_be_saved = scanner.next();
                                        to_be_saved_validation = votee_voter_validation(to_be_saved , players) ;
                                    }
                                    boolean to_be_saved_aliveness = votee_voter_aliveness(to_be_saved , players) ;
                                    while (!to_be_saved_aliveness){
                                        System.out.println("the one to be saved is dead! re_enter the votee name");
                                        to_be_saved = scanner.next();
                                        to_be_saved_aliveness = votee_voter_aliveness(to_be_saved , players) ;
                                    }
                                    for (int j = 0; j < players.length; j++) {
                                        if (to_be_saved.equals(players[j].player_name)){
                                            players[j].saved_by_doctor = true ;
                                            break;
                                        }
                                    }
                                    break;
                                case "silencer":
                                    int job = 0 ;
                                    if (job == 0){
                                        String who_to_silent = scanner.next();
                                        boolean who_to_silent_validation = votee_voter_validation(who_to_silent , players) ;
                                        while (!who_to_silent_validation){
                                            System.out.println("player to be silenced not found.re-enter the name");
                                            who_to_silent = scanner.next();
                                            who_to_silent_validation = votee_voter_validation(who_to_silent , players) ;
                                        }
                                        boolean who_to_silent_aliveness = votee_voter_aliveness(who_to_silent , players) ;
                                        while (!who_to_silent_aliveness){
                                            System.out.println("player to be silenced is not alive.re-enter the name");
                                            who_to_silent = scanner.next();
                                            who_to_silent_aliveness = votee_voter_aliveness(who_to_silent , players) ;
                                        }
                                        for (int j = 0; j < players.length; j++) {
                                            if (who_to_silent.equals(players[j].player_name)){
                                                players[j].is_silenced  = true ;
                                                break;
                                            }
                                        }
                                        job = 1 ;
                                    }
                                    if (job == 1){
                                        String who_to_kill = scanner.next();
                                        boolean who_to_kill_validaion = votee_voter_validation(who_to_kill , players) ;
                                        while (!who_to_kill_validaion){
                                            System.out.println("player to be killed not found.re-enter the name");
                                            who_to_kill = scanner.next();
                                            who_to_kill_validaion = votee_voter_validation(who_to_kill , players) ;
                                        }
                                        boolean who_to_kill_aliveness = votee_voter_aliveness(who_to_kill , players) ;
                                        while (!who_to_kill_aliveness){
                                            System.out.println("player to be killed is already dead.re-enter the name");
                                            who_to_kill = scanner.next();
                                            who_to_kill_aliveness = votee_voter_aliveness(who_to_kill , players) ;
                                        }
                                        at_night_several_votes(players ,night ,who_to_kill) ;
                                        job = 0 ;
                                    }
                                break;
                                case "detective":
                                    for (int j = 0; j < players.length; j++) {
                                        if (night.equals(players[j].player_name)){
                                            ((detective) players[j]).already_detected = true ;
                                        }
                                    }
                                    String who_to_detect = scanner.next();
                                    boolean who_to_detect_validation = votee_voter_validation(who_to_detect , players) ;
                                    while (!who_to_detect_validation){
                                        System.out.println("player to be silenced not found.re-enter the name");
                                        who_to_detect = scanner.next();
                                        who_to_detect_validation = votee_voter_validation(who_to_detect , players) ;
                                    }
                                    boolean who_to_detect_aliveness = votee_voter_aliveness(who_to_detect , players) ;
                                    while (!who_to_detect_aliveness){
                                        System.out.println("player to be silenced is not alive.re-enter the name");
                                        who_to_detect = scanner.next();
                                        who_to_detect_aliveness = votee_voter_aliveness(who_to_detect , players) ;
                                    }
                                    for (int j = 0; j < players.length; j++) {
                                        if (who_to_detect.equals(players[j].player_name)){
                                            if (players[j].role.equals("mafia") || players[j].role.equals("silencer")){
                                                System.out.println("yes");
                                            }
                                            else {
                                                System.out.println("no");
                                            }
                                        }
                                    }
                                break;
                                case "mafia","godfather":
                                    String who_to_kill = scanner.next();
                                    boolean who_to_kill_validaion = votee_voter_validation(who_to_kill , players) ;
                                    while (!who_to_kill_validaion){
                                        System.out.println("player to be killed not found.re-enter the name");
                                        who_to_kill = scanner.next();
                                        who_to_kill_validaion = votee_voter_validation(who_to_kill , players) ;
                                    }
                                    boolean who_to_kill_aliveness = votee_voter_aliveness(who_to_kill , players) ;
                                    while (!who_to_kill_aliveness){
                                        System.out.println("player to be killed is already dead.re-enter the name");
                                        who_to_kill = scanner.next();
                                        who_to_kill_aliveness = votee_voter_aliveness(who_to_kill , players) ;
                                    }
                                    at_night_several_votes(players ,night ,who_to_kill) ;
                                break;
                                default:
                                    System.out.println("role not found");
                            }
                        }
                    }
                }
                int max_vote_night = players[0].votes_gained ;
                int index_max_votes = 0 ;
                for (int i = 1; i < players.length; i++) {
                    if (players[i].votes_gained > max_vote_night){
                        max_vote_night = players[i].votes_gained ;
                        index_max_votes = i ;
                    }
                }
                int num_of_same_max_votes = 1 ;
                for (int i = 0; i < players.length; i++) {
                    if (max_vote_night == players[i].votes_gained){
                        num_of_same_max_votes++;
                    }
                }
                int[] index_same = new int[2] ;
                if (num_of_same_max_votes == 2 ){
                    int q = 0;
                    for (int i = 0; i < players.length; i++) {
                        if (players[i].votes_gained==max_vote_night){
                            index_same[q] = i ;
                            q++;
                        }
                    }
                }
                if (num_of_same_max_votes == 1){
                    if (players[index_max_votes].saved_by_doctor){
                        System.out.println("no one died.doctor saved");
                    }
                    else {
                        System.out.println(players[index_max_votes].player_name + " died with " +players[index_max_votes].votes_gained );
                        players[index_max_votes].is_alive = false ;
                        game.count_of_villagers--;
                    }
                }
                else if(num_of_same_max_votes == 2){
                    if (players[index_same[0]].saved_by_doctor && !players[index_same[1]].saved_by_doctor){
                        System.out.println(players[index_same[1]].player_name + " died with " +players[index_same[1]].votes_gained ) ;
                        players[index_same[1]].is_alive = false ;
                        game.count_of_villagers--;
    
    
                    }
                    else if (!players[index_same[0]].saved_by_doctor && players[index_same[1]].saved_by_doctor){
                        System.out.println(players[index_same[0]].player_name + " died with " +players[index_same[0]].votes_gained ) ;
                        players[index_same[0]].is_alive = false ;
                        game.count_of_villagers--;
                    }
                    else {
                        System.out.println("no one died.doctor saved none.2 same votes");
                    }
                }
                else {
                    System.out.println("no one died. more than 2 same votes");
                }
                //-
                for (int i = 0; i < players.length; i++) {
                    players[i].saved_by_doctor = false ;
                    players[i].votes_gained = 0 ;
                    players[i].already_voted = false ;
                    players[i].already_voted_to = "";
                }
                for (int i = 0; i < players.length; i++) {
                    if (players[i].is_silenced){
                        System.out.println(players[i].player_name + " is silenced");
                    }
                }
                if (game.count_of_mafias == 0 || game.count_of_villagers <= game.count_of_mafias){
                    if (game.count_of_villagers <= game.count_of_mafias){
                        System.out.println("mafia won!");
                        System.exit(0);
                    }
                    else{
                        System.out.println("villagers won!");
                        System.exit(0);
                    }
                }
                game.num_of_Night++;
                game.is_it_day = true ;
            }
        }
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
