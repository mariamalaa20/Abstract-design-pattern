public class Main {
    public static void main(String[] args) {
        Factory fabrika1= new ServerFactory("4GB","13. Nesil");
        Computer sunucu = fabrika1.createComputer();
        System.out.println(sunucu.getRam()+" "+sunucu.getCpu());
    }
}
