<b>Note:</b> Click Readme.md for better reading

<h2>Collections : </h2>
          
      In simple terms if we are talking in terms of numbers or group we need something to store. let say 
      if we want to store a single number we can use either long, int, short or if we want to store a single 
      name we can use String but what if we want to store mulitple or group of name of numbers then what do we 
      use to store it. 
 
      Java has provided something called `Collections` or `Collections Framework` which helps in storing and 
      processing the data efficiently. It has multiple classes and interfaces for storing data. 
      
      Now the question is why multiple classes or interace ? well each class or interface has its unique 
      funtionality that will be helpful for a particular use case. For example I need to store a list of numbers
      and want to maintain the order in terms of how i am storing I should retrieve in same manner and also we can 
      include null and duplicate numbers. In that case Arraylist, Linkedlist or Vector is helpful.Similarly each 
      class or interface has it unique functionality and based on that we can store the data in those classes 
      based on the requirement.
      
      

      Collections Framework Hierarchy (I stands for interface where as C stands for class)
          
          - List(I)
              - ArrayList(C)
              - LinkedList(C)
              - Vector(C)
              
           - Set(I)
              - HashSet(C)
              - LinkedHashSet(C)
              - SortedSet(I)
               - TreeSet(C)
              
            - Map(I)
              - HashMap(C)
              - HashTable(C)
              - LinkedHashMap(C)
              - SortedMap(I)
                - TreeMap(C)
                
            - Queue(I)
              - PriorityQueue(C)

<br>
<h3> Functionalities on which Collections are distributed </h3>

- Data Order
- Is Duplicate Records Allowed
- Is Null Values Allowed
- Synchronization
- Key/Value Pair
- Sorting



              
 <br><br>
 
 <h3> LIST </h3>
 
       - ordered collection
       - contain duplicate elements
       - contain null value
       
       
        ARRAYLIST
          
          - ordered collection, maintain the insertion order that means if we insert numbers like 23, 54, 22 will 
	    	get in the same order while retriving i.e. 23, 54, 22.
          - contain duplicate elements
          - contain null value
          - is non synchronized
	      - good for search and traversal
          
          
          HOW ARRAY LIST WORKS INTERNALLY
           -  It uses array of Objects
           -  whenever we create an object of array an array is created with the default size of 10
           - in the case the array is full it will create a new array with the double capacity and push the elements 
	     	 in the new array
           - elements are transient that means they are non serialized - transient Object[] elementData
          
          
          IMPORTANT FUNCTIONS IN ARRAYLIST
          
          `List<E> arrayList  = new AraayList<>();`
            - add(element) - adding object in array list it will add in the last
            - add(index, element) - will add the element in the particular index
            - addAll(Collection) - adding from one collection to another collection
            - addAll(index,Collection) - adding another collection starting from a particular index
            - size() -  size of the array
            - remove(element) - removing an element from list
            - remove(index) -  removing an element on a particular index
            - get(index) - retrieving element at a particular index
            - indexOf(element)  - will check the element in the list and return the index of the element found first.
            - lastIndexOf(element)  - will check the element in the list and return the index of the element fat last 
	         place.
            - contains(element) - check if the element is part of list.
            - sublist(start index, end index) - create a sublist or small arraylist from arraylist based on the start 
	      and end index
            - Arrays.asList(array) - converting from array to arraylist
            - sorting
              - using Collections class
                  - Collections.sort(arrayList) - will sort in ascending order.
                  - Collections.sort(arrayList, Collections.reverseOrder()) - - will sort in descending order.
              - using Comparable interface
                  - comapreTo() 
                    -  implement Comparable Intefrace to the model or Object class 
                       :->  Employee implements Comparable<Employee>
                    - add compareTo() method
                      :->  @Override
	                         public int compareTo(Employee o) {
		                          return this.age -  o.age;
	                          }
              - using comparator interface
                      :->  we can add comparator method outside Model or object class, each comparator can refer to 
		      different data like  for employee one sorting based on age, one sorting based on name etc.
                        
                            Comparator cmp  = new Comparator(){
                            
                            @Override
                            public int compare(Emp e1, Emp 2){
                              return e1.age < e2.age ? 1 : -1;
                           }
                          };
                            
                          Collections.sort(arrayList, cmp);   -- will sort based on emp age.
              
              
	
	
	
	VECTOR:
		- same like Array list only difference is it is synchronized or thread safe thats why is bit slow
		- maintain insertion order
		- allow null elements
		- allow duplicate elements
		- is synchronized
		- slow compared to other list clases
	
	 	HOW ARRAY LIST WORKS INTERNALLY
	 	
			similar to array list just that the functions are synchronized
	
		IMPORTANT FUNCTIONS OF VECTOR 
			same what arraylist has..



<br> <br>
<h3> SET </h3>
	
	- does not allow duplicate elements
	
	
	
	HASHSET
	
	  - `no duplicate elements`
	  - maintains no order
	  - stores the elements in hashtables and is best out of other set class as per performance
	  - allow null elements
	  - non synchronized
	  - not sorted
	  - Hashset provide better performance (faster) than TreeSet for the operations like add, remove, 
	    contains, size etc
	    HashSet offers constant time cost while TreeSet offers log(n) time cost for such operations.
 	  - iterator returned by this class is fail-fast which means iterator would throw
	    ConcurrentModificationException if HashSet has been modified after creation of iterator, by any means 
	    except iterator’s own remove method.
	  - for sorting hashet you either need to convert in list, use comparator (if applicable) and call 
	    Collections.sort() or convert into tree set.
	
	
	 HOW HASHSET WORKS INTERNALLY
	 	- stores all the elements in hash table.
		
	
	 IMPORTANT FUNCTIONS IN HASHSET
	 	- add(Element e) 
		- addAll(Collection c)
		- size()
		- remove(object obj)
		- removeAll(Collection c)
		- contains(Element e)
		- containsAll(Collection c)
		- clear()
		- isEmpty()
		- toArray()
	
	
	
	
	
	LINKEDHASHSET
	
	  - `no duplicate elements`
	  - `maintains order based on insertion`
	  -  allow null elements
	  -  non synchronized
	  -  not sorted
 	  - iterator returned by this class is fail-fast which means iterator would throw
	    ConcurrentModificationException if HashSet has been modified after creation of iterator, by any means 
	    except iterator’s own remove method.
	 - for sorting linkedhashet you either need to convert in list, use comparator (if applicable) and call 
	    Collections.sort() or convert into tree set.
	
	 HOW LINKEDHASHSET WORKS INTERNALLY
	 	- stores all the elements in hash table.
		
	
	 IMPORTANT FUNCTIONS IN HASHSET
	 	- add(Element e) 
		- addAll(Collection c)
		- size()
		- remove(object obj)
		- removeAll(Collection c)
		- contains(Element e)
		- containsAll(Collection c)
		- clear()
		- isEmpty()
		- toArray()
	
	
	
	
	
	
	TREESET
	
	  - `no duplicate elements`
	  -  maintains no order
	  -  does not allow null elements as it uses compareTo() or compare method and when you compare anything 
	     with null it will throw Null Pointer exception
	  -  non synchronized
	  - `sorted in asc order`
 	  - iterator returned by this class is fail-fast which means iterator would throw
	    ConcurrentModificationException if HashSet has been modified after creation of iterator, by any means 
	    except iterator’s own remove method.
	
	
	 HOW TREESET WORKS INTERNALLY
	 	- stores all the elements in hash table.
		
	
	 IMPORTANT FUNCTIONS IN TREESET
	 	- add(Element e) 
		- addAll(Collection c)
		- size()
		- remove(object obj)
		- removeAll(Collection c)
		- contains(Element e)
		- containsAll(Collection c)
		- clear()
		- isEmpty()
		- toArray()
	
	
	
<br> <br>
<h3>MAP</h3>

	- contains key value pair
	- key does not contain duplicate element
	- values can have duplicate elements
	
	
	HASHMAP
		- key/value pair, denoted as HashMap<Key, Value> or HashMap<K, V>
		- maintains no order, no guarantees concerning the order of iteration
		- not syncronized
		- allow null values both for key and value
		- not sorted both key and values
		- keys does not allow duplicate elements, values can be duplicate
		- similar to the Hashtable class except that it is unsynchronized and permits nulls(null values and null key).
	
	
	 IMPORTANT FUNCTIONS IN HASHMAP
		
		- boolean containsKey(Key k)
		- boolean containsValue(Value v)
		- boolean isEmpty()
		- Set<E> keySet()
		- Collections<E> values()
		- value remove(Key,value)
		- value remove(Key k)
		- int size()
		- void clear()
		- E replace(key, new value) - return the value of previous key or null if its first
		- E put(key, value) - return the value of previous key or null if its first
		- void puAll(Map)
		- Collections.synchronizedMap(hmap)
		- Sorting Hashmap
			- Keys using Treemap
			- Values using Comparator

					List<String>  list = new LinkedList(employee.entrySet());

					Comparator<String> valueComp =  new Comparator() {

						@Override
						public int compare(Object o1, Object o2) {
						return ((Comparable)(((Map.Entry) o1).
							getValue())).compareTo((((Map.Entry) o2).
							getValue()));
						}
					};

					Collections.sort(list, valueComp);
					
					
					
					
		
	traversing Map: 
	  1. 	
		- use Map.Entry
		- entrySet
		- getKey()
		- get Value()
		
		//Iteration 1
		for(Map.Entry<Long, String> mp : employee.entrySet()) {
			System.out.printf("Key : %d \n",  mp.getKey());
			System.out.printf("Value  : %s \n",  mp.getValue());
			
		}


	   2. 
		- convert to Set (of Entry)
		- use Map.Entry
		- entrySet
		- getKey()
		- get Value()
		- Iterator
		
		//Iteration 2
		Set<Entry<Long, String>> set =  employee.entrySet();
		Iterator<Entry<Long, String>> itr  = set.iterator();
		while(itr.hasNext()) {
			Map.Entry<Long, String> mp1 = (Map.Entry<Long, String>) itr.next();
			System.out.printf("Key : %d \n", mp1.getKey())  ;
			System.out.printf("Value  : %s \n",  mp1.getValue());
		}
		
	    3. using keySet())
		
		//Iteration 3 getting keys 
		for(Long empid :  employee.keySet()) {
			System.out.printf("Key : %d \n", empid)  ;
		}
		
	    4. using values()

		//Iteration 3 getting values 
		for(String name :  employee.values()) {
			System.out.printf("Values : %s \n", name)  ;
		}
	
	
	
	
	LINKEDHASHMAP:
	
		- is same like hashmap the only difference is it maintains insertion order
		- key/value pair
		- not sorted
		- not synchronized
		- contain duplicate elements in values but not in kes
		- allow null values in key and values
	
	Methods are same what are there in HashMap.
	
	
	
	
	TREEMAP
	
		- key/value pair
		- sorted 
		- does not allow null values 
		- not synchronized
		- maintain no order
		- allow duplicate elements
	
	
	
		- maintaint the insertion order 





<br> <br>
<h2> Comparable vs Comparator </h2>

	Java provides some inbuilt methods to sort primitive types array or Wrapper classes array or list.Both comparable 
	and comparator interfaces are used for sorting.
	
	Lets say we have an Employee class that has follwoing elements:
	- name
	- age
	- salary
	
	Now lets see how we can sort using both the interface and also see the advantage:
	
	We have to sort the employee based on age.
	
	1. Comparable :
		
		- Model (employee)  will implement Comparable interface
		- overide compareTo(T obj) method in model class to compare current object with passing object.Comparable 
		  affects the original class, i.e., the actual class is modified.
		- Comparable is present in java.lang package.
		- one of the disavantage of using comparable is we can only do a sorting on a single element.
		- once comparable is implemented by the model class you can sort by calling Collections.sort(list) method.
		
		e.g. 
			
			public class Employee implements Comparable<Employee>
			
			public String name;
			public int age;
			public int salary;
			
			//returns 
				//1 if this.age is greater than e.age
				// 0 both are equal
				// -1 if e.age is greater than this.age
			@Override
			public int compareTo(employee e){
				return this.age  - e.age;
			}
		
		Once it is implemented now you can sort by calling:
		
		Collections.sort(arraylist);  //it will sort based on the comparable interface 
		
		
		
		
		
		
		Comparator: 
			
			- one of the advatage is that you can create sorting based on multiple elements.
			- use compare(T obj, T obj1) method. Does not affect the model class
			- part of java.util package
			- once comparable is implemented by the model class you can sort by calling 
			  Collections.sort(list,comparator) method.
		
		
		e.g. 1 : within the service implementation or in the main method
		
		
		Comparator ageSorting  = new Comparator(){
			
			@Override
			public int compare(Employee e1, Employee e2){
				return e1.age.compare(e2.age);
			}
		};
		
		Collections.sort(lst, ageSorting);
		
		
		
		
		e.g.2 : By creating  separate class
		
		public class SalaryComparator implements Comparator<Employee>{
		
			@Override
			public int compare(Employee e1, Employee e2){
				return e1.salary.compare(e2.salary);
			}
		}
		
		now in the service or main class :
		
		Collections.sort(lst, SalaryComparator);
		
