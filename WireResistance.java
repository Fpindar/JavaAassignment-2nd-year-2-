/**
* @author Faisal Pindar YourBannerID 100629476
*/

import java.util.Scanner;
 
 
public class WireResistance {
 
    
    double computeDiameter(int wireGauge) {
        return 0.127 * Math.pow(92, ((36-wireGauge)/39.0)) * Math.pow(10, -3);
    }
   
    
    double computeCopperWireResistance(double length, int wireGauge) {
        return (4 * 1.678 * Math.pow(10, -8) * length) / (Math.PI * computeDiameter(wireGauge) * computeDiameter(wireGauge));
    }
 
    double computeAlumWireResistance(double length, int wireGauge){
        return (4 * 2.82 * Math.pow(10, -8) * length) / (Math.PI * computeDiameter(wireGauge) * computeDiameter(wireGauge));
    }
   
    
    public static int getInt(String question) {
       
        Scanner console = new Scanner(System.in);
        System.out.print(question);
        while(!console.hasNextInt()) {
            System.out.print("Input is not a valid integer!");
            console.next();
        }
        int temp = console.nextInt();
        while(temp<0 || temp == 0) {
            System.out.println("invalid input");
            temp = console.nextInt();
        }
        return temp;  
    }
   
   
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int wireGauge = getInt("Enter the wire gauge: ");
        int wireLength = getInt("Enter the wire length in inches: ");
       
        WireResistance wr = new WireResistance();
       
        System.out.printf("The resistance of a " + wireLength + " inch piece of " + wireGauge + " gauge copper wire is %.3f Ohms.\n", wr.computeCopperWireResistance(wireLength * 0.0254, wireGauge));
        System.out.printf("The resistance of a " + wireLength + " inch piece of " + wireGauge + " gauge aluminum wire is %.3f Ohms.\n", wr.computeAlumWireResistance(wireLength * 0.0254, wireGauge));
    }
 
}
