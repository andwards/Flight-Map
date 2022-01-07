/**
 * @author - Andrew Edwards
 * A class to create the FlightMap object, and reading and processing requests from the request file. 
 */
package flight_map;

import java.util.*;
import java.io.*;

public class DeterminePaths {

	public static void main(String[] args) {
		Scanner inputStream;
		inputStream = null;
		FlightMap flights = new FlightMap();
		LinkedList<City> flightPath;

		try {
			flights.loadFlightMap("cityFile.txt", "flightFile.txt");
		}
		catch (FileNotFoundException e) {

			System.out.println("Error opening file!");
			System.exit(1);

		}

		try {
			inputStream = new Scanner(new File("requestFile.txt"));
		}
		catch (FileNotFoundException e) {
			System.out.println("Error opening file!");
			System.exit(1);
		}
		
		flights.displayFlightMap();
		
		City originCity;
		City destination;
		City temp;
		
		while (inputStream.hasNext()) {
			originCity = new City(inputStream.next());
			destination = new City(inputStream.next());
			
			if (!flights.servesCity(originCity)) {
				System.out.println("The airline does not serve city " + originCity + ".");
			}
			else if (!flights.servesCity(destination)) {
				System.out.println("The airline does not serve city " + destination + ".");
			}
			
			else {
                
                flightPath = flights.getPath(originCity, destination);
                
                if (flightPath == null) {
                        System.out.println("No sequence of flights exist between cities " + originCity + 
                        		" and " + destination + ".");
                }
                else {
                	System.out.println("The following sequence of flights exist between cities " + originCity + 
                			" and " + destination + ":");
                	
                    ListIterator<City> iter = flightPath.listIterator();
                    while (iter.hasNext()) {
                            
                            temp = iter.next();
                            System.out.print(temp);
                            if (iter.hasNext()) {
                            	System.out.print(" -> ");
                            }
                    }
                    System.out.println();
                }
			}
		}
		inputStream.close();
	}

}
