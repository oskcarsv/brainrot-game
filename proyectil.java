import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class proyectil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class proyectil extends Actor
{
    /**
     * Act - do whatever the proyectil wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 10;

    public void act()
    {
         // Avanza hacia la derecha
        setLocation(getX() + speed, getY());
        // Si sale del mundo, se elimina
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
