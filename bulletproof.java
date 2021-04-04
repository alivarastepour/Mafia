public class bulletproof extends Players{
    boolean night_attack ;//bulletproof is invulnerable to night attacks
    int remaining_spare_life = 1 ;//only once they can be saved
    public boolean isNight_attack() {
        return night_attack;
    }
    public void setNight_attack(boolean night_attack) {
        this.night_attack = night_attack;
    }
    // a constructor which is mainly used to instantiate a new object
    public bulletproof(String player_name, String role) {
        super(player_name, role);
    }
    
}
