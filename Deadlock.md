## Deadlock

1. In multiprogramming system, a number of process compete for the limited number of resources, and if a resource is not available, at the instance, then process enters into waiting state.

2. If that particular resource is being held by another process for indefinite time, then the situation is called to be a deadlock.
        ![Deadlock](https://media.geeksforgeeks.org/wp-content/uploads/Slide1.jpg)


      Can be easily understood using Resource Allocation Graph
       
##### System Model:

1. Every process follows a system model.
2. Every resource is requested by OS
3. Not necessary that process gets resource.
4. Process have to relieve the resource after it's execution.

### Conditions for causing Deadlocks

1. Mutual Exclusion:

    At least, one resource type in the system can be used in non shareable mode, i.e. mutual exclusion (one at a time, one by one) for example: Printer

    Critical Section can be accessed by one process only.
2. Hold and Wait:

    
