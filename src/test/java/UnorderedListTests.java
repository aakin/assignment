import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.junit4.DisplayName;
import org.assessment.UnorderedList;
import org.junit.Assert;
import org.junit.Test;

@Epic("Assessment")
@Feature("Question 2")
public class UnorderedListTests {

    @Test
    @DisplayName("Shows the array that contains number 2")
    public void getArrayWithNumberTwo() {

        int number = 2;
        String numbers1 = "[1, 2, 3, 4]";
        String expectedArray = numbers1;
        String arrayResult = UnorderedList.getArrayContainingNumber(number).toString();
        Assert.assertEquals(expectedArray, arrayResult);
    }

    @Test
    @DisplayName("Shows the array that contains number 7")
    public void getArrayWithNumberSeven() {

        int number = 7;
        String numbers2 = "[5, 6, 7, 8]";
        String expectedArray = numbers2;
        String arrayResult = UnorderedList.getArrayContainingNumber(number).toString();
        Assert.assertEquals(expectedArray, arrayResult);
    }

    @Test
    @DisplayName("Number that doesn't exist in the array shouldn't return an array")
    public void getArrayWithNumberThatDoesntExists() {

        int number = 9;
        String expectedArray = "Number "+ number +" doesn't exist in the arrays.";
        String arrayResult = UnorderedList.getArrayContainingNumber(number).toString();
        Assert.assertEquals(expectedArray, arrayResult);
    }
}
