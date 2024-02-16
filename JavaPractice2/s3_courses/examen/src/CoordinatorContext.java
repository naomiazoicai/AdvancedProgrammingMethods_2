public class CoordinatorContext {
    private CoordonationStrategy strategy;

    public CoordinatorContext(CoordonationStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(CoordonationStrategy strategy) {
        this.strategy = strategy;
    }
    public void coordinateCourse()
    {
        strategy.coordinateCourse();

    }
}
