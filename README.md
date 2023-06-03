# Flight-Map

This program is a sophisticated flight search tool that allows users to find flight paths between cities served by an airline. It offers a range of features to ensure efficient and accurate search results.

## Features

1. **Data Loading**: The program provides a seamless process for loading city and flight data from external files. It supports loading city names from `cityFile.txt` and flight adjacencies from `flightFile.txt`. These files are formatted with clear instructions to ensure accurate data retrieval.

2. **Flight Map Visualization**: The program offers a visual representation of the flight map, displaying all cities served by the airline along with their adjacent cities. This feature allows users to gain a comprehensive overview of the available flight connections.

3. **City Information**: Users can access detailed information about individual cities. The program provides the ability to display all cities served by the airline and retrieve a list of adjacent cities for any specific city. This feature assists users in making informed decisions about their travel plans.

4. **Path Search**: The program employs an advanced algorithm to determine the existence of flight paths between two cities. It utilizes a stack-based approach to find the most efficient route from the origin city to the destination city. If a valid flight path exists, the program returns a LinkedList object containing a sequence of cities representing the flight route.

5. **City Serving Validation**: The program offers a city validation feature to determine if the airline serves a specific city. This ensures that users receive accurate information about the availability of flights to and from their desired destinations.

6. **Visited City Tracking**: To optimize the flight search process, the program keeps track of visited cities. This prevents redundant searches and improves the overall search efficiency.

## Contributors

- [Andrew Edwards](https://www.github.com/andwards)
