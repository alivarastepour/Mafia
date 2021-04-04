public class silencer extends Players{
    String who_to_silent ;//they will silent s.one so they wont be able to vote for one day
    boolean first_job = true ;
    public String getWho_to_silent() {
        return who_to_silent;
    }
    public void setWho_to_silent(String who_to_silent) {
        this.who_to_silent = who_to_silent;
    }
    // a constructor which is mainly used to instantiate a new object
    public silencer(String player_name, String role) {
        super(player_name, role);
    }
}
