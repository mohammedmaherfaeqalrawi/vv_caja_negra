import com.cajanegra.SingleLinkedListImpl;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
public class Prueba {
    @BeforeEach
     void setup(){
        SingleLinkedListImpl lista=new SingleLinkedListImpl();
    }
    // Tests del metodo getAtPos
    @Test
    @DisplayName("Test GetAtPos pos=1")
    void testGetAtPos1(){
        SingleLinkedListImpl lista=new SingleLinkedListImpl();
        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');

        assertEquals('A',lista.getAtPos(1));
    }
    @Test
    @DisplayName("Test GetAtPos pos=2")
    void testGetAtPos2(){
        SingleLinkedListImpl lista=new SingleLinkedListImpl();
        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');

        assertEquals('B',lista.getAtPos(2));
    }
    @Test
    @DisplayName("Test GetAtPos pos=Size")
    void testGetAtPosSize(){
        SingleLinkedListImpl lista=new SingleLinkedListImpl();
        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');

        assertEquals('D',lista.getAtPos(lista.size()));
    }
    @Test
    @DisplayName("Test GetAtPos pos=Size-1")
    void testGetAtPosPenultimo(){
        SingleLinkedListImpl lista=new SingleLinkedListImpl();
        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');

        assertEquals('C',lista.getAtPos(lista.size()-1));
    }
    @Test
    @DisplayName("Test GetAtPos pos<1")
    void testGetAtPos0(){
        SingleLinkedListImpl lista=new SingleLinkedListImpl();
        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');

        assertThrows(IllegalArgumentException.class,()->{
            lista.getAtPos(0);
        });
    }
    @Test
    @DisplayName("Test GetAtPos supera size")
    void testGetAtPosSuperSize(){
        SingleLinkedListImpl lista=new SingleLinkedListImpl();
        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');

        assertThrows(IllegalArgumentException.class,()->{
            lista.getAtPos(lista.size()+1);
        });
    }
    // Tests del metodo getAtPos
    @Test
    @DisplayName("Test IndexOf aparece una vez")
    void testindexOfExisteUnaVez(){
        SingleLinkedListImpl lista=new SingleLinkedListImpl();
        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');

        assertEquals(1,lista.indexOf('A'));
    }
    @Test
    @DisplayName("Test indexOf Existe el elemento varias veces")
    void testindexOfExisteVariasVeces(){
        SingleLinkedListImpl lista=new SingleLinkedListImpl();
        lista.addLast('B');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('D');

        assertEquals(2,lista.indexOf('A'));
    }
    @Test
    @DisplayName("Test indexOF NoExiste el elemento")
    void testindexOfNoExiste(){
        SingleLinkedListImpl lista=new SingleLinkedListImpl();
        lista.addLast('B');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('D');

        assertThrows(NoSuchElementException.class,()->{
            lista.indexOf('H');
        });
    }




}
