package Project2.MultiBitVariants;

import Project2.ElementaryLogicGates.Or;

public class Or16 {
    public boolean[] out = new boolean[16];
    private Or or1 = new Or();
    private Or or2 = new Or();
    private Or or3 = new Or();
    private Or or4 = new Or();
    private Or or5 = new Or();
    private Or or6 = new Or();
    private Or or7 = new Or();
    private Or or8 = new Or();
    private Or or9 = new Or();
    private Or or10 = new Or();
    private Or or11 = new Or();
    private Or or12 = new Or();
    private Or or13 = new Or();
    private Or or14 = new Or();
    private Or or15 = new Or();
    private Or or16 = new Or();

    public Or16() {
    }

    public void compute(boolean[] a,boolean[] b){
    or1.compute(a[0],b[0]);
    or2.compute(a[1],b[1]);
    or3.compute(a[2],b[2]);
    or4.compute(a[3],b[3]);
    or5.compute(a[4],b[4]);
    or6.compute(a[5],b[5]);
    or7.compute(a[6],b[6]);
    or8.compute(a[7],b[7]);
    or9.compute(a[8],b[8]);
    or10.compute(a[9],b[9]);
    or11.compute(a[10],b[10]);
    or12.compute(a[11],b[11]);
    or13.compute(a[12],b[12]);
    or14.compute(a[13],b[13]);
    or15.compute(a[14],b[14]);
    or16.compute(a[15],b[15]);
    out[0]=or1.out;
    out[1]=or2.out;
    out[2]=or3.out;
    out[3]=or4.out;
    out[4]=or5.out;
    out[5]=or6.out;
    out[6]=or7.out;
    out[7]=or8.out;
    out[8]=or9.out;
    out[9]=or10.out;
    out[10]=or11.out;
    out[11]=or12.out;
    out[12]=or13.out;
    out[13]=or14.out;
    out[14]=or15.out;
    out[15]=or16.out;
    }
}
