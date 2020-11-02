package Project2.MultiBitVariants;

import Project2.ElementaryLogicGates.Not;

public class Not16 {
    public boolean[] out = new boolean[16];
    private Not not1 = new Not();
    private Not not2 = new Not();
    private Not not3 = new Not();
    private Not not4 = new Not();
    private Not not5 = new Not();
    private Not not6 = new Not();
    private Not not7 = new Not();
    private Not not8 = new Not();
    private Not not9 = new Not();
    private Not not10 = new Not();
    private Not not11 = new Not();
    private Not not12 = new Not();
    private Not not13 = new Not();
    private Not not14 = new Not();
    private Not not15 = new Not();
    private Not not16 = new Not();

    public Not16() {
    }

    public void compute(boolean[] in){
    not1.compute(in[0]);
    not2.compute(in[1]);
    not3.compute(in[2]);
    not4.compute(in[3]);
    not5.compute(in[4]);
    not6.compute(in[5]);
    not7.compute(in[6]);
    not8.compute(in[7]);
    not9.compute(in[8]);
    not10.compute(in[9]);
    not11.compute(in[10]);
    not12.compute(in[11]);
    not13.compute(in[12]);
    not14.compute(in[13]);
    not15.compute(in[14]);
    not16.compute(in[15]);
    out[0]= not1.out;
    out[1]= not2.out;
    out[2]= not3.out;
    out[3]= not4.out;
    out[4]= not5.out;
    out[5]= not6.out;
    out[6]= not7.out;
    out[7]= not8.out;
    out[8]= not9.out;
    out[9]= not10.out;
    out[10]= not11.out;
    out[11]= not12.out;
    out[12]= not13.out;
    out[13]= not14.out;
    out[14]= not15.out;
    out[15]= not16.out;
    }
}
