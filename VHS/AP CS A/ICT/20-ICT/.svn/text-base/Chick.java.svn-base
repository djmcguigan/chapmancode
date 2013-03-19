public class Chick implements Animal
{
    private String myType;
    private String mySound;
    private String myNoise;

    public Chick(String type, String sound)
    {
        myType = type;
        mySound = sound;
        myNoise = sound;
    }
    
    public Chick(String type, String sound1, String sound2)
    {
        myType = type;
        mySound = sound1;
        myNoise = sound2;
    }
        
        
    public String getSound()
    {
        double num = Math.random();
        if(num < .5)
            return mySound;
        else
            return myNoise;
    }
        
    public String getType()
    {
        return myType; 
    }
}