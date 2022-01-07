/**
 * @author - Andrew Edwards
 * An interface describing all methods that are to be included in a Flight Map. 
 */
package flight_map;

import java.io.FileNotFoundException;
import java.util.LinkedList;


public interface FlightMapInterface {

	/**
	 * Retrieves information about the cities and adjacencies from the two
	 * files provided and stores the information in the FlightMap object.
	 * @param cityFileName The name of a file containing a list of city names; 
	 *        one city name per line.
	 * @param flightFileName The name of a file showing city adjacencies.  
	 *        There will be two city names listed per line, separated by a tab
	 *        character; the first city on the line is adjacent to the 
	 *        second city on the same line.
	 * @throws FileNotFoundException if either the city file or the flight
	 *         file are not able to be opened.
	 */
	public void loadFlightMap(String cityFileName, String flightFileName)
		throws FileNotFoundException;


	/**
	 * Inserts information into the flight map to record the fact that there
	 * is a direct flight between aCity and adjCity. Both aCity and adjCity
	 * are assumed to be valid cities that are served by the airline.
	 * @param aCity The origin city.
	 * @param adjCity The destination city.
	 */
	public void insertAdjacent(City aCity, City adjCity);


	/**
	 * Displays to the screen, a list of all cities served by the airline
	 * along with the names of cities to which each is adjacent.
	 */
	public void displayFlightMap();


	/**
	 * Displays to the screen, the names of all cities served by the airline.
	 */
	public void displayAllCities();


	/**
	 * Displays to the screen, the names of all cities which are are adjacent
	 * to aCity; aCity is assumed to be a valid city served by the airline.
	 * @param aCity The city for which the adjacency list is desired.
	 */
	public void displayAdjacentCities(City aCity);


	/**
	 * Records information to note that aCity has been visited in the path 
	 * so that aCity won't be returned again; aCity is assumed to be 
	 * a valid city served by the airline.
	 * @param aCity The city to be marked.
	 */
	public void markVisited(City aCity);


	/**
	 * Removes the visited marks on all cities served by the airline.
	 */
	public void unVisitAll();


	/**
	 * Determines whether or not aCity has been visited
	 * @param aCity The city for which you wish to determine visited status.
	 * @return True if aCity has been visited, and false otherwise.
	 */
	public boolean isVisited(City aCity);


	/**
	 * Gets the next unvisited city, if any, to which aCity is adjacent.
	 * @param aCity The city for which you wish to get the next adjacency.
	 * @return The next unvisited city to which you can directly travel
	 *         from aCity, or null there are no unvisited cities to which
	 *         you can travel from aCity.
	 */
	public City getNextCity(City aCity);


	/**
	 * Determines if the airline serves aCity
	 * @param aCity The city to check
	 * @return True if the airline has flights leaving or arriving at
	 *         aCity and false otherwise
	 */
	public boolean servesCity(City aCity);


	/**
	 * Determines if there is a sequence of flights which start at originCity,
	 * and take you to destinationCity; Both originCity and destinationCity are
	 * assumed to be valid cities served by the airline.
	 * @param originCity The city from which the search should begin
	 * @param destinationCity The final city at which you wish to arrive
	 * @return A LinkedList object containing a list of cities starting at the
	 *         originCity and ending at destinationCity, if there is a sequence 
	 *         of flights from originCity to destinationCity. The
	 *         originCity will be found in position 0 of the list.
	 *         If no sequence of flights exist, then null will be returned.
	 */
	public LinkedList<City> getPath(City originCity, City destinationCity);

}
