import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 200);
        
        createBread();
    }
    
    public void createBread()
    {
        Bread bread = new Bread();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(bread, x, y);
    }
}
