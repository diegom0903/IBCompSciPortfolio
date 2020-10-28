package Project2.ElementaryLogicGates;

public class Or {
    public boolean out;
    private Not not1;
    private Not not2;
    private Not not3;
    private And and1;

    public Or() {
    not1 = new Not();
    not2 = new Not();
    not3 = new Not();
    and1 = new And();
    }

    public void compute(boolean a, boolean b){
        not1.compute(a);
        not2.compute(b);
        and1.compute(not1.out, not2.out);
        not3.compute(and1.out);
        out=not3.out;
    }

}
