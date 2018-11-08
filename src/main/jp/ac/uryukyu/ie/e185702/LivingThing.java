package jp.ac.uryukyu.ie.e185702;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;


    public LivingThing(String name, int hitPoint, int attack) {
        this.name = name;
        this.attack = attack;
        this.hitPoint = hitPoint;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }

    public boolean isDead() {
        return dead;
    }

    public String getName() {
        return name;
    }

    public void attack(LivingThing opponent) {
        if (!dead) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }
}