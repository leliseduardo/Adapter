package Adapter;

public class SizeAdapter extends SizeBr {

    private ISize sizeUsa;

    public SizeAdapter(ISize sizeUsa) {
        this.sizeUsa = sizeUsa;
    }

    public double retrieveSize() {
        if (this.getSizeBr() == 36) {
            sizeUsa.setSize(7);
        } else if (this.getSizeBr() == 37) {
            sizeUsa.setSize(7.5);
        } else if (this.getSizeBr() == 38) {
            sizeUsa.setSize(8.5);
        } else if (this.getSizeBr() == 39) {
            sizeUsa.setSize(9);
        }
        return sizeUsa.getSize();
    }

    public void saveSize() {
        if (sizeUsa.getSize() == 7) {
            this.setSizeBr(36);
        } else if (sizeUsa.getSize() == 7.5) {
            this.setSizeBr(37);
        } else if (sizeUsa.getSize() == 8.5) {
            this.setSizeBr(38);
        } else if (sizeUsa.getSize() == 9) {
            this.setSizeBr(39);
        }
    }
}
