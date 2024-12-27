public class SemContract extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Palio(100, "Cheio", "Preto");
        } else {
            return null;
        }
    }
}
