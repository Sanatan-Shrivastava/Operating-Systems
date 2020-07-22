### Approaches of CPU Scheduling:

                    CPU Scheduling
                    /           \
                Premptive   Non Premptive

1. When Process voluntarily leaves CPU, for another process after its execution, its called Non Pre-emption.
2. When Process is snatched from one process for another more priority process or when process is fixed to run for a fixed time interval, it is called Pre-emption.

3. This Fixed time interval is called Time Quanta.After a particular time quanta, after the quanta is expire, process context switch is performed. Server CPU outlooks this over clients.

4. More priority may include any external device IO bound process.

5. There are few criterias on which we decide which scheduling algos work better.

### Terminology related to Scheduling:
- Arrival Time - Process when enters in ready state.
- Burst Time / Execution Time / Running Time
- Response Time
- Execution Time might involve IO time.
- Waiting Time : Time spent by process in ready state for CPU.
- Completion Time : Process gets completed and PCB is deleted.
- TurnAround Time = CT - AT = WT + BT [ Time spent by process in a system ]
- Response Time : Time between a process enters a ready queue and get scheduled for CPU for very first time.

### Criterias for a better Scheduling Algorithm:
1. Average Waiting Time - better time complexity, should be less.
2. Average Response Time - Better res time should be very less.
3. Throughput - execution per process
4. CPU utilization


No algorithm follows all criterias but all are safe for certain-certain operations.
