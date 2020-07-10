<h2>Collections : </h2>
          
      In simple terms if we are talking in terms of numbers or group we need something to store. let say if we want to store a single number we can use 
      either long, int, short or if we want to store a single name we can use String but what if we want to store mulitple or group of name of numbers then 
      what do we use to store it. 
 
      Java has provided something called `Collections` or `Collections Framework` which helps in storing and processing the data efficiently. It has multiple
      classes and interfaces for storing data. 
      
      Now the question is why multiple classes or interace ? well each class or interface has its unique funtionality that will be helpful for a particular 
      use case. For example I need to store a list of numbers and want to maintain the order in terms of how i am storing I should retrieve in same manner and
      also i can include null and duplicate numbers. In that case Arraylist, Linkedlist or Vector is helpful.
      Similarly each class or interface has it unique functionality and based on that we can store the data in those classes based on the requirement.
      
      

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
              
 <br><br>
 
 <h3> LIST </h3>
 
       - ordered collection
       - contain duplicate elements
       - contain null value
       
       
        ARRAYLIST
          
          - ordered collection, maintain the insertion order that means if we insert numbers like 23, 54, 22 will get in the same order while retriving
            i.e. 23, 54, 22.
          - contain duplicate elements
          - contain null value
          - is non synchronized
	      - good for search and traversal
          
          
          HOW ARRAY LIST WORKS INTERNALLY </b>
           -  It uses array of Objects
           -  whenever we create an object of array an array is created with the default size of 10
           - in the case the array is full it will create a new array with the double capacity and push the elements in the new array
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
            - lastIndexOf(element)  - will check the element in the list and return the index of the element fat last place.
            - contains(element) - check if the element is part of list.
            - sublist(start index, end index) - create a sublist or small arraylist from arraylist based on the start and end index
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
                      :->  we can add comparator method outside Model or object class, each comparator can refer to different data like  for employee 
                      one sorting based on age, one sorting based on name etc.
                        
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
	
	 	HOW ARRAY LIST WORKS INTERNALLY </b>
	 	
			similar to array list just that the functions are synchronized
	
		IMPORTANT FUNCTIONS OF VECTOR 
			same what arraylist has..
		
