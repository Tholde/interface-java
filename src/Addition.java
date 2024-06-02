public class Addition implements ArithExpr {
    public Addition(ArithExpr left, ArithExpr right) {
        this.left = left;
        this.right = right;
    }

    public ArithExpr left;
    public ArithExpr right;
    @Override
    public double eval() {
        return left.eval() + right.eval();
    }

    @Override
    public String prefix() {
        return left.prefix();
    }

    @Override
    public String suffix() {
        return right.suffix();
    }
    @Override
    public String toString(){
        return "("+left.toString() + " + " + right.toString() + ")";
    }
}
