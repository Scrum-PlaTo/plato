# PlaTo - Planning To Calendar
This readme briefly describes how to get PlaTo up and running, considering:
1. You have **JAVA_HOME** pointed to `JDK-14` in your environment variables
2. You have installed `NetBeans IDE 12.1`
3. You know how to **pull** this repository, create your own **branch**, and **push** your changes to this branch.

## 1 - JAVA_HOME and JDK-14
Open up a command prompt (Windows+R, type `cmd`, press enter) and check your java version (`java -version` and `javac -version`).

You're good to go if your version is 14.x.x.
Otherwise, [download JDK-14](https://download.oracle.com/otn-pub/java/jdk/14.0.2+12/205943a0976c4ed48cb16f1043c5c647/jdk-14.0.2_windows-x64_bin.exe) and follow the installation process.

Next, type `systemvariables` (or in dutch: `omgevingsvariabelen`), which will lead you to the following screen

![Systemvariables](https://github.com/TELangelaar/plato/blob/master/plato-howto/systemvariables.png)

In `Uservariables` (`Gebruikersvariabelen`), click on `new`. A dialog opens up. For the name, enter `JAVA_HOME`. For the value, press on `Search in Active Directory` and point it to your JDK-14 installation directory (eg C:/Program Files/Java/jdk-14.0.2 ). Confirm.

Press on your `Path` variable and press `edit`. In the dialog, press `new` and type `%JAVA_HOME%\bin`.

You're all set! Confirm and exit.

## 2 - NetBeans
[Download Apache NetBeans 12.1](https://ftp.nluug.nl/internet/apache/netbeans/netbeans/12.1/Apache-NetBeans-12.1-bin-windows-x64.exe) and follow the installation process.
