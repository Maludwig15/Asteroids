
public class Bullet extends Sprite{
    public Bullet(int x, int y, int direction, int speed){
        super(x, y, EAST);
        setPic("bullet1.png", WEST);
        setSpeed(-15);
    }
    public Bullet(){
        setPic("bullet1.png", WEST);
        setSpeed(-15);
    }
    @Override
    public void update(){
        super.update();
    }


}
