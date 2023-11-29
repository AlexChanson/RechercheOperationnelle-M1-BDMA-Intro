# Recherche Operationnelle - Introduction
### M1 BDMA 2023-2024
## Subject
During classes, you have studied two typical Operation Research problems, the Knapsack Problem (KP) and the Travelling Salesman Problem (TSP).
We will now study algorithms used to solve the TSP. Starting with a simple greedy heuristic.


## Example 'Canonical Tour'
Complete the TODO item in class `CanonicalSolver` that implements the `TSPSolver` interface. 
As you can see in the interface we need to implement a solve method with the following signature `public List<Integer> solve(Instance ist)`. 
To construct the solution we will simply chain the cities in the order they appear in the `Instance` until we are done.

## Checking our work
You will need to implement the methods `public double distance(List<Integer> sequence)` in the `Objective` class as well as the method `public boolean check()` in class `Solution` to respectively compute your solution length and check if your solution is in fact a hamiltonien cycle on the graph of all cities.

## Using your own PC
You should have Maven installed and an updated JDK.

Download Project
```shell
git clone https://github.com/AlexChanson/RechercheOperationnelle-M1-BDMA-Intro
```
Move to project and test build
```shell
cd .\RechercheOperationnelle-M1-BDMA-Intro\
mvn package
```

### Run your code 
```shell
java -cp target/TP-RO-M1-BDMA-1.0-SNAPSHOT.jar com.alexscode.teaching.Main
```

## Using computer lab PCs
### Ouvrir powershell
Set proxy for git
```
git config --global https.proxy http://proxy:3128
git config --global http.proxy http://proxy:3128
```

Download Project
```shell
git clone https://github.com/AlexChanson/RechercheOperationnelle-M1-BDMA-Intro
```

Setup maven (Only use last line if you have already downloaded)
```
wget https://dlcdn.apache.org/maven/maven-3/3.9.5/binaries/apache-maven-3.9.5-bin.zip -UseBasicParsing -O maven.zip
Expand-Archive .\maven.zip .
$env:Path += 'U:\apache-maven-3.9.5\bin'
```

Set Proxy for maven
```shell
mkdir $Env:userprofile\.m2
cp .\RechercheOperationnelle-M1-BDMA-Intro\config\settings.xml $Env:userprofile\.m2\settings.xml
```


Check if it's working with `mvn --version`

Setup Java Environment
```
$Env:JAVA_HOME = "C:\Program Files\Java\jdk1.8.0_341\"
```

Move to project and test build
```shell
cd .\RechercheOperationnelle-M1-BDMA-Intro\
mvn package
```

### Run your code
```shell
java -cp target/TP-RO-M1-BDMA-1.0-SNAPSHOT.jar com.alexscode.teaching.Main
```



