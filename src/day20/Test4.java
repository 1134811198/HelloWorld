package day20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test4 {
public static void main(String[] args) {
	Collection c1=new ArrayList();
	
	Test4.printCollection(c1);
	Test4.printCollection2(c1);
} 

static void printCollection(Collection c) {
    Iterator i = c.iterator();
    for (int k = 0; k < c.size(); k++) {
          System.out.println(i.next());


  }
}
static void printCollection2(Collection<Object> c) {
    for (Object e : c) {
          System.out.println(e);
} }

}