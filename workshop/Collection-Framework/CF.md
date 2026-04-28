# Collection - List, Set, Queue


# List

- predefined interface present in java util
- introduced from JDK 1.2
- implemented classes of list interface is 1- Array list, 2- Linked list, 3- Vector, 4- Stack

### Generalisation OR Upcasting 

List l(refernce Variable) = new Arraylist(); new LinkedList(); new Vector(); new Stack();

### Specfication of List I
 - Insertion order is maintained 
 - Null Value is allowed 
 - Duplucate allowed 
 - list is index based

### List In-built Method 

- get()
- set()
- indexOf()
- last Index 
- add
---

## ArrayList

- Present in java.util
- Introduced from JDK 1.2
- All Specification of list interface follow by Arraylist
- Intial capacity = 10 
- Incremental capacity =  ((current capacity * 3))/ 2 + 1 

### Array list Constructor 


- Array list();

- Arraylist (Capacity) ;
- Arraylist (Collection());



## Linked List
- java util
- introduced in JDK 1.2
- Store data in Node

### Linked list Constructor

- Linked List();
- Linked LIst(Collection());


## Stack  (Legacy Classes)
- introduced in JDK 1.0
- java.util
- No Constructor

### Methods

- push()
- pop()
- peek()
- isEmpty()
- clear()


# Implementation 

```
- LinkedList<Integer> reference variable = new LinkedList<>();
- Vector<Boolean> reference variable= new Vector<>();
- Stack<Integer> refernce variable= new Stack();
```

## Stack  

- st is a reference variable

```java
st.push(1);
st.push(2);
st.push(3);
st.push(4);
System.out.println(st); -- prints [1, 2, 3, 4]
st.pop(); 
System.out.println(st); -- prints [1, 2, 3]
st.peek();
System.out.println(st) -- prints 3
st.size();
System.out.println(st) -- prints 3 
st.isEmpty();
System.out.println(st) -- prints false
```

## LinkedList

- l is a reference variable
  
```java
LinkedList<Integer> ll = new LinkedList<>();
ll.add(11);
ll.add(22);
ll.add(33);
ll.add(44);
System.out.println(ll);
ll.set(0. 90);
System.out.println(ll);
LinkedList<Integer> l = new LinkedList<>();
l.add(1);
l.add(2);
l.add(3);
ll.addAll(l);
System.out.println(ll);
```

## Vector 

```java
```


#Queue

```java
Queue<Integer> q = new LinkedList<>();
q.add(56);
q.add(45);
q.add(51);
q.offer(66);
System.out.println(q);
System.out.println(q.element());
q.remove();
System.out.println(q);
q.poll();
System.out.prinln(q);
System.out.println(q.size());





```



# Set 

- introduced in java JDK 1.2
- in package java.util*
- dont maintain insertion order
- not indexed based
- duplicate value cannot be inserted 
- null value can be inserted

```java
Set s = new LinkedHashSet();
Set s = new TreeSet();
Set s = new HashSet();

```

## HashSet

- intial capacity = 16
- in JDK 1.2
- dont maintain insertion order
```java
HashSet<Integer> hs = new HashSet<>(); 
hs.add(88);
hs.add(0);
hs.add(63);
hs.add(1);
hs.add(56);
System.out.println(hs);

//Output = [0, 1, 88, 56, 63]
```

## LinkedHashSet

- java util*
- JDK 1.4
- no intial capacity
- maintain insertion order
``` java
LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
hs.add(88);
hs.add(0);
hs.add(63);
hs.add(1);
hs.add(56);
System.out.println(hs);


//Output = [88, 0, 63, 1, 56]

```

## TreeSet

```java
TreeSet <Integer> ts = new TreeSet<>();
ts.add(23);
ts.add(456);
ts.add(987);
ts.add(99);
ts.add(6);
System.out.println(ts);

// Output = [6, 23, 99, 456, 987] 
```
- java.util*
- 
- JDK 1.2
- no intial capacity
- Follow Natural Sorting order (*Ascending Order*)


# Maps

## HashMap
- Introduced in java 1.2
```java
HashMap<Integer, Integer> hm = new HashMap<>();
hm.put(2, 90);
hm.put(3, 78);
hm.put(1, 99);
hm.put(4, 88);
System.out.println("Keys : "+ hm.keySet());
for(int a : hm.keySet()) {
    System.out.println(a);
}

System.out.println("Values : "+ hm.values());
for (int b : hm.values()) {
    System.out.println(b);
}
System.out.println(hm);

/* Output

Keys : [1, 2, 3, 4]
1
2
3
4
Value : [99, 90, 78, 88]
99
90
78
88
{1=99, 2=90, 3=78, 4=88}

*/
```
## LinkedHashMap
- Introduced in java 1.4

## TreeMap
- Introduced in java 1.2







  


