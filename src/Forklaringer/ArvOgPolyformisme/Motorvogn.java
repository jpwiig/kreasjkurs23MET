package Forklaringer.ArvOgPolyformisme;

public class Motorvogn {
   private String farge;
  private int år;

    public Motorvogn(String farge, int år) {
        this.farge = farge;
        this.år = år;
    }

    public void setFarge(String farge) {
        this.farge = farge;
    }

    public void setÅr(int år) {
        this.år = år;
    }

    public int getÅr() {
        return år;
    }

    public String getFarge() {
        return farge;
    }
}
