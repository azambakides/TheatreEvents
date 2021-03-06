# Theatre Events System
***
A Command Line Application for the development of Theatre Events System using only Java. 

**The Inspiration:**

The inspiration for this app came to me in the shower after I had seen _The Game Plan_ that starred Dwayne "The Rock" Johnson. In one scene, he danced a beautiful ballet with Roselyn Sanchez, which made me realise how much I miss the theatre, and I thought something theatre related would be good for this Command Line Application.

## Statement of Purpose

---
**What this application will do:**
  
The aim of this application is to create the development of a Theatre Events System app. Here, users can search for, and book theatre shows, with ease and simplicity.

**What business problem it addresses:**

The app addresses the problem of scrolling through a long list of show titles until the user finds the one they want. With this app, the user can simply search for a show by putting in the name of the show they wish to see, and it will appear. If the show they wanted is not available, they do not leave empty-handed, as they are given a list of possible shows that they could see instead.

**The target audience:**
    
The target audience of this app are fans and lovers of art and culture, who want a simple and easy way to search for a show that will be part of their next cultured trip.
  
## Features

---
1. The users type in the name of the show that they want to see into the input
2. If the show they wish to see is available, an output of the name of the show will appear, along with the show date, show time, and price
3. If the desired show is unavailable or if they input a wrongly-named show, the output gives an apology and presents a list of available shows that they could see instead

## Implementation Plan

---
| Step | Process or Task | Members    | Comments | 
|------|------------------|------------|----------|
|1 | Made first commit by creating the repository in GitHub and linking it to Intellji |
|2 | Added the first files of the project set-up | .gitignore, pom.xml, App.java, AppTest.java
|3 | Created three shows: a ballet, a play, and a musical, and printed them to the console| Main Class: Hello world, Show showOne/showTwo/showThree, System.out.prinln (x3). Show: private LocalDateTime and nameOfTheShow, Constructors, Getters/Setters| Also renamed file names of the main class to Main and the test to MainTest|
|4 | Refactored Show to ShowTemplates, created a new class called Show, and added an extra show, totalling in four shows | Main: System.out.Println (x3) with two greetings and on show name only | Testing the printing to the console
|5 | Refactored ShowTemplates to TheatreTemplates, created a new String of three different show times to all four shows, and made new Constructors, and Getters/Setters | TheatreTemplates: Strings, Constructors, Getters/Setters, Show: Public Static linking back to TheatreTemplates with details of the shows
|6| Got started on the README.md file with bullet points for Statement of Purpose and Features
|7| Printed out the Welcome messages with all four shows shown with all the dates, times, and prices | Main: System.out.println only | Tested the printing to the console again with all shows
|8| Added a bit more to the README.md, as it's better to keep doing it as the project progresses. Tried to make a ArrayList, but was unsuccessful, thus commented it out | Show: unsuccessful attempt at an ArrayList |
|9| Tested an ArrayList and a For/Each Loop to try and print all my shows altogether | TheatreTemplates: PrintShow(), Show: List.of()
|10| Tidied up the printShow() in TheatreTemplates to make it easier to read when it is printed to console, and changed the show times and prices while adding AUD at the end | Same as above |
|11| Added the Dollar ($) in front of the prices, added a Collections getAllShows() method, add said method to the For Loop | TheatreTemplates: Added Dollar ($); Main: For Loop with getAllShows() method
|12| Added a fifth show of a classical concert, reduced show times back to one single time to make the code cleaner, changed the musical to a simpler name, and changed the Welcome message | TheatreTemplates: had to redo the Constructors and Getters/Setters when the showTime went back to one single time | Also made the price one cent less than the rounded price, so that all the digits print to the console
|12| Created the User Input: deleted the original second greeting and made a Conditional If/Else Statement with the console of "If" printing the correct show with a name and parting statement, and "Else" apologising fo the show not being found| Main: User Input with Scanner, boolean true/false, iteration of If/Else Statement
|13| Added a PrintAllShows() in the If/For Loop, if a show was not found | Main: printAllShows()|
|14| Slightly amended the Apology line in the User Input for when a show is not found, extracted the If/Else Statement for the MainTest, and made two tests - one of assertTrue if the show does exist, and one for assertFalse, if the show does not exist  | MainTest: test_Show_Found_If_Exists(), test_Show_Not_Found_If_Does_Not_Exist()|
|15| Added a .trim() to the If/Else Statement in case the user inputs a space or two, changed "but" to "however" to avoid negativity and corrected the grammar in the same line | Main: .trim()|
|16| Renamed the flowchart, embedded the flowchart in the README.md under the flowchart heading| | Had difficulty getting my flowchart to show up embedded, but I fixed it with a different technique to what I had learnt before
|17| Added comments in Main, Show, and TheatreTemplates | | Just in case comments were needed |
|18| Continued filling out the Documentation by adding to the README.md: fattened out the Statement of Purpose and made it look neater, added the Features, and started on the table for the Implementation Plan, and added a Command Line App Flowchart, which I designed in [Canva](https://www.canva.com)| | See flowchart below |
|17| Finished the Implementation Plan, committed the final whole project to GitHub and sent Zip file to the tutors |

## Command Line App Flowchart

---
![Command_Line_Flowchart](Command_Line_Flowchart.png)



