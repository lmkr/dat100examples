package no.hib.dat100;

public class KlientVParam {

	public static void main(String[] args) {
	    VParam.m1(1);
	    VParam.m1(2, "a");
	    VParam.m1(3, "a", "b");

	    int[] a = {7,8,9};
	    VParam.m2(10, 11, 13, 15);
	    VParam.m2(a);

	}

}
