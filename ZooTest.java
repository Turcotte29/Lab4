
public class ZooTest
{

   
    public void getTotalHeightTest() throws AssertException
    {
        Zoo zoo = new Zoo(10);
        
        zoo.addAnimal(new Animal("Blue", "Bear", 0.0, 100.5));
        
        Assert.assertEquals(100.5, zoo.getTotalHeight());
        
    	
    }

    
    public void getCapacityTest() throws AssertException
    {
    	Zoo zoo = new Zoo(0);
    	Zoo zoo2 = new Zoo(1);
    	Zoo zoo3 = new Zoo(2);
    	
    	Assert.assertEquals(0, zoo.getCapacity());
    	
    	zoo2.addAnimal(new Animal());
    	Assert.assertEquals(1, zoo2.getCapacity());
    	
    	zoo3.addAnimal(new Animal());
    	Assert.assertEquals(2, zoo3.getCapacity());
    	
    }
    
    public void toStringTest() throws AssertException
    {
    	Zoo zoo = new Zoo(10);
    	
    	zoo.addAnimal(new Animal("Yellow", "Doggo", 220.7, 154.2));
    	
    	Assert.assertEquals("These animals live in the zoo: \n"
    			+ "Doggo, a Yellow-colored animal. 220.7 pounds, 154.2 inches\n", zoo.toString());
    	
    	
    }
    
    
}

