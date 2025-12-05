public class UnifiedObserverFactory implements ObserverFactory{
    @Override
    public Observer createObserver(String type, Subject sensor) {
        switch (type.toLowerCase()) {
            case "heartrate":
                return new CurrentHeartRateObserver(sensor);
            case "airflow":
                return new CurrentAirFlowObserver(sensor);
            case "temp":
                return new CurrentTempObserver(sensor);
            default:
                throw  new IllegalArgumentException("Invalid type");

        }

    }
}
