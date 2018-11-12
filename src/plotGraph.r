autos_data <- read.table("./data/autos.csv", header=T, sep=",")
dotchart(t(autos_data))
