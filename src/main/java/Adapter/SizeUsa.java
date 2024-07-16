package Adapter;

public class SizeUsa implements ISize {
    private double size;

    @Override
    public double getSize() {
        return this.size;
    }

    @Override
    public void setSize(double size) {
        this.size = size;
    }
}
