public class Main {

    public static void main(String[] args) {
        Custom cliente = new Custom("A", false);
        Factory factory = getFactory(cliente);
        Car car = factory.create(cliente.getGradeRequest());
        car.startEngine();
    }

    private static Factory getFactory(Custom cliente) {
        if (cliente.hasCompanyContract()) {
            return new ContractFactory();
        } else {
            return new SemContract();
        }
    }
}
