package Adapter;

public class Footwear {
    private ISize size;
    private SizeAdapter adapter;

    public Footwear() {
        size = new SizeUsa();
        adapter = new SizeAdapter(size);
    }

    public void setSize(double size) {
        this.size.setSize(size);
        adapter.saveSize();
    }

    public double getSize() {
        return adapter.retrieveSize();
    }

    public double getSizeBr() {
        return adapter.getSizeBr();
    }
}
