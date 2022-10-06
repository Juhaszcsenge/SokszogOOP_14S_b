package hu.petrik.sokszog;

public class Teglalap extends Sokszog {
    private double b;

    public Teglalap(double a, double b) {
        super(a);
        this.b = b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public  double getKerulet(){
        return 2 * (super.getA() + this.getB());
    }


    public  double getTerulet(){
        return this.getA() * this.getB();
    }

    @Override
    public String toString() {
        return String.format("Téglalap: a = %-10.3f b = %-10.3f %s",
                this.getA(),this.getB(),super.toString());
    }
}
