package homework19;
/**
 * 二、面试题
List和Set的区别？答：List  有序，可重复；
                  Set  无序，不可重复；
ArrayList和LinkedList的区别？答：ArrayList  jdk1.2   线程不同步     不安全    效率较高    增删效率较低   改查效率较高
                             LinkedList  jdk1.0   线程同步       较安全     效率较低    增删效率较高  改查效率较低
HashSet和TreeSet的区别？答：HashSet   底层是HashMap   根据哈希值得出位置从而存储元素                           元素所在类必须重写hashCode和equals方法
                        TreeSet   底层实现：红黑树      必须指明排序方式：自然排序或者制定排序             元素所在为同一个类
HashMap和Hashtable的区别？                                                                                                                                遍历方式的内部实现不同
         答：HashMap    继承父类是：       线程不同步      无contains方法   key和value都可以为null，    重新计算哈希值                 initialCapacity初始容量，默认为16/ 
               Dictionary类            不安全                                             但只能有一个key是null                      loadFactor加载因子，默认为0.75/threshold 临界值
                                                               
                
      HashTable  继承父类是：         线程同步         有contains方法    key和value都不能为null    直接使用key的哈希值
               AbstractMap类       较安全
      
Collection和Map的区别？
  答：Collection  单列集合  ，无序，可重复   
       Map      双列集合， 无序，不可重复
ArrayList的源码分析？
答：底层是多态数组，里面维护了elementData数组；没有制定容量时，elementData容量默认为0（jdk8），10（jdk7），当制定Capacity容量时，elementData容量就是Capacity的值；扩容：2倍
HashMap的源码分析？
答：HashMap是由数组+链表组成的，主体是一个Entry数组，链表主要是为了解决哈希值冲突而存在的，链表越少，性能越好；每一个Entry包含一个键值对，Entry是HashMap的一个静态内部类，需要计算哈希值
 * @author win10
 *
 */
public class homework2 {

}
