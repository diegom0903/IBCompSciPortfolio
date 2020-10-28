package Project2.ElementaryLogicGates;

public class And {
    public boolean out;
    public Nand nand1;
    public Not not1;

    public And() {
        nand1 = new Nand();
        not1 = new Not();
    }

    public void compute(boolean a, boolean b){
        nand1.compute(a,b);
        not1.compute(nand1.out);
        out=not1.out;
    }
}
