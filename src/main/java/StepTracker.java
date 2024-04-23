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
  activeDay = 0;
 }
 public void addDailySteps(int steps)
 {
  if(steps >= minSteps)
  {
   activeDay++;
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
  for(int i: fred)
   {
    sum+= i;
   }
  sum /= fred.size();
  return sum;
 }
} 
