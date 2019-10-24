/**
* @author Faisal Pindar 100629476
*/

public class PrintVoltageWater {
    public static void main (String[]args){
        double Vm,Rs = 75,Vs = 20,Ro = 50,k = 0.5;
      System.out.println("  t" + "\t" + "  Vm");
      System.out.println("-----" + "\t"+ "------");
        for (int t =0; t<=100; t+=10){
          
            Vm = (Vs*((k*t)+Ro))/((k*t)+Ro+Rs);
            
            System.out.println(t+ "\t" + String.format("%.2f", Vm));
            
        }
        
    }
