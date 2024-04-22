import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 int minSteps, activeDay;
 ArrayList<Integer> fred;
 public StepTracker(int aa)
 {
  fred = new ArrayList<Integer>();
  minSteps = aa;
  activeDays = 0;
 }
 public void addDailySteps(int steps)
 {
  if(steps >= minSteps)
  {
   activeDay++:
  }
  fred.add(steps);
 }
 public int activeDays()
 {
  return activeDay;
 }
 public double averageSteps()
 {
  double sum = 0;
  for(int i =0; i < fred.size(); i++)
   {
    sum+= fred.get(i);
   }
  return sum/fred.size();
 }
} 
