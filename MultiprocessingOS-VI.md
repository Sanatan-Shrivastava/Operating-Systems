### Multi-Tasking Operating System

**Many Processor - Many Pocesses - Context Switch per process**
##### True parallel executing

       Two or more CPU with a single computer in a close communication sharing the system bus, memory and other I/O devices.


![MOSII](https://edux.pjwstk.edu.pl/mat/264/lec/ark16/Image8183.gif)

1) True concurrent execution.
2) Symmetric => One OS control all CPU, No master - Slave architecture
3) Anti - Symmetric => Master - Slave Architecture or Client - Server Architecture.
there are dedicated CPU for every operation, and has one CPU handling these dedicated client CPU.


#### Advantages:

1) Better Throughput - process per unit execution is better.
2) Better Reliabilty
3) GraceFul degradation => Failure of one processor, does not affect other processors.
4) Cost is saved -> Low perf more processors are cheaper than One better perf more processors.
Only cost is of CPU, not of disks, Bus, and all components.
5) Battery efficient.
6) Actual parallel computing.
7) Less loading, hence less heating.

#### Disadvantages:

1. More main memory consumption
2. More overhead, hence throughput less than ideal or expected throughput
**Overhead - Buses, and other comps are sharing.**
3. Quite complex architecture of the whole system.



        Advantages >>>>> Disadvantages