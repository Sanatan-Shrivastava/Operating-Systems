### Batch Operating Systems

* They were used mainly in main frames computer
* They commonly used magnetic tapes and Card readers - for ex tapes found in Audio Tapes
* Input was given in form of punch cards
* Ouput was given in form of punch cards after processing - PC, Control Instruction, Input data given firsthand
  * Job -> [Program + I/P data + Control Instruction + Program Counter]

* Memory was very much limited only upto Kb(s)
* Speed Mismatch - timing of output and input.
* Example - FORTRAN Batch, COBOL Batch

        *                   CPU
                             |
                             OS
                             |
           Input -----> User Program -----> Output

1) Input jobs were given in form of batches:

    ![Batch OS scheme](https://www.includehelp.com/operating-systems/images/batch-operating-system.jpg)

    * Operator sorts jobs according to similar needs into batches.
    * these batches are executed through a processor as a group
        * for example: Similar Languages need similar compiler to be executed.
    * Batches are sorted in deck of punch cards

#### Advantages of BOS

1) In a BOS, time is saved because of no loading or linking

2) No interventon of user, not an user interface. So NO MANUAL INTERACTION.

  [Note:] **CPU and memory both are very important.**

#### Disadvantages

1) Memory management -> Limited Memory
2) Interaction of I/P and O/P devices directly with CPU
