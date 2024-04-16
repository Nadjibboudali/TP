import org.example.Calculatrice;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
@RunWith(MockitoJUnitRunner.class)
public class CalculatriceTest {
    @Mock
    private Calculatrice calculatrice;
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        calculatrice=mock(Calculatrice.class);
    }

    @Test
    public void test_additionner() {

        when(calculatrice.additionner(7, 6)).thenReturn(13);


        int result=calculatrice.additionner(7,6);


       assertEquals(13, result);



        verify(calculatrice,never()).additionner(7, 6);
        calculatrice.test_another_method();

        verifyNoMoreInteractions(calculatrice);




    }
}