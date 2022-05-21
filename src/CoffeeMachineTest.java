import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class CoffeeMachineTest {

    @Test
    public void integrationsTest() {
        CoffeeMachine cmTest = new CoffeeMachine();

        //test case to test GetIngredient() that calls all main get...() functions together.
        assertEquals("Available French Coffee Power(Gram) 0.0\nAvailable Coffee Power(Gram) 0.0\nAvailable Milk(Liter) 0.0\nAvailable Water(Liter) 0.0", cmTest.GetIngredient());

        //test case to test SetIngredient() that calls all main set...() functions together.
        assertEquals("Filling Completed.", cmTest.SetIngredient());

        //test case to test GetIngredient() that calls all main get...() functions together with different values.
        assertEquals("Available French Coffee Power(Gram) 500.0\nAvailable Coffee Power(Gram) 500.0\nAvailable Milk(Liter) 3.0\nAvailable Water(Liter) 1.0", cmTest.GetIngredient());

        //test case to test CleanMachine() that calls all main set...() functions together with different values.
        assertEquals("Cleaning Completed.", cmTest.CleanMachine());

    }

}