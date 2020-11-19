import java.util.Arrays;

public class Mylist<E> {
    private int size =0;
    private int DEFAULT_CAPACITY=10 ;
    private Object element[];
    public Mylist(){
        element= new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa(){
        int newSize=element.length*2;
        element= Arrays.copyOf(element,newSize);

    }
    public void add(E e){
        if (size==element.length){
            ensureCapa();
        }
        element[size ++]=e;
    }
   public E get(int i){
        if (i>=size||i<0){
            throw new IndexOutOfBoundsException("Index" +i+",Side" +i);
        }
        return (E) element[i];
   }
}
