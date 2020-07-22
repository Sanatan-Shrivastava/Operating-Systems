#### Multiprogramming Operating System:

## Multiprogramming is not running two processes concurrently. It is executing other program if one program is on hold.

![MOS](https://www.includehelp.com/operating-systems/images/multiprogramming.jpg)

1) MOS increased CPU clock utilization; Spooling was 100%
2) Multi Processing in MOS
3) Main memory executes another process if current program is held. [ Context Switch ]

4) CPU does not sit idle.
5) CPU takes another program from main memory, hence lot of context switching.
6) CPU continues step 5 until processes in main memory are executed.

#### Advantages

1) High CPU clock utilization.
2) Less waiting time, response time etc.
3) Handles more load/applications easily.

#### Disadvantages

1) Scheduling becomes difficult.
2) Main memory management is required, due to more context switch.
3) Memory fragmentation, to store midway ran processes.
4) Paging => Non Contiguous Memory Allocation.
