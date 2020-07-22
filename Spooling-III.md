## Spooling:

![Spooling!](https://4.bp.blogspot.com/-9HBZ7aIgSew/W11bF3xv4RI/AAAAAAAAGpA/dUgKkWeTNkc-vF0NMabO7wrv0iIrjFEwQCLcBGAs/s1600/spooling-in-os.png)

**SPOOL - Simultaneous Peripheral Operations Online.**

***Online means - During CPU operation.***
* Concurrent I/O ops during CPU ops.

1) Input is given
2) Input stored in disk
3) Input is fetched from disk by CPU for processing
4) Processed by Main Memory
5) Processed Input is stored in Disk
6) Output is fetched from disk.

I/O Device interaction with CPU is minimised, CPU interacts with Disk.

-> Spooling increases CPU utilization.

#### Advantages

1) No interaction of I/O with CPU - CPU can do other ops
2) CPU utilization increased.

#### Disadvantages

1) In starting, the spooling was uniprogramming.

        - CPU does not used to perform other ops in BOS.
        - No context Switch.
        - Multiprogramming will solve this error.
