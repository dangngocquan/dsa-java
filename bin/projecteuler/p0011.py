if __name__ == '__main__':
    
    matrix = []
    
    # Read file
    with open('.\\src\\Files\\projecteuler\\p0011.txt', 'r') as f:
        matrix = f.readlines()
        for i in range(len(matrix)):
            matrix[i] = matrix[i].split()
            for j in range(len(matrix[i])):
                matrix[i][j] = int(matrix[i][j])
    
    # Find answer
    ans = 0
    for row in range(len(matrix)):
        for column in range(len(matrix[row])):
            if (row + 3 < len(matrix)):
                ans = max(ans, matrix[row][column] * matrix[row+1][column] * matrix[row+2][column] * matrix[row+3][column])
                if (column + 3 < len(matrix[row])):
                    ans = max(ans, matrix[row][column] * matrix[row+1][column+1] * matrix[row+2][column+2] * matrix[row+3][column+3])
                if (column - 3 >= 0):
                    ans = max(ans, matrix[row][column] * matrix[row+1][column-1] * matrix[row+2][column-2] * matrix[row+3][column-3])
            if (column + 3 < len(matrix[row])):
                ans = max(ans, matrix[row][column] * matrix[row][column+1] * matrix[row][column+2] * matrix[row][column+3])
    print(ans) 
    # 70600674      