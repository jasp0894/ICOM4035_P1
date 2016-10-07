******************************README*****************************

Author: Jesus Antonio Sanchez Perez
File: ICOM4035 Data Structures
Version: 1.0
SN: 840-12-8088

*****************************************************************


This document describes the general behavior of P1_840128088.
The main idea of the project is to estimate the execution time
it takes the host computer to execute the code that determines
the frequency distribution of all the elements in a dataset.
Three different strategies to accomplish the mentioned task
are tested:sequential, ordered, map. 

The project is a Java coded project which consists of 3 packages 
that divides the strategy implementation, testing, and experimentation.
Each package contains multiple classes that address the desired
functionality. 


------------------------------------------------------------------
			GENERAL DESCRIPTION
------------------------------------------------------------------


The project is contained in the folder named P1_4035_840128088_161.zip


P1_4035_840128088_161/P1_840128088      contains all project's contents

  ~/P1_840128088/bin                         contains all class files

  ~/P1_840128088/src                            contains all packages

     ~/experimentalClasses              This package contains the class that 
					starts the experimentation that will
					estimate the execution time of the 
					three different strategies.
          ~/ExperimentalTrials.java





    ~/strategyClasses                  This package contains all classes 
					that that implement a strategy.
          ~/FrequencyCounter.java
          ~/MapFD.java
          ~/OrderedFD.java
	  ~/SequentialFD.java
     

    ~/testerClasses                     Contains tester classes for each 
					strategy.All classes are sub-classes
					of strategyTester.java   
          ~/strategyTester.java         
          ~/SequentialTester.java
          ~/MapTester.java
          ~/OrderedTester.java                    
   

    ~/experimentalResuts		Contains text files for the result of 
					each strategy. The result is a Time vs
					Input Size plot.	     
          ~/resultsMap.txt
          ~/resultsOrdered.txt
	  ~/resultsSequential.txt	

    ~/inputData				Contains text files with given input
					data (integers and strings) to test	
					the functionality of each strategy	     
          ~/integerData.txt
          ~/stringData.txt
	
    

  ~/P1_840128088/doc                     contains Javadoc files	
   



------------------------------------------------------------------
		      EXECUTION INSTRUCTIONS
------------------------------------------------------------------

~/testerClasses contains three classes that provide main method. Also
~/experimentalClasses/ExperimentalTrials.java.Therefore, to launch 
these classes it's neccesary to compile and run them.

Steps to run in eclipse IDE:

(1) Create an empty java project.

(2) Import P1_4035_840128088_161.zip and save it on the empty folder.

(3) Go to P1_840128088/src and drag and drop all its content onto
    the default package created automatically for the java project.
    Now called src too.

(4) Go to src of the  created java project and open testerClasses or
    experimentalClasses package.

(5) Open, for example, testerClasses/MapOrdered.java and run it.
    The same applies for ~/experimentalClasses/ExperimentalTrials.java


Steps to run from CMD:

(1) Navigate to a workspace or directory that contains the project
    named, say, p1j.

(2) Go to ~/p1j/src/testerClasses from the command line prompt

(3) call the java compiler to compile all source files in that folder.
   
     ~/p1j/src/testerClasses> javac -cp .. *.java
     
    *NOTE: make sure to leave the whitespaces

(5) Go back to ~/p1j/src by typing

     ~/p1j/src/testerClasses> cd ..

(6) From there, execute the JVM to run any of the strategies:
    For example,

    ~/p1j/src>java testerClasses/MapTester

(7) The same concept (steps 2 to 6) applies for the execution of
	 ~/experimentalClasses/ExperimentalTrials.java
    where the package will be experimentalClasses instead of
    testerClasses.
	









