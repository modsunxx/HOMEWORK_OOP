public class DragonSlime extends Slime{

    public DragonSlime(int hitPoint, int attack) {
        super(hitPoint, attack);
    }
    public int fireBreath(){
        return this.getAttack() * 2;
    }
    
}
