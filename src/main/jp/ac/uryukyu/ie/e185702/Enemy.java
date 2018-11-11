package jp.ac.uryukyu.ie.e185702;

public class Enemy extends LivingThing{

    public Enemy (String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }

    @Override
    public void wounded ( int damage){
        int Enmy_hp = getHitPoint();
        setHitPoint(Enmy_hp -= damage);
        if (getHitPoint() < 0) {
            setDead(true);
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }

}