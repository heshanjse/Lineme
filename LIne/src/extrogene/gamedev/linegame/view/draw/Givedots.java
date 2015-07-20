package extrogene.gamedev.linegame.view.draw;

import java.util.HashMap;



public class Givedots {
	private final int first;
    private final int second;
    private final int repnum;

    public Givedots(int first, int second,int repnum) {
        this.first = first;
        this.second = second;
        this.repnum=repnum;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }
    public int getRepnum() {
        return repnum;
    }
    public static Givedots setall(int first, int second,int repnum){
    	Givedots gt = new Givedots(first, second, repnum);
    	return gt;
    }

}
