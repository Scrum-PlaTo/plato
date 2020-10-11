# PlaTo - Planning To Calendar
This readme briefly describes how to get PlaTo up and running, considering:
1. You have **JAVA_HOME** pointed to `JDK-14` in your environment variables
2. You have installed `NetBeans IDE 12.1`
3. You know how to **pull** this repository, work on your own **branch**, and **push** your changes to this branch.

## 1 - JAVA_HOME and JDK-14
Open up a command prompt (Windows+R, type `cmd`, press enter) and check your java version (`java -version` and `javac -version`).

You're good to go if your version is 14.x.x.
Otherwise, [download JDK-14 Windows x64 Installer](https://www.oracle.com/java/technologies/javase-jdk14-downloads.html) and follow the installation process.

Next, type `systemvariables` (or in dutch: `omgevingsvariabelen`), which will lead you to the following screen

![Systemvariables](https://github.com/TELangelaar/deb-install/blob/master/plato-howto/systemvariables.png)

In `Uservariables` (`Gebruikersvariabelen`), click on `new`. A dialog opens up. For the name, enter `JAVA_HOME`. For the value, press on `Search in Active Directory` and point it to your JDK-14 installation directory (eg C:/Program Files/Java/jdk-14.0.2 ). Confirm.

Press on your `Path` variable and press `edit`. In the dialog, press `new` and type `%JAVA_HOME%\bin`.

You're all set! Confirm and exit.

## 2 - setting up your NetBeans IDE and importing the PlaTo project.
[Download Apache NetBeans 12.1](https://ftp.nluug.nl/internet/apache/netbeans/netbeans/12.1/Apache-NetBeans-12.1-bin-windows-x64.exe) and follow the installation process.

Next, clone this repository to a destination of your choosing. If you are unfamiliar with git and/or GitHub, press the `Clone` button on the [landing page](https://github.com/TELangelaar/plato) and press `Download Zip`.

Two options to run the application:
1. Open up a command prompt, go to the project folder (`C:/YOURPATH/plato`) and type `mvnw clean javafx:run`.
2. ~~Open NetBeans and open the project you just cloned/downloaded. Press `Run` (F6).~~ IM NOT SURE IF THIS WORKS YET

The first option uses a [Maven](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html) wrapper (**M**a**V**e**N** **W**rapper). This means the correct Maven version gets installed. Afterwards, it handles the dependencies and the various lifecycles of building a project.

The second option probably only works if Maven is already installed, but since I haven't been able to test it, I'm not sure.

Congrats, you can start working on PlaTo!

## 3 - Start contributing to the project - GitHub starting guide.
(IE, for the hackathon, my proposal is to create separate branches based on the different modules that teams will be working on.) We can provide access to these branches for these teams only, and they can create pull requests once they are finished. UPDATE: creating protected branches with specific user access can only be achieved when a repository is owned by an organisation. Furthermore, we would be able to create several repo administrators instead of only one owner.

In sum, teams will be asked to take the following steps:
1. Fork the project (or work on your designated branch).
2. Create a pull request indicating your changes.
3. Continue to make changes on this pull request, providing detailed descriptions of added features / bugfixes / whatever else comes up.
4. Ask for a pull request review.
5. If everything is in order, the changes will be merged into the master branch.

[Click here](https://guides.github.com/introduction/flow/) for a good GitHub workflow overview

# Maven & File structure
The pom.xml is the file which 'builds' our project. It stands for **P**roject **O**bject **M**odel. It contains maven plugin, dependencies, configuration details, source and target directories and the entry point (class) to the application. 

In short, the file structure is as follows:
1. src
    + main
      + java
        + com
          + teamplato
            + plato
              + dal --> Data Access Layer. Retrieves data from the database and makes it accessible to the bol.
              + bol --> Business Object Layer. Creates new objects to hold data and handles all the logic.
              + gui --> User Interface Layer. Holds the Model-View-Controllers and handles the fxml files.
              + PlaTo.java (entry point)
      + resources - has the same structure underneath it as main. Contains the fxml and css files.
    + test - has the same structure underneath it as main. Contains the test classes (or should contain...).
2. target
    + classes
        + com.teamplato.plato --> dal/bol/gui
    
It can be daunting, but it isn't. Consider the following: all the classes you make should be placed in either the **dal**, **bol** or **gui** sub-directories under **main**. Any static files (.css/.fxml/.html/.js/.sh/.c/.ts/.md/....) should be placed in the same relative directory as the class that uses that file, but under **resources** instead. 

Likewise, the relevant test classes should be placed in the same relative directory as the class or package that it tests, but under **test**. If you quickly want to try something out in a temporary class, please do not call this file `Test.java`. Maven will detect it as a test class and stuff will break.

Lastly, when you run `mvnw clean javafx:run`, maven will take everything from the src directory, and place it with the correct structure in the target directory. In other words, this will contain the binary files.
