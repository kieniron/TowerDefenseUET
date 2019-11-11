package game.enemy;

public class SmallerEnemy extends BaseEnemy {
    public SmallerEnemy(int posX, int posY, int type) {
        super(posX, posY, "smaller", type,60);
        setFrameAmount(9);
        setSpeed(1);
    }
}