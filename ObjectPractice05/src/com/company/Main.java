package com.company;

public class Main {

    public static void main(String[] args) {
	    Peason morita = new Peason();
	    morita.myName = "森田";
	    morita.syuShin = "奈良県";

	    Peason kimura = new Peason();
	    kimura.myName = "木村";
	    kimura.syuShin ="埼玉県";

	    Peason takayama = new Peason();
	    takayama.myName = "高山";
	    takayama.syuShin = "東京都";

	    Peason mogi = new Peason();
	    mogi.myName = "茂木";
	    mogi.syuShin = "沖縄県";

	    System.out.print(morita.GetName());
	    System.out.print("   ");
		System.out.println(morita.GetsyuShin());
		System.out.println("");


		System.out.print(kimura.GetName());
		System.out.print("   ");
        System.out.println(kimura.GetsyuShin());
		System.out.println("");

        System.out.print(takayama.GetName());
		System.out.print("   ");
        System.out.println(takayama.GetsyuShin());
		System.out.println("");

        System.out.print(mogi.GetName());
		System.out.print("   ");
        System.out.println(mogi.GetsyuShin());





    }
}
