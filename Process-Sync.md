## Process Sync:

Critical Section: Area in process where resources are shared either by hardware or software.

#### How to solve a Critical Section:
* Always take care of mutual Exclusion - One resource must enter critical section alone at a time. 

### Race Condition:
* When two process try to enter critical section together, then the situation is called RACE CONDITION.

        **TRY YOURSELF!**

        P1() {              
            C = B - 1;          - 1
            B = 2*C;            - 2
        }

        P2() {
            D = 2*B;            - 3
            B = D - 1;          - 4
        }
        Initial value of B = 2.
        What are different values of B?

**Race Condition:** A situation where several processes access and change the data concurrently and the outcome depends upon the order in which the execution takes place.

### Critical Section Problem:

There are 3 criterias, to prove that the critical section problem is valid when solved:

1. Mutual Exclusion: CS must be accessed by one resource at a given time.    ***MANDATORY***

2. Progress: Only those processes should enter CS who actually want to. ***MANDATORY***

* Although system will still be consistent and upright, but this decreases Efficiency.

3. Bound & Wait: 

* There must be a maximum bound upto which a process should wait, indefinite wait leads to starvation.
***NOT MANDATORY, OPTIONAL***

First two should be followed, while the third one can be/cannot be followed through.

