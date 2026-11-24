
import java.util.*;

class RideRequest extends Thread
{
@Override
public void run()
{
   IO.println("User requested a ride...");
   
   try
   {
    Thread.sleep(2000);}
   catch(InterruptedException a)
   {
    a.printStackTrace();
   }

   IO.println("Searching for nearby drivers...");
}
}

class DriverAssignment extends Thread
{
    @Override
public void run()
{
   try
   {
    Thread.sleep(3000);
   }
   catch(InterruptedException b)
   {
    b.printStackTrace();
   }
     IO.println("Driver found and assigned!");
}
}

class FareCalculation extends Thread
{
    @Override
public void run()
{
    IO.println("Calculating estimated fare...");
   try
   {
    Thread.sleep(1500);
   }
   catch(InterruptedException c)
   {
    c.printStackTrace();
   }
   IO.println("Estimated fare: 135.75 RS.");
}
}

class LiveTracking extends Thread
{
    @Override
public void run()
{
    IO.println("Updating ride location... 20% completed");
    IO.println("Updating ride location... 40% completed");
    IO.println("Updating ride location... 60% completed");
    IO.println("Updating ride location... 80% completed");
    IO.println("Updating ride location... 100% completed");


    IO.println("Ride completed!");

}
}

class PaymentProcessing extends Thread
{
    @Override
public void run()
{
    IO.println("Processing payment...");
   try
   {
    Thread.sleep(2000);
   }
   catch(InterruptedException d)
   {
    d.printStackTrace();
   }
    IO.println("Payment successful!");
}
}

class RatingSystem extends Thread
{
    @Override
public void run()
{
     IO.println("Requesting user rating...");
   try
   {
    Thread.sleep(1500);
   }
   catch(InterruptedException e)
   {
    e.printStackTrace();
   }
    IO.println("User rated the ride: 5 star");

}
}


public class Main {
    public static void main(String[] args) throws InterruptedException
     {
       RideRequest rs = new RideRequest();
       DriverAssignment dr  =  new DriverAssignment();
       FareCalculation fc = new FareCalculation();
       LiveTracking tc = new LiveTracking();
       PaymentProcessing pay = new PaymentProcessing();
       RatingSystem rc = new RatingSystem();

       rs.start();
       fc.start();
       fc.join();
       dr.start();
       dr.join();
       tc.start();
       tc.join();
       pay.start();
       pay.join();
       rc.start();
       


    }
}
