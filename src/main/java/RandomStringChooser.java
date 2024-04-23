import java.util.*;
public class RandomStringChooser
{
  private String [] vals1;
  private int valL;
  /* to be implemented in part (a) */
  public RandomStringChooser(String[]vals){
    for(int i = 0;i<vals.length;i++){
      vals1[i] = vals[i];
    }
    valL = vals.length;
  }
  public String getNext(){
    if(va1L==0)
      return "NONE"
        int index = (int)(Math.random()*va1L)
      String chose = vals1[index];
    vals1[index] = vals1[va1L-1];
    va1l-1;
  }
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
