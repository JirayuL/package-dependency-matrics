data <- read.csv(file="./src/data/dependency.csv", header=T)
plot(data, xlim=c(0,1))
abline(1,-1)
