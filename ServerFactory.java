public class ServerFactory extends Factory{
    private String ram,cpu;

    ServerFactory(String ram, String cpu){
        this.ram=ram;
        this.cpu=cpu;
    }
    @Override
    Computer createComputer() {
        return new Server(this.ram,this.cpu);
    }
}

