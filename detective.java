public class detective extends Players{
    String who_to_investigate ;//detective investigate one person a night
    public String getWho_to_investigate() {
        return who_to_investigate;
    }
    public void setWho_to_investigate(String who_to_investigate) {
        this.who_to_investigate = who_to_investigate;
    }
    // a constructor which is mainly used to instantiate a new object
    public detective(String player_name, Role role) {
        super(player_name, role);
    }
}
