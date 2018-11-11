package jp.ac.uryukyu.ie.e185702;

public class Hero extends LivingThing {

    public Hero (String name, int hitPoint, int attack) {
        super(name,hitPoint,attack);
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }

    @Override
    public void wounded(int damage){
        int Hp_hero = getHitPoint();
        setHitPoint(Hp_hero -= damage);

        if( getHitPoint() < 0 ) {
            setDead(true);
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", getName());
        }
    }
}