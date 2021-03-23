public class Players {
    // a parent class which holds main fields
    String player_name ;
    String role ;
    boolean is_alive = true ;//game should know who is dead
    boolean is_silenced = false ;//game should know who is silenced
    boolean already_voted = false ;//only one vote per person is valid
    int votes_gained = 0 ;//to retrieve number of gained votes per person
    // a constructor which is mainly used to instantiate a new object
    public Players(String player_name, String role) {
        this.player_name = player_name;
        this.role = role;
    }
    public Players(String player_name) {
        this.player_name = player_name;
    }
}
