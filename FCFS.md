## FCFS Scheduling algorithm:

#### First Come First Serve:
1. Simple Scheduling algorithm, it assign the process which arrives first.
2. Easy to understand, quite simple.
3. Implemented thorugh Queue Data Structure
4. Always Non Premptive in nature => Voluntary Releasing of CPU by any process.
5. Average Waiting Time is not optimal.

        Pid         AT         BT       CT     TAT     WT
         A          3           4       7       4      0
         B          5           3       13      8      5
         C          0           2       2       2      0
         D          5           1       14      9      8
         E          4           3       10      6      3

        Prepare the Gantt Chart:

        C   A   E     B     D
       0-2 3-7 7-10 10-13 13-14

       Hence average WT and average TAT can be found easily.

**If arrival time is same, Sort according to PID**
**Burst Time does not matter in FCFS**

