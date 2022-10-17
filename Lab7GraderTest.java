import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.List;
import java.util.*;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Lab7GraderTest {
    private static double score = 100;
    private final double EPSILON = 1e-3;

    private double problem1Points = 10 / 10;
    private double problem2Points = 10 / 10;
    private double problem3Points = 10 / 10;
    private double problem4_5Points = 20 / 10;
    private double problem6Points = 10 / 10;
    private double problem7Points = 10 / 10;
    private double problem8Points = 10 / 10;
    private double problem9_10Points = 20 / 10;
    //problem1
    @Test
    void problem1_TestCase_1() throws IOException{
        try{
            assertEquals("", Main.problem1_moveXToEnd(""));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem1_TestCase_1\n" + e);
            score -= problem1Points;
        }
    }
    @Test
    void problem1_TestCase_2() throws IOException{
        try{
            assertEquals("xxxxxx", Main.problem1_moveXToEnd("xxxxxx"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem1_TestCase_2\n" + e);
            score -= problem1Points;
        }
    }
    @Test
    void problem1_TestCase_3() throws IOException{
        try{
            assertEquals("ixxxxxx", Main.problem1_moveXToEnd("xxxixxx"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem1_TestCase_3\n" + e);
            score -= problem1Points;
        }
    }
    @Test
    void problem1_TestCase_4() throws IOException{
        try{
            assertEquals("X", Main.problem1_moveXToEnd("X"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem1_TestCase_4\n" + e);
            score -= problem1Points;
        }
    }
    @Test
    void problem1_TestCase_5() throws IOException{
        try{
            assertEquals("Xxx", Main.problem1_moveXToEnd("xxX"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem1_TestCase_5\n" + e);
            score -= problem1Points;
        }
    }
    @Test
    void problem1_TestCase_6() throws IOException{
        try{
            assertEquals("abc", Main.problem1_moveXToEnd("abc"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem1_TestCase_6\n" + e);
            score -= problem1Points;
        }
    }
    @Test
    void problem1_TestCase_7() throws IOException{
        try{
            assertEquals("aibcxx", Main.problem1_moveXToEnd("axibxc"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem1_TestCase_7\n" + e);
            score -= problem1Points;
        }
    }
    @Test
    void problem1_TestCase_8() throws IOException{
        try{
            assertEquals("aXbXcX", Main.problem1_moveXToEnd("aXbXcX"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem1_TestCase_8\n" + e);
            score -= problem1Points;
        }
    }
    @Test
    void problem1_TestCase_9() throws IOException{
        try{
            assertEquals("aaaaxxxx", Main.problem1_moveXToEnd("xxxxaaaa"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem1_TestCase_9\n" + e);
            score -= problem1Points;
        }
    }
    @Test
    void problem1_TestCase_10() throws IOException{
        try{
            assertEquals("aXaaXaxxxx", Main.problem1_moveXToEnd("aXxaaXxaxx"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem1_TestCase_10\n" + e);
            score -= problem1Points;
        }
    }
    //problem2
    @Test
    void problem2_TestCase_1() throws IOException {
        try {
            assertEquals(2, Main.problem2_countSubs("abcaabcab", "abc"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem2_TestCase_1\n" + e);
            score -= problem2Points;
        }
    }
    @Test
    void problem2_TestCase_2() throws IOException {
        try {
            assertEquals(2, Main.problem2_countSubs("aaaaaaa", "aaa"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem2_TestCase_2\n" + e);
            score -= problem2Points;
        }
    }
    @Test
    void problem2_TestCase_3() throws IOException {
        try {
            assertEquals(1, Main.problem2_countSubs("aaabaabaa", "aaa"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem2_TestCase_3\n" + e);
            score -= problem2Points;
        }
    }
    @Test
    void problem2_TestCase_4() throws IOException {
        try {
            assertEquals(0, Main.problem2_countSubs("abccbaabc", "bac"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem2_TestCase_4\n" + e);
            score -= problem2Points;
        }
    }
    @Test
    void problem2_TestCase_5() throws IOException {
        try {
            assertEquals(1, Main.problem2_countSubs("aaaacccc", "ac"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem2_TestCase_5\n" + e);
            score -= problem2Points;
        }
    }
    @Test
    void problem2_TestCase_6() throws IOException {
        try {
            assertEquals(0, Main.problem2_countSubs("c", "cc"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem2_TestCase_6\n" + e);
            score -= problem2Points;
        }
    }
    @Test
    void problem2_TestCase_7() throws IOException {
        try {
            assertEquals(8, Main.problem2_countSubs("aaaaaaaa", "a"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem2_TestCase_7\n" + e);
            score -= problem2Points;
        }
    }
    @Test
    void problem2_TestCase_8() throws IOException {
        try {
            assertEquals(0, Main.problem2_countSubs("", "abc"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem2_TestCase_8\n" + e);
            score -= problem2Points;
        }
    }
    @Test
    void problem2_TestCase_9() throws IOException {
        try {
            assertEquals(5, Main.problem2_countSubs("abababbba", "b"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem2_TestCase_9\n" + e);
            score -= problem2Points;
        }
    }
    @Test
    void problem2_TestCase_10() throws IOException {
        try {
            assertEquals(2, Main.problem2_countSubs("abcabc", "abc"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem2_TestCase_10\n" + e);
            score -= problem2Points;
        }
    }

    //problem3
    @Test
    void problem3_TestCase_1() throws IOException {
        try {
            assertEquals(1, Main.problem3_countHis("hixhixhi"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem3_TestCase_1\n" + e);
            score -= problem3Points;
        }
    }
    @Test
    void problem3_TestCase_2() throws IOException {
        try {
            assertEquals(5, Main.problem3_countHis("hihihihihi"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem3_TestCase_2\n" + e);
            score -= problem3Points;
        }
    }
    @Test
    void problem3_TestCase_3() throws IOException {
        try {
            assertEquals(0, Main.problem3_countHis("xhixhixhixhi"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem3_TestCase_3\n" + e);
            score -= problem3Points;
        }
    }
    @Test
    void problem3_TestCase_4() throws IOException {
        try {
            assertEquals(0, Main.problem3_countHis(""));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem3_TestCase_4\n" + e);
            score -= problem3Points;
        }
    }
    @Test
    void problem3_TestCase_5() throws IOException {
        try {
            assertEquals(1, Main.problem3_countHis("hixhixxhi"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem3_TestCase_5\n" + e);
            score -= problem3Points;
        }
    }
    @Test
    void problem3_TestCase_6() throws IOException {
        try {
            assertEquals(0, Main.problem3_countHis("aaaaaaaa"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem3_TestCase_6\n" + e);
            score -= problem3Points;
        }
    }
    @Test
    void problem3_TestCase_7() throws IOException {
        try {
            assertEquals(1, Main.problem3_countHis("hi"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem3_TestCase_7\n" + e);
            score -= problem3Points;
        }
    }
    @Test
    void problem3_TestCase_8() throws IOException {
        try {
            assertEquals(0, Main.problem3_countHis("ii"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem3_TestCase_8\n" + e);
            score -= problem3Points;
        }
    }
    @Test
    void problem3_TestCase_9() throws IOException {
        try {
            assertEquals(3, Main.problem3_countHis("xhixhichichichi"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem3_TestCase_9\n" + e);
            score -= problem3Points;
        }
    }
    @Test
    void problem3_TestCase_10() throws IOException {
        try {
            assertEquals(1, Main.problem3_countHis("hcxhichihci"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem3_TestCase_10\n" + e);
            score -= problem3Points;
        }
    }

    //problem4-5
    @Test
    void problem4_5_TestCase_1() throws IOException {
        try {
            PurchaseHistory history = new PurchaseHistory();
            history.addPurchase(LocalDate.of(2021, 12, 19), "Christmas pillow for Robert", 10.00);
            history.addPurchase(LocalDate.of(2021, 12, 19), "Christmas jammies for Robert", 19.99);
            history.addPurchase(LocalDate.of(2021, 12, 31), "Champagne", 18.50);
            history.addPurchase(LocalDate.of(2022, 1, 2), "Takeout food", 57.89);
            history.addPurchase(LocalDate.of(2022, 1, 2), "Takeout food", 7.89);
            history.addPurchase(LocalDate.of(2022, 1, 2), "Takeout food", 98.17);
            history.addPurchase(LocalDate.of(2021, 3, 1), "Cable/Internet bill", 243.00);
            history.addPurchase(LocalDate.of(2021, 2, 19), "Cell phone bill", 78.53);
            history.addPurchase(LocalDate.of(2021, 7, 28), "Rent", 2000.00);
            history.addPurchase(LocalDate.of(2022, 4, 18), "Gas", 74.33);
            history.addPurchase(LocalDate.of(2022, 4, 18), "Gas", 74.33);
            history.addPurchase(LocalDate.of(2022, 4, 18), "Takeout food", 196.31);
            history.addPurchase(LocalDate.of(2021, 11, 23), "New running shoes", 72.10);
            history.addPurchase(LocalDate.of(2021, 9, 19), "Life insurance", 110.00);
            history.addPurchase(LocalDate.of(2020, 9, 30), "Pet insurance", 44.99);
            history.addPurchase(LocalDate.of(2020, 8, 22), "Church charitable gift", 100.00);

            // PurchaseHistory.toString():
            String expectedPHStr = "2020-08-22 Church charitable gift 100.0, 2020-09-30 Pet insurance 44.99, 2021-02-19 Cell phone bill 78.53, 2021-03-01 Cable/Internet bill 243.0, 2021-07-28 Rent 2000.0, 2021-09-19 Life insurance 110.0, 2021-11-23 New running shoes 72.1, 2021-12-19 Christmas jammies for Robert 19.99, 2021-12-19 Christmas pillow for Robert 10.0, 2021-12-31 Champagne 18.5, 2022-01-02 Takeout food 98.17, 2022-01-02 Takeout food 57.89, 2022-01-02 Takeout food 7.89, 2022-04-18 Takeout food 196.31, 2022-04-18 Gas 74.33, 2022-04-18 Gas 74.33";
            assertEquals(expectedPHStr, history.toString());

        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem4_5_TestCase_1\n" + e);
            score -= problem4_5Points;
        }
    }

    @Test
    void problem4_5_TestCase_2() throws IOException {
        try {
            PurchaseHistory history = new PurchaseHistory();
            history.addPurchase(LocalDate.of(2021, 12, 19), "Christmas pillow for Robert", 10.00);
            history.addPurchase(LocalDate.of(2021, 12, 19), "Christmas jammies for Robert", 19.99);
            history.addPurchase(LocalDate.of(2021, 12, 31), "Champagne", 18.50);
            history.addPurchase(LocalDate.of(2022, 1, 2), "Takeout food", 57.89);
            history.addPurchase(LocalDate.of(2022, 1, 2), "Takeout food", 7.89);
            history.addPurchase(LocalDate.of(2022, 1, 2), "Takeout food", 98.17);
            history.addPurchase(LocalDate.of(2021, 3, 1), "Cable/Internet bill", 243.00);
            history.addPurchase(LocalDate.of(2021, 2, 19), "Cell phone bill", 78.53);
            history.addPurchase(LocalDate.of(2021, 7, 28), "Rent", 2000.00);
            history.addPurchase(LocalDate.of(2022, 4, 18), "Gas", 74.33);
            history.addPurchase(LocalDate.of(2022, 4, 18), "Gas", 74.33);
            history.addPurchase(LocalDate.of(2022, 4, 18), "Takeout food", 196.31);
            history.addPurchase(LocalDate.of(2021, 11, 23), "New running shoes", 72.10);
            history.addPurchase(LocalDate.of(2021, 9, 19), "Life insurance", 110.00);
            history.addPurchase(LocalDate.of(2020, 9, 30), "Pet insurance", 44.99);
            history.addPurchase(LocalDate.of(2020, 8, 22), "Church charitable gift", 100.00);
            assertEquals(1, history.removePurchase(LocalDate.of(2022, 1, 2), "Takeout food", 57.89));
            String expectedPHStr = "2020-08-22 Church charitable gift 100.0, 2020-09-30 Pet insurance 44.99, 2021-02-19 Cell phone bill 78.53, 2021-03-01 Cable/Internet bill 243.0, 2021-07-28 Rent 2000.0, 2021-09-19 Life insurance 110.0, 2021-11-23 New running shoes 72.1, 2021-12-19 Christmas jammies for Robert 19.99, 2021-12-19 Christmas pillow for Robert 10.0, 2021-12-31 Champagne 18.5, 2022-01-02 Takeout food 98.17, 2022-01-02 Takeout food 7.89, 2022-04-18 Takeout food 196.31, 2022-04-18 Gas 74.33, 2022-04-18 Gas 74.33";
            assertEquals(expectedPHStr, history.toString());
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem4_5_TestCase_2\n" + e);
            score -= problem4_5Points;
        }
    }

    @Test
    void problem4_5_TestCase_3() throws IOException {
        try {
            PurchaseHistory history = new PurchaseHistory();
            history.addPurchase(LocalDate.of(2021, 12, 19), "Christmas pillow for Robert", 10.00);
            history.addPurchase(LocalDate.of(2021, 12, 19), "Christmas jammies for Robert", 19.99);
            history.addPurchase(LocalDate.of(2021, 12, 31), "Champagne", 18.50);
            history.addPurchase(LocalDate.of(2022, 1, 2), "Takeout food", 57.89);
            history.addPurchase(LocalDate.of(2022, 1, 2), "Takeout food", 7.89);
            history.addPurchase(LocalDate.of(2022, 1, 2), "Takeout food", 98.17);
            history.addPurchase(LocalDate.of(2021, 3, 1), "Cable/Internet bill", 243.00);
            history.addPurchase(LocalDate.of(2021, 2, 19), "Cell phone bill", 78.53);
            history.addPurchase(LocalDate.of(2021, 7, 28), "Rent", 2000.00);
            history.addPurchase(LocalDate.of(2022, 4, 18), "Gas", 74.33);
            history.addPurchase(LocalDate.of(2022, 4, 18), "Gas", 74.33);
            history.addPurchase(LocalDate.of(2022, 4, 18), "Takeout food", 196.31);
            history.addPurchase(LocalDate.of(2021, 11, 23), "New running shoes", 72.10);
            history.addPurchase(LocalDate.of(2021, 9, 19), "Life insurance", 110.00);
            history.addPurchase(LocalDate.of(2020, 9, 30), "Pet insurance", 44.99);
            history.addPurchase(LocalDate.of(2020, 8, 22), "Church charitable gift", 100.00);
            String expectedPHStr = "2020-08-22 Church charitable gift 100.0, 2020-09-30 Pet insurance 44.99, 2021-02-19 Cell phone bill 78.53, 2021-03-01 Cable/Internet bill 243.0, 2021-07-28 Rent 2000.0, 2021-09-19 Life insurance 110.0, 2021-11-23 New running shoes 72.1, 2021-12-19 Christmas jammies for Robert 19.99, 2021-12-19 Christmas pillow for Robert 10.0, 2021-12-31 Champagne 18.5, 2022-01-02 Takeout food 98.17, 2022-01-02 Takeout food 57.89, 2022-01-02 Takeout food 7.89, 2022-04-18 Takeout food 196.31, 2022-04-18 Gas 74.33, 2022-04-18 Gas 74.33";
            assertEquals(expectedPHStr, history.toString());
            assertEquals(0, history.removePurchase(LocalDate.of(2022, 4, 19), "Gas", 74.33));
            assertEquals(expectedPHStr, history.toString());
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem4_5_TestCase_3\n" + e);
            score -= problem4_5Points;
        }
    }

    @Test
    void problem4_5_TestCase_4() throws IOException {
        try {
            PurchaseHistory history = new PurchaseHistory();
            history.addPurchase(LocalDate.of(2021, 12, 19), "Christmas pillow for Robert", 10.00);
            history.addPurchase(LocalDate.of(2021, 12, 19), "Christmas jammies for Robert", 19.99);
            history.addPurchase(LocalDate.of(2021, 12, 31), "Champagne", 18.50);
            history.addPurchase(LocalDate.of(2022, 1, 2), "Takeout food", 57.89);
            history.addPurchase(LocalDate.of(2022, 1, 2), "Takeout food", 7.89);
            history.addPurchase(LocalDate.of(2022, 1, 2), "Takeout food", 98.17);
            history.addPurchase(LocalDate.of(2021, 3, 1), "Cable/Internet bill", 243.00);
            history.addPurchase(LocalDate.of(2021, 2, 19), "Cell phone bill", 78.53);
            history.addPurchase(LocalDate.of(2021, 7, 28), "Rent", 2000.00);
            history.addPurchase(LocalDate.of(2022, 4, 18), "Gas", 74.33);
            history.addPurchase(LocalDate.of(2022, 4, 18), "Gas", 74.33);
            history.addPurchase(LocalDate.of(2022, 4, 18), "Takeout food", 196.31);
            history.addPurchase(LocalDate.of(2021, 11, 23), "New running shoes", 72.10);
            history.addPurchase(LocalDate.of(2021, 9, 19), "Life insurance", 110.00);
            history.addPurchase(LocalDate.of(2020, 9, 30), "Pet insurance", 44.99);
            history.addPurchase(LocalDate.of(2020, 8, 22), "Church charitable gift", 100.00);
            String expectedPHStr = "2020-08-22 Church charitable gift 100.0, 2020-09-30 Pet insurance 44.99, 2021-02-19 Cell phone bill 78.53, 2021-03-01 Cable/Internet bill 243.0, 2021-07-28 Rent 2000.0, 2021-09-19 Life insurance 110.0, 2021-11-23 New running shoes 72.1, 2021-12-19 Christmas jammies for Robert 19.99, 2021-12-19 Christmas pillow for Robert 10.0, 2021-12-31 Champagne 18.5, 2022-01-02 Takeout food 98.17, 2022-01-02 Takeout food 57.89, 2022-01-02 Takeout food 7.89, 2022-04-18 Takeout food 196.31, 2022-04-18 Gas 74.33, 2022-04-18 Gas 74.33";
            assertEquals(expectedPHStr, history.toString());
            assertEquals(0, history.removePurchase(LocalDate.of(2022, 4, 19), "Gas", 74.33));
            assertEquals(expectedPHStr, history.toString());
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem4_5_TestCase_4\n" + e);
            score -= problem4_5Points;
        }
    }

    @Test
    void problem4_5_TestCase_5() throws IOException {
        try {
            PurchaseHistory history = new PurchaseHistory();
            history.addPurchase(LocalDate.of(2021, 12, 19), "Christmas pillow for Robert", 10.00);
            history.addPurchase(LocalDate.of(2021, 12, 19), "Christmas jammies for Robert", 19.99);
            history.addPurchase(LocalDate.of(2021, 12, 31), "Champagne", 18.50);
            history.addPurchase(LocalDate.of(2022, 1, 2), "Takeout food", 57.89);
            history.addPurchase(LocalDate.of(2022, 1, 2), "Takeout food", 7.89);
            history.addPurchase(LocalDate.of(2022, 1, 2), "Takeout food", 98.17);
            history.addPurchase(LocalDate.of(2021, 3, 1), "Cable/Internet bill", 243.00);
            history.addPurchase(LocalDate.of(2021, 2, 19), "Cell phone bill", 78.53);
            history.addPurchase(LocalDate.of(2021, 7, 28), "Rent", 2000.00);
            history.addPurchase(LocalDate.of(2022, 4, 18), "Gas", 74.33);
            history.addPurchase(LocalDate.of(2022, 4, 18), "Gas", 74.33);
            history.addPurchase(LocalDate.of(2022, 4, 18), "Takeout food", 196.31);
            history.addPurchase(LocalDate.of(2021, 11, 23), "New running shoes", 72.10);
            history.addPurchase(LocalDate.of(2021, 9, 19), "Life insurance", 110.00);
            history.addPurchase(LocalDate.of(2020, 9, 30), "Pet insurance", 44.99);
            history.addPurchase(LocalDate.of(2020, 8, 22), "Church charitable gift", 100.00);
            List<Purchase> expList2020 = Arrays.asList(
                    new Purchase(LocalDate.of(2020, 8, 22), "Church charitable gift", 100.0),
                    new Purchase(LocalDate.of(2020, 9, 30), "Pet insurance", 44.99));
            List<Purchase> actualList2020 = history.getPurchasesInDateRange(LocalDate.of(2020, 1, 1),
                    LocalDate.of(2020, 12, 31));
            assertEquals(expList2020, actualList2020);

            List<Purchase> expListDec19_2021 = Arrays.asList(
                    new Purchase(LocalDate.of(2021, 12, 19), "Christmas jammies for Robert", 19.99),
                    new Purchase(LocalDate.of(2021, 12, 19), "Christmas pillow for Robert", 10.00));
            List<Purchase> actualListDec19_2021 = history.getPurchasesInDateRange(LocalDate.of(2021, 12, 19),
                    LocalDate.of(2021, 12, 19));
            assertEquals(expListDec19_2021, actualListDec19_2021);

        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem4_5_TestCase_5\n" + e);
            score -= problem4_5Points;
        }
    }

    @Test
    void problem4_5_TestCase_6() throws IOException {
        try {
            PurchaseHistory history = new PurchaseHistory();
            history.addPurchase(LocalDate.of(2021, 12, 19), "Christmas pillow for Robert", 10.00);
            history.addPurchase(LocalDate.of(2021, 12, 19), "Christmas jammies for Robert", 19.99);
            history.addPurchase(LocalDate.of(2021, 12, 31), "Champagne", 18.50);
            history.addPurchase(LocalDate.of(2022, 1, 2), "Takeout food", 7.89);
            history.addPurchase(LocalDate.of(2022, 1, 2), "Takeout food", 98.17);
            history.addPurchase(LocalDate.of(2021, 3, 1), "Cable/Internet bill", 243.00);
            history.addPurchase(LocalDate.of(2021, 2, 19), "Cell phone bill", 78.53);
            history.addPurchase(LocalDate.of(2021, 7, 28), "Rent", 2000.00);
            history.addPurchase(LocalDate.of(2022, 4, 18), "Takeout food", 196.31);
            history.addPurchase(LocalDate.of(2021, 11, 23), "New running shoes", 72.10);
            history.addPurchase(LocalDate.of(2021, 9, 19), "Life insurance", 110.00);
            history.addPurchase(LocalDate.of(2020, 9, 30), "Pet insurance", 44.99);
            history.addPurchase(LocalDate.of(2020, 8, 22), "Church charitable gift", 100.00);
            history.addPurchase(LocalDate.of(2021, 12, 19), "Christmas tree", 64.00);
            history.addPurchase(LocalDate.of(2021, 12, 31), "Champagne", 1358.44);
            history.addPurchase(LocalDate.of(2019, 1, 19), "Movies", 36.12);
            history.addPurchase(LocalDate.of(2022, 2, 1), "boba", 4.95);
            history.addPurchase(LocalDate.of(2022, 2, 28), "boba", 4.95);
            String expectedPHStr = "2019-01-19 Movies 36.12, 2020-08-22 Church charitable gift 100.0, 2020-09-30 Pet insurance 44.99, 2021-02-19 Cell phone bill 78.53, 2021-03-01 Cable/Internet bill 243.0, 2021-07-28 Rent 2000.0, 2021-09-19 Life insurance 110.0, 2021-11-23 New running shoes 72.1, 2021-12-19 Christmas tree 64.0, 2021-12-19 Christmas jammies for Robert 19.99, 2021-12-19 Christmas pillow for Robert 10.0, 2021-12-31 Champagne 1358.44, 2021-12-31 Champagne 18.5, 2022-01-02 Takeout food 98.17, 2022-01-02 Takeout food 7.89, 2022-02-01 boba 4.95, 2022-02-28 boba 4.95, 2022-04-18 Takeout food 196.31";
            assertEquals(expectedPHStr, history.toString());

        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem4_5_TestCase_6\n" + e);
            score -= problem4_5Points;
        }
    }

    @Test
    void problem4_5_TestCase_7() throws IOException {
        try {
            PurchaseHistory history = new PurchaseHistory();
            history.addPurchase(LocalDate.of(2021, 12, 19), "Christmas pillow for Robert", 10.00);
            history.addPurchase(LocalDate.of(2021, 12, 19), "Christmas jammies for Robert", 19.99);
            history.addPurchase(LocalDate.of(2021, 12, 31), "Champagne", 18.50);
            history.addPurchase(LocalDate.of(2022, 1, 2), "Takeout food", 7.89);
            history.addPurchase(LocalDate.of(2022, 1, 2), "Takeout food", 98.17);
            history.addPurchase(LocalDate.of(2021, 3, 1), "Cable/Internet bill", 243.00);
            history.addPurchase(LocalDate.of(2021, 2, 19), "Cell phone bill", 78.53);
            history.addPurchase(LocalDate.of(2021, 7, 28), "Rent", 2000.00);
            history.addPurchase(LocalDate.of(2022, 4, 18), "Takeout food", 196.31);
            history.addPurchase(LocalDate.of(2021, 11, 23), "New running shoes", 72.10);
            history.addPurchase(LocalDate.of(2021, 9, 19), "Life insurance", 110.00);
            history.addPurchase(LocalDate.of(2020, 9, 30), "Pet insurance", 44.99);
            history.addPurchase(LocalDate.of(2020, 8, 22), "Church charitable gift", 100.00);
            history.addPurchase(LocalDate.of(2021, 12, 19), "Christmas tree", 64.00);
            history.addPurchase(LocalDate.of(2021, 12, 31), "Champagne", 1358.44);
            history.addPurchase(LocalDate.of(2019, 1, 19), "Movies", 36.12);
            history.addPurchase(LocalDate.of(2022, 2, 1), "boba", 4.95);
            history.addPurchase(LocalDate.of(2022, 2, 28), "boba", 4.95);

            assertEquals(9.9, history.getPurchaseTotalInDateRange(LocalDate.of(2022, 2, 1), LocalDate.of(2022, 2, 28)),
                    EPSILON);
            assertEquals(36.12, history.getPurchaseTotalInDateRange(LocalDate.of(2019, 1, 1), LocalDate.of(2019, 6, 30)),
                    EPSILON);
            assertEquals(1470.93,
                    history.getPurchaseTotalInDateRange(LocalDate.of(2021, 12, 1), LocalDate.of(2021, 12, 31)), EPSILON);
            assertEquals(0, history.getPurchaseTotalInDateRange(LocalDate.of(2023, 2, 1), LocalDate.of(2023, 12, 31)),
                    EPSILON);
            assertEquals(4467.94, history.getPurchaseTotalInDateRange(LocalDate.of(2019, 1, 1), LocalDate.of(2023, 12, 31)),
                    EPSILON);

        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem4_5_TestCase_7\n" + e);
            score -= problem4_5Points;
        }
    }

    @Test
    void problem4_5_TestCase_8() throws IOException {
        try {
            PurchaseHistory history = new PurchaseHistory();
            history.addPurchase(LocalDate.of(2021, 12, 19), "Christmas pillow for Robert", 10.00);
            history.addPurchase(LocalDate.of(2021, 12, 19), "Christmas jammies for Robert", 19.99);
            history.addPurchase(LocalDate.of(2021, 12, 31), "Champagne", 18.50);
            history.addPurchase(LocalDate.of(2022, 1, 2), "Takeout food", 7.89);
            history.addPurchase(LocalDate.of(2022, 1, 2), "Takeout food", 98.17);
            history.addPurchase(LocalDate.of(2021, 3, 1), "Cable/Internet bill", 243.00);
            history.addPurchase(LocalDate.of(2021, 2, 19), "Cell phone bill", 78.53);
            history.addPurchase(LocalDate.of(2021, 7, 28), "Rent", 2000.00);
            history.addPurchase(LocalDate.of(2022, 4, 18), "Takeout food", 196.31);
            history.addPurchase(LocalDate.of(2021, 11, 23), "New running shoes", 72.10);
            history.addPurchase(LocalDate.of(2021, 9, 19), "Life insurance", 110.00);
            history.addPurchase(LocalDate.of(2020, 9, 30), "Pet insurance", 44.99);
            history.addPurchase(LocalDate.of(2020, 8, 22), "Church charitable gift", 100.00);
            history.addPurchase(LocalDate.of(2021, 12, 19), "Christmas tree", 64.00);
            history.addPurchase(LocalDate.of(2021, 12, 31), "Champagne", 1358.44);
            history.addPurchase(LocalDate.of(2019, 1, 19), "Movies", 36.12);
            history.addPurchase(LocalDate.of(2022, 2, 1), "boba", 4.95);
            history.addPurchase(LocalDate.of(2022, 2, 28), "boba", 4.95);

            history.addPurchase(LocalDate.of(2022, 2, 1), "boba", 8.95);
            List<Purchase> expList = Arrays.asList(new Purchase(LocalDate.of(2022, 2, 1), "boba", 8.95),
                    new Purchase(LocalDate.of(2022, 2, 1), "boba", 4.95),
                    new Purchase(LocalDate.of(2022, 2, 28), "boba", 4.95));
            assertEquals(expList, history.getPurchasesMatchingDescription("boba"));

            assertEquals(new ArrayList<Purchase>(), history.getPurchasesMatchingDescription("Home Depot stuff"));

            expList = Arrays.asList(new Purchase(LocalDate.of(2020, 9, 30), "Pet insurance", 44.99));
            assertEquals(expList, history.getPurchasesMatchingDescription("Pet insurance"));

        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem4_5_TestCase_8\n" + e);
            score -= problem4_5Points;
        }
    }

    @Test
    void problem4_5_TestCase_9() throws IOException {
        try {
            PurchaseHistory history = new PurchaseHistory();
            history.addPurchase(LocalDate.of(2021, 12, 19), "Christmas pillow for Robert", 10.00);
            history.addPurchase(LocalDate.of(2021, 12, 19), "Christmas jammies for Robert", 19.99);
            history.addPurchase(LocalDate.of(2021, 12, 31), "Champagne", 18.50);
            history.addPurchase(LocalDate.of(2022, 1, 2), "Takeout food", 7.89);
            history.addPurchase(LocalDate.of(2022, 1, 2), "Takeout food", 98.17);
            history.addPurchase(LocalDate.of(2021, 3, 1), "Cable/Internet bill", 243.00);
            history.addPurchase(LocalDate.of(2021, 2, 19), "Cell phone bill", 78.53);
            history.addPurchase(LocalDate.of(2021, 7, 28), "Rent", 2000.00);
            history.addPurchase(LocalDate.of(2022, 4, 18), "Takeout food", 196.31);
            history.addPurchase(LocalDate.of(2021, 11, 23), "New running shoes", 72.10);
            history.addPurchase(LocalDate.of(2021, 9, 19), "Life insurance", 110.00);
            history.addPurchase(LocalDate.of(2020, 9, 30), "Pet insurance", 44.99);
            history.addPurchase(LocalDate.of(2020, 8, 22), "Church charitable gift", 100.00);
            history.addPurchase(LocalDate.of(2021, 12, 19), "Christmas tree", 64.00);
            history.addPurchase(LocalDate.of(2021, 12, 31), "Champagne", 1358.44);
            history.addPurchase(LocalDate.of(2019, 1, 19), "Movies", 36.12);
            history.addPurchase(LocalDate.of(2022, 2, 1), "boba", 4.95);
            history.addPurchase(LocalDate.of(2022, 2, 1), "boba", 8.95);
            List<Purchase> expList = Arrays.asList(new Purchase(LocalDate.of(2020, 8, 22), "Church charitable gift", 100.0));
            List<Purchase> actualList = history.getMaxPurchaseInDateRange(LocalDate.of(2020, 1, 1),
                    LocalDate.of(2020, 12, 31));
            assertEquals(expList, actualList);

            expList = Arrays.asList(new Purchase(LocalDate.of(2021, 12, 31), "Champagne", 1358.44));
            actualList = history.getMaxPurchaseInDateRange(LocalDate.of(2021, 12, 1), LocalDate.of(2021, 12, 31));
            assertEquals(expList, actualList);

            history.addPurchase(LocalDate.of(2021, 12, 19), "Canidae dog food for Robert", 64.00);
            expList = Arrays.asList(new Purchase(LocalDate.of(2021, 12, 19), "Canidae dog food for Robert", 64.00),
                    new Purchase(LocalDate.of(2021, 12, 19), "Christmas tree", 64.00));
            actualList = history.getMaxPurchaseInDateRange(LocalDate.of(2021, 12, 19), LocalDate.of(2021, 12, 19));
            assertEquals(expList, actualList);

            actualList = history.getMaxPurchaseInDateRange(LocalDate.of(2022, 5, 1), LocalDate.of(2022, 5, 31));
            assertEquals(new ArrayList<Purchase>(), actualList);

        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem4_5_TestCase_9\n" + e);
            score -= problem4_5Points;
        }
    }

    @Test
    void problem4_5_TestCase_10() throws IOException {
        try {
            PurchaseHistory history = new PurchaseHistory();
            history.addPurchase(LocalDate.of(2021, 12, 19), "Christmas pillow for Robert", 10.00);
            history.addPurchase(LocalDate.of(2021, 12, 19), "Christmas jammies for Robert", 19.99);
            history.addPurchase(LocalDate.of(2021, 12, 31), "Champagne", 18.50);
            history.addPurchase(LocalDate.of(2022, 1, 2), "Takeout food", 7.89);
            history.addPurchase(LocalDate.of(2022, 1, 2), "Takeout food", 98.17);
            history.addPurchase(LocalDate.of(2021, 3, 1), "Cable/Internet bill", 243.00);
            history.addPurchase(LocalDate.of(2021, 2, 19), "Cell phone bill", 78.53);
            history.addPurchase(LocalDate.of(2021, 7, 28), "Rent", 2000.00);
            history.addPurchase(LocalDate.of(2022, 4, 18), "Takeout food", 196.31);
            history.addPurchase(LocalDate.of(2021, 11, 23), "New running shoes", 72.10);
            history.addPurchase(LocalDate.of(2021, 9, 19), "Life insurance", 110.00);
            history.addPurchase(LocalDate.of(2020, 9, 30), "Pet insurance", 44.99);
            history.addPurchase(LocalDate.of(2020, 8, 22), "Church charitable gift", 100.00);
            history.addPurchase(LocalDate.of(2021, 12, 19), "Christmas tree", 64.00);
            history.addPurchase(LocalDate.of(2021, 12, 31), "Champagne", 1358.44);
            history.addPurchase(LocalDate.of(2019, 1, 19), "Movies", 36.12);
            history.addPurchase(LocalDate.of(2022, 2, 1), "boba", 4.95);
            history.addPurchase(LocalDate.of(2022, 2, 1), "boba", 8.95);

            assertEquals(70.28, history.getPurchaseTotalInAmountRange(1, 20), EPSILON);
            assertEquals(493.91, history.getPurchaseTotalInAmountRange(20, 100), EPSILON);
            assertEquals(4007.75, history.getPurchaseTotalInAmountRange(100, 2000), EPSILON);
            assertEquals(0, history.getPurchaseTotalInAmountRange(2000.01, 100000), EPSILON);
            assertEquals(36.12, history.getPurchaseTotalInAmountRange(36.12, 36.12), EPSILON);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem4_5_TestCase_10\n" + e);
            score -= problem4_5Points;
        }
    }
    //problem6
    @Test
    void problem6_TestCase_1() throws IOException {
        try {
            FirstLetterMap map = new FirstLetterMap("res/firstLetter1.txt");
            assertEquals(
                    "{a=[a, across, actually, alice, and, at], b=[before], e=[either], f=[feet, flashed, for], h=[had, her, hurried], i=[it, its], l=[looked], m=[mind], n=[never], o=[of, on, or, out], r=[rabbit], s=[seen, she, started], t=[take, that, the, then, to, took], w=[waistcoatpocket, watch, when, with]}",
                    map.toString());

            Set<String> expected = new TreeSet<>();
            expected.add("had");
            expected.add("her");
            expected.add("hurried");
            assertEquals(expected, map.getWordsThatStartWith('h'));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem6_TestCase_1\n" + e);
            score -= problem6Points;
        }
    }
    @Test
    void problem6_TestCase_2() throws IOException {
        try {
            FirstLetterMap map = new FirstLetterMap("res/firstLetter1.txt");
            assertEquals(
                    "{a=[a, across, actually, alice, and, at], b=[before], e=[either], f=[feet, flashed, for], h=[had, her, hurried], i=[it, its], l=[looked], m=[mind], n=[never], o=[of, on, or, out], r=[rabbit], s=[seen, she, started], t=[take, that, the, then, to, took], w=[waistcoatpocket, watch, when, with]}",
                    map.toString());

            Set<String> expected = new TreeSet<>();
            expected.add("either");
            assertEquals(expected, map.getWordsThatStartWith('e'));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem6_TestCase_2\n" + e);
            score -= problem6Points;
        }
    }
    @Test
    void problem6_TestCase_3() throws IOException {
        try {
            FirstLetterMap map = new FirstLetterMap("res/firstLetter1.txt");
            assertEquals(
                    "{a=[a, across, actually, alice, and, at], b=[before], e=[either], f=[feet, flashed, for], h=[had, her, hurried], i=[it, its], l=[looked], m=[mind], n=[never], o=[of, on, or, out], r=[rabbit], s=[seen, she, started], t=[take, that, the, then, to, took], w=[waistcoatpocket, watch, when, with]}",
                    map.toString());

            Set<String> expected = new TreeSet<>();
            expected.add("before");
            assertEquals(expected, map.getWordsThatStartWith('b'));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem6_TestCase_3\n" + e);
            score -= problem6Points;
        }
    }
    @Test
    void problem6_TestCase_4() throws IOException {
        try {
            FirstLetterMap map = new FirstLetterMap("res/firstLetter1.txt");
            assertEquals(
                    "{a=[a, across, actually, alice, and, at], b=[before], e=[either], f=[feet, flashed, for], h=[had, her, hurried], i=[it, its], l=[looked], m=[mind], n=[never], o=[of, on, or, out], r=[rabbit], s=[seen, she, started], t=[take, that, the, then, to, took]}",
                    map.toString());
            assertEquals(null, map.getWordsThatStartWith('c'));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem6_TestCase_4\n" + e);
            score -= problem6Points;
        }
    }
    @Test
    void problem6_TestCase_5() throws IOException {
        try {
            FirstLetterMap map = new FirstLetterMap("res/firstLetter1.txt");
            assertEquals(
                    "{a=[a, across, actually, alice, and, at], b=[before], e=[either], f=[feet, flashed, for], h=[had, her, hurried], i=[it, its], l=[looked], m=[mind], n=[never], o=[of, on, or, out], r=[rabbit], s=[seen, she, started], t=[take, that, the, then, to, took], w=[waistcoatpocket, watch, when, with]}",
                    map.toString());
            Set<String> expected = new TreeSet<>();
            expected.add("feet");
            expected.add("flashed");
            expected.add("for");
            assertEquals(expected, map.getWordsThatStartWith('f'));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem6_TestCase_5\n" + e);
            score -= problem6Points;
        }
    }
    @Test
    void problem6_TestCase_6() throws IOException {
        try {
            FirstLetterMap map = new FirstLetterMap("res/firstLetter1.txt");
            assertEquals(
                    "{a=[a, across, again, around, and], b=[before], e=[either], o=[or, odd], h=[had, husband, his], i=[it, its]}",
                    map.toString());
            Set<String> expected = new TreeSet<>();
            expected.add("a");
            expected.add("across");
            expected.add("again");
            expected.add("around");
            expected.add("and");
            assertEquals(expected, map.getWordsThatStartWith('a'));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem6_TestCase_6\n" + e);
            score -= problem6Points;
        }
    }
    @Test
    void problem6_TestCase_7() throws IOException {
        try {
            FirstLetterMap map = new FirstLetterMap("res/firstLetter2.txt");
            assertEquals(
                    "{b=[better, bad, behind], c=[cross, cow], d=[died], g=[grass, grow], n=[near, its]}",
                    map.toString());
            Set<String> expected = new TreeSet<>();
            expected.add("cross");
            expected.add("cow");
            assertEquals(expected, map.getWordsThatStartWith('c'));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem6_TestCase_7\n" + e);
            score -= problem6Points;
        }
    }
    @Test
    void problem6_TestCase_8() throws IOException {
        try {
            FirstLetterMap map = new FirstLetterMap("res/firstLetter2.txt");
            assertEquals(
                    "{b=[better, bad, behind], c=[cross, cow], d=[died, do], g=[grass, grow], n=[near, never]}",
                    map.toString());
            Set<String> expected = new TreeSet<>();
            expected.add("died");
            expected.add("do");
            assertEquals(expected, map.getWordsThatStartWith('d'));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem6_TestCase_8\n" + e);
            score -= problem6Points;
        }
    }
    @Test
    void problem6_TestCase_9() throws IOException {
        try {
            FirstLetterMap map = new FirstLetterMap("res/firstLetter2.txt");
            assertEquals(
                    "{b=[better, bad, behind], c=[cross, cow], d=[died, do], g=[grass, grow], n=[near, never]}",
                    map.toString());
            Set<String> expected = new TreeSet<>();
            expected.add("near");
            expected.add("never");
            assertEquals(expected, map.getWordsThatStartWith('n'));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem6_TestCase_9\n" + e);
            score -= problem6Points;
        }
    }
    @Test
    void problem6_TestCase_10() throws IOException {
        try {
            String nonExistentFileName = "res/firstLetterDoesNotExist.txt";
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            System.setOut(new PrintStream(output));
            FirstLetterMap map = new FirstLetterMap(nonExistentFileName);
            String result = output.toString();
            assertEquals("File: " + nonExistentFileName + " not found", result);
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem6_TestCase_10\n" + e);
            score -= problem6Points;
        }
    }
    //problem7
    @Test
    void problem7_TestCase_1() throws IOException {
        try {
            ShippingCenter center = new ShippingCenter();
            assertEquals("", center.getShippingStack());
            assertEquals("", center.getTemporaryStack());

        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem7_TestCase_1\n" + e);
            score -= problem7Points;
        }
    }

    @Test
    void problem7_TestCase_2() throws IOException {
        try {
            ShippingCenter center = new ShippingCenter();
            List<String> expected = Arrays.asList(
                    "Shipping stack: product 1",
                    "Temporary stack: ");
            assertEquals(expected, center.add("product 1"));
            expected = Arrays.asList(
                    "Shipping stack: product 1, product 2",
                    "Temporary stack: ");
            assertEquals(expected, center.add("product 2"));
            expected = Arrays.asList(
                    "Shipping stack: product 1, product 2, product 3",
                    "Temporary stack: ");
            assertEquals(expected, center.add("product 3"));
            expected = Arrays.asList("That product is already on the shipping stack.");
            assertEquals(expected, center.add("product 3"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem7_TestCase_2\n" + e);
            score -= problem7Points;
        }
    }

    @Test
    void problem7_TestCase_3() throws IOException {
        try {
            ShippingCenter center = new ShippingCenter();
            List<String> expected = Arrays.asList(
                    "Shipping stack: product 1",
                    "Temporary stack: ");
            assertEquals(expected, center.add("product 1"));

            expected = Arrays.asList(
                    "Shipping stack: product 1, product 2",
                    "Temporary stack: ");
            assertEquals(expected, center.add("product 2"));

            expected = Arrays.asList(
                    "Shipping stack: product 1, product 2, product 3",
                    "Temporary stack: ");
            assertEquals(expected, center.add("product 3"));
            expected = Arrays.asList(
                    "Shipping stack: product 1, product 2, product 3, product 4",
                    "Temporary stack: ");
            assertEquals(expected, center.add("product 4"));

            expected = Arrays.asList(
                    "Shipping stack: product 1, product 2, product 3",
                    "Temporary stack: product 4",
                    "Shipping stack: product 1, product 2",
                    "Temporary stack: product 4, product 3",
                    "Shipping stack: product 1, product 3",
                    "Temporary stack: product 4",
                    "Shipping stack: product 1, product 3, product 4",
                    "Temporary stack: "
            );
            assertEquals(expected, center.ship("product 2"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem7_TestCase_3\n" + e);
            score -= problem7Points;
        }
    }
    @Test
    void problem7_TestCase_4() throws IOException {
        try {
            ShippingCenter center = new ShippingCenter();
            List<String> expected = Arrays.asList(
                    "Shipping stack: product 1",
                    "Temporary stack: ");
            assertEquals(expected, center.add("product 1"));
            expected = Arrays.asList(
                    "Shipping stack: product 1, product 2",
                    "Temporary stack: ");
            assertEquals(expected, center.add("product 2"));
            expected = Arrays.asList(
                    "Shipping stack: product 1, product 2, product 3",
                    "Temporary stack: ");
            assertEquals(expected, center.add("product 3"));
            expected = Arrays.asList("That product is not on the shipping stack.");
            assertEquals(expected, center.ship("product 7"));
            assertEquals(expected, center.ship("product 99"));

        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem7_TestCase_4\n" + e);
            score -= problem7Points;
        }
    }
    @Test
    void problem7_TestCase_5() throws IOException {
        try {
            ShippingCenter center = new ShippingCenter();
            List<String> expected = Arrays.asList(
                    "Shipping stack: product 1",
                    "Temporary stack: ");
            assertEquals(expected, center.add("product 1"));
            expected = Arrays.asList(
                    "Shipping stack: product 1, product 3",
                    "Temporary stack: ");
            assertEquals(expected, center.add("product 3"));
            expected = Arrays.asList(
                    "Shipping stack: product 1, product 3, product 5",
                    "Temporary stack: ");
            assertEquals(expected, center.add("product 5"));
            expected = Arrays.asList(
                    "Shipping stack: product 1, product 3, product 5, product 6",
                    "Temporary stack: "
            );
            assertEquals(expected, center.add("product 6"));
            expected = Arrays.asList(
                    "Shipping stack: product 1, product 3, product 5",
                    "Temporary stack: product 6",
                    "Shipping stack: product 1, product 3",
                    "Temporary stack: product 6, product 5",
                    "Shipping stack: product 1",
                    "Temporary stack: product 6, product 5, product 3",
                    "Shipping stack: product 3",
                    "Temporary stack: product 6, product 5",
                    "Shipping stack: product 3, product 5",
                    "Temporary stack: product 6",
                    "Shipping stack: product 3, product 5, product 6",
                    "Temporary stack: "
            );
            assertEquals(expected, center.ship("product 1"));

        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem7_TestCase_5\n" + e);
            score -= problem7Points;
        }
    }
    @Test
    void problem7_TestCase_6() throws IOException {
        try {
            ShippingCenter center = new ShippingCenter();
            List<String> expected = Arrays.asList(
                    "Shipping stack: product 1",
                    "Temporary stack: ");
            assertEquals(expected, center.add("product 1"));
            expected = Arrays.asList(
                    "Shipping stack: product 1, product 2",
                    "Temporary stack: ");
            assertEquals(expected, center.add("product 2"));
            expected = Arrays.asList(
                    "Shipping stack: product 1, product 2, product 4",
                    "Temporary stack: ");
            assertEquals(expected, center.add("product 4"));

            expected = Arrays.asList(
                    "Shipping stack: product 1, product 2",
                    "Temporary stack: product 4",
                    "Shipping stack: product 1",
                    "Temporary stack: product 4, product 2",
                    "Shipping stack: product 2",
                    "Temporary stack: product 4",
                    "Shipping stack: product 2, product 4",
                    "Temporary stack: "
            );
            assertEquals(expected, center.ship("product 2"));
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem7_TestCase_6\n" + e);
            score -= problem7Points;
        }
    }
    @Test
    void problem7_TestCase_7() throws IOException {
        try {
            ShippingCenter center = new ShippingCenter();
            List<String> expected = Arrays.asList(
                    "Shipping stack: product 1",
                    "Temporary stack: ");
            assertEquals(expected, center.add("product 1"));
            expected = Arrays.asList(
                    "Shipping stack: product 1, product 2",
                    "Temporary stack: ");
            assertEquals(expected, center.add("product 2"));
            expected = Arrays.asList(
                    "Shipping stack: product 1, product 2, product 3",
                    "Temporary stack: ");
            assertEquals(expected, center.add("product 3"));
            expected = Arrays.asList(
                    "Shipping stack: product 1, product 2",
                    "Temporary stack: product 3",
                    "Shipping stack: product 1, product 2",
                    "Temporary stack: "
            );
            assertEquals(expected, center.ship("product 3"));

        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem7_TestCase_7\n" + e);
            score -= problem7Points;
        }
    }

    @Test
    void problem7_TestCase_8() throws IOException {
        try {
            ShippingCenter center = new ShippingCenter();
            List<String> expected = Arrays.asList(
                    "Shipping stack: product 1",
                    "Temporary stack: ");
            assertEquals(expected, center.add("product 1"));
            expected = Arrays.asList(
                    "Shipping stack: product 1, product 2",
                    "Temporary stack: ");
            assertEquals(expected, center.add("product 2"));
            expected = Arrays.asList(
                    "Shipping stack: product 1, product 2, product 3",
                    "Temporary stack: ");
            assertEquals(expected, center.add("product 3"));
            expected = Arrays.asList(
                    "Shipping stack: product 1, product 2, product 3, product 4",
                    "Temporary stack: ");
            assertEquals(expected, center.add("product 4"));
            expected = Arrays.asList(
                    "Shipping stack: product 1, product 2, product 3",
                    "Temporary stack: product 4",
                    "Shipping stack: product 1, product 2",
                    "Temporary stack: product 4, product 3",
                    "Shipping stack: product 1",
                    "Temporary stack: product 4, product 3, product 2",
                    "Shipping stack: product 2",
                    "Temporary stack: product 4, product 3",
                    "Shipping stack: product 2, product 3",
                    "Temporary stack: product 4",
                    "Shipping stack: product 2, product 3, product 4",
                    "Temporary stack: "
            );
            assertEquals(expected, center.ship("product 1"));

        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem7_TestCase_8\n" + e);
            score -= problem7Points;
        }
    }

    @Test
    void problem7_TestCase_9() throws IOException {
        try {
            ShippingCenter center = new ShippingCenter();
            List<String> expected = Arrays.asList(
                    "Shipping stack: product 1",
                    "Temporary stack: ");
            assertEquals(expected, center.add("product 1"));
            expected = Arrays.asList(
                    "Shipping stack: product 1, product 3",
                    "Temporary stack: ");
            assertEquals(expected, center.add("product 3"));
            expected = Arrays.asList(
                    "Shipping stack: product 1, product 3, product 4",
                    "Temporary stack: ");
            assertEquals(expected, center.add("product 4"));
            expected = Arrays.asList(
                    "Shipping stack: product 1, product 3",
                    "Temporary stack: "
            );
            assertEquals(expected, center.ship("product 4"));

        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem7_TestCase_9\n" + e);
            score -= problem7Points;
        }
    }

    @Test
    void problem7_TestCase_10() throws IOException {
        try {
            ShippingCenter center = new ShippingCenter();
            List<String> expected = Arrays.asList(
                    "Shipping stack: product 5",
                    "Temporary stack: ");
            assertEquals(expected, center.add("product 5"));
            expected = Arrays.asList(
                    "Shipping stack: product 5, product 3",
                    "Temporary stack: ");
            assertEquals(expected, center.add("product 3"));
            expected = Arrays.asList(
                    "Shipping stack: product 5, product 3, product 2",
                    "Temporary stack: ");
            assertEquals(expected, center.add("product 2"));
            expected = Arrays.asList(
                    "Shipping stack: product 5, product 3",
                    "Temporary stack: "
            );
            assertEquals(expected, center.ship("product 2"));

        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem7_TestCase_10\n" + e);
            score -= problem7Points;
        }
    }

    //problem8
    @Test
    void problem8_TestCase_1() throws IOException {
        try {
            ProductionLine pl = new ProductionLine();
            assertEquals("", pl.handleNextOrder());
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem8_TestCase_1\n" + e);
            score -= problem8Points;
        }
    }

    @Test
    void problem8_TestCase_2() throws IOException {
        try {
            ProductionLine pl = new ProductionLine();
            pl.addStandardOrder(101);
            pl.addStandardOrder(10);
            pl.addStandardOrder(66);
            pl.addStandardOrder(13);
            assertEquals("Producing standard order for customer 101", pl.handleNextOrder());
            assertEquals("Producing standard order for customer 10", pl.handleNextOrder());
            assertEquals("Producing standard order for customer 66", pl.handleNextOrder());
            assertEquals("Producing standard order for customer 13", pl.handleNextOrder());
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem8_TestCase_2\n" + e);
            score -= problem8Points;
        }
    }
    @Test
    void problem8_TestCase_3() throws IOException {
        try {
            ProductionLine pl = new ProductionLine();
            pl.addStandardOrder(12);
            pl.addStandardOrder(54);
            pl.addStandardOrder(71);
            pl.addRushOrder(18);
            pl.addStandardOrder(13);
            assertEquals("Producing rush order for customer 18", pl.handleNextOrder());
            assertEquals("Producing standard order for customer 12", pl.handleNextOrder());
            assertEquals("Producing standard order for customer 54", pl.handleNextOrder());
            assertEquals("Producing standard order for customer 71", pl.handleNextOrder());
            assertEquals("Producing standard order for customer 13", pl.handleNextOrder());
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem8_TestCase_3\n" + e);
            score -= problem8Points;
        }
    }

    @Test
    void problem8_TestCase_4() throws IOException {
        try {
            ProductionLine pl = new ProductionLine();
            pl.addRushOrder(18);
            pl.addRushOrder(77);
            pl.addRushOrder(103);
            pl.addRushOrder(55);
            assertEquals("Producing rush order for customer 18", pl.handleNextOrder());
            assertEquals("Producing rush order for customer 77", pl.handleNextOrder());
            assertEquals("Producing rush order for customer 103", pl.handleNextOrder());
            assertEquals("Producing rush order for customer 55", pl.handleNextOrder());
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem8_TestCase_4\n" + e);
            score -= problem8Points;
        }
    }
    @Test
    void problem8_TestCase_5() throws IOException {
        try {
            ProductionLine pl = new ProductionLine();
            pl.addRushOrder(18);
            pl.addStandardOrder(12);
            pl.addStandardOrder(54);
            pl.addStandardOrder(71);
            pl.addStandardOrder(13);
            assertEquals("Producing rush order for customer 18", pl.handleNextOrder());
            assertEquals("Producing standard order for customer 12", pl.handleNextOrder());
            assertEquals("Producing standard order for customer 54", pl.handleNextOrder());
            assertEquals("Producing standard order for customer 71", pl.handleNextOrder());
            assertEquals("Producing standard order for customer 13", pl.handleNextOrder());
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem8_TestCase_5\n" + e);
            score -= problem8Points;
        }
    }
    @Test
    void problem8_TestCase_6() throws IOException {
        try {
            ProductionLine pl = new ProductionLine();
            pl.addStandardOrder(12);
            pl.addStandardOrder(54);
            pl.addStandardOrder(71);
            pl.addStandardOrder(13);
            assertEquals("Producing standard order for customer 12", pl.handleNextOrder());
            assertEquals("Producing standard order for customer 54", pl.handleNextOrder());
            pl.addRushOrder(18);
            pl.addRushOrder(33);
            assertEquals("Producing rush order for customer 18", pl.handleNextOrder());
            assertEquals("Producing rush order for customer 33", pl.handleNextOrder());
            assertEquals("Producing standard order for customer 71", pl.handleNextOrder());
            assertEquals("Producing standard order for customer 13", pl.handleNextOrder());
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem8_TestCase_6\n" + e);
            score -= problem8Points;
        }
    }

    @Test
    void problem8_TestCase_7() throws IOException {
        try {
            ProductionLine pl = new ProductionLine();
            pl.addStandardOrder(85);
            pl.addStandardOrder(54);
            pl.addStandardOrder(99);
            pl.addStandardOrder(222);
            pl.addRushOrder(18);
            assertEquals("Producing rush order for customer 18", pl.handleNextOrder());
            assertEquals("Producing standard order for customer 85", pl.handleNextOrder());
            assertEquals("Producing standard order for customer 54", pl.handleNextOrder());
            pl.addRushOrder(33);
            assertEquals("Producing rush order for customer 33", pl.handleNextOrder());
            assertEquals("Producing standard order for customer 99", pl.handleNextOrder());
            assertEquals("Producing standard order for customer 222", pl.handleNextOrder());
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem8_TestCase_7\n" + e);
            score -= problem8Points;
        }
    }
    @Test
    void problem8_TestCase_8() throws IOException {
        try {
            ProductionLine pl = new ProductionLine();
            pl.addStandardOrder(107);
            pl.addStandardOrder(44);
            pl.addStandardOrder(99);
            pl.addStandardOrder(222);
            assertEquals("Producing standard order for customer 107", pl.handleNextOrder());
            assertEquals("Producing standard order for customer 44", pl.handleNextOrder());
            assertEquals("Producing standard order for customer 99", pl.handleNextOrder());
            assertEquals("Producing standard order for customer 222", pl.handleNextOrder());
            pl.addRushOrder(33);
            assertEquals("Producing rush order for customer 33", pl.handleNextOrder());
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem8_TestCase_8\n" + e);
            score -= problem8Points;
        }
    }
    @Test
    void problem8_TestCase_9() throws IOException {
        try {
            ProductionLine pl = new ProductionLine();
            pl.addStandardOrder(20);
            pl.addStandardOrder(33);
            pl.addStandardOrder(99);
            pl.addStandardOrder(111);
            assertEquals("Producing standard order for customer 20", pl.handleNextOrder());
            assertEquals("Producing standard order for customer 33", pl.handleNextOrder());
            assertEquals("Producing standard order for customer 99", pl.handleNextOrder());
            assertEquals("Producing standard order for customer 111", pl.handleNextOrder());
            pl.addStandardOrder(76);
            pl.addRushOrder(15);
            assertEquals("Producing rush order for customer 15", pl.handleNextOrder());
            assertEquals("Producing standard order for customer 76", pl.handleNextOrder());
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem8_TestCase_9\n" + e);
            score -= problem8Points;
        }
    }
    @Test
    void problem8_TestCase_10() throws IOException {
        try {
            ProductionLine pl = new ProductionLine();
            pl.addStandardOrder(40);
            pl.addStandardOrder(33);
            pl.addStandardOrder(88);
            pl.addStandardOrder(111);
            assertEquals("Producing standard order for customer 40", pl.handleNextOrder());
            assertEquals("Producing standard order for customer 33", pl.handleNextOrder());
            assertEquals("Producing standard order for customer 88", pl.handleNextOrder());
            assertEquals("Producing standard order for customer 111", pl.handleNextOrder());
            pl.addStandardOrder(76);
            pl.addRushOrder(15);
            assertEquals("Producing rush order for customer 15", pl.handleNextOrder());
            assertEquals("Producing standard order for customer 76", pl.handleNextOrder());
            assertEquals("", pl.handleNextOrder());
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem8_TestCase_10\n" + e);
            score -= problem8Points;
        }
    }
    //problem9-10
    @Test
    void problem9_10_TestCase_1() throws IOException {
        try {
            SurvivalGame game = new SurvivalGame();
            assertEquals(0, game.getPlayer().getLocation().x);
            assertEquals(0, game.getPlayer().getLocation().y);
            assertEquals(100, game.getPlayer().getEnergy());
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem9_10_TestCase_1\n" + e);
            score -= problem9_10Points;
        }
    }

    @Test
    void problem9_10_TestCase_2() throws IOException {
        try {
            SurvivalGame game = new SurvivalGame();
            game.dropFood(new Point(3, 3), "granola bar", 2); // net energy: -2
            game.dropFood(new Point(-1, 1), "steak", 8); // net energy: 7
            game.dropFood(new Point(16, 6), "candy bar", 1); // net energy: -16
            game.dropFood(new Point(1, 0), "sandwich", 10); // net energy: 9
            game.dropFood(new Point(2, 0), "apple", 12); // net energy: 10
            game.dropFood(new Point(3, 4), "cake", 1); // net energy: -4

            Food f = game.getPlayer().getFood();
            assertEquals("apple at location 2, 0, energy value 12", f.toString());
            assertEquals("apple", f.getDescription());
            Point p = new Point(2, 0);
            assertEquals(p, f.getLocation());
            assertEquals(p, game.getPlayer().getLocation());
            assertEquals(110, game.getPlayer().getEnergy());

            f = game.getPlayer().getFood();
            assertEquals("sandwich at location 1, 0, energy value 10", f.toString());
            assertEquals("sandwich", f.getDescription());
            p = new Point(1, 0);
            assertEquals(p, f.getLocation());
            assertEquals(p, game.getPlayer().getLocation());
            assertEquals(119, game.getPlayer().getEnergy());

            f = game.getPlayer().getFood();
            assertEquals("steak at location -1, 1, energy value 8", f.toString());
            assertEquals("steak", f.getDescription());
            p = new Point(-1, 1);
            assertEquals(p, f.getLocation());
            assertEquals(p, game.getPlayer().getLocation());
            assertEquals(125, game.getPlayer().getEnergy());

            game.dropFood(new Point(15, 5), "pizza", 20); // net energy: 4

            f = game.getPlayer().getFood();
            assertEquals("pizza at location 15, 5, energy value 20", f.toString());
            assertEquals("pizza", f.getDescription());
            p = new Point(15, 5);
            assertEquals(p, f.getLocation());
            assertEquals(p, game.getPlayer().getLocation());
            assertEquals(129, game.getPlayer().getEnergy());

            f = game.getPlayer().getFood();
            assertEquals("candy bar at location 16, 6, energy value 1", f.toString());
            assertEquals("candy bar", f.getDescription());
            p = new Point(16, 6);
            assertEquals(p, f.getLocation());
            assertEquals(p, game.getPlayer().getLocation());
            assertEquals(129, game.getPlayer().getEnergy());

            f = game.getPlayer().getFood();
            assertEquals("granola bar at location 3, 3, energy value 2", f.toString());
            assertEquals("granola bar", f.getDescription());
            p = new Point(3, 3);
            assertEquals(p, f.getLocation());
            assertEquals(p, game.getPlayer().getLocation());
            assertEquals(118, game.getPlayer().getEnergy());

            assertNull(game.getPlayer().getFood());
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem9_10_TestCase_2\n" + e);
            score -= problem9_10Points;
        }
    }

    @Test
    void problem9_10_TestCase_3() throws IOException {
        try {
            SurvivalGame game = new SurvivalGame();
            game.dropFood(new Point(4, 3), "spaghetti", 2); // net energy:
            game.dropFood(new Point(2, 2), "noodles", 8); // net energy:
            game.dropFood(new Point(7, 1), "candy bar", 10); // net energy:
            game.dropFood(new Point(1, 0), "sandwich", 10); // net energy:

            Food f = game.getPlayer().getFood();
            assertEquals("sandwich at location 1, 0, energy value 10", f.toString());
            assertEquals("sandwich", f.getDescription());
            Point p = new Point(1, 0);
            assertEquals(p, f.getLocation());
            assertEquals(p, game.getPlayer().getLocation());
            assertEquals(109, game.getPlayer().getEnergy());

            f = game.getPlayer().getFood();
            assertEquals("noodles at location 2, 2, energy value 8", f.toString());
            assertEquals("noodles", f.getDescription());
            p = new Point(2, 2);
            assertEquals(p, f.getLocation());
            assertEquals(p, game.getPlayer().getLocation());
            assertEquals(115, game.getPlayer().getEnergy());

            f = game.getPlayer().getFood();
            assertEquals("candy bar at location 7, 1, energy value 10", f.toString());
            assertEquals("candy bar", f.getDescription());
            p = new Point(7, 1);
            assertEquals(p, f.getLocation());
            assertEquals(p, game.getPlayer().getLocation());
            assertEquals(120, game.getPlayer().getEnergy());

            f = game.getPlayer().getFood();
            assertEquals("spaghetti at location 4, 3, energy value 2", f.toString());
            assertEquals("spaghetti", f.getDescription());
            p = new Point(4, 3);
            assertEquals(p, f.getLocation());
            assertEquals(p, game.getPlayer().getLocation());
            assertEquals(118, game.getPlayer().getEnergy());

            assertNull(game.getPlayer().getFood());

        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem9_10_TestCase_3\n" + e);
            score -= problem9_10Points;
        }
    }

    @Test
    void problem9_10_TestCase_4() throws IOException {
        try {
            SurvivalGame game = new SurvivalGame();
            game.dropFood(new Point(-3, 3), "spaghetti", 2); // net energy:
            game.dropFood(new Point(-2, 2), "noodles", 2); // net energy: 5

            Food f = game.getPlayer().getFood();
            assertEquals("noodles at location -2, 2, energy value 2", f.toString());
            assertEquals("noodles", f.getDescription());
            Point p = new Point(-2, 2);
            assertEquals(p, f.getLocation());
            assertEquals(p, game.getPlayer().getLocation());
            assertEquals(100, game.getPlayer().getEnergy());

            f = game.getPlayer().getFood();
            assertEquals("spaghetti at location -3, 3, energy value 2", f.toString());
            assertEquals("spaghetti", f.getDescription());
            p = new Point(-3, 3);
            assertEquals(p, f.getLocation());
            assertEquals(p, game.getPlayer().getLocation());
            assertEquals(101, game.getPlayer().getEnergy());

            assertNull(game.getPlayer().getFood());

        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem9_10_TestCase_4\n" + e);
            score -= problem9_10Points;
        }
    }

    @Test
    void problem9_10_TestCase_5() throws IOException {
        try {
            SurvivalGame game = new SurvivalGame();
            game.dropFood(new Point(7, 1), "candy bar", 15); // net energy: -
            game.dropFood(new Point(8, -5), "sandwich", 10); // net energy:

            Food f = game.getPlayer().getFood();
            assertEquals("candy bar at location 7, 1, energy value 15", f.toString());
            assertEquals("candy bar", f.getDescription());
            Point p = new Point(7, 1);
            assertEquals(p, f.getLocation());
            assertEquals(p, game.getPlayer().getLocation());
            assertEquals(108, game.getPlayer().getEnergy());

            f = game.getPlayer().getFood();
            assertEquals("sandwich at location 8, -5, energy value 10", f.toString());
            assertEquals("sandwich", f.getDescription());
            p = new Point(8, -5);
            assertEquals(p, f.getLocation());
            assertEquals(p, game.getPlayer().getLocation());
            assertEquals(112, game.getPlayer().getEnergy());

            assertNull(game.getPlayer().getFood());

        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem9_10_TestCase_5\n" + e);
            score -= problem9_10Points;
        }
    }

    @Test
    void problem9_10_TestCase_6() throws IOException {
        try {
            SurvivalGame game = new SurvivalGame();
            game.dropFood(new Point(1, 1), "candy bar", 8); // net energy: 7
            game.dropFood(new Point(2, -1), "sandwich", 10); // net energy: 8
            game.dropFood(new Point(3, 0), "milk", 5); // net energy: 2
            game.dropFood(new Point(5, -1), "cake", 3); // net energy: -3

            Food f = game.getPlayer().getFood();
            assertEquals("sandwich at location 2, -1, energy value 10", f.toString());
            assertEquals("sandwich", f.getDescription());
            Point p = new Point(2, -1);
            assertEquals(p, f.getLocation());
            assertEquals(p, game.getPlayer().getLocation());
            assertEquals(108, game.getPlayer().getEnergy());

            f = game.getPlayer().getFood();
            assertEquals("candy bar at location 1, 1, energy value 8", f.toString());
            assertEquals("candy bar", f.getDescription());
            p = new Point(1, 1);
            assertEquals(p, f.getLocation());
            assertEquals(p, game.getPlayer().getLocation());
            assertEquals(114, game.getPlayer().getEnergy());

            f = game.getPlayer().getFood();
            assertEquals("milk at location 3, 0, energy value 5", f.toString());
            assertEquals("milk", f.getDescription());
            p = new Point(3, 0);
            assertEquals(p, f.getLocation());
            assertEquals(p, game.getPlayer().getLocation());
            assertEquals(117, game.getPlayer().getEnergy());

            f = game.getPlayer().getFood();
            assertEquals("cake at location 5, -1, energy value 5", f.toString());
            assertEquals("cake", f.getDescription());
            p = new Point(5, -1);
            assertEquals(p, f.getLocation());
            assertEquals(p, game.getPlayer().getLocation());
            assertEquals(118, game.getPlayer().getEnergy());

            assertNull(game.getPlayer().getFood());

        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem9_10_TestCase_6\n" + e);
            score -= problem9_10Points;
        }
    }


    @Test
    void problem9_10_TestCase_7() throws IOException {
        try {

            SurvivalGame game = new SurvivalGame();

            game.dropFood(new Point(2, 0), "candy bar", 15); // net energy: -
            game.dropFood(new Point(2, 3), "sandwich", 10); // net energy:

            Food f = game.getPlayer().getFood();
            assertEquals("candy bar at location 2, 2, energy value 15", f.toString());
            assertEquals("candy bar", f.getDescription());
            Point p = new Point(2, 0);
            assertEquals(p, f.getLocation());
            assertEquals(p, game.getPlayer().getLocation());
            assertEquals(113, game.getPlayer().getEnergy());

            game.dropFood(new Point(15, 5), "pizza", 14);

            f = game.getPlayer().getFood();
            assertEquals("sandwich at location 2, 3, energy value 10", f.toString());
            assertEquals("sandwich", f.getDescription());
            p = new Point(2, 3);
            assertEquals(p, f.getLocation());
            assertEquals(p, game.getPlayer().getLocation());
            assertEquals(120, game.getPlayer().getEnergy());

            f = game.getPlayer().getFood();
            assertEquals("pizza at location 15, 5, energy value 14", f.toString());
            assertEquals("pizza", f.getDescription());
            p = new Point(15, 5);
            assertEquals(p, f.getLocation());
            assertEquals(p, game.getPlayer().getLocation());
            assertEquals(121, game.getPlayer().getEnergy());

            assertNull(game.getPlayer().getFood());

        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem9_10_TestCase_7\n" + e);
            score -= problem9_10Points;
        }
    }

    @Test
    void problem9_10_TestCase_8() throws IOException {
        try {
            SurvivalGame game = new SurvivalGame();
            game.dropFood(new Point(2, 0), "candy bar", 15); // net energy: -
            game.dropFood(new Point(2, 3), "sandwich", 10); // net energy:

            Food f = game.getPlayer().getFood();
            assertEquals("candy bar at location 2, 2, energy value 15", f.toString());
            assertEquals("candy bar", f.getDescription());
            Point p = new Point(2, 0);
            assertEquals(p, f.getLocation());
            assertEquals(p, game.getPlayer().getLocation());
            assertEquals(113, game.getPlayer().getEnergy());

            game.dropFood(new Point(2, 1), "pizza", 14);
            f = game.getPlayer().getFood();
            assertEquals("pizza at location 2, 1, energy value 14", f.toString());
            assertEquals("pizza", f.getDescription());
            p = new Point(2, 1);
            assertEquals(p, f.getLocation());
            assertEquals(p, game.getPlayer().getLocation());
            assertEquals(126, game.getPlayer().getEnergy());

            f = game.getPlayer().getFood();
            assertEquals("sandwich at location 2, 3, energy value 10", f.toString());
            assertEquals("sandwich", f.getDescription());
            p = new Point(2, 3);
            assertEquals(p, f.getLocation());
            assertEquals(p, game.getPlayer().getLocation());
            assertEquals(134, game.getPlayer().getEnergy());

            assertNull(game.getPlayer().getFood());


        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem9_10_TestCase_8\n" + e);
            score -= problem9_10Points;
        }
    }

    @Test
    void problem9_10_TestCase_9() throws IOException {
        try {
            SurvivalGame game = new SurvivalGame();
            game.dropFood(new Point(2, 0), "candy bar", 15); // net energy: -
            game.dropFood(new Point(2, 3), "sandwich", 10); // net energy:

            Food f = game.getPlayer().getFood();
            assertEquals("candy bar at location 2, 2, energy value 15", f.toString());
            assertEquals("candy bar", f.getDescription());
            Point p = new Point(2, 0);
            assertEquals(p, f.getLocation());
            assertEquals(p, game.getPlayer().getLocation());
            assertEquals(113, game.getPlayer().getEnergy());

            game.dropFood(new Point(4, 2), "pizza", 14);
            game.dropFood(new Point(2, 1), "milk", 12);

            f = game.getPlayer().getFood();
            assertEquals("milk at location 2, 1, energy value 12", f.toString());
            assertEquals("milk", f.getDescription());
            p = new Point(2, 1);
            assertEquals(p, f.getLocation());
            assertEquals(p, game.getPlayer().getLocation());
            assertEquals(124, game.getPlayer().getEnergy());

            f = game.getPlayer().getFood();
            assertEquals("pizza at location 4, 2, energy value 14", f.toString());
            assertEquals("pizza", f.getDescription());
            p = new Point(4, 2);
            assertEquals(p, f.getLocation());
            assertEquals(p, game.getPlayer().getLocation());
            assertEquals(136, game.getPlayer().getEnergy());

            f = game.getPlayer().getFood();
            assertEquals("sandwich at location 2, 3, energy value 10", f.toString());
            assertEquals("sandwich", f.getDescription());
            p = new Point(2, 3);
            assertEquals(p, f.getLocation());
            assertEquals(p, game.getPlayer().getLocation());
            assertEquals(144, game.getPlayer().getEnergy());

            assertNull(game.getPlayer().getFood());

        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem9_10_TestCase_9\n" + e);
            score -= problem9_10Points;
        }
    }

    @Test
    void problem9_10_TestCase_10() throws IOException {
        try {

            SurvivalGame game = new SurvivalGame();
            game.dropFood(new Point(2, 0), "candy bar", 15); // net energy: -
            game.dropFood(new Point(2, 4), "sandwich", 10); // net energy:

            Food f = game.getPlayer().getFood();
            assertEquals("candy bar at location 2, 2, energy value 15", f.toString());
            assertEquals("candy bar", f.getDescription());
            Point p = new Point(2, 0);
            assertEquals(p, f.getLocation());
            assertEquals(p, game.getPlayer().getLocation());
            assertEquals(113, game.getPlayer().getEnergy());

            game.dropFood(new Point(5, 6), "pizza", 5);

            f = game.getPlayer().getFood();
            assertEquals("sandwich at location 2, 4, energy value 10", f.toString());
            assertEquals("sandwich", f.getDescription());
            p = new Point(2, 4);
            assertEquals(p, f.getLocation());
            assertEquals(p, game.getPlayer().getLocation());
            assertEquals(119, game.getPlayer().getEnergy());

            f = game.getPlayer().getFood();
            assertEquals("pizza at location 5, 6, energy value 5", f.toString());
            assertEquals("pizza", f.getDescription());
            p = new Point(5, 6);
            assertEquals(p, f.getLocation());
            assertEquals(p, game.getPlayer().getLocation());
            assertEquals(120, game.getPlayer().getEnergy());
            assertNull(game.getPlayer().getFood());
        } catch (AssertionError | Exception e) {
            System.err.println("Error in problem9_10_TestCase_10\n" + e);
            score -= problem9_10Points;
        }
    }
    @AfterAll
    public static void printScore() {
        // Use Logger
        Logger log = Logger.getLogger(Lab7GraderTest.class.getName());
        log.info("total_score: " + score);

    }

}