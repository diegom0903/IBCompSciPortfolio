package Project2.ElementaryLogicGates;

public class Xor {
    public boolean out;
    private Not not1;
    private Not not2;
    private And and1;
    private And and2;
    private Or or1;

    public Xor() {
    not1 = new Not();
    not2 = new Not();
    and1 = new And();
    and2 = new And();
    or1 = new Or();
    }

    public void compute(boolean a, boolean b){
        not1.compute(b);
        not2.compute(a);
        and1.compute(a,not1.out);
        and2.compute(not2.out,b);
        or1.compute(and1.out,and2.out);
        out= or1.out;
    }
}
