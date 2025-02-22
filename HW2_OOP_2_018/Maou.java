public class Maou extends DragonSlime{

    public Maou(int hitPoint, int attack) {
        super(hitPoint, attack);
    }
    public int superNova(){
        return this.getAttack() * 10;
    }

    
}
