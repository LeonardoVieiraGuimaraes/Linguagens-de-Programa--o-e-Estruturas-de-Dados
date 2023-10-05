public class TiposEstruturas {
    // Campos da classe para representar as coordenadas do ponto
    private int x;
    private int y;

    // Construtor para inicializar as coordenadas
    public TiposEstruturas(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Métodos para acessar e modificar as coordenadas
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static void main(String[] args) {
        // Criação de uma instância da classe Ponto
        TiposEstruturas p1 = new TiposEstruturas(3, 4);

        // Acessando as coordenadas usando métodos
        System.out.println("Coordenadas do ponto: (" + p1.getX() + ", " + p1.getY() + ")");
    }
}
