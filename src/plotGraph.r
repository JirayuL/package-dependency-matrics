dependency <- read.csv(file="./src/data/dependency.csv", header=T)
plot(dependency, xlim=c(0,1))
abline(1,-1)
