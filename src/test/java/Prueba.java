import com.cajanegra.EmptyCollectionException;
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
    SingleLinkedListImpl lista;
    @BeforeEach
     void setup(){
        lista=new SingleLinkedListImpl();
    }
    // Tests del metodo addAtPos
    @Test
    @DisplayName("Test addAtPos elem=A p=3 listaTamanio=5")
    void testAddAtPosElemA(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');

        lista.addAtPos('A',3);

        assertEquals("[A, B, A, C, D, D]",lista.toString());
    }
    @Test
    @DisplayName("Test addAtPos elem=B p=3 listaTamanio=5")
    void testAddAtPosElemB(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');

        lista.addAtPos('B',3);

        assertEquals("[A, B, B, C, D, D]",lista.toString());
    }
    @Test
    @DisplayName("Test addAtPos elem=Z p=3 listaTamanio=5")
    void testAddAtPosElemZ(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');

        lista.addAtPos('Z',3);

        assertEquals("[A, B, Z, C, D, D]",lista.toString());
    }
    @Test
    @DisplayName("Test addAtPos elem=Y p=3 listaTamanio=5")
    void testAddAtPosElemY(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');

        lista.addAtPos('Y',3);

        assertEquals("[A, B, Y, C, D, D]",lista.toString());
    }
    @Test
    @DisplayName("Test addAtPos elem=H p=1 listaTamanio=5")
    void testAddAtPosPrincipio(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');

        lista.addAtPos('H',1);

        assertEquals("[H, A, B, C, D, D]",lista.toString());
    }
    @Test
    @DisplayName("Test addAtPos elem=H p=2 listaTamanio=5")
    void testAddAtPosSegunda(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');

        lista.addAtPos('H',2);

        assertEquals("[A, H, B, C, D, D]",lista.toString());
    }
    @Test
    @DisplayName("Test addAtPos elem=H p=5 listaTamanio=5")
    void testAddAtPosListSize(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');

        lista.addAtPos('H',5);

        assertEquals("[A, B, C, D, H, D]",lista.toString());
    }
    @Test
    @DisplayName("Test addAtPos elem=H p=4 listaTamanio=5")
    void testAddAtPosListSizeMenos1(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');

        lista.addAtPos('H',4);

        assertEquals("[A, B, C, H, D, D]",lista.toString());
    }
    @Test
    @DisplayName("Test addAtPos elem=H p=3 listaTamanio=5")
    void testAddAtPosNominal(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');

        lista.addAtPos('H',3);

        assertEquals("[A, B, H, C, D, D]",lista.toString());
    }
    @Test
    @DisplayName("Test addAtPos elem=@ p=3 listaTamanio=5")
    void testAddAtPosArroba(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');



        assertThrows(IllegalArgumentException.class,()->{
            lista.addAtPos('@',3);
        });
    }
    @Test
    @DisplayName("Test addAtPos elem=[ p=3 listaTamanio=5")
    void testAddAtPosCorchete(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');



        assertThrows(IllegalArgumentException.class,()->{
            lista.addAtPos('[',3);
        });
    }
    @Test
    @DisplayName("Test addAtPos elem=H p=0 listaTamanio=5")
    void testAddAtPos0(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');



        assertThrows(IllegalArgumentException.class,()->{
            lista.addAtPos('H',0);
        });
    }
    @Test
    @DisplayName("Test addAtPos elem=H p=6 listaTamanio=5")
    void testAddAtPos6(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');

        lista.addAtPos('H',6);

        assertEquals("[A, B, C, D, D, H]",lista.toString());
    }
    @Test
    @DisplayName("Test addAtPos elem=H p=7 listaTamanio=5")
    void testAddAtPos7(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');

        lista.addAtPos('H',7);

        assertEquals("[A, B, C, D, D, H]",lista.toString());
    }
    // Tests del metodo addFirst
    @Test
    @DisplayName("Test addFirst elem=A tamañoLista=5 ")
    void testAddFirstA(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');

        lista.addFirst('A');

        assertEquals("[A, A, B, C, D, D]",lista.toString());
    }

    @Test
    @DisplayName("Test addFirst elem=B tamañoLista=5 ")
    void testAddFirstB(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');

        lista.addFirst('B');

        assertEquals("[B, A, B, C, D, D]",lista.toString());
    }
    @Test
    @DisplayName("Test addFirst elem=H tamañoLista=5 ")
    void testAddFirstH(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');

        lista.addFirst('H');

        assertEquals("[H, A, B, C, D, D]",lista.toString());
    }
    @Test
    @DisplayName("Test addFirst elem=Z tamañoLista=5 ")
    void testAddFirstZ(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');

        lista.addFirst('Z');

        assertEquals("[Z, A, B, C, D, D]",lista.toString());
    }
    @Test
    @DisplayName("Test addFirst elem=Y tamañoLista=5 ")
    void testAddFirstY(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');

        lista.addFirst('Y');

        assertEquals("[Y, A, B, C, D, D]",lista.toString());
    }
    @Test
    @DisplayName("Test addFirst elem=H tamañoLista=0 ")
    void testAddFirstListaVacia(){



        lista.addFirst('H');

        assertEquals("[H]",lista.toString());
    }
    @Test
    @DisplayName("Test addFirst elem=H tamañoLista=1 ")
    void testAddFirstListaUnSoloElemento(){

        lista.addLast('A');


        lista.addFirst('H');

        assertEquals("[H, A]",lista.toString());
    }
    @Test
    @DisplayName("Test addFirst elem=@ tamañoLista=5 ")
    void testAddFirstArroba(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');


        assertThrows(IllegalArgumentException.class,()->{
            lista.addFirst('@');
        });
    }
    @Test
    @DisplayName("Test addFirst elem=H tamañoLista=5 ")
    void testAddFirstCorchete(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');


        assertThrows(IllegalArgumentException.class,()->{
            lista.addFirst('[');
        });
    }
    // Tests del metodo addLast
    // Se consideran probadas ya los CP 1-7 al utilizar este metodo
    // en otras pruebas unitarias, por tanto, no realizará
    // pruebas unitarias de estos cp
    @Test
    @DisplayName("Test addFirst elem=@ tamañoLista=5 ")
    void testAddLastArroba(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');


        assertThrows(IllegalArgumentException.class,()->{
            lista.addLast('@');
        });
    }
    @Test
    @DisplayName("Test addFirst elem=H tamañoLista=5 ")
    void testAddLastCorchete(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');


        assertThrows(IllegalArgumentException.class,()->{
            lista.addLast('[');
        });
    }

    // Tests del metodo addNTimes
    @Test
    @DisplayName("Test addNTimes elem=H n=0 tamañoLista=5 ")
    void testAddNTimes0(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');


        lista.addNTimes('H',0);

        assertEquals("[A, B, C, D, D]",lista.toString());
    }

    @Test
    @DisplayName("Test addNTimes elem=H n=1 tamañoLista=5 ")
    void testAddNTimes1(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');


        lista.addNTimes('H',1);

        assertEquals("[A, B, C, D, D, H]",lista.toString());
    }
    @Test
    @DisplayName("Test addNTimes elem=A n=5 tamañoLista=5 ")
    void testAddNTimesElemA(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');


        lista.addNTimes('A',5);
        assertEquals("[A, B, C, D, D, A, A, A, A, A]",lista.toString());
    }
    @Test
    @DisplayName("Test addNTimes elem=B n=5 tamañoLista=5 ")
    void testAddNTimesElemB(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');
        lista.addNTimes('B',5);
        assertEquals("[A, B, C, D, D, B, B, B, B, B]",lista.toString());
    }
    @Test
    @DisplayName("Test addNTimes elem=Z n=5 tamañoLista=5 ")
    void testAddNTimesElemZ(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');


        lista.addNTimes('Z',5);
        assertEquals("[A, B, C, D, D, Z, Z, Z, Z, Z]",lista.toString());
    }
    @Test
    @DisplayName("Test addNTimes elem=Y n=5 tamañoLista=5 ")
    void testAddNTimesElemY(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');


        lista.addNTimes('Y',5);
        assertEquals("[A, B, C, D, D, Y, Y, Y, Y, Y]",lista.toString());
    }
    @Test
    @DisplayName("Test addNTimes elem=H n=5 tamañoLista=5 ")
    void testAddNTimesElemH(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');


        lista.addNTimes('H',5);
        assertEquals("[A, B, C, D, D, H, H, H, H, H]",lista.toString());
    }


    @Test
    @DisplayName("Test addNTimes elem=[ n=5 tamañoLista=5 ")
    void testAddNTimesElemCorchete(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');


        assertThrows(IllegalArgumentException.class,()->{
            lista.addNTimes('[',5);
        });
    }
    @Test
    @DisplayName("Test addNTimes elem=H n=-1 tamañoLista=5 ")
    void testAddNTimesMenos1(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');


        assertThrows(IllegalArgumentException.class,()->{
            lista.addNTimes('H',-1);
        });

    }
    @Test
    @DisplayName("Test addNTimes elem=@ n=5 tamañoLista=5 ")
    void testAddNTimesElemArroba(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');
        lista.addLast('D');


        assertThrows(IllegalArgumentException.class,()->{
            lista.addNTimes('@',5);
        });
    }



    // Tests del metodo getAtPos
    @Test
    @DisplayName("Test GetAtPos pos=1")
    void testGetAtPos1(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');

        assertEquals('A',lista.getAtPos(1));
    }
    @Test
    @DisplayName("Test GetAtPos pos=2")
    void testGetAtPos2(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');

        assertEquals('B',lista.getAtPos(2));
    }
    @Test
    @DisplayName("Test GetAtPos pos=Size")
    void testGetAtPosSize(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');

        assertEquals('D',lista.getAtPos(lista.size()));
    }
    @Test
    @DisplayName("Test GetAtPos pos=Size-1")
    void testGetAtPosPenultimo(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');

        assertEquals('C',lista.getAtPos(lista.size()-1));
    }
    @Test
    @DisplayName("Test GetAtPos pos<1")
    void testGetAtPos0(){

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
    void testGetAtPosSuperaSize(){

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
    @DisplayName("Test IndexOf aparece al principio")
    void testindexOfExistePrincipio(){

        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('C');
        lista.addLast('D');

        assertEquals(1,lista.indexOf('A'));
    }
    @Test
    @DisplayName("Test indexOf Existe el elemento varias veces")
    void testindexOfExisteVariasVeces(){

        lista.addLast('B');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('D');

        assertEquals(2,lista.indexOf('A'));
    }
    @Test
    @DisplayName("Test indexOf Existe el elemento al final de la lista")
    void testindexOfExisteFinal(){

        lista.addLast('B');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('D');

        assertEquals(4,lista.indexOf('D'));
    }
    @Test
    @DisplayName("Test indexOF NoExiste el elemento")
    void testindexOfNoExiste(){

        lista.addLast('B');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('D');

        assertThrows(NoSuchElementException.class,()->{
            lista.indexOf('H');
        });
    }
    // Tests del metodo isEmpty
    @Test
    @DisplayName("Test isEmpty cuando la lista esta vacia")
    void testIsEmptyListaVacia() {
        assertTrue(lista.isEmpty());
    }
    @Test
    @DisplayName("Test isEmpty cuando la lista tiene mas que un elem")
    void testIsEmptyListMuchosElem() {
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        assertFalse(lista.isEmpty());
    }
    @Test
    @DisplayName("Test isEmpty cuando la lista solo contiene un elem")
    void testIsEmptyListaUnElem() {
        lista.addLast('A');
        assertFalse(lista.isEmpty());
    }
    //Tests del metodo isSubList
    @Test
    @DisplayName("Test isSubList cuando lista contiene la sublista al principio")
    void testIsSubListPrincipio() {
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('B');
        SingleLinkedListImpl sublist=new SingleLinkedListImpl();
        sublist.addLast('A');
        sublist.addLast('A');
        sublist.addLast('A');
        sublist.addLast('A');


        assertEquals(1,lista.isSubList(sublist));
    }
    @Test
    @DisplayName("Test isSubList cuando lista contiene la sublista en el medio")
    void testIsSubListMitad() {
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('B');
        SingleLinkedListImpl sublist=new SingleLinkedListImpl();
        sublist.addLast('A');
        sublist.addLast('A');
        sublist.addLast('A');
        sublist.addLast('B');
        assertEquals(6,lista.isSubList(sublist));
    }
    @Test
    @DisplayName("Test isSubList cuando lista contiene la sublista en el final")
    void testIsSubListfinal() {
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('B');
        SingleLinkedListImpl sublist=new SingleLinkedListImpl();
        sublist.addLast('A');
        sublist.addLast('A');
        sublist.addLast('B');
        sublist.addLast('B');
        assertEquals(7,lista.isSubList(sublist));
    }
    @Test
    @DisplayName("Test isSubList cuando lista no contiene la sublista")
    void testIsSubListNoContiene() {
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('B');
        SingleLinkedListImpl sublist=new SingleLinkedListImpl();
        sublist.addLast('A');
        sublist.addLast('B');
        sublist.addLast('B');
        sublist.addLast('B');
        assertEquals(-1,lista.isSubList(sublist));
    }
    @Test
    @DisplayName("Test isSubList cuando sublista esta vacia")
    void testIsSubListVacia() {
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('B');
        SingleLinkedListImpl sublist=new SingleLinkedListImpl();
        assertEquals(0,lista.isSubList(sublist));
    }
    //Tests del metodo removeLast()
    @Test
    @DisplayName("Test removeLast() cuando lista tiene contenido")
    void testremoveLastSinParam() throws EmptyCollectionException {
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('B');
        assertEquals('B',lista.removeLast());
        assertEquals("[A, A, A, A, A, A, A, A, B]",lista.toString());

    }
    @Test
    @DisplayName("Test removeLast() cuando lista no tiene contenido")
    void testremoveLastSinParamVacio() {
        assertThrows(EmptyCollectionException.class,()->{
            lista.removeLast();
        });
    }
    @Test
    @DisplayName("Test removeLast() cuando la lista solo contiene a un elem")
    void testremoveLastSinParamUnElemento() throws EmptyCollectionException {
        lista.addLast('B');


        assertEquals('B',lista.removeLast());
        assertEquals("[]",lista.toString());

    }
    //Tests del metodo removeLast(T elem)
    @Test
    @DisplayName("Test removeLast(T elem) cuando elem solo aparece al principio")
    void testremoveLastAlPrincipio() throws EmptyCollectionException {
        lista.addLast('B');
        lista.addLast('A');
        lista.addLast('A');
        lista.addLast('A');

        assertEquals('B',lista.removeLast('B'));
        assertEquals("[A, A, A]",lista.toString());

    }
    @Test
    @DisplayName("Test removeLast(T elem) cuando elem aparece varías veces")
    void testremoveLastvaríasAparencias() throws EmptyCollectionException {
        lista.addLast('B');
        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('A');

        assertEquals('B',lista.removeLast('B'));
        assertEquals("[B, A, A]",lista.toString());

    }
    @Test
    @DisplayName("Test removeLast(T elem) cuando elem aparece solo al final")
    void testremoveLastFinal() throws EmptyCollectionException {
        lista.addLast('B');
        lista.addLast('B');
        lista.addLast('B');
        lista.addLast('A');

        assertEquals('A',lista.removeLast('A'));
        assertEquals("[B, B, B]",lista.toString());

    }
    @Test
    @DisplayName("Test removeLast(T elem) cuando elem no aparece en la lista")
    void testremoveLastNoAparece() {
        lista.addLast('B');
        lista.addLast('B');
        lista.addLast('B');
        lista.addLast('A');

        assertThrows(NoSuchElementException.class,()->{
            lista.removeLast('H');
        });

    }

    @Test
    @DisplayName("Test removeLast(T elem) cuando lista esta vacía")
    void testremoveLastVacio() {
        assertThrows(EmptyCollectionException.class,()->{
            lista.removeLast('A');
        });

    }
    @Test
    @DisplayName("Test removeLast(T elem) cuando la lista solo contiene a elem")
    void testremoveLastUnElemento() throws EmptyCollectionException {
        lista.addLast('B');


        assertEquals('B',lista.removeLast('B'));
        assertEquals("[]",lista.toString());

    }
    // tests para el metodo reverse()
    @Test
    @DisplayName("Test reverse() lista vacía")
    void testReverseVacia(){
       assertEquals("[]",lista.reverse().toString());
    }
    @Test
    @DisplayName("Test reverse() lista no vacía")
    void testReverse(){
        lista.addLast('B');
        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('A');
        assertEquals("[A, B, A, B]",lista.reverse().toString());
    }
    @Test
    @DisplayName("Test size lista con solo un elemento")
    void testReverseUnElemento(){
        lista.addLast('B');
        assertEquals("[B]",lista.reverse().toString());

    }
    //tests para el metodo size
    @Test
    @DisplayName("Test size lista vacía")
    void testSizeVacia(){
        assertEquals(0,lista.size());
    }
    @Test
    @DisplayName("Test size lista con mas que un elemento")
    void testSize(){
        lista.addLast('B');
        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('A');
        assertEquals(4,lista.size());
    }
    @Test
    @DisplayName("Test size lista con solo un elemento")
    void testSizeUnElemento(){
        lista.addLast('B');
        assertEquals(1,lista.size());
    }

    //tests para el metodo toString()
    @Test
    @DisplayName("Test toString lista vacía")
    void testToStringVacia(){
        assertEquals("[]",lista.toString());
    }
    @Test
    @DisplayName("Test toString lista con mas que un elemento")
    void testtoString(){
        lista.addLast('B');
        lista.addLast('A');
        lista.addLast('B');
        lista.addLast('A');
        assertEquals("[B, A, B, A]",lista.toString());
    }
    @Test
    @DisplayName("Test toString lista con solo un elemento")
    void testToStringUnElemento(){
        lista.addLast('B');
        assertEquals("[B]",lista.toString());
    }

    }
