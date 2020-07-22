### Convoy Effect:

When a smaller process has to wait for CPU for an definite time, it is called a convoy effect!

if process with more processing time are executed first, the process with smaller processing time are delayed in their execution by a larger amount of time, and hence can suffer from convoy effect.

Convoy blocks the road => reference.

#### Advantages:

1. Easy to use
2. useful where execution is not needed -> background processes.
            for ex: Syncing of data


#### Disadvantages:

1. Convoy Effects
2. No inclusion for burst time
3. Only used for non interactive systems.

### Is starvation possible in FCFS? 
**The Answer is a definite NOOO!**

    DeadLock >>>>  Starvation >>>> Convoy Effect.
                       |
                    Processer is biased in starvation.