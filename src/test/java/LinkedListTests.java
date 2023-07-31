import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.junit4.DisplayName;
import org.assessment.LinkedList;
import org.junit.Assert;
import org.junit.Test;

@Epic("Assessment")
@Feature("Question 1")
public class LinkedListTests {

    @Test
    @DisplayName("Verify that it should return the middle number of numbers until 5")
    public void getMiddleUntilFive() {

        LinkedList linkedListTests = new LinkedList();
        for (int i = 5; i >= 1; i--) {
            linkedListTests.pushNode(i);
        }

        int expectedValueOfLL = 3;
        int middleValueOfLL = linkedListTests.getMiddle();
        Assert.assertEquals(expectedValueOfLL, middleValueOfLL);
    }

    @Test
    @DisplayName("Different method: Verify that it should return the middle number of numbers until 5")
    public void getMiddleUntilFiveOnce() {

        LinkedList linkedListTests = new LinkedList();
        for (int i = 5; i >= 1; i--) {
            linkedListTests.pushNode(i);
        }

        int expectedValueOfLL = 3;
        int middleValueOfLL = linkedListTests.middleSingle();
        Assert.assertEquals(expectedValueOfLL, middleValueOfLL);
    }

    @Test
    @DisplayName("Shows the middle number of numbers until 3")
    public void getMiddleUntilThree() {

        LinkedList linkedListTests = new LinkedList();
        for (int i = 3; i >= 1; i--) {
            linkedListTests.pushNode(i);
        }

        int expectedValueOfLL = 2;
        int middleValueOfLL = linkedListTests.getMiddle();
        Assert.assertEquals(expectedValueOfLL, middleValueOfLL);
    }

    @Test
    @DisplayName("Deletes the middle number 3 and asserts that the middle number is 4 for numbers until 5")
    public void deleteMiddleUntilFive() {

        LinkedList linkedListTests = new LinkedList();
        for (int i = 5; i >= 1; i--) {
            linkedListTests.pushNode(i);
        }

        linkedListTests.deleteMiddleNode();

        int expectedValueOfLL = 4;
        int middleValueOfLL = linkedListTests.getMiddle();
        Assert.assertEquals(expectedValueOfLL, middleValueOfLL);
    }

    @Test
    @DisplayName("Deletes the middle number 3 and asserts that the middle number is 2 for numbers until 4")
    public void deleteMiddleUntil4() {

        LinkedList linkedListTests = new LinkedList();
        for (int i = 4; i >= 1; i--) {
            linkedListTests.pushNode(i);
        }

        linkedListTests.deleteMiddleNode();

        int expectedValueOfLL = 2;
        int middleValueOfLL = linkedListTests.getMiddle();
        Assert.assertEquals(expectedValueOfLL, middleValueOfLL);
    }
}
