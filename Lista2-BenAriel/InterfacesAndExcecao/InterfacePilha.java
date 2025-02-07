
package InterfacesAndExcecao;

public interface InterfacePilha <T>{
    
    void push(T element) throws Excecao;
    T pop() throws Excecao;
    
    T peek() throws Excecao;
    
    boolean isEmpty();
    void show() throws Excecao;
}
