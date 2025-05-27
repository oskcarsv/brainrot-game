import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(2000, 700, 1, false); 
        getBackground().setColor(new Color(106, 206, 222));
        getBackground().fill();
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Plataforma plataforma = new Plataforma();
        addObject(plataforma,548,675);
        Plataforma plataforma2 = new Plataforma();
        addObject(plataforma2,544,633);
        whitey whitey = new whitey();
        addObject(whitey,92,587);
        removeObject(whitey);
        plataforma2.setLocation(791,630);
        removeObject(plataforma2);
        addObject(whitey,94,457);
        plataforma.setLocation(415,666);
        Plataforma plataforma3 = new Plataforma();
        addObject(plataforma3,1343,628);
        plataforma3.setLocation(1661,708);
        plataforma3.setLocation(1450,677);
        plataforma.setLocation(808,665);
        plataforma.setLocation(808,665);
        plataforma.setLocation(805,688);
        plataforma.setLocation(444,665);
        plataforma.setLocation(444,690);
        plataforma.setLocation(444,679);
        obstaculo obstaculo = new obstaculo();
        addObject(obstaculo,409,631);
        obstaculo obstaculo2 = new obstaculo();
        addObject(obstaculo2,580,572);
        obstaculo obstaculo3 = new obstaculo();
        addObject(obstaculo3,803,500);
        plataformaPequeña plataformaPequeña = new plataformaPequeña();
        addObject(plataformaPequeña,1120,535);
        plataformaPequeña plataformaPequeña2 = new plataformaPequeña();
        addObject(plataformaPequeña2,1358,629);
        plataformaPequeña plataformaPequeña3 = new plataformaPequeña();
        addObject(plataformaPequeña3,1517,580);
        plataformaPequeña plataformaPequeña4 = new plataformaPequeña();
        addObject(plataformaPequeña4,1589,532);
        plataformaPequeña plataformaPequeña5 = new plataformaPequeña();
        addObject(plataformaPequeña5,1649,478);
        cactus cactus = new cactus();
        addObject(cactus,700,616);
        cactus cactus2 = new cactus();
        addObject(cactus2,893,628);
        cactus cactus3 = new cactus();
        addObject(cactus3,936,627);
        cactus cactus4 = new cactus();
        addObject(cactus4,974,628);
        cactus cactus5 = new cactus();
        addObject(cactus5,1012,624);
        cactus cactus6 = new cactus();
        addObject(cactus6,1234,617);
        cactus.setLocation(684,616);
        arbol arbol = new arbol();
        addObject(arbol,244,562);
        arbol.setLocation(253,616);
        arbol.setLocation(1004,388);
        removeObject(arbol);
        moneda2 moneda2 = new moneda2();
        addObject(moneda2,374,563);
        moneda2 moneda22 = new moneda2();
        addObject(moneda22,544,521);
        moneda2 moneda23 = new moneda2();
        addObject(moneda23,751,444);
        moneda2 moneda24 = new moneda2();
        addObject(moneda24,814,441);
        moneda2 moneda25 = new moneda2();
        addObject(moneda25,1585,418);
        moneda2 moneda26 = new moneda2();
        addObject(moneda26,1636,418);
        moneda2 moneda27 = new moneda2();
        addObject(moneda27,1692,419);
    }
}


