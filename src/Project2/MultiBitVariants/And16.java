package Project2.MultiBitVariants;

import Project2.ElementaryLogicGates.And;

public class And16 {
    public boolean[] out = new boolean[16];
    private And and1 =  new And();
    private And and2 =  new And();
    private And and3 =  new And();
    private And and4 =  new And();
    private And and5 =  new And();
    private And and6 =  new And();
    private And and7 =  new And();
    private And and8 =  new And();
    private And and9 =  new And();
    private And and10 =  new And();
    private And and11 =  new And();
    private And and12 =  new And();
    private And and13 =  new And();
    private And and14 =  new And();
    private And and15 =  new And();
    private And and16 =  new And();

    public And16() {
    }

    public void compute(boolean[] a,boolean[] b){
        and1.compute(a[0],b[0]);
        and2.compute(a[1],b[1]);
        and3.compute(a[2],b[2]);
        and4.compute(a[3],b[3]);
        and5.compute(a[4],b[4]);
        and6.compute(a[5],b[5]);
        and7.compute(a[6],b[6]);
        and8.compute(a[7],b[7]);
        and9.compute(a[8],b[8]);
        and10.compute(a[9],b[9]);
        and11.compute(a[10],b[10]);
        and12.compute(a[11],b[11]);
        and13.compute(a[12],b[12]);
        and14.compute(a[13],b[13]);
        and15.compute(a[14],b[14]);
        and16.compute(a[15],b[15]);
        out[0]=and1.out;
        out[1]=and2.out;
        out[2]=and3.out;
        out[3]=and4.out;
        out[4]=and5.out;
        out[5]=and6.out;
        out[6]=and7.out;
        out[7]=and8.out;
        out[8]=and9.out;
        out[9]=and10.out;
        out[10]=and11.out;
        out[11]=and12.out;
        out[12]=and13.out;
        out[13]=and14.out;
        out[14]=and15.out;
        out[15]=and16.out;
    }
}
