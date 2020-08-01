public class ClockImp
{
//the main method
      public static void main(String[] args)
      
      {
            ClockDisplay clockDisplay = new  ClockDisplay(5,30);
            clockDisplay.tick();
            
         System.out.println(clockDisplay.getDisplayValue());
                   CounterDisplay CounterDisplay  = new CounterDisplay(3);
                   
                   clockDisplay.tick();
                   clockDisplay.tick();
                    
         System.out.println(CounterDisplay.getDisplayValue());
                    clockDisplay.tick();
              
         System.out.println(CounterDisplay.getDisplayValue());


            
            
            }
}