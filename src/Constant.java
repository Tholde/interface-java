public class Constant implements ArithExpr {
    public Constant(double value) {
        this.value = value;
    }

    private final double value;


    @Override
    public double eval() {
        return value;
    }

    @Override
    public String toString(){
        return Double.toString(value);
    }
    @Override
    public String prefix() {
        return Double.toString(value);
    }

    @Override
    public String suffix() {
        return Double.toString(value);
    }
}
