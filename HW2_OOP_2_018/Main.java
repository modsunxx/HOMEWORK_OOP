public static void main(String args[]) {
    Slime s = new Slime(100,3);
    DragonSlime d = new DragonSlime(1000,10);
    Maou m = new Maou(9999,100);
    System.out.println("Slime attacked by dragon slime");
    System.out.println("Dragon slime attack = "+d.getAttack());
    System.out.println("Miss!!!\nSlime remaining hp = "+s.getHitPoint());
    System.out.println("Dragon slime use firebreath attack = "+d.fireBreath());
    s.attacked(d.fireBreath());
    System.out.println("Hit!!!\nSlime remaining hp = "+s.getHitPoint());
    System.out.println("Maou join battle!! ");
    System.out.println("Maou use supernova attack = "+m.superNova());
    s.attacked(m.superNova());   
    System.out.println("Hit!!!\nSlime remaining hp = "+s.getHitPoint());
  }
