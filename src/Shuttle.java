import java.util.ArrayList;

public class Shuttle extends Vehicle {

        // circular route.
        private ArrayList<String> route;
        // The destination number in route that the shuttle is
        // currently headed for.
        private int destinationNumber;

        /**
         * Constructor for objects of class Shuttle
         * @param id This shuttle's unique id.
         * @param route The route taken by this shuttle.
         *              The first entry is the starting location.
         */
    public Shuttle(String id, ArrayList<String> route)
        {
            super(id);
            setRoute(route);
        }

        /**
         * Indicate that this shuttle has arrived at its next destination.
         */
        public void signalArrival()
        {
            super.signalArrival();
            setNextDestination();
        }

}
