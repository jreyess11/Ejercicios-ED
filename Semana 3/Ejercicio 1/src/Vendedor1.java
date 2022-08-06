public class Vendedor1 {
    long documento;
    int tipo;
    double ventas;

    public Vendedor1 (long doc, int tipo, double ven){
        this.documento=doc;
        this.tipo=tipo;
        this.ventas=ven;
    }

    public double calcCom (){
        double com;
        if (tipo==1){
            com = ventas * 0.25;
        } else {
            com = ventas * 0.20;
        }
        return com;
    }
}