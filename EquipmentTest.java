
public class EquipmentTest
{

    
    public void constructorTest() throws AssertException
    {
       
        Equipment equipment = new Equipment("Bat Shark Repellent/3,3.0,3.0, Shark repelling bat spray");

       
        Assert.assertEquals("Bat Shark Repellent", equipment.getName());
        Assert.assertEquals(3, equipment.getCount());
        Assert.assertEquals(3.0, equipment.getTotalWeight());
        Assert.assertEquals(3.0, equipment.getTotalPrice());
        Assert.assertEquals(" Shark repelling bat spray", equipment.getDescription());
        
    }
    
    public void testToString() throws AssertException{
    	
    	Equipment equipment = new Equipment("Bat Shark Repellent/3,3.0,3.0,Shark repelling"
    			+ " bat spray");
    	
    	Assert.assertEquals("Name: Bat Shark Repellent, Number: 3, Weight: "
    			+ "3.00 lbs, Price: $3.00 - Shark repelling bat spray", equipment.toString());
    	
    }
    
    
}

