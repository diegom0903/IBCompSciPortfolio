package Project2.ElementaryLogicGates;

public class Dmux {
    public boolean a;
    public boolean b;
    private Not not1;
    private And and1;
    private And and2;

    public Dmux() {
    not1 = new Not();
    and1 = new And();
    and2 = new And();
    }

    public void compute(boolean in, boolean sel){
    not1.compute(sel);
    and1.compute(not1.out,in);
    and2.compute(in,sel);
    a= and1.out;
    b= and2.out;
    }
}
