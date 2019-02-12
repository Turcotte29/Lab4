/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
        
       
    }

    // TODO: test full constructor, getters, and toString
    public void fullConstructorTest() throws AssertException
    {
    	 Animal animal = new Animal("Yellow", "Doggo", 220.7, 154.2);
         
         Assert.assertEquals("Yellow", animal.getColor());
         Assert.assertEquals("Doggo", animal.getName());
         Assert.assertEquals(220.7, animal.getWeight(), 0.01);
         Assert.assertEquals(154.2, animal.getHeight(), 0.01);
    }
    
    public void toStringTest() throws AssertException
    {
    	
    	Animal animal = new Animal("Yellow", "Doggo", 220.7, 154.2);
        	
    	Assert.assertEquals("Doggo, a Yellow-colored animal. 220.7 pounds, 154.2 inches\n", animal.toString());
    }
    
}

