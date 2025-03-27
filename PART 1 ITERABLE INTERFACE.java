                                              "COLLECTION FRAMEWORK"
											  
**AAJ HUM COLLECTION FRAMEWORK START KR RHE HAI AUR ISKE BARE MEIN SAMJHENGE KI ISKO KIS VERSION MEIN 
INTRODUCE KIYA HAI AUR ISKO INTRODUCE HI KIS PERPOSE SE KIYA HAI YDI HUM ISKA KARAN SAMAJH LENGE KI KYU 
INTRODUCE KIYA HAI TO HME AAGE ISKE BAARE MEIN PADNE MEIN AASANI HOGI. ISKO PADNE KE PEHLE AAPKO BTA DETE 
HAI KI YEH BHOT HI IMPORTANT CONCEPT HAI MERI BAAT KO SAMAJHNA YEH KOI FEATURE YA TOPIC NHI HAI YEH 
CONCEPT HAI DATA STRUCTURE KI TARAH JESE HUM DATA STRUCTURE KO USE KRTEY HAI CONDITION KE ACCORDING 
THIK USI TARAH HUM ISKE INTERFACE AUR CLASSES KA USE KRENGE OR ISKI METHODS KA ACCORDING TO CONDITION**

**TO PEHLA QUESTION YEH HAI KI COLLECTION FRAMEWORK KYA HAI?ISKO KIS VERSION MEIN INTRODUCE KIYA?AUR 
ISKO INTRODUCE KRNE KA KYA PERPOSE HAI**

=>Collection Framework isliye kehte hain kyunki yeh collections(Object ka collection) ko manage karne ke liye 
ek structured aur framework provide karta hai, jo consistent, reusable, aur efficient hota hai.

=>Collection framework ko java ke version 1.2 mein 1998 mein introduce kiya hai.

=>Collection framework ke aane ke piche mein reason hai array ki limitations.
1)Array ke case mein fixed size ka array banta hai.
for example mujhe need hai mere according ki 100 member ka aaj admission krna hai aur date wise array bna 
rhe hai aur 10 hi member aaye to memory waste ho gai.
agle din mene socha ki kl to km member aaye the to aaj ki date ke according 10 capacity ka hi array bna lu
or aaj 150 member aa gye or hme pta hai ki ek baar array ki size fix krke array bna diya to phir use change 
nhi kr saktey kyuki fix size hoti hai .

->Collection mein growable nature ka array hota hai,jitni capacity hai array ki ydi wo full ho jati hai
aur hum jab next element store krwatey hai to iss condition mein new array banker teyar hota hai 
double size ka or usme first array ki sari value copy ho jati hai uske baad new value jo hai wo store ho jati
hai. Ab jo variable previous array ko point kr rha tha wo ab new array ko point krega or first array jo  tha 
wo garbage collection ke liye illigible ho jayega.

2)Array mein hum sirf homogeneous type ka data hi store krwa saktey hai.

->Collection ke case mein hum Homogeneous and Heterogeneous dono type ka data store krwa saktey hai.
in the form of Object . Collection ke case mein her kaam Object ke form mein hoga.

3)Array ke case mein hume koi internal data structure provide nhi kiya hai taki hum usme extra predefined method 
use kr sake.

->Lekin Collection ke case mein hme methods provide ki hai collection ne jisse hum sare operation easily perform 
kr saktey hai .
-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_

**TO NEXT QUESTION YEH HAI KI ARRAY USE KRNA BETTER HAI YA COLLECTION USE KRNA BETTER HAI**

=>Jab hume pta hai exact data ki kitni size ka array bnana hai to iss condition mein array ka use krna hi 
better rhega .
lekin ydi hme pta hi nhi hai ki kitni size ka array bnana hai to iss condition mein hume collection ka 
use krna better rhega.

-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_

**AB HUM COLLECTION INTERFACE KI HEIERARCHY DEKHENGE JISKE BASE PR AAGE HUM PURA COLLECTION PADNE WALE HAI**

=>YHA HUM ROOT SE SHURUAT KRENGE OR DEKHENGE KI KON INTERFACE OR CLASS KISSE KISSE EXTENDS OR IMPLEMENTS HAI.

                                                                        
										                     java.lang.Iterable("interface")	
                                                                         |
                                                                         |
                                                            java.util.Collection("interface")
	                                                                     |
                                                                         |
         ----------------------------------------------------------------------------------------------------------------------------																		 
			|		                                                    |					                                      |
			|                                                           |                                                         |                                        
			|                                                           |                                                         |
			|                                                           |                                                         |	
    List("interface")                                            Set("interface")                                        Queue("interface")
      |                                                          1.|                                                      |
        ->ArrayList("class")                                         ->HashSet("class")                                     ->PriorityQueue
        ->LinkedList("class")                                            |                                                  ->BlockingQueue
        ->Vector("class")                                                  ->LinkedHashSet("class")                             |
            |                                                    2.|                                                              ->PriorityBlockingQueue
              ->Stack("class")                                       ->SortedSet("interface")                                     ->LinkedBlockingQueue
                                                                         |
                                                                           ->NavigableSet("interface")																		   
     			                                                           ->TreeSet("class")                                                       


=>Abhi hum itna dekhenge  jo heirarchy uper  hai usko detailed mein step by step samjhenge aur program bhi bnaker 
dekhenge.										  										  


1)Sabse pehle humne dekha ki java mein jitne bhi classes hai sabhi ki super class(base class)
Object class hai.

**->Object class ko hi base class kyu rakha hai?

=>Java create krne wale developers se socha ki java mein jitni bhi predifined ya phir user defined classes 
hai  sabhi ke objects ko ek common functionality diya jaye jese common methods aur common oops ke principles etc.

=>Common oops ke principle se mtlb yeh hai ki inheritence,polymorshism, Ab jab object class sabhi classes ki 
super class rhegi to object class ka refrence variable create krke hum kisi bhi class ke object ko hold krwa 
saktey hai.

=>Agar har class ka ek common parent hoga, to Java runtime environment ko objects ko handle karne mein 
asaani hogi. Jab koi object ko generic form mein handle karte hain, wo sabhi objects ko Object class se treat 
kar sakte hain.




                                             2)"ITERABLE(interface)"
											 
->iterable ek functional interface hai

->iske pass total three methods hai jisme 1 abstract method hai aur 2 default method hai
                    (a) public abstract java.util.Iterator<T> iterator();
                    (b) public void forEach(java.util.function.Consumer<? super T>);
                    (c) public java.util.Spliterator<T> spliterator();

->Agar koi collection Iterable implement karta hai, to tum for-each loop se uske elements ko easily print kar
sakte ho.

**To kya for loop se iterate nhi kr saktey hai kya **
-> hum for loop se bhi iterate kr saktey hai lekin hme uska size pta hona chahiye ek condition to yeh hai
aur dusri yeh hai ki ydi hum iterator method ka use kr rhe hai to menually hme Iterator ka object create krna 
hoga or uss interfacek ki methods ko override krna hoga.

**TO KYA FOR-EACH LOOP MEIN HME ESA NHI KRNA PADTA HAI **
->Ha hme for-each loop ke case mein esa kuch nhi krne padta hai, for-each loop  automatically iterator() method
ko call krta hai or iss method ka return type hai Iterator<> interace then Iterator interface ki internally
hastNext() and next() method work krti hai.				


**TO KYA FOR-EACH LOOP NORMAL ARRAY OR COLLECTION KE CASE MEIN SAME HI WORKING KRTA HAI **

->NHI, for-each loop normal array ke case mein internally "array.length" method add krta hai or last index tak
program ko execute krta hai, kehne kamtlb yeh hai ki yeh normal for loop ki tarah hi work krta hai.

Aur Collection ke case mein for-each loop internally "iterator()" method ko add krta hai, iterator method 
iterate krta hai aur Iterator jo ki iska return type hai us form mein return krta hai
fir Iterator interface iske pass rakhi hui methods hasNext() and next() method ka use krke process ko execute 
krta hai .


**FOR-EACH LOOP KESE PTA CHALTA HAI KI HUMNE ARRAY LIYA HAI YA PHIR COLLECTION LIYA HAI **
->for-each loop ko pta chalta hai ki uske ander kya pass kiya hai normal array ka variable pass kiya hai 
ya phir kisi class ka object pass kiya hai.


**TO COLLECTION KE CASE MEIN HME FOR LOOP KA USE KRNE CHAHIYE YA PHIR FOR-EACH LOOP KA USE KRNA CHAHIYE**

->Hum collection mein dono type ke loop ka use kr saktey hai lekin 
1)For-each loop: Simpler, cleaner code ke liye, jab tumhe index ki zarurat na ho.
2)Simple for loop: Agar tumhe index ya position ki zarurat ho.


-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_

"AB HUM KUCH PROGRAM BNAKER ISKO SAMAJHTEY HAI ITERABLE INTERFACE KO AUR ISKE SATH HI FOR LOOP AUR FOR-EACH" 
"LOOP KO BHI OR DONO LOOP KE SATH INTERNAL WORKING KO BHI SAMJHNE KI KOSHISH KRTEY HAI "

"STEP:-1"

Program:-1 Simple program using for loop

class DEMO
{
public static void main(String ar[]){
	int x[]={1,2,3,4,5};
	for(int i=0;i<x.length;i++)
	{
		System.out.println(x[i]);
	}
}
}


Program:-2 previous program ko ab hum for each loop mein convert kr rhe hai 

class DEMO
{
public static void main(String ar[]){
	int x[]={1,2,3,4,5};
	for(int i:x)
	{
		System.out.println(i);
	}
}
}

NOTE:-
Yeh hme yaad rakhna hai ki normal array ke case mein for-each loop ka internal working kuch esa hota hai:-
    for (int i = 0; i < x.length; i++) {
            int i = x[i];
			System.out.println(i);
	}
iska mtlb yeh hai ki normal for loop ki tarah hi work krta hai.


------------------------------------------------------------------------------------------------------------------

"STEP:-2"

Program:-1 Simple Iterable interface ka object create krte hum simple for loop ki help se data ko 
iterate krenge.


import java.util.*;
class demo1
{
	public static void main(String ar[]){
		
		List<String> l=new ArrayList<>();
		l.add("ram");
		l.add("sita");
		l.add("gita");
		
		Iterator<String> i=l.iterator();
		for(int f=0;f<3;f++){
		if(i.hasNext())
		{
			String s=i.next();
			System.out.println(s);
		}
	}
	}
} 


Program:-2 previous program 1 ko hi hum ab for each loop ki help se implement krenge to dekhenge ki 
kya kya changes hai 

import java.util.*;
class demo1
{
	public static void main(String ar[]){
		List<String> l=new ArrayList<>();
		l.add("ram");
		l.add("sita");
		l.add("gita");
		for(String s:l){
			System.out.println(s);
		}
	}
	}

NOTE:-
for-each loop ki wajah se hme code bhi km likhna padta hai or hmara code clean dikhta hai.

Aur collection ke case mein for-each loop ki internal working kuch ese hoti hai:-

Iterator<String> iterator = l.iterator();  // Get the iterator for the List
while (iterator.hasNext()) {               // Check if there are more elements
    String s = iterator.next();             // Get the next element in the List
    System.out.println(s);                  // Print the element
}

iska mtlb for-each loop internaly while loop use krta hai.aur uske sath wha implement bhi kr deta hai 
aur aurtomatically iterator method ko call bhi kr deta hai internally.

------------------------------------------------------------------------------------------------------------------



**Iterator kya hai aur iske pass total kitni methods hai**

->Iterator interface hai aur yeh util package mein rakha hua hai .

->Yeh ek esa mechanism provide krta hai jiski help se hum collection 
ke elements ko easily traverse kr saktey hai squence se .

->Is interface ke pass total four methods hai :-
                   (a) public abstract boolean hasNext();
                   (b) public abstract E next();
                   (c) public void remove();
                   (d) public void forEachRemaining(java.util.function.Consumer<? super E>);
------------------------------------------------------------------------------------------------------------------

				   
	
	
	



					


