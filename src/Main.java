public class Main {
    public static void main(String[] args) {
    cocheMejorado cm = new cocheMejorado("Opel", "Astra", 2011);
        System.out.println(cm);
        System.out.println(cm.getCombustibleActual());
        cm.repostar(200);
        cm.setConsumo(10);
        cm.conducir(6);
        System.out.println(cm.getCombustibleActual());
        System.out.println(cm.getKilometraje());
    }
}