public interface Subject {

    /**
     * Registers an observer
     * @param o the observer to be registered
     */
    public void registerObserver(Observer o);

    /**
     * Removes a registered observer
     * @param o the observer to be removed
     */
    public void removeObserver(Observer o);

    /**
     * notifies registered observers of an update
     */
    public void notifyObservers();
}
