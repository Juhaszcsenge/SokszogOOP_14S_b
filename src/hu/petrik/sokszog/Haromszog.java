package hu.petrik.sokszog;

public class Haromszog  extends Sokszog{
    private double b;
    private double c;

    @Override
    public void setA(double a) {
        super.setA(a);
        if(!this.isSzerkesztheto()){
            throw new IllegalArgumentException("A háromszög nem szerkeszthető");
        }

    }

    public Haromszog(double a, double b, double c) {
        super(a);
        this.b = b;
        this.c = c;
        if(!this.isSzerkesztheto()){
            throw new IllegalArgumentException("A háromszög nem szerkeszthető");
        }
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getB() {
        return b;
    }


    public double getC() {
        return c;
    }

    public  double getKerulet(){
        return this.getA() + this.getB() + this.getC();
    }

    public double getS(){
        return  getKerulet() / 2;
    }


    private boolean isSzerkesztheto(){
        return this.getA() + this.getB() > this.getC() &&
                this.getA() + this.getC() > this.getB() &&
                this.getA() + this.getC() > this.getA();

    }


    public  double getTerulet(){
        return  Math.sqrt(this.getS() * (this.getS() - this.getA())
        * (this.getS() - this.getB())
        * (this.getS() - this.getC()));
    }

    @Override
    public String toString() {
        return String.format("Háromszög: a = %-10.3f  b = %-10.3f  c = %-10.3f %s",
        this.getA(),this.getB(),this.getC(), super.toString());
    }
    
    public Haromszog(){
        super(Math.random() * 10 + 5);
        this.b = Math.random() * 10 + 5;
        this.c =  veletlenoldalgeneralas();
        while (!this.isSzerkesztheto()){
            super.setA(veletlenoldalgeneralas());
            this.b = veletlenoldalgeneralas();
            this.c = veletlenoldalgeneralas();
        }
    }

    private double  veletlenoldalgeneralas() {
        return Math.random() * 10 + 5;
    }
}
