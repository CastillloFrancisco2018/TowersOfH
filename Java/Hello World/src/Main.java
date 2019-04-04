public class Main
{
	static String[] thePatients = new String[0];
    public static void main(String[] args)
    {
    	for(int i = 0; i< 10;i++)
    	{
    		
    	}
    }  
    static void addPatient(String patientName)
    {
    	String[] temp = new String[Main.thePatients.length +1];
    	for(int i = 0; i<Main.thePatients.length; i++)
    	{
    		temp[i] = Main.thePatients[i];
    	}
    temp [temp.length - 1] = patientName;
    Main.thePatients = temp;
    }
    static void printPatients()
    {
    	for(int i = 0; i<Main.thePatients.length; i++)
    	{
    		System.out.println(Main.thePatients[i]);
    	}
    }
    
}        