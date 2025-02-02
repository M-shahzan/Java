matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
Tmatrix = [[],[],[]]
for i in range(len(matrix)):
    for j in range(len(matrix)):
        Tmatrix[i].insert(j,matrix[j][i])
print(f"matrix : {matrix} \ntranspose : {Tmatrix}")