# ACubelets plugin

ACubelets are a crate-like plugin.
Each item you can get from a cubelet has a rarity, this
rarity determines the odds of you wining the item.

You can choose from a large selection of animations 
for the opening of your cubelet!

> Available for purchase at:
[SpigotMC](https://www.spigotmc.org/resources/acubelets-%E2%AD%90-23-animations-%E2%AD%90-1-16-1-21-8.78092/),
[Polymart](https://polymart.org/product/408/acubelets-13-animations) and
[BuiltByBit](https://builtbybit.com/resources/acubelets.45566/).

## For developers
#### How to start contributing?
###### 1. Fork the repository
- Click "Fork" in the top-right corner on GitHub
- Select your account to create a copy
###### 2. Clone Your Fork
```bash
git clone https://github.com/your_username/ACubelets.git
cd ./ACubelets
```
###### 3. Create a new branch
```bash
git branch <your_branch_name>
git switch your_branch_name
```
###### 4. Make some changes in source
###### 5. Please, test your changes!
###### 6. Commit, pull, merge and push your changes in forked repository
```bash
git add .
git commit -m "In my commit i change..."

git switch master
git pull origin master

git merge your_branch_name
git push origin master
```
###### 6. Open a pull request by clicking the "Contribute" button on your fork's GitHub page
###### Thanks for supporting ❤️

#### Compiling
###### Use maven to compile a jar
```bash
cd <project_root_directory>
mvn package
```
Find compiled jar in `target` directory
