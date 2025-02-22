public class Slime {
    private int hitPoint;
    private int attack;

    public Slime(int hitPoint,int attack){
        this.hitPoint = hitPoint;
        this.attack = attack;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public int getAttack() {
        return attack;
    }
    public void attacked(int damage){
        this.hitPoint -= damage;
        if (this.hitPoint < 0) {
            this.hitPoint = 0;
        }
    }
    
}
