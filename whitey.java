import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class whitey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class whitey extends Actor
{
 private int vSpeed = 0;
    private int speed = 5;

    public void act() {
        handleInput();
        jump();
        checkFalling();
        fall();
        moveAround();
        collectCoin();
    }

    private void handleInput() {
        String key = Greenfoot.getKey();
        if ("x".equals(key)) {
            shoot();
        }
    }

    public void moveAround() {
        if (Greenfoot.isKeyDown("right")) setLocation(getX() + speed, getY());
        if (Greenfoot.isKeyDown("left"))  setLocation(getX() - speed, getY());
    }

    public void fall() {
        setLocation(getX(), getY() + vSpeed);
    }

    public void checkFalling() {
        if (!isTouching(Plataforma.class)) vSpeed++;
        else {
            setLocation(getX(), getY() - 1);
            vSpeed = 0;
        }
    }

    public void jump() {
        if (Greenfoot.isKeyDown("space")) {
            vSpeed = -12;
        }
    }

    private void collectCoin() {
        if (isTouching(moneda2.class)) {
            removeTouching(moneda2.class);
            // Greenfoot.playSound("coin.wav");
        }
    }

    private void shoot() {
        proyectil proj = new proyectil();
        getWorld().addObject(proj, getX(), getY());
    }
}
