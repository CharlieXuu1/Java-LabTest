import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import java.util.logging.Logger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Lab10GraderTest {

    private static double score = 100;
    private final double EPSILON = 1e-3;

    private double problemPoints = 100 / 100;

    List<Airport> airportsList;
    List<Airport> airportsList1;
    List<Airport> airportsList2;
    List<Airport> airportsList3;
    List<Airport> airportsList4;
    List<Airport> airportsList5;
    List<Airport> airportsList6;
    List<Airport> airportsList7;
    List<Airport> airportsList8;
    List<Airport> airportsList9;
    List<Airport> airportsList10;

    //This method will be executed before all the other methods.
    @BeforeEach
    void before() {
        String path = "res/"; //<- Assign the path of the .dat files to this variable. Do not include the file name,
        // it will be added below.
        airportsList = AirportsReader.readAirports(path + "airports.dat");
        airportsList1 = AirportsReader.readAirports(path + "airports1.dat");
        airportsList2 = AirportsReader.readAirports(path + "airports2.dat");
        airportsList3 = AirportsReader.readAirports(path + "airports3.dat");
        airportsList4 = AirportsReader.readAirports(path + "airports4.dat");
        airportsList5 = AirportsReader.readAirports(path + "airports5.dat");
        airportsList6 = AirportsReader.readAirports(path + "airports6.dat");
        airportsList7 = AirportsReader.readAirports(path + "airports7.dat");
        airportsList8 = AirportsReader.readAirports(path + "airports8.dat");
        airportsList9 = AirportsReader.readAirports(path + "airports9.dat");
        airportsList10 = AirportsReader.readAirports(path + "airports10.dat");
    }


    @Test
    void problem1_1() {
        try {
            assertTrue(AirportsStats.problem1_getAirportsInCountry(airportsList3.stream(), "Kugaaruk").isEmpty());
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem1_TestCase_1\n" + e);
            score -= problemPoints;
        }
    }

    @Test
    void problem1_2() {
        try {
            List<Airport> result = AirportsStats.problem1_getAirportsInCountry(airportsList8.stream(), "United States");
            assertTrue(result.size() == 7 &&
                    result.get(0).getAirportID() == 3747 &&
                    result.get(1).getAirportID() == 3830 &&
                    result.get(2).getAirportID() == 3699 &&
                    result.get(3).getAirportID() == 7767 &&
                    result.get(4).getAirportID() == 3797 &&
                    result.get(5).getAirportID() == 3697 &&
                    result.get(6).getAirportID() == 8123);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem1_TestCase_2\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem1_3() {
        try {
            List<Airport> result = AirportsStats.problem1_getAirportsInCountry(airportsList1.stream(), "United Kingdom");
            assertTrue(result.size() == 2 &&
                    result.get(0).getAirportID() == 503 &&
                    result.get(1).getAirportID() == 507);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem1_TestCase_3\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem1_4() {
        try {
            List<Airport> result = AirportsStats.problem1_getAirportsInCountry(airportsList9.stream(), "Greenland");
            assertTrue(result.size() == 4 &&
                    result.get(0).getAirportID() == 8 &&
                    result.get(1).getAirportID() == 9 &&
                    result.get(2).getAirportID() == 10 &&
                    result.get(3).getAirportID() == 7);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem1_TestCase_4\n" + e);
            score -= problemPoints;
        }
    }

    @Test
    void problem1_5() {
        try {
            List<Airport> result = AirportsStats.problem1_getAirportsInCountry(airportsList9.stream(), "Papua New Guinea");
            assertTrue(result.size() == 6 &&
                    result.get(0).getAirportID() == 1 &&
                    result.get(1).getAirportID() == 2 &&
                    result.get(2).getAirportID() == 3 &&
                    result.get(3).getAirportID() == 4 &&
                    result.get(4).getAirportID() == 5 &&
                    result.get(5).getAirportID() == 6);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem1_TestCase_5\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem1_6() {
        try {
            List<Airport> result = AirportsStats.problem1_getAirportsInCountry(airportsList2.stream(), "United Kingdom");
            assertTrue(result.isEmpty());
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem1_TestCase_6\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem1_7() {
        try {
            List<Airport> result = AirportsStats.problem1_getAirportsInCountry(airportsList4.stream(), "Iceland");
            assertTrue(result.size() == 1 &&
                    result.get(0).getAirportID() == 4321);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem1_TestCase_7\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem1_8() {
        try {
            List<Airport> result = AirportsStats.problem1_getAirportsInCountry(airportsList6.stream(), "Canada");
            assertTrue(result.size() == 0);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem1_TestCase_8\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem1_9() {
        try {
            List<Airport> result = AirportsStats.problem1_getAirportsInCountry(airportsList3.stream(), "Nigeria");
            assertTrue(result.size() == 0);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem1_TestCase_9\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem1_10() {
        try {
            List<Airport> result = AirportsStats.problem1_getAirportsInCountry(airportsList8.stream(), "Luxembourg");
            assertTrue(result.size() == 1 &&
                    result.get(0).getAirportID() == 629);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem1_TestCase_10\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem2_1() {
        try {
            assertEquals("La Guardia Airport, Madang Airport",
                    AirportsStats.problem2_getAllAirportsInAltitudeRange(airportsList1.stream(), 20.0, 66.6));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem2_TestCase_1\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem2_2() {
        try {
            assertEquals("Godthaab / Nuuk Airport, Indianola Municipal Airport, Kangerlussuaq Airport, Nadzab Airport, One Police Plaza Heliport, Port Moresby Jacksons International Airport, Thule Air Base, xNarsarsuaq Airport",
                    AirportsStats.problem2_getAllAirportsInAltitudeRange(airportsList1.stream(), 100.0, 500.0));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem2_TestCase_2\n" + e);
            score -= problemPoints;
        }

    }


    @Test
    void problem2_3() {
        try {
            assertEquals("", AirportsStats.problem2_getAllAirportsInAltitudeRange(airportsList3.stream(), 0.0, 1000.0));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem2_TestCase_3\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem2_4() {
        try {
            assertEquals("Madang Airport", AirportsStats.problem2_getAllAirportsInAltitudeRange(airportsList5.stream(), -500.0, 20.0));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem2_TestCase_4\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem2_5() {
        try {
            assertEquals("", AirportsStats.problem2_getAllAirportsInAltitudeRange(airportsList4.stream(), 50.0, 20.0));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem2_TestCase_5\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem2_6() {
        try {
            assertEquals("Bakki Airport, Brisbane Archerfield Airport, Chicago Midway International Airport, Chicago O'Hare International Airport, Godthaab / Nuuk Airport, Goroka Airport, Kangerlussuaq Airport, Mount Hagen Kagamuga Airport, Nadzab Airport, Port Moresby Jacksons International Airport, Thule Air Base, xNarsarsuaq Airport",
                    AirportsStats.problem2_getAllAirportsInAltitudeRange(airportsList4.stream(), 21.0, 10000.0));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem2_TestCase_6\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem2_7() {
        try {
            assertEquals("Beijing Xijiao Airport",
                    AirportsStats.problem2_getAllAirportsInAltitudeRange(airportsList6.stream(), 0.0, 20.0));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem2_TestCase_7\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem2_8() {
        try {
            assertEquals("xNarsarsuaq Airport",
                    AirportsStats.problem2_getAllAirportsInAltitudeRange(airportsList10.stream(), 100.0, 115.0));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem2_TestCase_8\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem2_9() {
        try {
            assertEquals("John F Kennedy International Airport, London City Airport, Madang Airport, Seychelles International Airport, Wake Island Airfield, Wewak International Airport",
                    AirportsStats.problem2_getAllAirportsInAltitudeRange(airportsList9.stream(), 10.0, 20.0));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem2_TestCase_9\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem2_10() {
        try {
            assertEquals("John F Kennedy International Airport",
                    AirportsStats.problem2_getAllAirportsInAltitudeRange(airportsList2.stream(), 0.0, 20.0));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem2_TestCase_10\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem3_1() {
        try {
            List<String> result = AirportsStats.problem3_getTopNCitiesWithMostAirports(airportsList.stream(), 3);
            assertTrue(result.size() == 3 &&
                    result.get(0).equals("London") && result.get(1).equals("Columbus") && result.get(2).equals("Georgetown"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem3_TestCase_1\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem3_2() {
        try {
            List<String> result = AirportsStats.problem3_getTopNCitiesWithMostAirports(airportsList1.stream(), 10);
            assertEquals("[New York, Chicago, London, Madang, Goroka, Narssarssuaq, Thule, Wewak, Nadzab, Sondrestrom]", result.toString());
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem3_TestCase_2\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem3_3() {
        try {
            List<String> result = AirportsStats.problem3_getTopNCitiesWithMostAirports(airportsList2.stream(), 1);
            assertTrue(result.size() == 1 && result.get(0).equals("New York"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem3_TestCase_3\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem3_4() {
        try {
            List<String> result = AirportsStats.problem3_getTopNCitiesWithMostAirports(airportsList2.stream(), 0);
            assertTrue(result.isEmpty());
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem3_TestCase_4\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem3_5() {
        try {
            List<String> result = AirportsStats.problem3_getTopNCitiesWithMostAirports(airportsList3.stream(), 3);
            assertTrue(result.size() == 0);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem3_TestCase_5\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem3_6() {
        try {
            List<String> result = AirportsStats.problem3_getTopNCitiesWithMostAirports(airportsList4.stream(), 1);
            assertTrue(result.size() == 1 && result.get(0).equals("Chicago"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem3_TestCase_6\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem3_7() {
        try {
            List<String> result = AirportsStats.problem3_getTopNCitiesWithMostAirports(airportsList4.stream(), 3);
            assertTrue(result.size() == 3 &&
                    "[Chicago, Madang, Goroka]".equals(result.toString()));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem3_TestCase_7\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem3_8() {
        try {
            List<String> result = AirportsStats.problem3_getTopNCitiesWithMostAirports(airportsList5.stream(), 5);
            assertTrue(result.size() == 1 && result.get(0).equals("Madang"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem3_TestCase_8\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem3_9() {
        try {
            List<String> result = AirportsStats.problem3_getTopNCitiesWithMostAirports(airportsList7.stream(), 7);
            assertTrue(result.size() == 2 &&
                    result.get(0).equals("Burley") && result.get(1).equals("Embu"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem3_TestCase_9\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem3_10() {
        try {
            List<String> result = AirportsStats.problem3_getTopNCitiesWithMostAirports(airportsList10.stream(), 6);
            assertTrue(result.size() == 6 &&
                    "[New York, Chicago, London, Madang, Goroka, Narssarssuaq]".equals(result.toString()));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem3_TestCase_10\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem4_1() {
        try {
            assertEquals(4, AirportsStats.problem4_countCities(airportsList6.stream()));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem4_TestCase_1\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem4_2() {
        try {
            assertEquals(2, AirportsStats.problem4_countCities(airportsList7.stream()));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem4_TestCase_2\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem4_3() {
        try {
            assertEquals(17, AirportsStats.problem4_countCities(airportsList8.stream()));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem4_TestCase_3\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem4_4() {
        try {
            assertEquals(21, AirportsStats.problem4_countCities(airportsList9.stream()));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem4_TestCase_4\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem4_5() {
        try {
            assertEquals(13, AirportsStats.problem4_countCities(airportsList10.stream()));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem4_TestCase_5\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem4_6() {
        try {
            assertEquals(0, AirportsStats.problem4_countCities(new ArrayList<Airport>().stream()));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem4_TestCase_6\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem4_7() {
        try {
            List<Airport> mergeList = new ArrayList<>();
            mergeList.addAll(airportsList);
            mergeList.addAll(airportsList1);
            assertEquals(6822, AirportsStats.problem4_countCities(mergeList.stream()));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem4_TestCase_7\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem4_8() {
        try {
            List<Airport> mergeList = new ArrayList<>();
            mergeList.addAll(airportsList7);
            mergeList.addAll(airportsList8);
            assertEquals(19, AirportsStats.problem4_countCities(mergeList.stream()));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem4_TestCase_8\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem4_9() {
        try {
            List<Airport> mergeList = new ArrayList<>();
            mergeList.addAll(airportsList5);
            mergeList.addAll(airportsList9);
            assertEquals(21, AirportsStats.problem4_countCities(mergeList.stream()));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem4_TestCase_9\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem4_10() {
        try {
            List<Airport> mergeList = new ArrayList<>();
            mergeList.addAll(airportsList3);
            mergeList.addAll(airportsList4);
            assertEquals(13, AirportsStats.problem4_countCities(mergeList.stream()));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem4_TestCase_10\n" + e);
            score -= problemPoints;
        }
    }



    @Test
    void problem5_1() {
        try {
            Optional<Airport> airport = AirportsStats.problem5_getFirstAirportContainingString(airportsList.stream(), "Salah");
            assertTrue(airport.isPresent());
            if (airport.isPresent()) {
                Airport result = airport.get();
                assertEquals(239, result.getAirportID());
            }
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem5_TestCase_1\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem5_2() {
        try {
            Optional<Airport> airport = AirportsStats.problem5_getFirstAirportContainingString(airportsList1.stream(), "International");
            assertTrue(airport.isPresent());
            if (airport.isPresent()) {
                Airport result = airport.get();
                assertEquals(3747, result.getAirportID());
            }
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem5_TestCase_2\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem5_3() {
        try {
            Optional<Airport> airport = AirportsStats.problem5_getFirstAirportContainingString(airportsList2.stream(), "ago O'H");
            assertTrue(airport.isPresent());
            if (airport.isPresent()) {
                Airport result = airport.get();
                assertEquals(3830, result.getAirportID());
            }
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem5_TestCase_3\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem5_4() {
        try {
            Optional<Airport> airport = AirportsStats.problem5_getFirstAirportContainingString(airportsList3.stream(), "Salah");
            assertFalse(airport.isPresent());
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem5_TestCase_4\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem5_5() {
        try {
            Optional<Airport> airport = AirportsStats.problem5_getFirstAirportContainingString(airportsList4.stream(), " Archer");
            assertTrue(airport.isPresent());
            if (airport.isPresent()) {
                Airport result = airport.get();
                assertEquals(3317, result.getAirportID());
            }
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem5_TestCase_5\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem5_6() {
        try {
            Optional<Airport> airport = AirportsStats.problem5_getFirstAirportContainingString(airportsList5.stream(), "ang ");
            assertTrue(airport.isPresent());
            if (airport.isPresent()) {
                Airport result = airport.get();
                assertEquals(2, result.getAirportID());
            }
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem5_TestCase_6\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem5_7() {
        try {
            Optional<Airport> airport = AirportsStats.problem5_getFirstAirportContainingString(airportsList6.stream(), "beijing");
            assertTrue(airport.isPresent());
            if (airport.isPresent()) {
                Airport result = airport.get();
                assertEquals(13726, result.getAirportID());
            }
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem5_TestCase_7\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem5_8() {
        try {
            Optional<Airport> airport = AirportsStats.problem5_getFirstAirportContainingString(airportsList7.stream(), "unicipal");
            assertTrue(airport.isPresent());
            if (airport.isPresent()) {
                Airport result = airport.get();
                assertEquals(11823, result.getAirportID());
            }
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem5_TestCase_8\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem5_9() {
        try {
            Optional<Airport> airport = AirportsStats.problem5_getFirstAirportContainingString(airportsList8.stream(), "n F K");
            assertTrue(airport.isPresent());
            if (airport.isPresent()) {
                Airport result = airport.get();
                assertEquals(3797, result.getAirportID());
            }
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem5_TestCase_9\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem5_10() {
        try {
            Optional<Airport> airport = AirportsStats.problem5_getFirstAirportContainingString(airportsList10.stream(), "Airport");
            assertTrue(airport.isPresent());
            if (airport.isPresent()) {
                Airport result = airport.get();
                assertEquals(3699, result.getAirportID());
            }

            airport = AirportsStats.problem5_getFirstAirportContainingString(airportsList10.stream(), "airport");
            assertTrue(airport.isPresent());
            if (airport.isPresent()) {
                Airport result = airport.get();
                assertEquals(3699, result.getAirportID());
            }
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem5_TestCase_10\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem6_1() {
        try {
            List<String> result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList2.stream(), new Coordinates(-9.443380355834961, 147.22000122070312), 1);
            assertTrue(result.size() == 1 && result.get(0).equals("Dupage Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList2.stream(), new Coordinates(33.6405, -117.8443), 1);
            assertTrue(result.size() == 1 && result.get(0).equals("Indianola Municipal Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList2.stream(), new Coordinates(33.6405, -117.8443), 2);
            assertTrue(result.size() == 2 && result.toString().equals("[Indianola Municipal Airport, Dupage Airport]"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList2.stream(), new Coordinates(33.6405, -117.8443), 3);
            assertTrue(result.size() == 3 && result.get(2).equals("Chicago O'Hare International Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList2.stream(), new Coordinates(33.6405, -117.8443), 4);
            assertTrue(result.size() == 4 && result.get(3).equals("Chicago Midway International Airport"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem6_TestCase_1\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem6_2() {
        try {
            List<String> result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList3.stream(), new Coordinates(-9.443380355834961, 147.22000122070312), 1);
            assertTrue(result.size() == 0);

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList3.stream(), new Coordinates(33.6405, -117.8443), 4);
            assertTrue(result.isEmpty());
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem6_TestCase_2\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem6_3() {
        try {
            List<String> result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList4.stream(), new Coordinates(-9.443380355834961, 147.22000122070312), 1);
            assertTrue(result.size() == 1 && result.get(0).equals("Port Moresby Jacksons International Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList4.stream(), new Coordinates(-9.443380355834961, 147.22000122070312), 2);
            assertTrue(result.size() == 2 && result.get(1).equals("Nadzab Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList4.stream(), new Coordinates(-9.443380355834961, 147.22000122070312), 3);
            assertTrue(result.size() == 3 && result.get(2).equals("Goroka Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList4.stream(), new Coordinates(-9.443380355834961, 147.22000122070312), 4);
            assertTrue(result.size() == 4 && result.get(3).equals("Madang Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList4.stream(), new Coordinates(33.6405, -117.8443), 1);
            assertTrue(result.size() == 1 && result.get(0).equals("Chicago O'Hare International Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList4.stream(), new Coordinates(33.6405, -117.8443), 2);
            assertTrue(result.size() == 2 && result.get(1).equals("Chicago Midway International Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList4.stream(), new Coordinates(33.6405, -117.8443), 3);
            assertTrue(result.size() == 3 && result.get(2).equals("Thule Air Base"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList4.stream(), new Coordinates(33.6405, -117.8443), 4);
            assertTrue(result.size() == 4 && result.get(3).equals("Godthaab / Nuuk Airport"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem6_TestCase_3\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem6_4() {
        try {
            List<String> result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList5.stream(), new Coordinates(-9.443380355834961, 147.22000122070312), 1);
            assertTrue(result.size() == 1 && result.get(0).equals("Madang Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList5.stream(), new Coordinates(-9.443380355834961, 147.22000122070312), 2);
            assertTrue(result.size() == 1);

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList5.stream(), new Coordinates(33.6405, -117.8443), 1);
            assertTrue(result.size() == 1 && result.get(0).equals("Madang Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList5.stream(), new Coordinates(33.6405, -117.8443), 2);
            assertTrue(result.size() == 1);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem6_TestCase_4\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem6_5() {
        try {
            List<String> result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList6.stream(), new Coordinates(-9.443380355834961, 147.22000122070312), 1);
            assertTrue(result.size() == 1 && result.get(0).equals("Beijing Xijiao Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList6.stream(), new Coordinates(-9.443380355834961, 147.22000122070312), 2);
            assertTrue(result.size() == 2 && result.get(1).equals("Kannur International Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList6.stream(), new Coordinates(-9.443380355834961, 147.22000122070312), 3);
            assertTrue(result.size() == 3 && result.get(2).equals("Burley Municipal Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList6.stream(), new Coordinates(-9.443380355834961, 147.22000122070312), 4);
            assertTrue(result.size() == 4 && result.get(3).equals("Embu Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList6.stream(), new Coordinates(33.6405, -117.8443), 1);
            assertTrue(result.size() == 1 && result.get(0).equals("Burley Municipal Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList6.stream(), new Coordinates(33.6405, -117.8443), 2);
            assertTrue(result.size() == 2 && result.get(1).equals("Beijing Xijiao Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList6.stream(), new Coordinates(33.6405, -117.8443), 3);
            assertTrue(result.size() == 3 && result.get(2).equals("Kannur International Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList6.stream(), new Coordinates(33.6405, -117.8443), 4);
            assertTrue(result.size() == 4 && result.get(3).equals("Embu Airport"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem6_TestCase_5\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem6_6() {
        try {
            List<String> result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList6.stream(), new Coordinates(-9.443380355834961, 147.22000122070312), 1);
            assertTrue(result.size() == 1 && result.get(0).equals("Beijing Xijiao Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList6.stream(), new Coordinates(-9.443380355834961, 147.22000122070312), 2);
            assertTrue(result.size() == 2 && result.get(1).equals("Kannur International Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList6.stream(), new Coordinates(-9.443380355834961, 147.22000122070312), 3);
            assertTrue(result.size() == 3 && result.get(2).equals("Burley Municipal Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList6.stream(), new Coordinates(-9.443380355834961, 147.22000122070312), 4);
            assertTrue(result.size() == 4 && result.get(3).equals("Embu Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList6.stream(), new Coordinates(33.6405, -117.8443), 1);
            assertTrue(result.size() == 1 && result.get(0).equals("Burley Municipal Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList6.stream(), new Coordinates(33.6405, -117.8443), 2);
            assertTrue(result.size() == 2 && result.get(1).equals("Beijing Xijiao Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList6.stream(), new Coordinates(33.6405, -117.8443), 3);
            assertTrue(result.size() == 3 && result.get(2).equals("Kannur International Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList6.stream(), new Coordinates(33.6405, -117.8443), 4);
            assertTrue(result.size() == 4 && result.get(3).equals("Embu Airport"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem6_TestCase_6\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem6_7() {
        try {
            List<String> result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList6.stream(), new Coordinates(-9.443380355834961, 147.22000122070312), 1);
            assertTrue(result.size() == 1 && result.get(0).equals("Beijing Xijiao Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList6.stream(), new Coordinates(-9.443380355834961, 147.22000122070312), 2);
            assertTrue(result.size() == 2 && result.get(1).equals("Kannur International Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList6.stream(), new Coordinates(-9.443380355834961, 147.22000122070312), 3);
            assertTrue(result.size() == 3 && result.get(2).equals("Burley Municipal Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList6.stream(), new Coordinates(-9.443380355834961, 147.22000122070312), 4);
            assertTrue(result.size() == 4 && result.get(3).equals("Embu Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList6.stream(), new Coordinates(33.6405, -117.8443), 1);
            assertTrue(result.size() == 1 && result.get(0).equals("Burley Municipal Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList6.stream(), new Coordinates(33.6405, -117.8443), 2);
            assertTrue(result.size() == 2 && result.get(1).equals("Beijing Xijiao Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList6.stream(), new Coordinates(33.6405, -117.8443), 3);
            assertTrue(result.size() == 3 && result.get(2).equals("Kannur International Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList6.stream(), new Coordinates(33.6405, -117.8443), 4);
            assertTrue(result.size() == 4 && result.get(3).equals("Embu Airport"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem6_TestCase_7\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem6_8() {
        try {
            List<String> result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList7.stream(), new Coordinates(-9.443380355834961, 147.22000122070312), 1);
            assertTrue(result.size() == 1 && result.get(0).equals("Burley Municipal Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList7.stream(), new Coordinates(-9.443380355834961, 147.22000122070312), 2);
            assertTrue(result.size() == 2 && result.get(1).equals("Embu Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList7.stream(), new Coordinates(-9.443380355834961, 147.22000122070312), 3);
            assertTrue(result.size() == 2);

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList7.stream(), new Coordinates(33.6405, -117.8443), 1);
            assertTrue(result.size() == 1 && result.get(0).equals("Burley Municipal Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList7.stream(), new Coordinates(33.6405, -117.8443), 2);
            assertTrue(result.size() == 2 && result.get(1).equals("Embu Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList7.stream(), new Coordinates(33.6405, -117.8443), 3);
            assertTrue(result.size() == 2);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem6_TestCase_8\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem6_9() {
        try {
            List<String> result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList10.stream(), new Coordinates(-9.443380355834961, 147.22000122070312), 1);
            assertTrue(result.size() == 1 && result.get(0).equals("Nadzab Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList10.stream(), new Coordinates(-9.443380355834961, 147.22000122070312), 2);
            assertTrue(result.size() == 2 && result.get(1).equals("Goroka Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList10.stream(), new Coordinates(-9.443380355834961, 147.22000122070312), 3);
            assertTrue(result.size() == 3 && result.get(2).equals("Madang Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList10.stream(), new Coordinates(-9.443380355834961, 147.22000122070312), 4);
            assertTrue(result.size() == 4 && result.get(3).equals("Mount Hagen Kagamuga Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList10.stream(), new Coordinates(33.6405, -117.8443), 1);
            assertTrue(result.size() == 1 && result.get(0).equals("Indianola Municipal Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList10.stream(), new Coordinates(33.6405, -117.8443), 2);
            assertTrue(result.size() == 2 && result.get(1).equals("Dupage Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList10.stream(), new Coordinates(33.6405, -117.8443), 3);
            assertTrue(result.size() == 3 && result.get(2).equals("Chicago O'Hare International Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList10.stream(), new Coordinates(33.6405, -117.8443), 4);
            assertTrue(result.size() == 4 && result.get(3).equals("Chicago Midway International Airport"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem6_TestCase_9\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem6_10() {
        try {
            List<String> result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList.stream(), new Coordinates(-9.443380355834961, 147.22000122070312), 1);
            assertTrue(result.size() == 1 && result.get(0).equals("Port Moresby Jacksons International Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList.stream(), new Coordinates(-9.443380355834961, 147.22000122070312), 2);
            assertTrue(result.size() == 2 && result.get(1).equals("Girua Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList.stream(), new Coordinates(-9.443380355834961, 147.22000122070312), 3);
            assertTrue(result.size() == 3 && result.get(2).equals("Kerema Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList.stream(), new Coordinates(-9.443380355834961, 147.22000122070312), 4);
            assertTrue(result.size() == 4 && result.get(3).equals("Nadzab Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList.stream(), new Coordinates(33.6405, -117.8443), 1);
            assertTrue(result.size() == 1 && result.get(0).equals("John Wayne Airport-Orange County Airport"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList.stream(), new Coordinates(33.6405, -117.8443), 2);
            assertTrue(result.size() == 2 && result.get(1).equals("El Toro Marine Corps Air Station"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList.stream(), new Coordinates(33.6405, -117.8443), 3);
            assertTrue(result.size() == 3 && result.get(2).equals("Los Alamitos Army Air Field"));

            result = AirportsStats.problem6_getTopNAirportsClosestTo(airportsList.stream(), new Coordinates(33.6405, -117.8443), 4);
            assertTrue(result.size() == 4 && result.get(3).equals("Fullerton Municipal Airport"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem6_TestCase_10\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem7_1() {
        try {
            List<Airport> mergeList = new ArrayList<>();
            mergeList.addAll(airportsList1);
            mergeList.addAll(airportsList2);
            OptionalDouble opt = AirportsStats.problem7_averageAltitude(mergeList.stream());
            assertTrue(opt.isPresent());
            if (opt.isPresent()) {
                double result = opt.getAsDouble();
                assertEquals(650.653, result, EPSILON);
            }
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem7_TestCase_1\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem7_2() {
        try {
            List<Airport> mergeList = new ArrayList<>();
            mergeList.addAll(airportsList4);
            mergeList.addAll(airportsList5);
            OptionalDouble opt = AirportsStats.problem7_averageAltitude(mergeList.stream());
            assertTrue(opt.isPresent());
            if (opt.isPresent()) {
                double result = opt.getAsDouble();
                assertEquals(888.333, result, EPSILON);
            }
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem7_TestCase_2\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem7_3() {
        try {
            List<Airport> mergeList = new ArrayList<>();
            mergeList.addAll(airportsList5);
            mergeList.addAll(airportsList6);
            OptionalDouble opt = AirportsStats.problem7_averageAltitude(mergeList.stream());
            assertTrue(opt.isPresent());
            if (opt.isPresent()) {
                double result = opt.getAsDouble();
                assertEquals(1730.0, result, EPSILON);
            }
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem7_TestCase_3\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem7_4() {
        try {
            List<Airport> mergeList = new ArrayList<>();
            mergeList.addAll(airportsList7);
            mergeList.addAll(airportsList6);
            OptionalDouble opt = AirportsStats.problem7_averageAltitude(mergeList.stream());
            assertTrue(opt.isPresent());
            if (opt.isPresent()) {
                double result = opt.getAsDouble();
                assertEquals(2821.666, result, EPSILON);
            }
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem7_TestCase_4\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem7_5() {
        try {
            OptionalDouble opt = AirportsStats.problem7_averageAltitude(airportsList5.stream());
            assertTrue(opt.isPresent());
            if (opt.isPresent()) {
                double result = opt.getAsDouble();
                assertEquals(20.0, result, EPSILON);
            }
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem7_TestCase_5\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem7_6() {
        try {
            OptionalDouble opt = AirportsStats.problem7_averageAltitude(airportsList6.stream());
            assertTrue(opt.isPresent());
            if (opt.isPresent()) {
                double result = opt.getAsDouble();
                assertEquals(2157.5, result, EPSILON);
            }
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem7_TestCase_6\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem7_7() {
        try {
            OptionalDouble opt = AirportsStats.problem7_averageAltitude(airportsList4.stream());
            assertTrue(opt.isPresent());
            if (opt.isPresent()) {
                double result = opt.getAsDouble();
                assertEquals(950.357, result, EPSILON);
            }
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem7_TestCase_7\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem7_8() {
        try {
            OptionalDouble opt = AirportsStats.problem7_averageAltitude(airportsList8.stream());
            assertTrue(opt.isPresent());
            if (opt.isPresent()) {
                double result = opt.getAsDouble();
                assertEquals(744.136, result, EPSILON);
            }
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem7_TestCase_8\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem7_9() {
        try {
            OptionalDouble opt = AirportsStats.problem7_averageAltitude(airportsList9.stream());
            assertTrue(opt.isPresent());
            if (opt.isPresent()) {
                double result = opt.getAsDouble();
                assertEquals(664.5, result, EPSILON);
            }
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem7_TestCase_9\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem7_10() {
        try {
            OptionalDouble opt = AirportsStats.problem7_averageAltitude(airportsList10.stream());
            assertTrue(opt.isPresent());
            if (opt.isPresent()) {
                double result = opt.getAsDouble();
                assertEquals(795.333, result, EPSILON);
            }
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem7_TestCase_10\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem8_1() {
        try {
            Map<Integer, Long> result = AirportsStats.problem8_countAirportsByNumWordsInName(airportsList8.stream());
            assertTrue(result.size() == 4 &&
                    result.get(2) == 6 &&
                    result.get(3) == 8 &&
                    result.get(4) == 6 &&
                    result.get(5) == 2);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem8_TestCase_1\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem8_2() {
        try {
            Map<Integer, Long> result = AirportsStats.problem8_countAirportsByNumWordsInName(airportsList9.stream());
            assertTrue(result.size() == 4 &&
                    result.get(2) == 7 &&
                    result.get(3) == 10 &&
                    result.get(4) == 7 &&
                    result.get(5) == 2);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem8_TestCase_2\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem8_3() {
        try {
            Map<Integer, Long> result = AirportsStats.problem8_countAirportsByNumWordsInName(airportsList10.stream());
            assertTrue(result.size() == 4 &&
                    result.get(2) == 6 &&
                    result.get(3) == 6 &&
                    result.get(4) == 5 &&
                    result.get(5) == 1);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem8_TestCase_3\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem8_4() {
        try {
            List<Airport> mergeList = new ArrayList<>();
            mergeList.addAll(airportsList1);
            mergeList.addAll(airportsList2);
            Map<Integer, Long> result = AirportsStats.problem8_countAirportsByNumWordsInName(mergeList.stream());
            assertTrue(result.size() == 4 &&
                    result.get(2) == 7 &&
                    result.get(3) == 8 &&
                    result.get(4) == 8 &&
                    result.get(5) == 3);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem8_TestCase_4\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem8_5() {
        try {
            List<Airport> mergeList = new ArrayList<>();
            mergeList.addAll(airportsList2);
            mergeList.addAll(airportsList3);
            Map<Integer, Long> result = AirportsStats.problem8_countAirportsByNumWordsInName(mergeList.stream());
            assertTrue(result.size() == 4 &&
                    result.get(2) == 1 &&
                    result.get(3) == 2 &&
                    result.get(4) == 3 &&
                    result.get(5) == 1);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem8_TestCase_5\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem8_6() {
        try {
            List<Airport> mergeList = new ArrayList<>();
            mergeList.addAll(airportsList3);
            mergeList.addAll(airportsList4);
            Map<Integer, Long> result = AirportsStats.problem8_countAirportsByNumWordsInName(mergeList.stream());
            assertTrue(result.size() == 4 &&
                    result.get(2) == 6 &&
                    result.get(3) == 3 &&
                    result.get(4) == 4 &&
                    result.get(5) == 1);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem8_TestCase_6\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem8_7() {
        try {
            List<Airport> mergeList = new ArrayList<>();
            mergeList.addAll(airportsList5);
            mergeList.addAll(airportsList4);
            Map<Integer, Long> result = AirportsStats.problem8_countAirportsByNumWordsInName(mergeList.stream());
            assertTrue(result.size() == 4 &&
                    result.get(2) == 7 &&
                    result.get(3) == 3 &&
                    result.get(4) == 4 &&
                    result.get(5) == 1);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem8_TestCase_7\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem8_8() {
        try {
            List<Airport> mergeList = new ArrayList<>();
            mergeList.addAll(airportsList5);
            mergeList.addAll(airportsList6);
            Map<Integer, Long> result = AirportsStats.problem8_countAirportsByNumWordsInName(mergeList.stream());
            assertTrue(result.size() == 2 &&
                    result.get(2) == 2 &&
                    result.get(3) == 3);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem8_TestCase_8\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem8_9() {
        try {
            List<Airport> mergeList = new ArrayList<>();
            mergeList.addAll(airportsList6);
            mergeList.addAll(airportsList7);
            Map<Integer, Long> result = AirportsStats.problem8_countAirportsByNumWordsInName(mergeList.stream());
            assertTrue(result.size() == 2 &&
                    result.get(2) == 2 &&
                    result.get(3) == 4);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem8_TestCase_9\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem8_10() {
        try {
            List<Airport> mergeList = new ArrayList<>();
            mergeList.addAll(airportsList3);
            mergeList.addAll(airportsList4);
            Map<Integer, Long> result = AirportsStats.problem8_countAirportsByNumWordsInName(mergeList.stream());
            assertTrue(result.size() == 4 &&
                    result.get(2) == 6 &&
                    result.get(3) == 3 &&
                    result.get(4) == 4 &&
                    result.get(5) == 1);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem8_TestCase_10\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem9_1() {
        try {
            assertEquals(0.0, AirportsStats.problem9_percentAirportsWithCountryInName(airportsList2.stream()), EPSILON);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem9_TestCase_1\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem9_2() {
        try {
            assertEquals(0.0, AirportsStats.problem9_percentAirportsWithCountryInName(airportsList4.stream()), EPSILON);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem9_TestCase_2\n" + e);
            score -= problemPoints;
        }
    }

    @Test
    void problem9_3() {
        try {
            assertEquals(0.0, AirportsStats.problem9_percentAirportsWithCountryInName(airportsList6.stream()), EPSILON);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem9_TestCase_3\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem9_4() {
        try {
            assertEquals(0.0, AirportsStats.problem9_percentAirportsWithCountryInName(airportsList7.stream()), EPSILON);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem9_TestCase_4\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem9_5() {
        try {
            assertEquals(0.0, AirportsStats.problem9_percentAirportsWithCountryInName(airportsList10.stream()), EPSILON);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem9_TestCase_5\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem9_6() {
        try {
            List<Airport> mergeList = new ArrayList<>();
            mergeList.addAll(airportsList);
            mergeList.addAll(airportsList1);
            assertEquals(0.449, AirportsStats.problem9_percentAirportsWithCountryInName(mergeList.stream()), EPSILON);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem9_TestCase_6\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem9_7() {
        try {
            List<Airport> mergeList = new ArrayList<>();
            mergeList.addAll(airportsList2);
            mergeList.addAll(airportsList1);
            assertEquals(0.0, AirportsStats.problem9_percentAirportsWithCountryInName(mergeList.stream()), EPSILON);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem9_TestCase_7\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem9_8() {
        try {
            List<Airport> mergeList = new ArrayList<>();
            mergeList.addAll(airportsList2);
            mergeList.addAll(airportsList8);
            assertEquals(10.344, AirportsStats.problem9_percentAirportsWithCountryInName(mergeList.stream()), EPSILON);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem9_TestCase_8\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem9_9() {
        try {
            List<Airport> mergeList = new ArrayList<>();
            mergeList.addAll(airportsList8);
            mergeList.addAll(airportsList9);
            assertEquals(20.833, AirportsStats.problem9_percentAirportsWithCountryInName(mergeList.stream()), EPSILON);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem9_TestCase_9\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem9_10() {
        try {
            List<Airport> mergeList = new ArrayList<>();
            mergeList.addAll(airportsList);
            mergeList.addAll(airportsList9);
            assertEquals(0.541, AirportsStats.problem9_percentAirportsWithCountryInName(mergeList.stream()), EPSILON);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem9_TestCase_10\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem10_1() {
        try {
            List<Airport> result = AirportsStats.problem10_getAirportWithLongestName(airportsList4.stream());
            assertTrue(result.size() == 1 &&
                    result.get(0).getAirportID() == 5);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem10_TestCase_1\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem10_2() {
        try {
            List<Airport> result = AirportsStats.problem10_getAirportWithLongestName(airportsList8.stream());
            assertTrue(result.size() == 1 &&
                    result.get(0).getAirportID() == 5);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem10_TestCase_2\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem10_3() {
        try {
            List<Airport> result = AirportsStats.problem10_getAirportWithLongestName(airportsList9.stream());
            assertTrue(result.size() == 1 &&
                    result.get(0).getAirportID() == 5);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem10_TestCase_3\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem10_4() {
        try {
            List<Airport> mergeList = new ArrayList<>();
            mergeList.addAll(airportsList1);
            mergeList.addAll(airportsList2);
            List<Airport> result = AirportsStats.problem10_getAirportWithLongestName(mergeList.stream());
            assertTrue(result.size() == 1 &&
                    result.get(0).getAirportID() == 5);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem10_TestCase_4\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem10_5() {
        try {
            List<Airport> mergeList = new ArrayList<>();
            mergeList.addAll(airportsList3);
            mergeList.addAll(airportsList2);
            List<Airport> result = AirportsStats.problem10_getAirportWithLongestName(mergeList.stream());
            assertTrue(result.size() == 3 &&
                    result.get(0).getAirportID() == 3797 &&
                    result.get(1).getAirportID() == 3747 &&
                    result.get(2).getAirportID() == 3830);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem10_TestCase_5\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem10_6() {
        try {
            List<Airport> mergeList = new ArrayList<>();
            mergeList.addAll(airportsList3);
            mergeList.addAll(airportsList4);
            List<Airport> result = AirportsStats.problem10_getAirportWithLongestName(mergeList.stream());
            assertTrue(result.size() == 1 &&
                    result.get(0).getAirportID() == 5);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem10_TestCase_6\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem10_7() {
        try {
            List<Airport> mergeList = new ArrayList<>();
            mergeList.addAll(airportsList4);
            mergeList.addAll(airportsList5);
            List<Airport> result = AirportsStats.problem10_getAirportWithLongestName(mergeList.stream());
            assertTrue(result.size() == 1 &&
                    result.get(0).getAirportID() == 5);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem10_TestCase_7\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem10_8() {
        try {
            List<Airport> mergeList = new ArrayList<>();
            mergeList.addAll(airportsList5);
            mergeList.addAll(airportsList6);
            List<Airport> result = AirportsStats.problem10_getAirportWithLongestName(mergeList.stream());
            assertTrue(result.size() == 1 &&
                    result.get(0).getAirportID() == 13725);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem10_TestCase_8\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem10_9() {
        try {
            List<Airport> mergeList = new ArrayList<>();
            mergeList.addAll(airportsList7);
            mergeList.addAll(airportsList8);
            List<Airport> result = AirportsStats.problem10_getAirportWithLongestName(mergeList.stream());
            assertTrue(result.size() == 1 &&
                    result.get(0).getAirportID() == 5);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem10_TestCase_9\n" + e);
            score -= problemPoints;
        }
    }


    @Test
    void problem10_10() {
        try {
            List<Airport> mergeList = new ArrayList<>();
            mergeList.addAll(airportsList9);
            mergeList.addAll(airportsList10);
            List<Airport> result = AirportsStats.problem10_getAirportWithLongestName(mergeList.stream());
            assertTrue(result.size() == 1 &&
                    result.get(0).getAirportID() == 5);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem10_TestCase_10\n" + e);
            score -= problemPoints;
        }
    }


    @AfterAll
    public static void printScore() {
        // Use Logger
        Logger log = Logger.getLogger(Lab10GraderTest.class.getName());
        log.info("total_score: " + score);
        System.out.println("total_score: " + score);
    }
}
