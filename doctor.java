public class doctor extends Players{
    String who_to_save ;//doctor will choose to save s.one
    public String getWho_to_save() {
        return who_to_save;
    }
    public void setWho_to_save(String who_to_save) {
        this.who_to_save = who_to_save;
    }
    // a constructor which is mainly used to instantiate a new object
    public doctor(String player_name, Role role) {
        super(player_name, role);
    }
}
