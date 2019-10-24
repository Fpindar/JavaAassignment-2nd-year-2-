/**
* @author Faisal Pindar YourBannerID: 100629476
*/

public class WoodenBeam {
    private double L, height, str, iner, base;
   
    public WoodenBeam(double length, double b, double h) {
        this.L= length;
        this.height = h;
        this.base = b;
       
    }
   
    public double calculateInertia() {
   
        this.iner = (this.base * Math.pow(this.height,3))/12;
        return this.iner;
    }
   
    public double computeMaxload(double str) {
        this.str = str;
        double ans = ( (str*Math.round(calculateInertia()  * 100.0) / 100.0 ) / (centroid() * (this.L *12)));
        return ans;
    }
   
    public double getLength() {
        return this.L;
    }
    public double getHeight() {
        return this.height;
    }
    public double getStrees() {
        return this.str;
    }
   
    public double getInertia() {
        return this.iner;
    }
    public double getBase() {
        return this.base;
    }
    public double centroid() {
        return this.height/2;
    }
 
    public static void main(String[] args) {
        WoodenBeam wb1 = new WoodenBeam(8.0,2.0,4.0);
        WoodenBeam wb2 = new WoodenBeam(8.0,3.0,6.0);
        double maxload1 = wb1.computeMaxload(3000.0);
        double maxload2 = wb2.computeMaxload(3000.0);
       
       
       
       
        System.out.println("For Beam #1: ");
        System.out.println("The Length of the beam is d = " + wb1.getLength() + " feet which is equal to 96 inches");
        System.out.println("The length of the base is b = " + wb1.getBase() + " inches");
        System.out.println("The height of the beam is h = " + wb1.getHeight() + " inches");
        System.out.println("THe stress on the fixed end of the beam is S = " + wb1.getStrees() + " lbs per square inch");
        System.out.printf("The rectangular moment of inertia is: %.2f", wb1.getInertia());
        System.out.println(" in^4");
        System.out.println("The centroid of the beam is: " + wb1.centroid() + " inches" );
        System.out.printf("Using the formula L  = (S*I)/(d*c) = (300*10.67/(96*2), the maximum load that can be placed at the end of the beam is: %.2f", + maxload1 );
 
       
       
        System.out.println(System.lineSeparator() + System.lineSeparator() + "For Beam #2: ");
        System.out.println("The Length of the beam is d = " + wb2.getLength() + " feet which is equal to 96 inches");
        System.out.println("The length of the base is b = " + wb2.getBase() + " inches");
        System.out.println("The height of the beam is h = " + wb2.getHeight() + " inches");
        System.out.println("THe stress on the fixed end of the beam is S = " + wb2.getStrees() + " lbs oer square inch");
        System.out.printf("The rectangular moment of inertia is: %.2f", wb2.getInertia());
        System.out.println(" in^4");
        System.out.println("The centroid of the beam is: " + wb2.centroid() + " inches" );
        System.out.printf("Using the formula L  = (S*I)/(d*c) = (300*10.67/(96*2), the maximum load that can be placed at the end of the beam is: %.2f", + maxload2 );
    }
   
   
   
}
