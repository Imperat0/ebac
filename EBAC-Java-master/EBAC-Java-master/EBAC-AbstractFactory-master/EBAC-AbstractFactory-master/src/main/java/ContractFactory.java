public class ContractFactory extends Factory  {
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Cronos(200, "Cheio", "Prata");
        } else {
            return null;
        }
    }
}
